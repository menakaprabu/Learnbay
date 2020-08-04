package PMP;

public class SentenceReverse {

    private static char[] reverseWords(char[] arr) {

        //reverse all characters:
        int n = arr.length;
        mirrorReverse(arr, 0, n - 1);

        // reverse each word:
        int wordStart = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == ' ') {
                if (wordStart != -1) {
                    mirrorReverse(arr, wordStart, i - 1);
                    wordStart = -1;
                }
            }
            else if (i == n - 1) {
                    if (wordStart != -1) {
                        mirrorReverse(arr, wordStart, i);
                    }
                }
            else{
                    if (wordStart == -1)
                     wordStart = i;
                }
            }
        return arr;
    }
   /* static char[] reverseWords(char[] arr) {
        // reverse the whole arr array
        int i = 0, j = arr.length - 1;
        swap(arr, i, j);

        // reverse each part
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i - 1] == ' ') {
                start = i;
            }

            if (i == arr.length - 1 || char[i] == ' ') {
                end = i;
                swap(arr, start, end);
            }
        }
        return arr;
    }*/

    // helper function - reverses the order of items in arr
    // please note that this is language dependent:
    // if are arrays sent by value, reversing should be done in place

    private static void mirrorReverse(char[] arr, int start, int end) {
    while(start <= end)
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
