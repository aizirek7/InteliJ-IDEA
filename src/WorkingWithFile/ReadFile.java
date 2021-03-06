package WorkingWithFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadFile {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream1 = new FileInputStream("MyEmployee");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream1);

            Employee employee = (Employee) objectInputStream.readObject();
            Employee employee2 = (Employee) objectInputStream.readObject();

            System.out.println(employee);
            System.out.println(employee2);

            objectInputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
