package Class2.Recursion;

public class HighestGCDForNumbers {

    private static int highestGCD(int input1, int input2){

       return recursiveHelper(input1, input2);

    }

    private static int recursiveHelper(int num1, int num2){
        if(num2 == 0){
            return num1;
        }
        return num1%num2 == 0 ? num2 : recursiveHelper(num2, num1%num2);
    }


    public static void main(String[] args){
        int hightestGCD = highestGCD(20,12);
        System.out.println("hihest GCD = "+hightestGCD);
    }
}
