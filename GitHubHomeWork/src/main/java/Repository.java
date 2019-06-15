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
    public void addCommit(Commit commit){
        this.commits.add(commit);
    }

    public Commit findCommitByUniqueId(String uniqueIdToFind) {
        //public Commit as needs to look in Commit class, pass in string of id to find
        for(Commit commit : this.commits){
            if(commit.getUniqueId() == uniqueIdToFind){
                return commit;
            }
        }
        return null;
    }

    public ArrayList<Commit> getCommitByType(CommitType commitTypeSearch){
        //commitTypeSearch is eNum to be searched for in CommitType
        ArrayList<Commit> matchingCommits = new ArrayList<>();
        // create a new arraylist using the contents available in CommitType
        for (Commit addedCommit : this.commits){
            if (addedCommit.getCommitType() == commitTypeSearch){
                //use getCommitType from Commit class
                matchingCommits.add(addedCommit);
                //add matchingCommit from commitTypeSearch to array
            }
        }
        return matchingCommits;
    }

//We should be able to get a commit by its uniqueId
//We should be able to get all commits of a certain type (e.g. all features)
}
