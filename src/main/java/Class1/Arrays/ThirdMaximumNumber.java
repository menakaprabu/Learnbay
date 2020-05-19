package Class1.Arrays;

public class ThirdMaximumNumber {

    //1.Initialize firstMax, SecondMax, thirdMAx to MI.VALUE
    //2.Loop the given array.
    //3.a if input[i] > firstMax then assign the input[i] to firstMax. FirstMax becomes secondMAx and secondMax becomes thirdMax.
    //3.b if input[i] > secondMax then assign the input[i] to secondMax. SecondMax becomes thirdMax.
    //3.c if input[i] > thirdMax then assign the input[i] to thirdMax.
    //4. if thirdMax is equal to Long.MINVALUE then we got less then 3 so return firstMax.
    private static void thirdMaximumNumber(int[] input){

        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;

        for(int i=0;i<input.length;i++){

            if(input[i] > firstMax){
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = input[i];
            }else if(input[i] == firstMax){
                continue;
            }else if(input[i] > secondMax){
                thirdMax = secondMax;
                secondMax = input[i];
            }else if(input[i] == secondMax){
                continue;
            }else if(input[i] > thirdMax){
                thirdMax = input[i];
            }else if(input[i] == thirdMax){
                continue;
            }
        }
        if(thirdMax == Long.MIN_VALUE){
            System.out.println("First Max value = " + firstMax);
        }else {
            System.out.println("Third Max value = " + thirdMax);
        }
    }

    public static void main(String[] args){
       // int[] input = new int[]{3,6,1,8,2};
        int[] input = new int[] {1,1,2};
        thirdMaximumNumber(input);
    }
}
