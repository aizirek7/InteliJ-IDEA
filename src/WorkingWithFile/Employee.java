package WorkingWithFile;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private int salary;
//    transient - ключивое слово для java чтобы он не серизизовал

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + name + " Salary " + salary;
    }
}
