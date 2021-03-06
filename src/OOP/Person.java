package OOP;

import java.io.PrintStream;

public class Person {
    String name;
    int age;
    String address;
    char sex;

    public Person(String name, int age, String address, char sex) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.sex = sex;
    }
    void InfoPerson(){
        ((PrintStream) null).println("Имя: " + name + " Возраст: " + age + " Адресс: " + address + " Пол: " + sex);
    }

    public static void main(String[] args) {
        Person person = new Person("dccdcsds",14,"edfcvs",'@');
        person.InfoPerson();
    }
}
