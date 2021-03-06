package Exception;

import OOP.Solutio;

import java.io.CharConversionException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.rmi.RemoteException;

public class lessonExceptions{
    public static StatelessBean BEAN = new StatelessBean();
    public static void main(String[] args) throws ArithmeticException, URISyntaxException, IOException, NoSuchFieldException {
//        Исключение
//        Ключивые слова try......catch
//        multi catch
//        Класс Throwable
//        finally
//        Throw, throws
//        try {
//            int x = 42/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println("ArithmeticException");
//        }


//        try {
//            String s = null;
//            String m = s.toLowerCase();
//        }
//        catch (NullPointerException e){
//            System.out.println("NullPointerException");
//        }


//        try {
//            int[] m = new int[2];
//            m[8] = 5;
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }


//        try {
//            ArrayList<String> list = new ArrayList<>();
//            String s = list.get(18);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("ArrayIndexOutOfBoundsException");
//        }


//        try {
//            HashMap map = new HashMap(null);
//            map.put(null,null);
//            map.remove(null);
//        }
//        catch (NullPointerException e){
//            System.out.println("NullPointerException");
//        }


//        try {
//            int num = Integer.parseInt("XYS");
//        }
//        catch (NumberFormatException e){
//            System.out.println("NumberFormatException");
//        }


//        Throw - умышленно создания ошибки
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            try {
//                int x = scanner.nextInt();
//                if (x == 0) {
//                    try {
//                        throw new ScannerExceptions("Пользователь ввел ошибку");
//                    } catch (ScannerExceptions e) {
//                        System.out.println(e.getMessage());
//                    }
//                }
//            }
//            catch (InputMismatchException e){
//                System.out.println("Вы ввели не цифру");
//                break;
//            }
//        }

//
//        for (int i = 0; i < 3; i++) {
//            UserFinally.genExceptions(i);
//            System.out.println();
//        }


//        try {
//            method1();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        catch (NullPointerException e){
//            e.printStackTrace();
//        }


//        handleExceptions(new lessonExceptions());
        handleExceptions();

    }

//    public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException{
//        int i = (int) (Math.random() * 4);
//        if (i == 0){
//            throw new NullPointerException();
//        }
//        else if (i == 1){
//            throw new ArithmeticException();
//        }
//        else if (i == 2){
//            throw new FileNotFoundException();
//        }
//        else if (i == 3){
//            throw new URISyntaxException("","");
//        }
//
//    }


//    public static void handleExceptions(lessonExceptions obj) throws IOException, NoSuchFieldException {
//       try {
//           obj.method1();
//           obj.method2();
//           obj.method3();
//       }
//       catch (Exception e){
//           System.out.println(e);
//       }
//    }
//    public static void method1() throws IOException{
//        throw new IOException();
//    }
//    public static void method2() throws NoSuchFieldException{
//        throw new NoSuchFieldException();
//    }
//    public static void method3() throws RemoteException{
//        throw new RemoteException();
//    }


public static void handleExceptions() throws IOException {
        BEAN.methodTrowExceptions();
}

public static class StatelessBean{
        public void log(Exception e){
            System.out.println(e.getMessage() + ", " + e.getClass().getSimpleName());
        }
        public void methodTrowExceptions() throws CharConversionException, FileSystemException, IOException{
            int i = (int) (Math.random() * 3);
            if (i == 0){
                throw new CharConversionException();
            }
            else if (i == 1){
                throw new FileSystemException("");
            }
            else if (i == 2){
                throw  new IOException();
            }
        }
}





}








//class UserFinally{
//    public static void genExceptions(int number){
//        int temp;
//        int[] numbers = new int[2];
//        System.out.println("Получено: " + number);
//        try {
//            switch (number){
//                case 0:
//                temp = 10/0;
//                break;
//                case 1:
//                    numbers[4] = 10;
//                    break;
//                case 2:
//                    return;
//            }
//        }
//        catch (ArithmeticException e){
//            System.out.println("Попытка деления на ноль");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Вывод за пределы массива");
//        }
//        finally {
//            System.out.println("Поля finally");
//        }
//        System.out.println("Строка Catch");
//    }
//}




















//        try - поля для проверки исключения
//        catch - перехват

//        try{
//            int x = 5/0;
//        }
//        catch (ArithmeticException e){
//            System.out.println("На ноль делить нельзя");
//        }
//        System.out.println("После проверки ошибки");
//        try{
//            System.out.println("До проверки");
//            int x = 5/0;
//            System.out.println("После проверки ошибки");
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("После проверки ошибки");
//        }
//        catch (ArithmeticException e){
//            System.out.println("На ноль делить нельзя");
//        }
//        System.out.println("После проверки ошибки");
//
//        try {
//            Demo.genException();
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Вы вышли за пределы массива");
//        }
//        Demo.genException();
//        try {
//            readFile();
//        }
//        catch (FileNotFoundException e){
//            e.printStackTrace();
//            System.out.println("Привет, я нашел твою ошибку на строке 47");
//        }
//        System.out.println("zxdqxaScxas");







//
//    public static void readFile() throws FileNotFoundException {
//        File file = new File("zxdqxaScxas");
//        Scanner scanner =new Scanner(file);
//    }

















//    static class Demo{
//        static void genException(){
//             int[] array1 = {4,8,16,32,64,128,128,128};
//             int[] array2 = {2,0,4,4,0,8};
//            for (int i = 0; i < array1.length; i++) {
//                try {
//                    System.out.println(array1[i] + " / " + array2[i] + " = " + array1[i]/array2[i]);
//                }
//                catch (ArithmeticException e){
//                    System.out.println("Попытка деления на ноль");
//                }
//                catch (ArrayIndexOutOfBoundsException e){
//                    System.out.println("Вывод за пределы массива");
//                }
//                catch (Throwable e){
//                    System.out.println("Ошибка");
//                }
//            }
//        }
//    }









