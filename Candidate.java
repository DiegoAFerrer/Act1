public class Candidate {
    private static int nextId = 1;
    private int id;
    private String name;

    public Candidate(String name){
        this.id = nextId++;
        this.name = name;
    }

    public int getId(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }
}