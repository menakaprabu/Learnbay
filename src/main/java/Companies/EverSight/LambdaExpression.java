package Companies.EverSight;

public class LambdaExpression {

    public static void main(String[] args){
        LambdaExpInterface lambdaExpInterface = (i) -> {
            System.out.println("Show from interface = "+i);
        };
        lambdaExpInterface.show(5);
    }
}
