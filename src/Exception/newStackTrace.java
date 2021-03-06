package Exception;

public class newStackTrace {
    public static void main(String[] args) {
//        Stack / StackTrace / Exception
//        functionA();
//        methodA();
//        A();
//        method1();








    }

//    public static void functionA(){
//        System.out.println("FunctionA");
//        functionB();
//    }
//    public static void functionB(){
//        System.out.println("FunctionB");
//         functionC();;
//    }
//    public static void functionC(){
//        System.out.println("FunctionC");
//        functionD();
//    }
//    public static void functionD(){
//        System.out.println("FunctionD");
//
//    }



//    public static void methodA(){
//        methodB();
//    }
//    public static void methodB(){
//        methodC();
//    }
//    public static void methodC(){
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//    }



//    Задача 1
//    Написать пять методов, которые вызывают друг друга.
//    Каждый метод должен возвращать свой StackTrace.
//   public static StackTraceElement[] A(){
//        B();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//
//    }
//    public static  StackTraceElement[] B(){
//        C();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//    }
//    public static StackTraceElement[] C(){
//        V();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//    }
//    public static StackTraceElement[] V(){
//        D();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//    }
//    public static StackTraceElement[] D(){
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getMethodName());
//        }
//        System.out.println();
//        return stackTraceElements;
//    }

//    Задача 2
//    Написать пять методов, которые вызывают друг друга.
//    Каждый метод должен возвращать имя метода, вызвавшего его, полученное с помощью
//    StackTrace.
    public static void methodA(){
        methodB();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name1 = stackTraceElements[5].getMethodName();
        System.out.println("Method 1" + name1);
    }
    public static void methodB(){
        methodC();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name1 = stackTraceElements[5].getMethodName();
        System.out.println("Method 2" + name1);
    }
    public static void methodC(){
        methodD();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name1 = stackTraceElements[5].getMethodName();
        System.out.println("Method 3" + name1);
    }
    public static void methodD(){
        methodE();
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name1 = stackTraceElements[5].getMethodName();
        System.out.println("Method 4" + name1);
    }
    public static void methodE(){
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
        String name1 = stackTraceElements[5].getMethodName();
        System.out.println("Method 5" + name1);
    }





//    Задача 3
//    Написать пять методов, которые вызывают друг друга.
//    Метод должен вернуть номер строки кода, из которого вызвали этот метод.
//    Воспользуйся функцией: element.getLineNumber().
//    public static void method1(){
//        method2();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getLineNumber());
//        }
//    }
//    public static void method2(){
//        method3();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getLineNumber());
//        }
//    }
//    public static void method3(){
//        method4();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getLineNumber());
//        }
//    }
//    public static void method4(){
//        method5();
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getLineNumber());
//        }
//    }
//    public static void method5(){
//        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
//        for (StackTraceElement element : stackTraceElements) {
//            System.out.println(element.getLineNumber());
//        }
//
//    }

    }













