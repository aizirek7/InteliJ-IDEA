package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//        Загадка задача 67
//        boolean answer = true;
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите сумму чисел");
//        int s = scanner1.nextInt();
//        System.out.println("Введите произведение чисел");
//        int p = scanner1.nextInt();
//        while (answer){
//            int a = 1 + (int)(Math.random() * 1000);
//            int b = 1 + (int)(Math.random() * 1000);
//            if (a + b == s){
//                if (a * b == p){
//                    answer = false;
//                    System.out.println(a + " " + b);
//                }
//            }
//        }



//         Задача 317 Подарки Деда Мороза
//        Scanner scanner1 = new Scanner(System.in);
//        int x = scanner1.nextInt();
//        int y = scanner1.nextInt();
//        int z = scanner1.nextInt();
//        int w = scanner1.nextInt();
//



//        аски код
//        char c = 'H';
//        int a = (int) c;
//        System.out.println(a);


//        Методы - Функция
//        Какие типы метода используются
//        Примеры
//        printName();
//        String returnNext = getPi();
//        System.out.println(returnNext);
//        System.out.println(checkFood());
//        int[] n1 = {13213, 45365,5436};
//        int[] n2 = {1321546573, 45365,543545436, 56566};
//        int[] n3 = {1327687 ,67567 ,13, 45365,5436};
//        int[] n4 = {13213, 45354765,5436};
//        int[] n5 = {1324543654, 13, 45365,5436};
//
//        System.out.println("Sum: " + printArray(n1));
//        System.out.println("Sum: " + printArray(n2));
//        System.out.println("Sum: " + printArray(n3));
//        System.out.println("Sum: " + printArray(n4));
//        System.out.println("Sum: " + printArray(n5));
//        1-задача
//        System.out.println("Среднее арифметическое: "+ mean(213, 3243));
//        2-задача
//        System.out.println(numbers(244,23435));
//        3-задача
//        int[][] a = new int[3][3];
//        int[][] b = new int[3][3];
//        System.out.println();

////        4-задача
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter size of array");
//        int size = scanner1.nextInt();
//        System.out.println("Enter start and end");
//        int start = scanner1.nextInt();
//        int end = scanner1.nextInt();
//        int array[] = new int[size];
//        array = fillArray(start, end, array);
//        System.out.println(Arrays.toString(array));
//        sortArray(array);
//        5-задача
//        System.out.println("Nod: " + NOD(24, 64));
//        ЗАДАЧИ ПО ФУНКЦИЯМ 2-ЧАСТЬ
//        1-ЗАДАЧА
//        Scanner scanner1 = new Scanner(System.in);
//        int length = scanner1.nextInt();
//        System.out.println(Arrays.toString(max(length)));
//        2-ЗАДАЧА
//        string("abracadabra allotte");
//        3-ЗАДАЧА
//        4-ЗАДАЧА
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Enter size");
//        int size = scanner1.nextInt();
//        int sizee = scanner1.nextInt();
//        int[][] matrix = new int[size][sizee];
//         random(matrix);
//        missingNumber(12346789);
//        5-ЗАДАЧА
//        int[] s = {1,2,3,4,3,2,1};
//        Sum(s);
//        6-ЗАДАЧА
//        code("Hello");


    }

//    ПРАКТИКА 1
//    Ваша задача - создать функцию, которая может принимать любое неотрицательное
//    целое число в качестве аргумента и возвращать его с цифрами в порядке убывания.
//    По сути, переставьте цифры, чтобы получить максимально возможное число.
//    static int[] max(int number) {
//    int length = String.valueOf(number).length();
//    int[] numbers = new int[length];
//    int mod = 10;
//    int division = 10;
//        for (int i = 0; i < numbers.length; i++) {
//            if (i == 0){
//                numbers[i] = (number % mod);
//            }
//            else {
//                numbers[i] = (number % mod) / division;
//                division *= 10;
//            }
//            mod *= 10;
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < numbers.length-1; i++) {
//            for (int j = 1; j < numbers.length; j++) {
//                if (numbers[i] < numbers[j] && j >i){
//                    int temp = numbers[i];
//                    numbers[i] = numbers[j];
//                    numbers[j] = temp;
//                }
//            }
//         }
//        return numbers;
//    }



        //    ПРАКТИКА 2
//    В этой практике вам будет предоставлен массив строк, и ваша задача - удалить все
//    последовательные повторяющиеся буквы из каждой строки в массиве.
//        static void string(String b){
//        char[] a = b.toCharArray();
//        int length = a.length;
//            for (int i = 1; i < length; i++) {
//                if (a[i -1] == a[i]){
//                    a[i] = 0;
//                }
//            }
//            String str = new String(a);
//            System.out.println(str);
//        }

//    ПРАКТИКА 3
//    В этом Ката вам будет дана последовательность чисел по порядку, и ваша задача -
//    вернуть недостающее число. Если номер отсутствует или в последовательности
//    есть ошибка, верните -1.
//    static void missingNumber(int a){
//        int[] b = {a};
//        int count = 0;
//        for (int i = 1; i < b.length; i++) {
//            if (b[i] > b[i - 1]){
//                count++;
//            }
//            else {
//                System.out.println(b[i + 1]);
//            }
//        }
//        System.out.println(count);
//    }


//    ПРАКТИКА 4 static void random (int[][] matrix){
////        for (int i = 0; i < matrix.length; i++) {
////            for (int j = 0; j < matrix[i].length; j++) {
////                matrix[i][j] = 1 + (int)(Math.random() * 9);
////            }
////        }
////    }
////    static void Snake(int[][] matrix){
////        int count = 0;
////        int a = 0;
////        int b = 1;
////        int c = 2;
////        for (int i = 0; i < matrix.length; i++) {
////            for (int j = 0; j < matrix[i].length; j++) {
////                count++;
////
////            }
////        }
////
////    }
//    Для массива размером n x n верните элементы массива, расположенные от
//    крайних элементов к среднему, перемещаясь по часовой стрелке.
//



//
//    ПРАКТИКА 5
//    Вам будет дан массив целых чисел. Ваша задача - взять этот массив и найти
//    индекс N, где сумма целых чисел слева от N равна сумме целых чисел справа от
//    N. Если нет индекса, который мог бы сделать это, верните - 1.
//    static void Sum(int[] array){
//        int lsum = 0;
//        int rsum = 0;
//        for (int i = 0; i < array.length; i++) {
//            if (i > 0) {
//                rsum += array[i - 1];
//            }
//            for (int j = i + 1; j < array.length; j++) {
//                lsum += array[j];
//            }
//            if (lsum == rsum) {
//                System.out.println(array[i]);
//                break;
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }



//    ПРАКТИКА 6
//    Зашифруйте это!
//    Вы хотите создавать секретные сообщения! Вот условия:
//    Ваше сообщение представляет собой строку, содержащую слова, разделенные
//    пробелами.
//    Вам нужно зашифровать каждое слово в сообщении, используя следующие
//    правила:
//    Первую букву необходимо преобразовать в ее код ASCII.
//    Вторую букву нужно заменить последней буквой
//    Будьте проще: во вводе нет специальных символов.
//        char c = 'H';
//        int a = (int) c;
//        System.out.println(a);
//    static void code(String a) {
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите кол-во букв");
//        String[] str = {a};
//        int length = scanner1.nextInt();
//        for (int i = 0; i < str.length; i++) {
//            char result = a.charAt(0);
//            char c = result;
//            int b = (int) c;
//            str[0] = b;
//            char result2 = a.charAt(1);
//            char result3 = a.charAt(length - 1);
//            char temp = result2;
//            result2 = result3;
//            result3 = temp;
//            System.out.println(a + b + result2 + result3);
//        }
//    }
//


//          4-задача
//    static void sortArray(int[] array) {
//        for (int i = 0; i < array.length -1; i++) {
//            for (int j = 0; j < array.length; j++) {
//                if (array[i] > array[j] && j > i) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(array));
//    }
//    static int[] fillArray(int start, int end, int[] array){
//        for (int i = 0; i < array.length; i++) {
//            array[i] = start + (int)(Math.random() * end);
//        }
//        return array;
//    }


//    5-задача
//    static int NOD(int a, int b) {
//        while (a != b){
//            if (a > b){
//                a = a - b;
//            }
//            else {
//                b = b - a;
//            }
//        }
//        return b;
//    }

//            3-задача
//    static void Sum(int[][] a){
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = (int)(Math.random() * 9);
//                System.out.println(a[i][j]);
//            }
//        }
//    }
//    static void matrix(int[][] a, int[][] b){
//        for (int i = 0; i < a.length ; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                int[][] mean = new int[a.length][a[i].length];
//                mean[i][j] = a[i][j] + b[i][j];
//                System.out.println(a[i][j]);
//                System.out.println(b[i][j]);
//                System.out.println(mean[i][j]);
//
//            }
//        }
//    }

    //2-задача
//    static String numbers(int a, int b){
//        int c = a;
//        a = b;
//        b = c;
//        String n = a + " " + b;
//        return n;
//    }


//    1-задача
//    static double mean(int a, int b){
//        int average = (a + b) / 2;
//        return average;
//    }


//    static int printArray(int[] numbers){
//        int sum = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.println(numbers[i] + " ");
//            sum += numbers[i];
//        }
//        System.out.println();
//        return sum;
//    }
//       (доступность public) (тип возвращаемого значения void) (имя метода printName) (метод класса static)
//    static void printName() {
//        System.out.println("tgy6yu");
//


//    static String getPi(){
//        double PI = Math.PI;
//        String text = "Number PI is: " + PI;
//        return text;
//
//    }

//    static String checkFood() {
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Did you eat something");
//        String answer = scanner1.nextLine();
//        if (answer.equals("Yes")){
//            return "Good job";
//        }
//        else {
//            return "There is some food in the fridge";
//        }
//    }


//   аски код
}




















