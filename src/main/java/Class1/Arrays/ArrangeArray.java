package Class1.Arrays;

public class ArrangeArray {

    private static void arrangeArray(int givenNum, int[] input){
        // 10,2,3,1,7,5,8,0,9
        //swap x with last index
        for(int i=0;i<input.length;i++){
            if(input[i] == givenNum){
                input[i] = input[input.length - 1];
                input[input.length - 1] = givenNum;
                break;
            }
        }
        int first = 0;
        int last = input.length - 2;
        while(first <= last){
            if(input[first] > givenNum){
                int temp = input[last];
                input[last] = input[first];
                input[first] = temp;
                last--;
            }else{
                first++;
            }
        }
        input[input.length-1] = input[first];
        input[first] = givenNum;

        for(int i=0;i<input.length;i++){
            System.out.println("output = "+ input[i]);
        }
    }

    public static void main(String[] args){
        int[] input = new int[]{ 10,2,3,1,7,5,8,0,9};
        arrangeArray(7, input);
    }
}
