package LastMinuteRevisions;

import java.util.Comparator;

public class ComputerComparator implements Comparator<Computer> {

    public int compare(Computer a, Computer b){
        return a.name.compareTo(b.name);
    }

}
