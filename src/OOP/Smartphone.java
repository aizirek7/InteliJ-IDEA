package OOP;

public class Smartphone extends Phone{
    int memory;
    int camera;

    @Override
    public void Call() {
        System.out.println("caaall");

    }

    @Override
    public void Ring() {
        System.out.println("Din Din");

    }

    @Override
    public void makeSound() {

    }
    public Smartphone(int memory, int camera) {
        this.memory = memory;
        this.camera = camera;
    }
}

//    public doggg(String name, int age, int weight) {
//        super(name, age, weight);
//    }
//
//    @Override
//    public void makeSound() {
//        System.out.println("gav gav");
//    }
//
//    public void guard(){
//        System.out.println("guard");
//    }
//}
