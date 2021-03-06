package Example;

import java.awt.*;

public class Solutions {
    public static void main(String[] args) throws Exception {
//        System.out.println(SimpleObject.NAME);
//        System.out.println(Buttons.NAME);

//        System.out.println(new Today(Weather.CLOUDY));
//        System.out.println(new Today(Weather.FOGGY));
//        System.out.println(new Today(Weather.FREEZING));

//    ПРАКТИКА 3
//    В этой задаче тебе нужно:
//    Считать с консоли имя файла.
//    Вывести в консоли (на экран) содержимое файла.
//    Освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
//        Scanner scanner = new Scanner(System.in);
//        BufferedReader bufferedReader = new BufferedReader(new FileReader(scanner.nextLine()));
//        String s = "";
//        while ((s = bufferedReader.readLine()) != null) {
//            System.out.println(s);
//        }
//        bufferedReader.close();
//        scanner.close();


//        ПРАКТИКА 4
//        В этой задаче тебе нужно:
//        Прочесть с консоли имя файла.
//        Считывать строки с консоли, пока пользователь не введет строку "exit".
//        Вывести абсолютно все введенные строки в файл, каждую строчку —с новой
//        строки.
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        System.out.println("Введите имя файла");
//        String st = bufferedReader.readLine();
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(st));
//        boolean exit = true;
//        while (exit){
//            if (bufferedReader.readLine().equals("exit")){
//                exit = false;
//                break;
//            }
//            bufferedWriter.write(bufferedReader.readLine());
//        }
//
//        BufferedReader bufferedReader1 = new BufferedReader(new FileReader(st));
//        String s = "";
//        while ((s = bufferedReader.readLine()) != null) {
//            System.out.println(s);
//        }
//        bufferedReader.close();
//        bufferedWriter.close();

//        System.out.println(Matrix.NEO);

//        System.out.println(Dream.hobby.toString());
//        System.out.println(new Hobby().INDEX);

//        Screen screen = new Screen();
//        screen.onSelect();
//        screen.refresh();


    }


//    ПРАКТИКА 1
//    Удали все некорректные строки в интерфейсе Button.
//    interface SimpleObject{
//        String NAME = "SimpleObject";
//        void onPress();
//    }
//    interface Buttons extends SimpleObject{
//        final String NAME = "Submit";
//        void onPress();
//        String onPress(Object o);
//
//     }




//    ПРАКТИКА 2
//    Реализуй в классе Today интерфейс Weather.
//    Подумай, как связан параметр type с методом getWeatherType().
//    Обрати внимание, что интерфейсы Weather и WeatherType уже реализованы в
//    отдельных файлах.
//interface Weather{
//    String CLOUDY = "CLOUDY";
//    String FOGGY = "FOGGY";
//    String FREEZING = "FREEZING";
//    public String getWeatherType();
//    public String toString();
//    }
//
//    static class Today implements Weather {
//        private String type;
//        Today(String type) {
//            this.type = type;
//        }
//        @Override
//        public String getWeatherType() {
//            return type;
//        }
//        @Override
//        public String toString() {
//            return String.format("Today it will be %s", this.getWeatherType());
//        }
//    }


//    ПРАКТИКА 5
//    В этой задаче тебе нужно:
//    Реализовать интерфейс DBObject в классе User.
//    Реализовать метод initializeIdAndName так, чтобы программа работала и выводила
//    на экран: "The user's name is Neo, id = 1".
//    Метод toString и метод main менять нельзя.
//    Подумать, что должен возвращать метод initializeIdAndName в классе User.
//    Обрати внимание: методы toString() и main() менять нельзя.
//    static class Matrix {
//        public static String NEO = new User().initializeIdAndName(1,"Neo");
//    }
//    interface DBObject{
//        public String initializeIdAndName(long id, String name);
//    }
//    static class User implements DBObject{
//        long id;
//        String name;
//
//        @Override
//        public String toString() {
//            return String.format ("The user's name is id = %d", name ,id);
//        }
//
//        @Override
//        public String initializeIdAndName(long id, String name) {
//            return String.format("The user's name is %s, ID = %d ", name, id);
//        }
//    }




//    ПРАКТИКА 6
//    Переделай наследование в классах и интерфейсах так, чтобы программа
//    компилировалась и продолжала делать то же самое.
//    Класс Hobby должен наследоваться от интерфейсов Desire, Dream.
//    interface Desire{
//
//    }
//    interface Dream extends Desire {
//        public static Hobby hobby = new Hobby();
//    }
//    static class Hobby implements Dream, Desire {
//        static int INDEX = 1;
//
//        @Override
//        public String toString() {
//             return "" + INDEX;
//        }
//    }




//    ПРАКТИКА 7
//    Реализуй интерфейс Updatable в классе Screen.
//    interface Selectable{
//        void onSelect();
//    }
//    interface Updatable extends Selectable{
//        void refresh();
//    }
//    static class Screen implements Updatable{
//
//        @Override
//        public void onSelect() {
//            System.out.println("onSelect");
//        }
//        @Override
//        public void refresh() {
//            System.out.println("refresh");
//        }
//    }


//    ПРАКТИКА 8
//    Унаследуй Fox от интерфейса Animal.
//    Поменяй код так, чтобы в классе Fox был только один метод - getName.
//    Учти, что методы удалять нельзя.
//    public interface Animal{
//    private Color getColor() {
//        return null;
//    }
//    private Integer getAge() {
//        return null;
//    }
//    }
//    public static class Fox implements Animal {
//        public String getName(){
//            return "Fox";
//        }
//    }



//    ПРАКТИКА 9
//    Исправь классы Fox и BigFox так, чтобы программа компилировалась.
//    В решении этой задачи не нужно создавать экземпляры базового класса.
//    Метод main не изменяй.
//    public interface Animal{
//    private Color getColor() {
//        return null;
//    }
//}
//    public abstract static class Fox implements  Animal{
//        public String getName(){
//            return "Fox";
//        }
//    }
//    public abstract static class BigFox extends Fox{
//
//    }
//
//



}













