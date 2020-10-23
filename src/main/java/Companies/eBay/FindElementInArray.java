package Companies.eBay;

public class FindElementInArray {
    /*
matrix = [
[10,14,15,16],
[20,21,24,26],
[30,34,40,45],
[50,67,78,89]
]
target = 20

Output -> (1,0)

Properties:
1) Each row would be sorted in asc order
2) First element of each row > last element of prev row
3) M * M, M = 1 to 1000000

*/


   /* class Solution {

        Indexer {

            int row, col;

            Indexer(int row, int col){
                this.row = row;
                this.col = col;
            }

        }

        private static Indexer binarySearch(int[] input,  int row, int findElement,){

            int left = 0;
            int right = input.length;

            while(left <= right){

                int mid =  left + (right - left)/2;
                if(input[mid] == findElement){
                    Indexer indexer = new Indexer(row, mid);
                    return indexer;

                }
                if(input[mid] > findElement){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }

            }
            return new Indexer(-1, -1);

        }

        public static void main(String[] args) {
            int[][] matrix = new int[][] {
                    {10,14,15,16},
                    {20,21,24,26},
                    {30,34,40,45},
                    {50,67,78,89}
            };
            int target = 20;

            for(int i=0;i<matrix.length;i++){

                Indexer output = binarySearch(matrix[i], i, target);
                System.out.println("Output Row "+output.row + "Output Col "+output.col);

            }


        }
    }*/
}
