import static org.junit.Assert.*;
import org.junit.jupiter.api.*;
import java.util.*;

class CandidateTests{
  private Candidate c;

  @BeforeEach
  public void setUp(){
    c = new Candidate("P","p");
  }

  @Test
  public void testGetName(){
    assertEquals("P",c.getName());
  }

  @Test
  public void testGetAffiliation(){
    assertEquals("P",c.getName());
  }

  @Test
  public void testGetVoteCount(){
    assertEquals(0,c.getVoteCount());
    c.tallyVote();
    assertEquals(1,c.getVoteCount());
    for (int i = 0; i< 999; i ++){
      c.tallyVote();
    }
    assertEquals(1000,c.getVoteCount());
    }

  @Test
  public void testToString(){
    assertEquals("P - p",c.toString());
  }

}
