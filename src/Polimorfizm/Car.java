package Polimorfizm;
// 1-ЗАДАЧА
public class Car implements CanMove{
    @Override
    public void Move() {
        System.out.println("I can move");
    }
}

class Duck implements CanMove, CanFly, CanEat{

    @Override
    public void Eat() {
        System.out.println("I can eat");
    }
    @Override
    public void Fly() {
        System.out.println("I can fly");
    }
    @Override
    public void Move() {
        System.out.println("I can move");
    }
}

class Dog implements CanEat, CanMove{

    @Override
    public void Eat() {
        System.out.println("I can eat");
    }
    @Override
    public void Move() {
        System.out.println("I can move");
    }
}

class Airplane implements CanFly, CanMove{

    @Override
    public void Fly() {
        System.out.println("I can fly");
    }
    @Override
    public void Move() {
        System.out.println("I can move");
    }
}


// 3-ЗАДАЧА
class Human implements CanRun, CanSwim{
    @Override
    public void Run() {
    }
    @Override
    public void Swim() {
    }
}

class duck implements CanSwim, CanFly, CanRun{
    @Override
    public void Fly() {
    }
    @Override
    public void Run() {
    }
    @Override
    public void Swim() {
    }
}

class Penguin implements CanRun, CanSwim{
    @Override
    public void Run() {
    }
    @Override
    public void Swim() {
    }
}

class airplane implements CanFly, CanMove{
    @Override
    public void Fly() {
    }
    @Override
    public void Move() {

    }
}











