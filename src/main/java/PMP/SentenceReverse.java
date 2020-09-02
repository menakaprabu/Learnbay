package PMP;

public class SentenceReverse {

    static char[] reverseWords(char[] arr) {
        // your code goes here
        if(arr == null || arr.length == 0) return arr;
        mirrorReverse(arr, 0, arr.length - 1);

        int start = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == ' '){
                mirrorReverse(arr, start, i-1);
                start = i+1;
            }
        }
        mirrorReverse(arr, start, arr.length - 1);
        return arr;
    }


    // helper function - reverses the order of items in arr
    // please note that this is language dependent:
    // if are arrays sent by value, reversing should be done in place

    private static void mirrorReverse(char[] arr, int start, int end) {
    while(start < end)
    {
        char tmp = arr[start];
        arr[start] = arr[end];
        arr[end] = tmp;
        start++;
        end--;
    }
    }

    public static void main(String[] args){
        char[] input =
                {'p', 'e', 'r', 'f', 'e', 'c', 't', ' ',
                'm', 'a', 'k', 'e', 's', ' ',
                'p', 'r', 'a', 'c', 't', 'i', 'c', 'e'};
        char[] output = reverseWords(input);
        for (int i = 0; i < output.length ; i++) {
            System.out.println("Output value = "+output[i]);
        }
    }
}
