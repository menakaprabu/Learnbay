package Companies.Walmart;

import java.util.ArrayList;
import java.util.List;

public class ConstructParanthesis {

    private static void constructParanthesisString(int n){
        List<String> list = new ArrayList<>();
        dfs("",list,n,n);
         for(int i=0;i<list.size();i++){
            System.out.println("Output = " + list.get(i));
        }
    }

    //((( )))
    private static void dfs(String output, List<String> list, int left, int right){
        if(left > right){
            return;
        }
        if(left > 0){
            dfs(output+"(", list, left-1, right);
        }
        if(right > 0){
            dfs(output+")", list, left, right-1);
        }
        if(left == 0 && right ==0){
            list.add(output);
            return;
        }
    }

    public static void main(String[] main){
        constructParanthesisString(3);
    }
}
