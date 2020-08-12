package LastMinuteRevisions;

public class Laptop implements Comparable<Laptop>{

    public int id;

    public String name;

    public Laptop(String name, int id){
        this.id = id;
        this.name = name;
    }

    public int compareTo(Laptop laptop){
        if(this.id > laptop.id){
            return 1;
        }else{
            return -1;
        }

    }
}
