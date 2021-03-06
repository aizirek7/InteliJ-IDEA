package j200;

public class modificator {
    public static void main(String[] args) {
//        public
//        private
//        default
//        protected
//        static
        Man person = new Man();
        Man.age = 30;
        person.getInfo();
        Man person1 = new Man();
        person1.getInfo();

//        Будет выводиться последнее введеное значение
//        Man person3 = new Man();
//        Man.age = 45;
//        Man person4 = new Man();
//        Man.age = 50;
//        person3.getInfo();
//        person4.getInfo();


    }
}



class Man{

    static int age;


    void getInfo(){


        System.out.println("I am " + age + " years old");
    }
}

