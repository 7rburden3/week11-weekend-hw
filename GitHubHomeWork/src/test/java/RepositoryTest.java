import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class RepositoryTest {

    // create instance variable

    Repository testRepository;
    Commit commit1, commit2, commit3;

    @Before
    public void before(){
        testRepository = new Repository("test", "repository of baz", RepositoryType.PUBLIC);
        commit1 = new Commit("initial commit", "a1b2c3", CommitType.OTHER);
        commit2 = new Commit("add test", "b2c3d4", CommitType.BUGFIX);
        commit3 = new Commit("change file name", "d4e5f6", CommitType.OTHER);
    }

    @Test
    public void repositoryHasName(){
        assertEquals("test", testRepository.getName());
    }

    @Test
    public void repositoryHasDescription(){
        assertEquals("repository of baz", testRepository.getDescription());
    }

    @Test
    public void repositoryHasType(){
        assertEquals(RepositoryType.PUBLIC, testRepository.getRepositoryType());
    }

    @Test
    public void repositoryStartsEmpty(){
        assertEquals(0, testRepository.getNumberOfCommits());
    }

    @Test
    public void canAddCommitToRepository(){
        //create new commit in @Before
        testRepository.addCommit(commit1);
        assertEquals(1, testRepository.getNumberOfCommits());
    }

    @Test
    public void canFindCommitByUniqueId(){
        testRepository.addCommit(commit1);
        testRepository.addCommit(commit2);
        Commit findUniqueCommit = testRepository.findCommitByUniqueId("b2c3d4");
        assertEquals("b2c3d4", findUniqueCommit.getUniqueId());
    }

    @Test
    public void canReturnNullIfUniqueIdNotFound(){
        testRepository.addCommit(commit1);
        Commit findUniqueCommit = testRepository.findCommitByUniqueId("c3d4e5");
        assertNull(findUniqueCommit);
    }

    @Test
    public void canFindCommitsByType(){
        testRepository.addCommit(commit1);
        testRepository.addCommit(commit2);
        testRepository.addCommit(commit3);
        ArrayList<Commit> commitOther = testRepository.getCommitByType(CommitType.OTHER);
        assertEquals(2, commitOther.size());
    }

}
