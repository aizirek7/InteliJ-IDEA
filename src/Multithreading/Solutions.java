package Multithreading;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Solutions {
//    public static volatile List<Object> list = new ArrayList<Object>(5);

//    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {
//        TestThread task = new TestThread();
//        new Thread(task).start();

//        TestThread thread = new TestThread();
//        thread.start();

//        SpecialThread specialThread = new SpecialThread();
//        SpecialThread specialThread1 = new SpecialThread();
//        SpecialThread specialThread2 = new SpecialThread();
//        SpecialThread specialThread3 = new SpecialThread();
//        SpecialThread specialThread4 = new SpecialThread();
//
//        Thread thread = new Thread();
//        Thread thread1 = new Thread();
//        Thread thread2 = new Thread();
//        Thread thread3 = new Thread();
//        Thread thread4 = new Thread();
//        list.add(thread);
//        list.add(thread1);
//        list.add(specialThread2);
//        list.add(specialThread3);
//        list.add(thread3);
//
//        specialThread.run();

//        Thread thread = new Thread(new SpecialThread());
//        thread.start();
//        System.out.println("*****************");
//        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
//            System.out.println(element);
//        }

//        Thread violin = new Thread(new Violin("Player"));
//        violin.start();


    }


//    ПРАКТИКА 1 EASY
//    Создать public static class TestThread - нить с интерфейсом Runnable.
//    TestThread должен выводить в консоль "My first thread".
//    Требования:
//            1. Добавь в класс Solution публичный статический класс TestThread.
//            2. Класс TestThread должен реализовывать интерфейс Runnable.
//            3. Метод run класса TestThread должен выводить "My first thread".
//            4. Программа должна вывести "My first thread".
//            5. Метод main не изменять.
//public static class TestThread implements Runnable{
//    public void run() {
//        System.out.println("My first thread");
//    }
//    }


//    ПРАКТИКА 2 EASY
//1. Создать public static класс TestThread, унаследованный от класса Thread.
//2. Создать статик блок внутри TestThread, который выводит в консоль "it's a static
//    block inside TestThread".
//            3. Метод run должен выводить в консоль "it's a run method".
//    Требования:
//            1. Добавь в класс Solution публичный статический класс TestThread.
//            2. Класс TestThread должен быть унаследован от класса Thread.
//            3. Класс TestThread не должен реализовывать какие-либо дополнительные
//    интерфейсов.
//4. Создать статик блок внутри TestThread, который выводит в консоль "it's a
//    static block inside TestThread".
//            5. Метод run класса TestThread должен выводить "it's a run method".
//            6. Метод main не изменять.


//    public static class TestThread extends Thread{
//        static {
//            System.out.println("it's a static block inside TestThread");
//        }
//        public void run(){
//            System.out.println("it's a run method");
//        }
//    }


//    ПРАКТИКА 3 MEDIUM
//    В методе main добавить в статический объект list 5 нитей. Каждая нить должна
//    быть новым объектом класса Thread, работающим со своим объектом класса
//    SpecialThread.
//            Требования:
//            1. В методе main создай 5 объектов типа SpecialThread.
//2. В методе main создай 5 объектов типа Thread.
//3. Добавь 5 разных нитей в список list.
//        4. Каждая нить из списка list должна работать со своим объектом класса
//    SpecialThread.
//5. Метод run класса SpecialThread должен выводить "it's a run method inside
//    SpecialThread".
//public static class SpecialThread implements Runnable {
//    public void run() {
//        System.out.println("it's a run method inside SpecialThread");
//    }
//}


//    ПРАКТИКА 4 EASY
//1. Создать таск (public static класс SpecialThread, который реализует интерфейс
//            Runnable).
//            2. SpecialThread должен выводить в консоль свой стек-трейс.
//            Подсказка: main thread уже выводит в консоль свой стек-трейс.
//            Требования:
//            1. Добавь в класс Solution публичный статический класс SpecialThread.
//            2. Класс SpecialThread не должен быть унаследован от какого-либо
//    дополнительного класса.
//            3. Класс SpecialThread должен реализовывать интерфейс Runnable.
//            4. Метод run класса SpecialThread должен выводить свой стек-трейс.
//    public static class SpecialThread implements Runnable{
//    @Override
//    public void run() {
//        for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
//            System.out.println(element);
//        }
//    }
//}


//    ПРАКТИКА 5 MEDIUM
//1. Измени класс Violin так, чтоб он стал таском для нити. Используй интерфейс
//    MusicalInstrument
//    2. Реализуй необходимый метод в нити Violin. Реализация должна быть следующей:
//            2.1. Считай время начала игры - метод startPlaying().
//            2.2. Подожди 1 секунду - метод sleepNSeconds(int n), где n - количество секунд.
//            2.3. Считай время окончания игры - метод stopPlaying().
//            2.4. Выведи на консоль продолжительность игры в миллисекундах. Используй
//    методы из пунктов 2.1 и 2.3.
//    Пример "Playing 1002 ms".
//    public static class Violin implements MusicalInstrument {
//        private String owner;
//
//        public Violin(String owner) {
//            this.owner = owner;
//        }
//
//        public Date startPlaying() {
//            System.out.println(this.owner + " starts playing");
//            return new Date();
//        }
//
//        public Date stopPlaying() {
//            System.out.println(this.owner + " stops playing");
//            return new Date();
//        }
//
//        @Override
//        public void run() {
//            Date start = startPlaying();
//            sleepNSeconds(1);
//            Date end = stopPlaying();
//            System.out.println("Playing " + (end.getTime() - start.getTime()) + " ms");
//        }
//    }
//
//    public static int delay = 1000;
//
//    public static void sleepNSeconds(int n) {
//        try {
//            Thread.sleep(n * delay);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static interface MusicalInstrument extends Runnable {
//        Date startPlaying();
//
//        Date stopPlaying();
//    }


}