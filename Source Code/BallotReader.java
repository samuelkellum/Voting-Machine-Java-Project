import java.io.*;
import java.util.*;

public class BallotReader{
	/**
	 * Reads text file to generate ballot for voting machine, must be in the
	 * following format:
	 * Office Name \n
	 * Number of candidates \n
	 * Candidate 1;Affiliation 1 \n
	 * Candidate 2;Affiliation 2 \n
	 * ... ; ....
	 * @param filename the name of the user's input file, must be a string
	 */
	public static Ballot readBallot(String filename) throws IOException{
		File fileName = new File(filename);
    Scanner scnr = new Scanner(fileName);
    Ballot ballot = new Ballot(scnr.nextLine());
		int numOfCandidatesInFile = Integer.parseInt(scnr.nextLine());
    while (scnr.hasNextLine()){
      scnr.useDelimiter(";|\\n");
      String ballotName = scnr.next();
      String ballotParty = scnr.next();
			ballot.addCandidate(new Candidate(ballotName, ballotParty));
    }
		scnr.close();
		return ballot;
  }
}
