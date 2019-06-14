public class Commit {

//    description
//commitType (feature, bugfix, refactor, other)
//uniqueId

    //declare variables
    private String description;
    private String uniqueId;
    private CommitType commitType;

    //create Constructor
    public Commit(String description, String uniqueId, CommitType commitType){
        this.description = description;
        this.uniqueId = uniqueId;
        this.commitType = commitType;
    }

    //create getters
    public String getDescription(){
        return this.description;
    }

    public String getUniqueId(){
        return this.uniqueId;
    }

    public CommitType getCommitType(){
        return this.commitType;
    }

}
