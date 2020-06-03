package Class1.Arrays;

/*
 Arrange an array such that all the elements smaller than x are at left and all the elements greater than x
  are on the right of x.
 */
public class ArrangeArray {

    private static void arrangeArray(int givenNum, int[] input){
        // 10,2,3,1,7,5,8,0,9
        //swap x value with last index (Basically move the x to the last)
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
                //Swap the last-2 (keeps decrementing)
                int temp = input[last];
                input[last] = input[first];
                input[first] = temp;
                last--;
            }else{
                first++;
            }
        }
        //8,3,7,1,2,6 : 8,3,6,1,2,7
        input[input.length-1] = input[first];
        input[first] = givenNum;

        for(int i=0;i<input.length;i++){
            System.out.println("output = "+ input[i]);
        }
    }

    public static void main(String[] args){
        int[] input = new int[]{ 8,3,7,1,2,6};
        arrangeArray(7, input);
    }
}
