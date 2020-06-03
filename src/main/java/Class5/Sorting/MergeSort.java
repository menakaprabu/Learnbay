package Class5.Sorting;

public class MergeSort {

    private static void merge(int[] arr,int start, int mid, int end) { // {1,3,5,6}   {2,4,7,8}
        // Copy both parts into the temp array
        int[] tempArray = new int[arr.length];
        for (int i = start; i <= end; i++) {
            tempArray[i] = arr[i];
        }

        int i = start, j = mid+1;   // i = 0,  j= 4
        int k = start;

        while(i<=mid && j<=end) {
            if(tempArray[i] <= tempArray[j]) {
                arr[k] = tempArray[i];

                k++;
                i++;
            }
            else {
                arr[k] = tempArray[j];
                k++;
                j++;
            }
        }

        while(i<=mid) {
            arr[k] = tempArray[i];
            k++;
            i++;
        }

        while (j<=end) {
            arr[k] = tempArray[j];
            k++;
            j++;
        }

     /*   j = start;
        for( i=0 ;i<end-start+1; i++) {
            arr[j] = tempArray[i];
            i++;
            j++;
        }*/
    }

    private static void divideAndMerge(int arr[], int strt, int end) {
        if(strt == end)
            return;
        if(strt < end ) {
            int mid = strt + (end - strt) / 2;
            divideAndMerge (arr, strt, mid);
            divideAndMerge (arr, mid+1, end);
            merge(arr,strt, mid, end);
        }
    }


    public static void main(String[] args){
        int[] arr = new int[]{4,3,9,7,5,2,1};
        divideAndMerge(arr,0,arr.length-1);
        //Print the array values
        for (int i=0;i<arr.length;i++){
            System.out.println("array value = "+arr[i]);
        }

    }
}
