import java.io.*;
import java.lang.*;
import java.util.*;

public class ResultWriter{

	/**
	 * Writes results of the election to user chosen output file
	 * @param filename name of the output file, must be a string
	 * @param ballot the ballot, of Ballot object
	*/
	public static void writeResults(String filename, Ballot ballot) throws IOException{
		FileWriter fileOutput = new FileWriter(filename);
		fileOutput.write(ballot.toString());
		fileOutput.close();
  }
}
