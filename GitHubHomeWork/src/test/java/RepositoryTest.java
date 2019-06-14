import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RepositoryTest {

    // create instance variable

    Repository testRepository;

    @Before
    public void before(){
        testRepository = new Repository("test", "repository of baz", RepositoryType.PUBLIC);
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

}
