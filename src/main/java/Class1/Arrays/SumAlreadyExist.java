package Class1.Arrays;

import java.util.HashSet;

public class SumAlreadyExist {

    private static boolean sumAlreadyExist(int[] arr) {
        HashSet set = new HashSet();
        for (int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        for (int i=0;i<arr.length;i++){
            for (int j=1;j<arr.length;j++){
                if(i != j && set.contains(arr[i] + arr[j])){
                    System.out.println("arr[i] = "+arr[i]+" arr[j] = "+arr[j]);
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] input = new int[]{ 2,7,5,9};
        boolean sumExist = sumAlreadyExist(input);
        System.out.println("Sum present = "+sumExist);
    }
}
