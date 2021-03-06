package WorkingWithFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WrittenFile {
    public static void main(String[] args) {
        Employee employee = new Employee("Ivan", 1000);
        Employee employee2 = new Employee("Vana", 900);

        try {
            FileOutputStream outputStream = new FileOutputStream("MyEmployee");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

            objectOutputStream.writeObject(employee);
            objectOutputStream.writeObject(employee2);

            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
