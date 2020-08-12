package Companies.EverSight;

public class Necklace {

    public int solution(int[] A){

    int maxVal = 0;
    int[] beads = new int[A.length+1];
    int ibean = 0;
    int head;
    int tail;
    int counter;
    if (A.length > 0)
    {
        for(int i = 0; i < A.length; i++)
        {
            counter = 1;
            head = i;
            tail = A[i];
            if (head != tail)
            {

                if (head == 0)
                {
                    beads[ibean++] = head;
                    beads[ibean++] = tail;
                    // search tail
                    while (head != tail)
                    {
                        tail = A[tail];
                        beads[ibean++] = tail;
                        counter++;
                    }
                }
            }
            if (counter > maxVal)
            {
                maxVal = counter;
            }
        }
    }
			return maxVal;
}
}
