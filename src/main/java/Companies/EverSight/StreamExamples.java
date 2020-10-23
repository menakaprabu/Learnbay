package Companies.EverSight;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExamples {

    public static void main(String[] args){
       List<Integer> list =  Arrays.asList(1,2,3,4,5,6,7,8,9);
       int sum = list.stream().filter(i -> i>5).mapToInt(i -> i).sum();
       System.out.println("Sum = "+sum);

       List<Integer> outList = list.stream().filter(i -> i < 5).collect(Collectors.toList());
        outList.forEach(i -> System.out.println("i = "+i));
        outList.forEach(i -> System.out.println("i TAG === "+i));
    }
}
