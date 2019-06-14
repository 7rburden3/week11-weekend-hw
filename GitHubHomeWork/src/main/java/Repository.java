import java.util.ArrayList;

public class Repository {

    //declare variables
    private String name, description;
    private ArrayList<Commit> commits;
    private RepositoryType repositoryType;

    public Repository(String name, String description, RepositoryType repositoryType){
        this.name = name;
        this.description = description;
        this.repositoryType = repositoryType;
        this.commits = new ArrayList<>();
    }

    //create getters

    public String getName(){
        return this.name;
    }

    public String getDescription(){
        return this.description;
    }

    public RepositoryType getRepositoryType(){
        return this.repositoryType;
    }

    public int getNumberOfCommits(){
        return this.commits.size();
    }

    //add commit to arraylist
    public void addCommit(){

    }


//We should be able to get a commit by its uniqueId
//We should be able to get all commits of a certain type (e.g. all features)
}
