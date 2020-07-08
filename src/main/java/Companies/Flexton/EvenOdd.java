package Companies.Flexton;

public class EvenOdd {

    private static void evenOdd(int[] input){

      int fromFirst = 0;
      int fromLast = input.length-1;

      while(fromFirst < fromLast){
          if(input[fromFirst]%2 == 0){
              fromFirst++;
          }else if(input[fromLast]%2 == 1){
              fromLast--;
          }else{
              int temp = input[fromFirst];
              input[fromFirst] = input[fromLast];
              input[fromLast] = temp;
              fromFirst++;
              fromLast--;
          }
      }

      for(int i=0;i<input.length;i++){
          System.out.println(" Output = "+input[i]);
      }
    }


    public static void main(String[] args){
        int input[] = new int[]{1,4,5,8,9,7,10,2,6,3};
        evenOdd(input);
    }
}
