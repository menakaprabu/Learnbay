package Companies.EverSight;

public class FrogJump {

    private static int minJump(int x, int y, int d){
        int sum = x;
        int count = 0;
        while(sum <= y){
            sum = sum+d;
            count++;
        }
        return count;
    }

    public static void main(String[] args){
        int count = minJump(10,85,40);
        System.out.println("count = "+count);
    }
}
