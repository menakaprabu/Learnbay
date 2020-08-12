package LastMinuteRevisions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

    public static void main(String[] args) {
        List<Laptop> laptopList = new ArrayList<>();
        laptopList.add(new Laptop("HCL", 16));
        laptopList.add(new Laptop("Apple", 8));
        laptopList.add(new Laptop("Dell", 4));
        Collections.sort(laptopList);
        for (Laptop lap : laptopList) {
            System.out.println(lap.id);
        }
    }
}
