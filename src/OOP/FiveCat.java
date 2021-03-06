package OOP;

import java.io.PrintStream;

public class FiveCat {
    String name;
    int age;
    int weight;
    String colour;
    String address;

    FiveCat(){}

    FiveCat(String name){
        name = name;
        this.weight = 3;
        this.age = 5;
    }
    FiveCat(String name,int weight, int age){
        name = name;
        this.weight = weight;
        this.age = age;
        address = null;
    }
    FiveCat(String name,int age){
        name = name;
        this.age = age;
        weight = 3;
        this.address = null;
    }
    FiveCat(int weight,String colour){
        this.weight = weight;
        colour = colour;
        address = "Бездомный";
        this.age = 5;
    }
    FiveCat(int weight,String colour,String address){
        this.weight = weight;
        this.colour = colour;
        this.address = address;
        this.age = 5;
    }
    void InfoFiveCAt(){
        ((PrintStream) null).println("weight: " + weight + " name: " + name + " age " + age + " colour " + colour);
    }

    public static void main(String[] args) {
        FiveCat fiveCat = new FiveCat("wxcc",12);
        fiveCat.InfoFiveCAt();
    }
}
