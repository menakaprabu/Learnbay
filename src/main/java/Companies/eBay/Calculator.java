package Companies.eBay;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

        public static int calculate(String s) {
            Queue<Character> q = new LinkedList<>();
            for(int i=0;i<s.length();i++){
                char nextChar = s.charAt(i);
                if(nextChar == ' ')continue;
                q.offer(nextChar);
            }
            q.offer('.');
            return dfs(q);
        }

        public static int dfs(Queue<Character> q){
            char prevOp = '+';
            int prev = 0;
            int sum = 0;
            int num = 0;
            char currOp = '+';
            while(q.size()>0){
                currOp = q.poll();

                if(currOp=='('){
                    num = dfs(q);
                }else{
                    if(Character.isDigit(currOp)){
                        num = num * 10 + (currOp-'0');
                        continue;
                    }else if(prevOp=='+'){
                        sum += prev;
                        prev = num;
                    }else if(prevOp =='-'){
                        sum+=prev;
                        prev=-num;
                    }else if(prevOp=='*'){
                        num = num*prev;
                        prev = num;
                    }else if(prevOp=='/'){
                        num = prev/num;
                        prev = num;
                    }
                    if(currOp=='.'||currOp==')')break;
                    prevOp = currOp;
                    num=0;
                }
            }
            return sum+prev;
        }


    public static void main(String[] args){
        //String input = "2*(5+5*2)/3+(6/2+8)";
        String input = "12 - 4 - 1";
        int output = calculate(input);
        System.out.println("output = "+output);

    }
}
