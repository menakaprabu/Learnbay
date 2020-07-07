package Companies.LVIS;

import java.util.Queue;
import java.util.LinkedList;

public class RipeTomatoes {

    //This is the tomato box structure
    private static class BoxStructure
    {
        int x;
        int y;

        BoxStructure(int x,int y)
        {
            this.x = x;
            this.y = y;
        }
    }

    private static int findDaysToRipeTomatoes(int[][] arr){
        int row = arr[0][1];
        int col = arr[0][0];
        System.out.println("row = "+row+ " and col = "+col);

        // Create a queue of cells
        Queue<BoxStructure> queue=new LinkedList<>();
        BoxStructure boxStructure;
        int days = 0;
        // Store all the cells having ripen tomatoes in given input
        //starting from 1, 1 because 0,0 and 0, 1 represents the number of row and col.
        for (int i=1; i <= row; i++)
            for (int j=1; j < col; j++) {
                if (arr[i][j] == 1) { // Add to Queue if its a riped tomato
                    queue.add(new BoxStructure(i, j));
                }
            }

        // Separate these ripen tomatoes from the tomatoes which will ripe the tomatoes due
        // to the tomatoes in given ripen tomatoes using delimiter which is (1001, 1001).
        queue.add(new BoxStructure(1001,1001));

        //Process the tomato box - grid
        while(!queue.isEmpty())
        {
            boolean flag = false;

            // Process all the riped.
            while(!isDelim(queue.peek()))
            {
                boxStructure = queue.peek();

            // Check the right adjacent cell that if it can be ripen
            if(isValidCell(boxStructure.x+1, boxStructure.y, row, col) && arr[boxStructure.x+1][boxStructure.y] == 1)
            {
                if(!flag)
                {
                    // If this is the first tomato to get ripen, increase count and set the flag.
                    days++;
                    flag = true;
                }
                // Make the tomato ripe
                arr[boxStructure.x+1][boxStructure.y] = 1;

                // push the adjacent tomatoes to Queue
                boxStructure.x++;
                queue.add(new BoxStructure(boxStructure.x,boxStructure.y));

                // Move back to current cell
                boxStructure.x--;
            }

            // Check left adjacent cell that if it can be riped
            if (isValidCell(boxStructure.x-1, boxStructure.y,row, col) && arr[boxStructure.x-1][boxStructure.y] == 1)
            {
                if (!flag)
                {
                    days++;
                    flag = true;
                }
                arr[boxStructure.x-1][boxStructure.y] = 1;
                boxStructure.x--;
                queue.add(new BoxStructure(boxStructure.x,boxStructure.y)); // push this cell to Queue
                boxStructure.x++;
            }

            // Check top adjacent cell that if it can be riped
            if (isValidCell(boxStructure.x, boxStructure.y+1, row ,col ) && arr[boxStructure.x][boxStructure.y+1] == 1) {
                if(!flag)
                {
                    days++;
                    flag = true;
                }
                arr[boxStructure.x][boxStructure.y+1] = 1;
                boxStructure.y++;
                queue.add(new BoxStructure(boxStructure.x,boxStructure.y)); // Push this cell to Queue
                boxStructure.y--;
            }

            // Check bottom adjacent cell if it can be riped
            if (isValidCell(boxStructure.x, boxStructure.y-1, row, col) && arr[boxStructure.x][boxStructure.y-1] == 1)
            {
                if (!flag)
                {
                    days++;
                    flag = true;
                }
                arr[boxStructure.x][boxStructure.y-1] = 1;
                boxStructure.y--;
                queue.add(new BoxStructure(boxStructure.x,boxStructure.y)); // push this cell to Queue
            }
                queue.remove();

        }
        // Pop the delimiter
            queue.remove();

        // If the tomatoes were ripen in current frame than separate the
        // riped tomatoes using the delimiter for the next frame for processing.
        if (!queue.isEmpty())
        {
            queue.add(new BoxStructure(1001,1001));
        }

    }

    // Return -1 if all the tomatoes could not be riped, otherwise -1
        return (checkAllTomatoes(arr, row, col))? -1: days;
}

    private static boolean isValidCell(int i, int j, int row, int col){
        return (i >= 1 && j > 1 && i <= row && j < col); //This is to check, we are not out of the tomato box
    }


    // This function is to check whether there is still a un-riped tomatoes remaining
    static boolean checkAllTomatoes(int arr[][],int row, int col)
    {
        for (int i=1; i<=row; i++)
            for (int j=1; j<col; j++)
                if (arr[i][j] == -1)
                    return true;
        return false;
    }

    static boolean isDelim(BoxStructure boxStructure)
    {
        return (boxStructure.x == 1001 && boxStructure.y == 1001); // Used 1001 as the delimiter.
    }

    public static void main(String[] args)
    {
        int arr[][] = {{6, 4},
                {6, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 1}};
        int days = findDaysToRipeTomatoes(arr);
        if(days == -1)
            System.out.println("Tomatoes cannot be riped = "+days);
        else
            System.out.println("Days required for all the tomatoes to get riped = " +days);
    }
}
