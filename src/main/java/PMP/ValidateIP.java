package PMP;

public class ValidateIP {

    static boolean validateIP(String ip) {
        // your code goes here
        String[] splitValues = ip.split("\\.");
        System.out.println("ipDigits = "+splitValues.length);
        if(splitValues.length != 4){
            return false;
        }

        for(int i=0;i<splitValues.length;i++){
            String value = splitValues[i];
            try{
                int ipDigits = Integer.parseInt(value);
                System.out.println("ipDigits = "+ipDigits);
                if(ipDigits >=0 && ipDigits <= 255){
                    continue;
                }else{
                    return false;
                }

            }catch(NumberFormatException e){
                return false;
            }

        }
        return true;
    }

    public static void main(String[] args) {
        validateIP("123.24.59.99");
    }
}
