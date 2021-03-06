package newInterface;

public class main {
    public static void main(String[] args) {
        GetInfo animal1 = new Animal(56);
        GetInfo person1 = new Person("Bob");
        animal1.getInfo();
        person1.getInfo();


        Animal animal = new Animal(2);
        Person person = new Person("Timur");
        animal.getInfo();
        person.getInfo();







    }
}
