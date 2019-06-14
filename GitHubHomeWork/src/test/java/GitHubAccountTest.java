import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GitHubAccountTest {

    //create instance variable
    GitHubAccount ralph;

    @Before
    public void before(){
        ralph = new GitHubAccount("7rburden3", "Ralph");
    }

    @Test
    public void accountHasUserName(){
        assertEquals("7rburden3", ralph.getUsername());
    }

    @Test
    public void accountHasName(){
        assertEquals("Ralph", ralph.getName());
    }

    @Test
    public void accountStartsAsFree(){
        assertEquals(AccountType.FREE, ralph.getAccountType());
    }

    @Test
    public void accountCanUpgradeToPro(){
        ralph.upgradeAccount();
        assertEquals(AccountType.PRO, ralph.getAccountType());
    }

    @Test
    public void accountCanDowngradeToFree(){
        ralph.upgradeAccount();
        assertEquals(AccountType.PRO, ralph.getAccountType());
        ralph.downgradeAccount();
        assertEquals(AccountType.FREE, ralph.getAccountType());
    }

}
