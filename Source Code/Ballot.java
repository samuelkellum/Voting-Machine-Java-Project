import java.util.*;
import java.io.*;
import java.lang.*;


public class Ballot{

	private ArrayList<Candidate> candidates = new ArrayList<>();
	private String officeName;

	/**
	 * Construct a ballot with the office name that people will vote for
	 * @param officeName the name of the office, must be a string
	 *
	 */
	public Ballot(String officeName){
		this.officeName = officeName;
	}

	/**
	 * @return the office name
	*/
	public String getOfficeName(){
    return this.officeName;
	}

	/**
	 * Adds a new candidate to the ballot, but first checks whether the candidate
	 * is already on the ballot to prevent duplicate candidates
	 * @param c the candidate the user will attempt to add
	*/
	public void addCandidate(Candidate c){
		if(!candidates.contains(c)){
			candidates.add(c);
		}
		else{
			System.out.println("Duplicate Candidate");
		}
	}
	/**
	 * @return an ArrayList of candidates
	*/
	public ArrayList<Candidate> getCandidates(){
    return candidates;
	}

	/**
	 * @return the winner of the election, but only if there is a definitive winner
	 this function will return "NO WINNER" if there is a tie for the most votes
	*/
	public String determineWinner(){

		int maxVoteCount = -1;
		String maxVoteCandidate = "";
		String maxVoteAffiliation = "";
		boolean tie = true;
		String winnerOutput;

		//finds the maximum vote count, and if there is a winner or a tie
		for (Candidate c: this.candidates){
			if (c.getVoteCount() > maxVoteCount){
				maxVoteCount = c.getVoteCount();
				maxVoteCandidate = c.getName();
				maxVoteAffiliation = c.getAffiliation();
				tie = false;
			}
			else if(c.getVoteCount() == maxVoteCount){
				tie  = true;
			}
		}
		//sets return variable to output a winner if there is a winner and no winner
		//if there is a tie
		if (tie == false){
			winnerOutput = ("WINNER: " + maxVoteCandidate + " - " + maxVoteAffiliation);
		}
		else{
			winnerOutput = ("NO WINNER");
		}

		return winnerOutput;
		}



		/**
		 * @return the results neatly formatted for the FileWriter
		*/
	public String toString(){
		String firstLineOutput = "RESULTS - " + this.officeName + "\n";
		String fstring = firstLineOutput;
		int lengthOfFirstLine = firstLineOutput.length();

		//neatly formats dotted line to match length of the first line
		for (int i = 1; i < lengthOfFirstLine; i++){
			fstring += "-";
		}
		fstring += "\n";

		//finds maximum length of candidate name + party affiliation to neatly format
		//and justify candidate lines with their vote count
		int maxCandidateLength = -1;
		for (Candidate l: this.candidates){
			if (l.toString().length() > maxCandidateLength){
				maxCandidateLength = l.toString().length();
			}
		}
		for (Candidate i: this.candidates){
			int leftJustify = maxCandidateLength;
			int rightJustify  = 40 - maxCandidateLength;
			fstring = fstring + String.format("%-" + leftJustify + "s" + "%" + rightJustify + "s" , i.toString() , i.getVoteCount()) + "\n";
		}
		//additional white space before results
		fstring = fstring + "\n";

		//last line of output file, writes if there is a winner, and winner's name (if applicable)
		fstring = fstring + determineWinner();

		return fstring;
		}
}
