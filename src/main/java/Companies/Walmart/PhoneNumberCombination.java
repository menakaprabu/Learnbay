package Companies.Walmart;

import java.util.List;
import java.util.LinkedList;

public class PhoneNumberCombination {

    private static List<String> letterCombinations(String digits) {
        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        LinkedList<String> ans = new LinkedList();
        ans.add("");
        if(digits.isEmpty()) return ans;
        for (int i=0;i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));

           while (ans.peek().length() == i){
               String val = ans.remove();// a
               for(char c : mapping[x].toCharArray()){// d e f
                    ans.add(val+c); //ad , ae, af
               }
           }
        }
        return ans;
    }


    public static void main(String[] main){
        List<String> output = letterCombinations("234");

        System.out.println("size = "+output.size());
        for (int i=0;i<output.size();i++){
            System.out.println("Output = "+output.get(i));
        }
    }

}
