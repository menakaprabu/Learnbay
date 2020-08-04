package Companies.Lyft;

public class WaterJugProblem {

    private static boolean canMeasure(int x, int y, int z){
        if(x == z || y == z || (x+y) == z){
            return true;
        }
        if(x+y < z){
            return false;
        }
        return (z % gcd(x,y) == 0);
    }

    private static int gcd(int x, int y){
            while(y != 0){
                int temp = y;
                y = x%y;
                x = temp;
            }
            return x;
    }

    public static void main(String[] args){
        boolean canBeMesaurable = canMeasure(3, 5, 4);
        System.out.println("canBeMesaurable example 1= "+canBeMesaurable);

        boolean canBeMesaurable2 = canMeasure(2, 6, 5);
        System.out.println("canBeMesaurable example 2 = "+canBeMesaurable2);
    }
}
