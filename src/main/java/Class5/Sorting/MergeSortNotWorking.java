package Class5.Sorting;

public class MergeSortNotWorking {

    private static void merge (int arr[], int strt, int mid, int end) { // {1,3,5,6}   {2,4,7,8}
        int i = strt, j = mid+1;   // i = 0,  j= 4
        int[] tempArray = new int[end-strt+1];  // size = 8  {1, 2, 3, 4, 5, 6, 7, 8}
        int k = 0;

        while(i<=mid && j<=end) {
            if(arr[i] < arr[j]) {
                tempArray[k] = arr[i];
                k++;
                i++;
            }
            else {
                tempArray[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i<=mid) {
            tempArray[k] = arr[i];
            k++;
            i++;
        }

        while (j<=end) {
            tempArray[k] = arr[j];
            k++;
            j++;
        }

        j = strt;
        for( i=0 ; i<=tempArray.length-1; i++) {
            arr[j] = tempArray[i];//temp = 2,3: 1,2,2
           // i++; // arr = 2,2,1 : 1,2,1
            j++;
        }
    }

   private static void divideAndMerge (int arr[], int strt, int end) {
        if(strt == end)
            return;
        if(strt < end ) {
            int  mid = (strt + end) / 2;
            divideAndMerge (arr, strt, mid);
            divideAndMerge (arr, mid+1, end);
            merge (arr, strt, mid, end);
        }
    }

    public static void main(String[] args){
        int[] arr = new int[]{3,2,8,20,0,1};
        divideAndMerge(arr,0,arr.length-1);
        //Print the array values
        for (int i=0;i<arr.length;i++){
            System.out.println("array value = "+arr[i]);
        }
    }


}

