package Class2.Recursion;

public class FibonocciSeries {
    //0,1,1,2,3,5,8,13

    private static int printFibRecursion(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1 || n == 2){
            return 1;
        }
        return printFibRecursion(n-1)+printFibRecursion(n-2);
    }

    private static void fibWithoutRecursion(int max){

        int previousNumber = 0;
        int nextNumber = 1;
        for(int i=0;i<max;i++){
            System.out.println("Without recursion Fib series = "+previousNumber);
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }

    public static void main(String[] args){
        int max = 8;
        for(int i=0;i<max;i++){
            System.out.print("Recursion Febo series "+printFibRecursion(max) +" ");
        }
        fibWithoutRecursion(max);
    }
}
