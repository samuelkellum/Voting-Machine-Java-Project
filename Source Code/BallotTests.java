import static org.junit.Assert.*;
import org.junit.jupiter.api.*;
import java.util.*;

public class BallotTests {
  private Ballot b;

  @BeforeEach
  public void setUp(){
    b = new Ballot("B");
  }

  @Test
  public void testGetOfficeName(){
    assertEquals("B",b.getOfficeName());
  }

  @Test
  public void testGetCandidates(){
    b.addCandidate(new Candidate("Stan Smith", "Red Party"));
    b.addCandidate(new Candidate("Peter Griffin", "Blue Party"));
    ArrayList<Candidate> list1 = b.getCandidates();
    ArrayList<Candidate> list2 = new ArrayList<Candidate>();
    list2.add(new Candidate("Stan Smith", "Red Party"));
    list2.add(new Candidate("Peter Griffin", "Blue Party"));
    assertEquals(list1.toString(), list2.toString());
  }


}
