package Companies.EverSight;

import java.io.*;

public class SerializationExample {

    public static void main(String[] args){
        Employee e = new Employee(100, "E1");
        try {
            FileOutputStream fo = new FileOutputStream("/Users/menakasundarraj/IdeaProjects/Learnbay/src/main/java/Companies/EverSight/Employee.Ser");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(e);
            oo.close();
            fo.close();
        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }

        deSerialize();
    }

    private static void deSerialize(){
        try {
            FileInputStream fi = new FileInputStream("/Users/menakasundarraj/IdeaProjects/Learnbay/src/main/java/Companies/EverSight/Employee.Ser");
            ObjectInputStream oi = new ObjectInputStream(fi);
            Employee e = (Employee)oi.readObject();
            System.out.println("Serialized object employee name = "+e.name);
            System.out.println("Serialized object employee last name = "+e.lastName);
            System.out.println("Serialized object employee id = "+e.id);
            oi.close();
            oi.close();
        } catch (ClassNotFoundException classNotFoundException) {
            classNotFoundException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }
}
