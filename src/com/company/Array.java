package com.company;

import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {


//        int age1 = 5;
//        //Массивы
//        //int  long  short  String
//        int[] numbers = new int[6];//Ссылочный тип данных
//[0, 0, 0, 0, 0, 0]
//        numbers[0] = 4;
//        numbers[1] = 5;
//        numbers[2] = 5;
//        numbers[3] = 4;
//        numbers[4] = 3;
//        numbers[5] = 4;
//        int[] grades = {4, 5, 5, 4, 3, 4};
//        System.out.println(Arrays.toString());
//
//        System.out.println(numbers[0]);


//        for (int i = 0; i < numbers.length; i++){
//            numbers[i] = i * 10;
//            System.out.println(Arrays.toString(numbers));
//        }
//        for (int i = 0; i < numbers.length; i++){
//            System.out.print(numbers[i] + " ");
//        }
//


//        int[] num = new int[12];
//
//        for (int i = 0; i <num.length ; i++) {
//            num[i] =  (int) (Math.random() * 31) - 15;
//        }
//
//        System.out.println(Arrays.toString(num));
//
//        int max = num[0];
//        for (int i = 0; i < num.length; i++ ){
//            if (num[i] > max){
//                max = num[i];
//            }
//        }
//        System.out.println("Максимальное значение в массиве num: " + max);


//        int[] num = new int[8];
//        int random;
//        for (int i = 0; i < num.length; i++) {
//            random = 1 + (int) (Math.random() * 10);
//            num[i] = random;
//        }
//            System.out.print(Arrays.toString(num) + " ");
//        for (int i = 0; i < num.length; i++) {
//            if (i % 2 == 1){
//                num[i] = 0;
//            }
//            }
//
//
//        System.out.println(Arrays.toString(num));
//


//        int[] num1 = new int[5];
//        int[] num2 = new int[5];
//
//        for (int i = 0; i < 5; i++) {
//            num1[i] = (int) (Math.random() *5);
//            num2[i] = (int) (Math.random() *5);
//        }
//        System.out.println(Arrays.toString(num1));
//        System.out.println(Arrays.toString(num2));
//
//
//        double n1 = 0;
//        double n2 = 0;
//        for (int i = 0; i < 5; i++) {
//            n1 += num1[i];
//            n2 += num2[i];
//        }
//
//        double arith1 = n1/5;
//        double arith2 = n2/5;
//
//
//        if (arith1 > arith2){
//            System.out.println("Средне арифмитичское первого массива больше: " + arith1);
//        }
//        else if (arith1 < arith2){
//            System.out.println("Средне арифмитическое втророго массива больше: " + arith2);
//        }
//        else {
//            System.out.println("Их средне арифмитические равны: " + arith1 + arith2);
//        }

//
//            System.out.println("Введите размер массива - натуральное число больше 3");
//            Scanner scanner1 = new Scanner(System.in);
//            int n = scanner1.nextInt();
//            int n1 = 0;
//            while (n <= 3) {
//                System.out.println("Повторите ввод");
//                n = scanner1.nextInt();
//            }
//            int[] num = new int[n];
//            int count = 0;
//        for (int i = 0; i < num.length; i++) {
//            num[i] = (int) (Math.random() * n);
//            if (num[i] % 2 == 0) {
//                count++;
//            }
//        }
//        int[] evens = new int[count];
//        int j = 0;
//        for (int i = 0; i < num.length; i++) {
//            if (num[i] % 2 == 0){
//                evens[j] = num[i];
//                j++;
//            }
//
//        }
//        System.out.println(Arrays.toString(num));
//        System.out.println(Arrays.toString(evens));
//


//        System.out.println(Arrays.toString(num));
//        int[] num2 = new int[n1];
//        int index = 0;
//        for (int i = 0; i < n; i++) {
//            if (num[i] % 2 == 0){
//                num2[index] = num[i];
//                index ++;
//            }
//
//        }
//        System.out.println(Arrays.toString(num2));


//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите предложение");
//        String a = scanner1.nextLine();
//        int spaceCount = 0;
//        if (a.length() != 0){
//            spaceCount++;
//            for (int i = 0; i < a.length(); i++) {
//                if (a.charAt(i) == ' '){
//                    spaceCount ++;
//                }
//
//            }
//        }
//        System.out.println("Вы ввели: " + spaceCount + " слов");


//               int[] num = new int[4];
//               for (int i = 0; i < num.length; i++) {
//                   int random = 10 + (int) (Math.random() * 90);
//                   num[i] = random;
//               }
//        System.out.println(Arrays.toString(num));
//        for (int i = 0; i < num.length; i++) {
//            if (i > 0 && num[i - 1] < num[i] ) {
//
//            }
//            }
//        System.out.println("Последовательность не возрастающая");


//        int[] num1 = new int[10];
//        int[] num2 = new int[10];
//        int count = 0;
//        double[] num3 = new double[10];
//        for (int i = 0; i < 10; i++) {
//            num1[i] = 1 + (int) (Math.random() * 10);
//            num2[i] = 1 + (int) (Math.random() * 10);
//        }
//        for (int i = 0; i < 10; i++) {
//            num3[i] = num1[i] / num2[i];
//            if ( num1[i] % num2[i] == 0){
//                count++;
//
//            }
//
//        }
//
//        System.out.println(Arrays.toString(num1));
//        System.out.println(Arrays.toString(num2));
//        System.out.println(Arrays.toString(num3));
//        System.out.println("Кол-во целых чисел в 3 массиве: " + count);
//
//        int [] num = new int[12];
//        int count1 = 0;
//        int count2 = 0;
//        boolean answer = true;
//        while (answer){
//            count1 = 0;
//            count2 = 0;
//            for (int i = 0; i < num.length; i++) {
//                num[i] = (int)(Math.random()*21 )-10;
//
//                if (num[i] == 0){
//                    i--;
//                    continue;
//                }
//                if(num[i] > 0){
//                    count1++;
//                }
//                if(num[i] < 0){
//                    count2++;
//                }
//            }
//            if(count1 == count2){
//                answer = false;
//            }
//        }
//        System.out.println("Positive: " + count1);
//        System.out.println("Negative: " + count2);
//        System.out.println(Arrays.toString(num));




//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите размер массива");
//        int size = scanner1.nextInt();
//        System.out.println("Заполните массив");
//        int[] num = new int[size];
//        Integer count1 = 1;
//        int count2 = 1;
//        for (int i = 1; i < size; i++) {
//            num[i] = scanner1.nextInt();
//            if (i > 0 && num[i - 1] <= num[i]) {
//                count1++;
//                System.out.println(Integer.toString(num[i]));
//
//            }
//        }



//
//
//
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите кол-во бросков");
//        int[] array = new int[scanner1.nextInt()];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = scanner1.nextInt();
//        }
//        int pos = 0;
//        int sum = 0;
//        for (int round = 1; round <= 10; round++) {
//            if (array[pos] == 10){
//                sum += array[pos] + array[pos + 1] + array[pos + 2];
//                pos ++;
//            }
//        else if (array[pos] + array[pos +1 ] == 10){
//        pos += 2;
//
//            else {
//                sum += array[pos] + array[pos + 1];
//                pos += 2;
//            }
//        }
//        System.out.println(sum);




//
//        String num = "23571113171923";
//        Scanner scanner1 = new Scanner(System.in);
//        System.out.println("Введите кол-во тестов");
//        int m = scanner1.nextInt();
//        System.out.println("Введите номер позиции");
//        int n = scanner1.nextInt();
//
//        for (int i = 1; i < m; i++) {
//            char result = num.charAt(n);
//            System.out.println("Кол-во тестов: " + m);
//            System.out.println(n + " номер строки равен: " + result);
//            }
//



//
//        String[] strings = new String[3];
//        strings[0] = "Привет";
//        strings[1] = "я Абу";
//        strings[2] = "из Алладина";
//        for (String x: strings) {
//            if (!x.equals("Привет"));
//            System.out.println(x);
//        }
//
//
//        int[] numbers = {1, 2, 3};
//        for (int a: numbers) {
//            if (a == 2){
//                continue;
//            }
//            System.out.println(a);
//
//        }

//































        








































    }
}