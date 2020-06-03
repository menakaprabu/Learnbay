package Class1.Arrays;

public class CountServers {

    private static int countServers(int[][] matrix){

        int serverCount = 0;
        int noOfrows = matrix.length;
        int noOfColumns = matrix[0].length;

        int[] rowCount = new int[noOfrows];
        int[] colCount = new int[noOfColumns];
        for(int row=0;row<noOfrows;row++){
            for(int col=0;col<noOfColumns;col++){
            if(matrix[row][col] == 1){
                rowCount[row]++;
                colCount[col]++;
                serverCount++;
            }
            }
        }

        for(int row=0;row<noOfrows;row++){
            for(int col=0;col<noOfColumns;col++){
                if(matrix[row][col] == 1){
                    if(rowCount[row] == 1 && colCount[col] == 1)
                    {
                        serverCount--;
                    }
                }
            }
        }
        return serverCount;
    }

    public static void main(String[] args){
            int[][] arr = new int[][]{
                    {1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
        int noOfServers = countServers(arr);

        System.out.println("no of servers = "+noOfServers);

    }
}
