package Class1.Arrays;

public class SortColors {

    //2 pointer
    //Steps:
    //1. start = 0, end = from last. index is to traverse
    //2.a if the input[index] = 0 then swap the input[index] and input[start]. So that the 0 will go to start. increment the start and index.
    //2.b if the input[index] = 2 then swap the input[index] and input[end]. so that 2 will go to end. Decrement the end.
    //2.c if te input[index] = 1 then just increment the index to proceed with next values.
    public static  void sortColors(int[] input){
        int start = 0;
        int end = input.length-1;
        int index = 0;

        while(index <= end){

            if(input[index] == 0){
                input[index] = input[start];
                input[start] = 0;
                start++;
                index++;
            }else if(input[index] == 2){
                input[index] = input[end];
                input[end] = 2;
                end--;
            }else{
                index++;
            }
        }
        for (int i:input) {
            System.out.println("Output = "+i);
        }
    }

    public static void main(String[] args){
        int[] input = new int[]{2,0,1,1,1,0,2,0,2};
        sortColors(input);
    }

}
