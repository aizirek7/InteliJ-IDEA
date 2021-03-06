package OOP.MethodOverLoading;

public class NewTask {
//    public static void main(String[] args) {
//        class ParentAnimal {
//            int ParentAnimal = 10; // 1
//            String name = "123"; // 3
//
//            public ParentAnimal()  // 4
//            {
//                System.out.println("Конструктор класса ParentAnimal");
//                System.out.println(ParentAnimal);
//                System.out.println(name);
//            }
//        }
//        class Catt extends ParentAnimal {
//            int Catt = 15; // 2
//            String name2 = "123123"; // 5
//
//            public Catt() // 6
//            {
//                System.out.println("Конструктор класса Catt");
//                System.out.println(Catt);
//                System.out.println(name2);
//            }
//        }
//    }
public static void main(String[] args) {

}

}

class ParentAnimal{
    static String poroda;
    public ParentAnimal(String poroda) {
        this.poroda = poroda;
    }
}

class Catt extends ParentAnimal{
    static String name;
    static String poroda;
    static int age;

    public Catt(String name, String poroda, int age) {
        super(poroda);
        this.name = name;
        this.age = age;
    }
}


