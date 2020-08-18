package LastMinuteRevisions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorExample {

    public static void main(String[] args) {
        List<Computer> computerList = new ArrayList<Computer>();
        computerList.add(new Computer("HCL", 16, 800));
        computerList.add(new Computer("Apple", 8, 100));
        computerList.add(new Computer("Dell", 4, 600));
        Comparator<Computer> comparator = new ComputerComparator();
        Collections.sort(computerList, comparator);
        for (Computer computer : computerList) {
            System.out.println(computer.getName());
        }
    }

}
