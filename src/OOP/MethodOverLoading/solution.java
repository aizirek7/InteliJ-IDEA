package OOP.MethodOverLoading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class solution {
    public static void main(String[] args) {
//        Goose goose =new Goose();
//        System.out.println(goose.getSize());
//        SmallAnimal smallAnimal = new SmallAnimal();
//        System.out.println(smallAnimal.getSize());
//        Dragon dragon = new Dragon();
//        System.out.println(dragon.getSize());
//        BigAnimal bigAnimal = new BigAnimal();
//        System.out.println(bigAnimal.getSize());

//        new solution.LuxuriousCar().printlnDesire();
//        new solution.CheapCar().printlnDesire();
//        new solution.Ferrari().printlnDesire();
//        new solution.Lanos().printlnDesire();

//        List<Book> books = new LinkedList<Book>();
//        books.add(new MarkTwainBook("Tom Sawyer"));
//        books.add(new AgathaChristieBook("Hercule Poirot"));
//        System.out.println(books);


//            printlnFingers();
//            printlnBodyParts();
//            printlnLivingParts();








//        print((double) 1);
//        print((Number) 1);
//        print((double) 1);
//        print((Integer) 1);
//        print((double) 1);

//        printMatrix(2, 3, "8");

//        print(1);

//        Man man = new Man();
//        Woman woman = new Woman();
//        printName(man);
//        printName(woman);

//        add((short) 1, 2f);
//        add(1, 2);
//        add(2d, 2);
//        add((byte) 1, 2d);





        }




//    ПРАКТИКА 1 EASY
//    Добавь все возможные интерфейсы из Movable, Sellable, Discountable в класс
//    Clothes.
//    Реализуй их методы.
//    public interface Movable{
//        boolean isMovable();
//    }
//    public interface Sellable{
//        Object getAllowedAction(String name);
//    }
//    public interface Discountable{
//        Object getAllowedActions();
//    }
//    public static class Clothes implements Movable, Sellable, Discountable {
//
//        @Override
//        public boolean isMovable() {
//            return false;
//        }
//
//        @Override
//        public Object getAllowedAction(String name) {
//            return null;
//        }
//
//        @Override
//        public Object getAllowedActions() {
//            return null;
//        }
//    }


//    ПРАКТИКА 2 EASY
//    Давай создадим классы животных и определим их размер, унаследовав их от
//    правильных классов.
//    Для этого:
//    Создай public static класс Goose (Гусь).
//    Создай public static класс Dragon (Дракон).
//    Унаследуй класс Goose от BigAnimal или SmallAnimal, подумай, какой логически
//    больше подходит.
//    Унаследуй класс Dragon от BigAnimal или SmallAnimal, подумай, какой логически
//    больше подходит.
//    В классах Goose и Dragon переопредели метод String getSize(), расширь видимость
//    до максимальной.
//    В классе Goose метод getSize должен возвращать строку "Гусь маленький, " +
//            [getSize родительского класса].
//    В классе Dragon метод getSize должен возвращать строку "Дракон большой, " +
//            [getSize родительского класса].
//public static class BigAnimal {
//    protected String getSize() {
//        return "как динозавр";
//    }
//}
//    public static class SmallAnimal {
//        String getSize() {
//            return "как кошка";
//        }
//    }
//    public static class Goose extends SmallAnimal{
//        @Override
//        String getSize() {
//             return "Гусь маленький, " + this;
//        }
//    }
//    public static class Dragon extends BigAnimal{
//        @Override
//        protected String getSize() {
//             return "Дракон большой, " + this;
//        }
//    }


    //    ПРАКТИКА 3 MEDIUM
//    Оцени наши машины и определи их в подходящую категорию — роскошное или
//    дешевое авто — и выведи результат.
//    Для вывода используй только переменные из класса Constants.
//    В классе Ferrari реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу
//    ездить на Феррари".
//    В классе Lanos реализуй метод printlnDesire, чтобы он выводил на экран "Я хочу
//    ездить на Ланосе".
//    Создай public static класс LuxuriousCar (РоскошнаяМашина).
//    Создай public static класс CheapCar (ДешеваяМашина).
//    Унаследуй Ferrari и Lanos от CheapCar и LuxuriousCar, подумай, какой класс для
//    кого.
//    В классе LuxuriousCar реализуй метод printlnDesire, чтобы он выводил на экран "Я
//    хочу ездить на роскошной машине".
//    В классе CheapCar реализуйте метод printlnDesire, чтобы он выводил на экран "Я
//    хочу ездить на дешевой машине".
//    В классах LuxuriousCar и CheapCar для метода printlnDesire расставь различными
//    способами модификаторы доступа так, чтобы в классах Ferrari и Lanos выполнялось
//    расширение видимости.
//    public static class Ferrari extends LuxuriousCar{
//        public void printlnDesire() {
//            Constants constants = new Constants();
//            System.out.println(constants.WANT_STRING + constants.FERRARI_NAME);
//        }
//    }
//
//    public static class Lanos extends CheapCar{
//        public void printlnDesire() {
//            Constants constants = new Constants();
//            System.out.println(constants.WANT_STRING + constants.LANOS_CAR);
//        }
//    }
//
//    public static class LuxuriousCar{
//        public void printlnDesire(){
//            Constants constants = new Constants();
//            System.out.println(constants.WANT_STRING + constants.LUXURIOUS_CAR);
//        }
//    }
//
//    public static class CheapCar{
//        public void printlnDesire(){
//            Constants constants = new Constants();
//            System.out.println(constants.WANT_STRING + constants.CHEAP_CAR);
//        }
//    }
//    public static class Constants{
//        public  String WANT_STRING = "Я хочу ездить на ";
//        public  String LUXURIOUS_CAR = "роскошной машине";
//        public  String CHEAP_CAR = "дешевой машине";
//        public  String FERRARI_NAME = "FERRARI";
//        public  String LANOS_CAR = "LONOS";
//
//    }




//    ПРАКТИКА 4 HARD
//    Давай напишем программу, которая будет определять жанр книги, или автора,
//    который ее написал.
//    Для этого:
//    Создай public static класс MarkTwainBook, который наследуется от Book. Имя
//    автора — [Mark Twain].
//    Параметр конструктора — название книги (title).
//    В классе MarkTwainBook реализуй все абстрактные методы.
//    Для метода getBook измени тип возвращаемого значения на более подходящий.
//    Создай по аналогии AgathaChristieBook. Имя автора — [Agatha Christie].
//    В классе Book реализуй тело метода getOutputByBookType() так, чтобы он
//    возвращал:
//    agathaChristieOutput — для книг Агаты Кристи;
//    markTwainOutput — для книг Марка Твена.
//     public static class MarkTwainBook extends Book{
//        String title;
//        public MarkTwainBook(String title) {
//            super("Mark Twain");
//            this.title = title;
//        }
//        @Override
//        public MarkTwainBook getBook() {
//            return this;
//        }
//        @Override
//        public String getTitle() {
//            return this.title;
//        }
//    }
//    public static class AgathaChristieBook extends Book{
//        String title;
//        public AgathaChristieBook(String title) {
//            super("Agatha Christie");
//            this.title = title;
//        }
//        @Override
//        public AgathaChristieBook getBook() {
//            return this;
//        }
//        @Override
//        public String getTitle() {
//            return this.title;
//        }
//    }
//    abstract static class Book {
//        private String author;
//        public Book(String author) {
//            this.author = author;
//        }
//        public abstract Book getBook();
//        public abstract String getTitle();
//        private String getOutputByBookType() {
//            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
//            String markTwainOutput = getBook().getTitle() + " was written by " + author;
//            String output = "Output";
//            if (author.equals("Agatha Christie")) {
//                output = agathaChristieOutput;
//            }else{
//                output = markTwainOutput;
//            }
////Add your code here
//            return output;
//        }
//        public String toString() {
//            return getOutputByBookType();
//        }
//    }




//    ПРАКТИКА 5 MEDIUM
//    Исправь метод containsBones() и всю связанную с ним логику так, чтобы:
//    1. Поведение программы осталось прежним.
//    2. Метод containsBones() возвращал тип Object и значение "Yes" вместо true, "No" —
//    вместо false.
//    1. Метод containsBones() в классе BodyPart должен иметь тип возвращаемого
//    значения Object.
//            2. Класс Finger должен быть потомком класса BodyPart.
//3. Метод containsBones() в классе Finger должен иметь тип возвращаемого
//    значения Object.
//            4. Метод containsBones() в классе BodyPart должен возвращать строку "Yes".
//            5. Метод containsBones() в классе Finger должен возвращать строку "Yes", если
//    такой же метод в классе BodyPart возвращает "Yes" и флаг isArtificial равен
//false. Если приведенное условие не выполняется - вернуть "No".
//            6. Метод toString() в классе BodyPart должен возвращать строку формата
//"name(имя части тела) содержит кости", если метод containsBones()
//    возвращает "Yes" для этой части тела. Если "No", то строку формата
//"name(имя части тела) не содержит кости".
//public static interface LivingPart {
//    Object containsBones();
//}
//    public static class BodyPart implements LivingPart {
//        private String name;
//        public BodyPart(String name) {
//            this.name = name;
//        }
//        public Object containsBones() {
//            return "YES";
//        }
//        public String toString() {
//             if (containsBones().equals("YES")){
//                 return name + " содержит кости";
//             }
//             else {
//                 return name + " не содержит кости";
//             }
//        }
//    }
//    public static class Finger extends BodyPart {
//        private boolean isArtificial;
//        public Finger(String name, boolean isArtificial) {
//            super(name);
//            this.isArtificial = isArtificial;
//        }
//        public Object containsBones() {
//            if (super.containsBones().equals("YES") && !isArtificial){
//                return "YES";
//            }
//            else {
//                return "NO";
//            }
//        }
//    }
//    private static void printlnLivingParts() {
//        System.out.println(new BodyPart("Рука").containsBones());
//    }
//    private static void printlnBodyParts() {
//        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
//        bodyParts.add(new BodyPart("Рука"));
//        bodyParts.add(new BodyPart("Нога"));
//        bodyParts.add(new BodyPart("Голова"));
//        bodyParts.add(new BodyPart("Тело"));
//        System.out.println(bodyParts.toString());
//    }
//    private static void printlnFingers() {
//        List<Finger> fingers = new ArrayList<Finger>(5);
//        fingers.add(new Finger("Большой", true));
//        fingers.add(new Finger("Указательный", true));
//        fingers.add(new Finger("Средний", true));
//        fingers.add(new Finger("Безымянный", false));
//        fingers.add(new Finger("Мизинец", true));
//        System.out.println(fingers.toString());
//    }







//    ПРАКТИКА 1 EASY
//    Удали реализации всех лишних методов, чтобы вывод программы выглядел так:
//    Это double
//    Это Object
//    Это double
//    Это Integer
//    Это double
//public static void print(Integer i) {
//    System.out.println("Это Integer");
//}
//    public static void print(int i) {
//        System.out.println("Это Integer");
//    }
//    public static void print(Short i) {
//        System.out.println("Это Object");
//    }
//    public static void print(Object i) {
//        System.out.println("Это Object");
//    }
//    public static void print(double i) {
//        System.out.println("Это double");
//    }
//    public static void print(Double i) {
//        System.out.println("Это double");
//    }
//    public static void print(float i) {
//        System.out.println("Это Double");
//    }




//    ПРАКТИКА 2 MEDIUM
//    Перегрузи метод printMatrix() 8 различными способами, чтобы в итоге у тебя
//    получилось 10 различных методов printMatrix().
//    Требования:
//            1. В классе Solution должны быть реализованы 10 методов printMatrix() с
//    различными аргументами.
//            2. Класс Solution должен быть public.
//            3. Все методы класса Solution должны быть статическими.
//4. Все методы класса Solution должны быть публичными.
//public static void printMatrix(int m, int n, String value) {
//    System.out.println("Заполняем объектами String");
//    printMatrix(m, n, (Object) value);
//}
//    public static void printMatrix(int m, int n, Object value) {
//        for (int i = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                System.out.print(value);
//            }
//            System.out.println();
//        }
//    }
//    public static void printMatrix(int m, long n, Object value){
//        System.out.println("int, long, Object");
//    }
//    public static void printMatrix(short m, int n, Object value){
//        System.out.println("short, int, Object");
//    }
//    public static void printMatrix(long m, short n, Object value){
//        System.out.println("long, short, Object");
//    }
//    public static void printMatrix(int m, short n, Object value){
//        System.out.println("int, short, Object");
//    }
//    public static void printMatrix(int m, float n, Object value){
//        System.out.println("int, float, Object");
//    }
//    public static void printMatrix(long m, float n, Object value){
//        System.out.println("long, float, Object");
//    }
//    public static void printMatrix(double m, int n, Object value){
//        System.out.println("double, int, Object");
//    }
//    public static void printMatrix(long m, int n, Object value){
//        System.out.println("long, int, Object");
//    }





//    ПРАКТИКА 3 EASY
//    Посмотри на реализации метода print() в коде и определи, какой из них будет
//    вызван.
//    Удали все лишние реализации метода print().
//    Требования:
//            1. В классе Solution кроме метода main должен остаться только один метод
//    print (с правильным параметром).
//            2. Метод print() должен быть публичным.
//            3. Метод print() должен быть статическим.
//            4. Программа должна выводить на экран строку "Я буду Java прогером!".
//    public static void print(long l) {
//        System.out.println("Я буду Java прогером!");
//    }



//    ПРАКТИКА 4 EASY
//    Измени метод printName() так, чтобы он выполнялся для man и woman.
//    Реализация метода printName() должна быть одна.
//    Требования:
//            1. В классе Solution должен быть реализован только один метод printName().
//            2. Метод printName() должен принимать один параметр типа Human.
//            3. Класс Man должен быть потомком класса Human.
//4. Класс Woman должен быть потомком класса Human.
//public static void printName(Human human) {
//}
//    public static class Human {
//    }
//    public static class Man extends Human{
//    }
//    public static class Woman extends Human{
//    }




//    ПРАКТИКА 5 EASY
//    Убери в методе main() лишние строки, для которых метод add() не реализован.
//    Требования:
//            1. В классе Solution должно быть реализовано три метода add().
//            2. В методе main() нужно убрать лишние строки.
//            3. Все методы класса Solution должны быть статическими.
//4. Все методы класса Solution должны быть публичными.
//public static void add(int i, int j) {
//    System.out.println("Integer addition");
//}
//    public static void add(int i, double j) {
//        System.out.println("Integer and double addition");
//    }
//    public static void add(double i, double j) {
//        System.out.println("Double addition");
//    }


}
