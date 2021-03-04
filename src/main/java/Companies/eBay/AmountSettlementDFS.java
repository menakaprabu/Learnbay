package Companies.eBay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AmountSettlementDFS {

    public static int minTransfers(int[][] transactions) {
        //(sender, receiver, amount)
        Map<Integer,Integer> map = new HashMap<>();
        for(int[] t : transactions){
            map.put(t[0],map.getOrDefault(t[0],0)-t[2]);
            map.put(t[1],map.getOrDefault(t[1],0)+t[2]);
        }
        return dfs(new ArrayList<Integer>(map.values()),0);
    }

    private static int dfs(List<Integer> balance, int start){
        while(start < balance.size() && balance.get(start) == 0){
            start++;
        }
        if(start == balance.size()){
            return 0;
        }
        int steps = Integer.MAX_VALUE;
        for(int i=start+1;i<balance.size();i++){
            if(balance.get(i)*balance.get(start) < 0){
                balance.set(i, balance.get(i)+balance.get(start));
                steps = Math.min(steps, 1+dfs(balance, start+1));
                balance.set(i, balance.get(i)-balance.get(start));
            }
        }
        return steps;
    }

    public static void main(String[] args){
       int[][] input = new int[][]{
               { 0,1,10 },
               {2,0,5}
       };
       int steps = minTransfers(input);
       System.out.println("steps = "+steps);
    }
}
