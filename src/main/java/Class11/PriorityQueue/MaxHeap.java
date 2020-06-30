package Class11.PriorityQueue;

public class MaxHeap {

    private static void swap(int arr[],int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    private static void maxHeapify(int arr[], int index, int size) {
        int leftChildIndex = 2*index + 1;
        int rightChildIndex = 2*index + 2;
        int maxValueIndex = index;
        if(leftChildIndex <= size && arr[leftChildIndex] > arr[maxValueIndex]) {
            maxValueIndex = leftChildIndex;
        }

        if(rightChildIndex <= size && arr[rightChildIndex] > arr[maxValueIndex]) {
            maxValueIndex = rightChildIndex;
        }

        if(maxValueIndex == index) {
            return;
        }
        else if(maxValueIndex == leftChildIndex) {
            swap(arr, leftChildIndex, index);
            maxHeapify(arr, leftChildIndex, size);
            return;
        }
        else if(maxValueIndex == rightChildIndex) {
            swap(arr, rightChildIndex, index);
            maxHeapify(arr, rightChildIndex, size);
            return;
        }
    }


    /**
     *               9(0)
     *
     *        5(1)          8(2)
     *
     *     4(3)    1(4)  6(5)  7(6)
     *
     *   2(7)  3(8)
     * @param arr
     */
    private static void buildMaxHeap(int arr[], int lastParent) {
        for(int i = lastParent; i >= 0; i--) {
            maxHeapify(arr, i, arr.length-1);
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
    private static void heapSort(int arr[]) {
        int arrSize = arr.length-1;
        int lastParent = (arrSize-1)/2; //4
        buildMaxHeap(arr, lastParent);

        int currSize = arrSize;
        while(currSize >=1) {
            swap(arr, 0, currSize);
            currSize--;
            maxHeapify(arr, 0, currSize);
        }
    }

    public static void main(String args[]) {
        int arr[] = {1, 3, 8, 4 , 5, 6, 7, 2, 9};
        heapSort(arr);

        //Output
        for (int i=0;i<arr.length;i++){
            System.out.println("arr value = "+arr[i]);
        }
    }

}
