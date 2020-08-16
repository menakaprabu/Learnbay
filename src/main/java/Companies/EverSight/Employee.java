package Companies.EverSight;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Employee implements Serializable {
    String name;

    String lastName;

    transient int id;

    Employee(int id, String name){
        this.name = name;
        lastName = "Test";
        this.id = id;
    }

     private void readObject(ObjectInputStream aInputStream) throws ClassNotFoundException, IOException
    {
        name = aInputStream.readUTF();
        lastName = aInputStream.readUTF();
    }

    private void writeObject(ObjectOutputStream aOutputStream) throws IOException
    {
        aOutputStream.writeUTF(name);
        aOutputStream.writeUTF(lastName);
    }
}
