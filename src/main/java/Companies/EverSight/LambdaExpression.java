package Companies.EverSight;

public class LambdaExpression {

    private static void lambda(){
        LambdaExpInterface lambdaExpInterface = (i) -> {
            System.out.println("Show from interface = "+i);
        };
        lambdaExpInterface.show(5);
    }

    public static void main(String[] args){
        lambda();
    }
}
