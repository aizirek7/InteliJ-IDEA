package OOP.Abstract;

public class AbstractMain {
    public static void main(String[] args) {
//        Pet pet = new Cat();
//        System.out.println(pet.getName());

//        Pet pet = new Cat();
//        pet.setName("Я - пушистик");
//        System.out.println(pet.getName());

//        Pet pet = new Cat();
//        pet.setName("Я - пушистик");
//        System.out.println(pet.getName());

//        System.out.println(getObjectType(new Bull()));
//        System.out.println(getObjectType(new Cat()));
//        System.out.println(getObjectType(new Tiger()));
//        System.out.println(getObjectType(new Lion()));
//        System.out.println(getObjectType(new Pig()));

//        System.out.println(getObjectType(new Bull()));
//        System.out.println(getObjectType(new Cat()));
//        System.out.println(getObjectType(new Tiger()));
//        System.out.println(getObjectType(new Lion()));
//        System.out.println(getObjectType(new Cow()));
//        System.out.println(getObjectType(new Animal()));

//        Integer i = 5;
//        int x = transformValue(i);
//        System.out.println(x);

//        Horse horse = new Pegasus();
//        horse.run();
//
//        Pegasus pegasus = new Pegasus();
//        pegasus.fly();

//        Pegasus pegasus = new Pegasus();

    }

//         ПРАКТИКА 1
//        Переопредели метод getName в классе Cat так, чтобы программа выдавала на
//        экран надпись «Я - кот».
//    public static class Pet {
//        public String getName() {
//            return "Я - пушистик";
//        }
//    }
//    public static class Cat extends Pet{
//        @Override
//        public String getName() {
//            return "Я - кот";
//        }
//    }



//    ПРАКТИКА 2
//    Переопредели метод setName в классе Cat так, чтобы программа выдавала на
//    экран надпись «Я - кот».
//       public static class Pet{
//        protected String name;
//        public Pet(){}
//        public String getName(){
//            return name;
//        }
//        public void setName(String name){
//            this.name = name;
//        }
//}
//public static class Cat extends Pet{
//    @Override
//    public void setName(String name) {
//        System.out.println("Я - кот");
//    }
//}



//    ПРАКТИКА 3
//    Добавь один метод в класс Cat так, чтобы программа ничего не выводила на экран.
//        public static class Pet{
//        protected String name;
//        public Pet(){}
//        public final String getName(){
//            return name;
//        }
//        public void setName(String name){
//            this.name = name;
//        }
//}
//public static class Cat extends Pet{
//    @Override
//    public void setName(String name) {
//        System.out.println();
//    }
//}



//    ПРАКТИКА 4
//    Напиши метод, который определяет, какой объект передали в него.
//    Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев»,
//    «Бык», «Животное».
//    public static class Cat{
//
//    }
//    public static class Tiger{
//
//    }
//    public static class Lion{
//
//    }
//    public static class Bull{
//
//    }
//    public static class Pig{
//
//    }
//    public static String getObjectType(Object o){
//        if (o instanceof Cat){
//            return "Cat";
//        }
//        if (o instanceof Lion){
//            return "Lion";
//        }
//        if (o instanceof Bull){
//            return "Bull";
//        }
//        if (o instanceof Pig){
//            return "Pig";
//        }
//        if (o instanceof Tiger){
//            return "Tiger";
//        }
//        return "Animal";
//    }



//    ПРАКТИКА 5
//    Напиши метод, который определяет, какой объект в него передали.
//    Программа должна выводить на экран одну из надписей: «Кот», «Тигр», «Лев»,
//    «Бык», «Корова», «Животное».
//    public static class Cat extends Animal{
//
//    }
//    public static class Tiger extends Animal{
//
//    }
//    public static class Lion extends Animal{
//
//    }
//    public static class Bull extends Animal{
//
//    }
//    public static class Cow extends Animal{
//
//    }
//    public static class Animal{
//
//    }
//    public static String getObjectType(Object o){
//        if (o instanceof Cat){
//            return "Cat";
//        }
//        if (o instanceof Lion){
//            return "Lion";
//        }
//        if (o instanceof Bull){
//            return "Bull";
//        }
//        if (o instanceof Cow){
//            return "Cow";
//        }
//        if (o instanceof Tiger){
//            return "Tiger";
//        }
//        return "Animal";
//    }





//    ПРАКТИКА 6
//    Вот что тебе нужно сделать в этой задаче:
//    Внутри класса Solution создай интерфейс public interface CanFly (летать) с методом
//    void fly().
//    Внутри класса Solution создай интерфейс public interface CanClimb (лазить по
//    деревьям) с методом void climb().
//    Внутри класса Solution создай интерфейс public interface CanRun (бегать) с
//            методом void run().
//    Подумай логически, какие именно интерфейсы нужно добавить для каждого
//    класса.
//    Добавь интерфейсы классам Cat (кот), Dog (собака), Tiger (тигр), Duck (Утка).
//    public interface CanRun{
//        public void canRun();
//    }
//    public interface CanClimb{
//        public void canClimb();
//    }
//    public interface CanFly{
//        public void canFly();
//    }
//
//    public static class Cat implements CanRun, CanClimb{
//        @Override
//        public void canRun() {
//        }
//        @Override
//        public void canClimb() {
//        }
//    }
//
//    public static class Dog implements CanRun {
//        @Override
//        public void canRun() {
//        }
//    }
//
//    public static class Tiger extends Cat{
//        @Override
//        public void canRun() {
//        }
//        @Override
//        public void canClimb() {
//        }
//    }
//
//    public static class Duck implements CanFly, CanRun{
//        @Override
//        public void canFly() {
//        }
//        @Override
//        public void canRun() {
//        }
//    }




//    ПРАКТИКА 7
//    Есть интерфейсы CanFly (летать), CanSwim (плавать), CanRun (бегать).
//    Добавь эти интерфейсы классам Duck (утка), Penguin (пингвин), Toad (жаба)
//    public interface CanFly{
//        public void canFly();
//    }
//    public interface CanSwim{
//        public void canSwim();
//    }
//    public interface CanRun{
//        public void canRun();
//    }
//
//    public static class Duck implements CanRun, CanFly, CanSwim{
//        @Override
//        public void canFly() {
//        }
//        @Override
//        public void canSwim() {
//        }
//        @Override
//        public void canRun() {
//        }
//    }
//
//    public static class Penguin implements CanSwim, CanRun{
//        @Override
//        public void canSwim() {
//        }
//        @Override
//        public void canRun() {
//        }
//    }
//
//    public static class Toad implements CanSwim{
//        @Override
//        public void canSwim() {
//        }
//    }




//    ПРАКТИКА 8
//    Добавь как можно больше интерфейсов к классу Human, но так, чтобы он не стал
//    абстрактным классом.
//    Добавлять методы в класс Human запрещается.
//    public static interface Worker{
//        public void workLazy();
//    }
//    public static interface Businessman{
//        public void workHard();
//    }
//    public static interface Secretary{
//        public void workLazy();
//    }
//    public static interface Miner{
//        public void workVeryHard();
//    }
//
//    public static class Human implements Businessman, Secretary, Worker{
//        @Override
//        public void workHard() {
//        }
//        @Override
//        public void workLazy() {
//        }
//    }





//    ПРАКТИКА 9
//    Добавь такой класс-родитель к классу CTO (технический директор), чтобы класс
//    перестал быть абстрактным.
//    Добавлять/реализовывать методы в классе CTO запрещается.
//    public static interface Businessman{
//        public void workHard();
//    }
//
//    public static class CTO extends cto{
//
//    }
//    public static class cto implements Businessman {
//        @Override
//        public void workHard() {
//
//        }
//    }




//    ПРАКТИКА 10
//    Добавь еще один метод, чтобы программа выводила на экран число 10.
//    Подсказка: используй перегрузку методов.
//    public static int transformValue(int i){
//        return i * i;
//    }
//    public static Integer transformValue(Integer i){
//        return i * 2;
//    }
//    public static String transformValue(String i){
//        return i;
//    }




//    ПРАКТИКА 11
//    Необходимо расставить правильно ключевые слова abstract, чтобы программа
//    компилировалась.
//    Добавь там, где нужно, и удали там, где они не нужны.
//    public static interface CanFly{
//        public void fly();
//    }
//    public static class Horse{
//        public void run(){
//        }
//    }
//    public static class Pegasus extends Horse implements CanFly{
//        @Override
//        public void fly() {
//        }
//    }
//    public static abstract class SwimmingPegasus extends Pegasus{
//        public abstract void swim();
//    }






//    ПРАКТИКА 12
//    Сделать класс Pegasus (пегас) на основе класса Horse (лошадь) и интерфейса
//    CanFly (летать).
//    public static interface CanFly{
//        public void fly();
//    }
//    public static class Horse{
//        public void run(){
//
//        }
//    }
//    public static class Pegasus extends Horse implements CanFly{
//        @Override
//        public void fly() {
//        }
//    }
    

}

