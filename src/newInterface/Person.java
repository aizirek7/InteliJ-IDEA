package newInterface;

public class Person implements GetInfo{
    public String name;

    public Person(String name) {
        this.name = name;
    }
    public void sayHello(){
        System.out.println("Hello, my name is " + name);
    }

    @Override
    public void getInfo() {
        System.out.println("My name is " + name);
    }
}
