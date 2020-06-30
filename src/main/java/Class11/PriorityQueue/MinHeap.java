package Class11.PriorityQueue;

public class MinHeap {

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static void minHeapify(int arr[], int index, int size){
        int leftChildIndex = 2*index + 1;
        int rightChildIndex = 2*index + 2;

        int minValueIndex = index;
        if(leftChildIndex <= size && arr[leftChildIndex] < arr[minValueIndex]){
            minValueIndex = leftChildIndex;
        }

        if(rightChildIndex <= size  && arr[rightChildIndex] < arr[minValueIndex]){
            minValueIndex = rightChildIndex;
        }
        if(minValueIndex != index) {
            swap(arr,index,minValueIndex);
            minHeapify(arr,minValueIndex,size);
        }
    }

    private static void buildMinHeap(int arr[], int lastParentIndex){
        for(int i=lastParentIndex;i>=0;i--){
            minHeapify(arr,i, arr.length-1);
        }
    }

    /**
     *               1(0)
     *
     *        3(1)          8(2)
     *
     *     4(3)    5(4)  6(5)  7(6)
     *
     *   2(7)  9(8)
     * @param arr
     */
    private static void minHeapSort(int arr[]) {
        int arrSize = arr.length-1;
        int lastParentIndex = (arrSize-1)/2; //4
        buildMinHeap(arr,lastParentIndex);

        //Output
        for (int i=0;i<arr.length;i++){
            System.out.println("After build path arr value = "+arr[i]);
        }


        int currSize = arrSize;
        while(currSize >=1) {
            swap(arr, currSize, 0);
            currSize--;
            minHeapify(arr, currSize, 0);
        }

    }

    /**
     *               1(0)
     *
     *        2(1)          6(2)
     *
     *     3(3)    5(4)  8(5)  7(6)
     *
     *   4(7)  9(8)
     *
     */
    public static void main(String args[]) {
        int arr[] = {1, 3, 8, 4 , 5, 6, 7, 2, 9};
        minHeapSort(arr);

        //Output
        for (int i=0;i<arr.length;i++){
            System.out.println("arr value = "+arr[i]);
        }

        //Output
        int kthSmallest = 3;
        for (int i=0;i<=kthSmallest;i++){
            if(i == kthSmallest) {
                System.out.println("arr value = " + arr[i]);
            }
        }
    }
}
