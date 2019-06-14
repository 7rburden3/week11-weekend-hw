import java.util.ArrayList;
import java.util.HashMap;

public class GitHubAccount {

    //declare variables

    private String username, name;
    private HashMap<String, Repository> repositories;
    private AccountType accountType;

    public GitHubAccount(String username, String name){

        //create Constructor

        this.username = username;
        this.name = name;
        this.accountType = AccountType.FREE;
        this.repositories = new HashMap<>();

    }

    //create getters

    public AccountType getAccountType(){
        return this.accountType;
    }

    public String getName(){
        return this.name;
    }

    public String getUsername(){
        return this.username;
    }

    //create account methods

    public void upgradeAccount() {
        this.accountType = AccountType.PRO;
    }

    public void downgradeAccount(){
        this.accountType = AccountType.FREE;
    }
}
