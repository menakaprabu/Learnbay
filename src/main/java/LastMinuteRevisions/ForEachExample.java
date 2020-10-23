package LastMinuteRevisions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {

    public static void main(String[] args){
        List<String> list = Arrays.asList("A", "B", "C", "D");

        Consumer<String> consumer = s -> System.out.println(s);
        System.out.println("For Each");
        list.forEach(consumer);
        System.out.println("Stream For Each");
        list.stream().forEach(consumer);
        System.out.println("Parallel Stream For Each");
        list.parallelStream().forEach(consumer);

        //Reduce to single element
        int[] numbers = {1, 2, 3,};

        // 1st argument, init value = 0
        int sum = Arrays.stream(numbers).reduce(0, (a, b) -> a + b);
        System.out.println("sum = "+sum);
    }
}
