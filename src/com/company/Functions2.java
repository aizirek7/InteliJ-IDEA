package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Functions2 {
    public static void main(String[] args) {
//        int num1 = 14;
//        int num2 = 14;
//        int num = num1 + num2;
//        System.out.println("main: " + num);
//        getSum();
//
//        System.out.println("Новости");
//        Scanner scanner = new Scanner(System.in);
//        int hour = scanner.nextInt();
//        temp(hour);
//        System.out.println(asd(4, 5));
//        average(5,15);
//        int[][] a = new  int[5][5];
//        (random(a););
//        int[][] b = new  int[5][5];
//        random(b);
//        sumMatrix(a,b);
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Ввудите диапозон");
//        int start = scanner.nextInt();
//        int end = scanner.nextInt();
//        System.out.println("Введите любое число");
//        int number = scanner.nextInt();
//        System.out.println("Введите размер массива");
//        int size = scanner.nextInt();
//        int num[] = new int[size];
//        num = sortArray(start, end, num);
//        System.out.println(Arrays.toString(num));
//        sortArray1(num);
//        System.out.println(NOD(3430, 1365));



//        Scanner scanner1 = new Scanner(System.in);
//        int length = scanner1.nextInt();
//        System.out.println(Arrays.toString(max(length)));
//        string("abracadabra allotte");
//        missingNumber(12456);
        String st = "Hello world";



    }
//    ПРАКТИКА 1
//    Функция, возвращающая среднее арифметическое двух аргументов.
//    Написать функцию, которая возвращает среднее арифметическое двух переданных
//    ей аргументов (параметров).
//    static void average(int a, int b){
//        int average1 = (a + b) / 2;
//        System.out.println(average1);
//    }


//    ПРАКТИКА 2
//    Обмен значений переменных.
//    Написать функцию для обмена значений двух переменных.
//    static String asd(int a, int b){
//        int temp = a;
//        a = b;
//        b = temp;
//        String n = a + " " + b;
//        return n;
//}



//    ПРАКТИКА 3
//    Сумма матриц.
//    С помощью функции заполнить матрицы случайными числами. Написать функцию,
//    вычисляющую сумму двух матриц. Вывести на экран две исходные матрицы и их
//    сумму (используя процедуру).
//    static void  random (int[][] a){
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                a[i][j] = (int) (Math.random() * 9);
//                System.out.print(a[i][j]);
//                System.out.println();
//
//            }
//        }
//    }
//    static void sumMatrix(int[][] a ,int[][] b){
//        int[][] sum;
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[i].length; j++) {
//                  sum = new int[a.length][a[i].length];
//                  sum[i][j] = a[i][j] + b[i][j];
//                  System.out.print(sum[i][j]);
//            }
//        }
//    }
//     ПРАКТИКА 4
//    Сортировка массива.
//    Сформировать массив из случайных чисел целых чисел ы указанном пользователем
//    диапозоне.
//    Сообщить, усть ли в нем элемент, также указанным пользователем.
//    Отсортировать массив(при этом оставив исходный массив без изменений).
//    static int[] sortArray(int start, int end, int [] num){
//        for (int i = 0; i < num.length ; i++) {
//            num[i] = start + (int)(Math.random() * end);
//        }
//        return num;
//    }
//    static void sortArray1(int[] num){
//        for (int i = 0; i < num.length - 1; i++) {
//            for (int j = 1; j < num.length; j++) {
//                if (num[i] > num[j] && j > i){
//                    int temp = num[i];
//                    num[i] = num[j];
//                    num[j] = temp;
//                }
//            }
//        }
//        System.out.println(Arrays.toString(num));
//    }

//    ПРАКТИКА 5
//    Нахождение НОД (наибольшего общего делителя).
//    Наибольший общий делитель (НОД) чисел 3430 и 1365 – это 35. Другими словами,
//    35 –
//    наибольшее число, на которое и 3430 и 1365 делятся без остатка. Чтобы убедиться
//    в этом,
//    разложим оба числа на простые сомножители:
//    static int NOD(int a, int b) {
//        while (a != b){
//            if (a > b){
//                a = a - b;
//            }
//            else {
//                b = b - a;
//            }
//        }
//        return a;
//    }



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
//    последовательные повторяющиеся буквы из каждой строки в массиве
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
//        int[] num = {a};
//        for (int i = 0; i < num.length - 1; i++) {
//            for (int j = 1; j < num[i]; j++) {
//                if (j > i && num[i] < num[j]) {
//                    System.out.println(j + 1);
//                } else {
//                    System.out.println(-1);
//                }
//            }
//        }
//    }



//    ПРАКТИКА 4
//    Зашифруйте это!
//    Вы хотите создавать секретные сообщения! Вот условия:
//    Ваше сообщение представляет собой строку, содержащую слова, разделенные
//    пробелами.
//    Вам нужно зашифровать каждое слово в сообщении, используя следующие
//    правила:
//    Первую букву необходимо преобразовать в ее код ASCII.
//    Вторую букву нужно заменить последней буквой
//    Будьте проще: во вводе нет специальных символов.
    static String cipher(){




        return null;


    }















//    static void temp (int tempHour){
//           if(tempHour < 12){
//            System.out.println("Тумпература равна: " + 8 + "градусов");
//        }
//        else if (tempHour >= 12){
//            System.out.println("Тумпература равна: " + 10 + "градусов");
//        }
//        else if (tempHour >= 17){
//            System.out.println("Тумпература равна: " + -5 + "градусов");
//        }
//
//    }


//    static void getSum() {
//        int num1 = 14;
//        int num2 = 14;
//        int num = num1 + num2;
//        System.out.println("getSum:" + num);
//    }

}

