import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CommitTest {

    //create instance variable
    Commit testCommit;

    //create new instance of Commit object
    @Before
    public void before(){
        testCommit = new Commit("initial commit", "a1b2c3", CommitType.OTHER);
    }

    @Test
    public void commitHasDescription(){
        assertEquals("initial commit", testCommit.getDescription());
    }

    @Test
    public void commitHasUniqueId(){
        assertEquals("a1b2c3", testCommit.getUniqueId());
    }

    @Test
    public void commitHasCommitType(){
        assertEquals(CommitType.OTHER, testCommit.getCommitType());
    }

}
