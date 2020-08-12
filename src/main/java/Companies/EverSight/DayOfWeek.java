package Companies.EverSight;

import java.util.Map;
import java.util.HashMap;

public class DayOfWeek {
    private static String[] days = new String[]{"Sun", "Mon", "Tue", "Wed",
            "Thu", "Fri", "Sat"};

    private static Map<String, Integer> map = new HashMap<>();
    static{
        map.put("Sun", 0);
        map.put("Mon", 1);
        map.put("Tue", 2);
        map.put("Wed", 3);
        map.put("Thu", 4);
        map.put("Fri", 5);
        map.put("Sat", 6);
    }

    private static String findDay(String day, int k) {
        if(k >=0 && k <= 500 && map.containsKey(day)) {
            int index = (map.get(day) + k) % 7;
            String output = days[index];
            System.out.println("output = " + output);
        }
        return "Please check the input";
    }

    public static void main(String[] args) {


        findDay("Wed", 2);

    }
}
