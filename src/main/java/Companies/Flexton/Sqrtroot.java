package Companies.Flexton;

public class Sqrtroot {

    public static double sqrt(int input) {
        double temp;
        double squareRoot = input / 2;

        do {
            temp = squareRoot;
            squareRoot = (temp + (input / temp)) / 2;
        } while ((temp - squareRoot) != 0);

        return squareRoot;
    }

    public static void main(String[] main){
        double val = sqrt(16);
        System.out.println("val = "+val);
    }
}
