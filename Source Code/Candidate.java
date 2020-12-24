
public class Candidate{
	private String name;
	private String affiliation;
	private int votes = 0;

	/**
	 * Construct a person (voting candidate) with a name and an affiliation
	 * @param name the name of the candidate, must be a string
	 * @param affiliation the party affiliation associated with the candidate,
	 * must be a string
	*/
	public Candidate(String name, String affiliation){
		this.name = name;
		this.affiliation = affiliation;
	}

	/**
	 * @return the name of the candidate
	*/
	public String getName(){
    return this.name;
	}

	/**
	 * @return the affiliation of the cadidate
	*/
	public String getAffiliation(){
    return this.affiliation;
	}

	/**
	 * @return the number of votes of the candidate, must be a positive integer
	*/
	public int getVoteCount(){
    return this.votes;
	}

	/**
	 * Add one vote to the candidate's number of votes
	*/
	public void tallyVote(){
		this.votes ++;
	}

	/**
	 * Organize the party's name and affiliation into a
	 * "Name - Affiliation" format
	*/
	public String toString(){
    return (this.name + " - " + this.affiliation);
	}

}
