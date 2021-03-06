package Example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class instanceofJava {
    public static void main(String[] args) throws IOException {
//        Building school = getSchool();
//        Building shop = getBuilding();
//        System.out.println(school);
//        System.out.println(shop);

//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        boolean answer = true;
//        String name = "";
//        while (answer) {
//            name = bufferedReader.readLine();
//            if (name.equals(" ")) {
//                answer = false;
//                break;
//            } else {
//                Cat cat = CatFactory.getCatByKey(name);
//                System.out.println(cat.toString());
//            }
//        }

//        Food food = new Food();
//        Selectable selectable = new Food();
//        Food newFood = (Food) selectable;
//        foodMethods(food);
//        selectableMethods(selectable);

//        Object obj = new Jerry();
//        Mouse mouse = (Mouse) obj;
//        GrayMouse grayMouse = (GrayMouse) mouse;
//        Jerry jerry = (Jerry) grayMouse;
//        printClasses(obj, mouse, grayMouse, jerry);

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        Person person = null;
//        String key;
//        while (!(key = reader.readLine()).equals("exit")) {
//            if ("player".equals(key)) {
//                person = new Player();
//            } else if ("dancer".equals(key)) {
//                person = new Dancer();
//            }
//            haveFun(person);
//        }



    }


//    ПРАКТИКА 1 EASY
//    В этой задаче тебе нужно:
//    Правильно расставить наследование между Building (здание) и School (здание
//    школы).
//    Подумать, объект какого класса должны возвращать методы getSchool и
//    getBuilding.
//    Изменить null на объект класса Building или School.
//    Сигнатуры методов getSchool() и getBuilding() не меняй.
//    public static Building getSchool(){
//
//        return new School;
//    }
//    public static Building getBuilding(){
//
//        return new Building;
//    }
//    static class School extends Building{
//        @Override
//        public String toString() {
//             return "School";
//        }
//    }
//    static class Building{
//        @Override
//        public String toString() {
//             return "Building";
//        }
//    }



//    ПРАКТИКА 2 MEDIUM
//    Давай напишем программу, которая будет давать имена всем котикам,
//    выпускаемым на нашей котофабрике.
//    Для этого нужно:
//    Считывать строки (параметры) с консоли, пока пользователь не введет пустую
//    строку (Enter).
//    Для каждого параметра (имени кота):
//    создать объект cat класса Cat, который равен коту из getCatByKey(String параметр).
//    вывести на экран cat.toString().
//    static class CatFactory {
//        static Cat getCatByKey(String key) {
//            Cat cat = null;
//            if ("vaska".equals(key)) {
//                cat = new MaleCat("Василий");
//            } else if ("murka".equals(key)) {
//                cat = new FemaleCat("Мурочка");
//            } else if ("kiska".equals(key)) {
//                cat = new FemaleCat("Кисюлька");
//            } else {
//                cat = new Cat(key);
//            }
//            return cat;
//        }
//    }
//
//    static class Cat {
//        private String name;
//
//        protected Cat(String name) {
//            this.name = name;
//        }
//
//        public String getName() {
//            return this.name;
//        }
//
//        public String toString() {
//            return "Я уличный кот " + getName();
//        }
//    }
//
//    static class MaleCat extends Cat {
//        MaleCat(String name) {
//            super(name);
//        }
//
//        public String toString() {
//            return "Я - солидный кошак по имени " +
//
//                    getName();
//        }
//    }
//
//    static class FemaleCat extends Cat {
//        FemaleCat(String name) {
//            super(name);
//        }
//
//        public String toString() {
//            return "Я - милая кошечка по имени " +
//
//                    getName();
//        }
//    }
//
//


//    ПРАКТИКА 3 MEDIUM
//    Давай напишем программу, которая поможет тебе выбрать, что съесть на обед.
//    Для этого нужно:
//    Реализовать интерфейс Selectable в классе Food.
//    Метод onSelect() должен выводить на экран фразу "The food was selected".
//    Подумай, какие методы можно вызвать для переменной food, а какие для —
//    selectable.
//    В методе foodMethods вызови методы onSelect, onEat, если это возможно.
//    В методе selectableMethods вызови методы onSelect, onEat, если это возможно.
//    Не используй явное приведение типов.
//public static void foodMethods(Food food) {
//        food.onEat();
//        food.onSelect();
//
//}
//    public static void selectableMethods(Selectable selectable) {
//        selectable.onSelect();
//
//    }
//    interface Selectable {
//        void onSelect();
//    }
//    static class Food implements Selectable{
//        public void onEat() {
//            System.out.println("The food was eaten");
//        }
//
//        @Override
//        public void onSelect() {
//            System.out.println("The food was selected");
//        }
//    }


//    ПРАКТИКА 4 EASY
//    Давай напишем программу, которая создает мышонка.
//    Для этого инициализируй объект obj таким классом, чтобы метод main()
//    выполнился без ошибок.

//    public static void printClasses(Object obj, Mouse mouse, GrayMouse
//            grayMouse, Jerry jerry) {
//        System.out.println(jerry.getClass().getSimpleName());
//        System.out.println(grayMouse.getClass().getSimpleName());
//        System.out.println(mouse.getClass().getSimpleName());
//        System.out.println(obj.getClass().getSimpleName());
//    }
//    static class Mouse {
//    }
//    static class GrayMouse extends Mouse {
//    }
//    static class Jerry extends GrayMouse {
//    }

//    ПРАКТИКА 5 EASY
//    Посмотри, что делает эта программа.
//    Затем измени haveFun так, чтобы он вызывал метод:
//    play(), если person имеет тип Player.
//    dance(), если person имеет тип Dancer.

//        public static void haveFun (Person person){
//        if (person instanceof Player){
//            ((Player) person).play();
//        }
//        else if (person instanceof Dancer){
//            ((Dancer) person).dance();
//        }
//
//        }
//        interface Person {
//        }
//        static class Player implements Person {
//            void play() {
//                System.out.println("playing");
//            }
//        }
//        static class Dancer implements Person {
//            void dance() {
//                System.out.println("dancing");
//            }
//        }




    }