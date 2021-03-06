package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimenArray {
    public static void main(String[] args) {
//        ЗАДАЧИ ПО ДВУМЕРНЫМ МАССИВАМ 1-ЧАСТЬ
//        1-задача
//        int[][] num = new int[8][5];
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = 10 + (int)(Math.random() * 90);
//            }
//        }
//        for (int[] m : num) {
//            for (int n : m) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }


//        2-задача
//        int[][] num = new int[5][8];
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = (int)(Math.random() * 199) - 99;
//            }
//        }
//        for (int[] m : num) {
//            for (int n : m) {
//                System.out.print(n);
//            }
//            System.out.println();
//            }
//        int max = num[0][0];
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                if (num[i][j] > max) {
//                    max = num[i][j];
//                }
//            }
//        }
//        System.out.println("Максимальное значени двумерного массива " + max);


//        3-задача
//        int[][] num = new int[6][7];
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = (int)(Math.random() * 10);
//            }
//        }
//        for (int[] m : num) {
//            for (int n : m) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }
//        int max = num[0][0];
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                if (num[i][j] > max) {
//                    max = num[i][j];
//                    num[i][j] = num[0][j];
//                }
//
//            }
//        }
//
//        System.out.println();
//        for (int[] m : num) {
//            for (int n : m) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }


//        4-задача
//        int[][] num = new int[3][3];
//        int count = 0;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = (int) (Math.random() * 199);
//                if (num[i][j] > 9 && num[i][j] < 100) {
//                    if ((num[i][j] / 10 + num[i][j] % 10) % 2 == 0) {
//                        count++;
//                        count = num[0][j];
//                        System.out.println("Сумма двухзначных чисел кратное двум: " + count);
//                    }
//                }
//            }
//        }
//        System.out.println();
//        System.out.println();
//        for (int[] m : num) {
//            for (int n : m) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }


//        5-задача
//        int[][] num = new int[10][10];
//        int count = 0;
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = (int) (Math.random() * 11) - 5;
//                if (i == j && num[i][j] > 0) {
//                    count++;
//                    System.out.println("Положиельные числа лежащие на главной доагонали: " + count);
//                }
//            }
//        }
//        for (int[] m : num) {
//            for (int n : m) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }


//        6-задача
//        int[][] num = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
//        int max = num[0][0];
//        String index = " ";
//        String index1 = " ";
//
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                if (i == j){
//                    for (int k = 0; k < num.length; k++) {
//                        for (int l = 0; l < num[i].length; l++) {
//                            if (num[k][l] > max) {
//                                max = num[k][l];
//
//
//                            }
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println("Максимальный диагональный элемент: " + max);
//


//        ЗАДАЧИ ПО МАССИВАМ 2-ЧАСТЬ
//        1-задача
//        int[][] num = new int[15][2];
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = 2 + (int)(Math.random() * 8);
//                for (int k = 0; k < i; k++) {
//                    if (num[i][j] == num[k][j]){
//                    }
//                }
//            }
//        }
//        for (int[] m : num) {
//            for (int n : m) {
//                System.out.print("*" + n);
//            }
//            System.out.println();
//        }


//        2-задача
//        double[][] numA = {{5, 3, 7, 0},{7, 1, 9, 2},{3, 4, 7, 6}};
//        double [][] numB = {{20.30, 1.60},{18.60, 1.60},{12.10, 1.00},{23.00, 1.80}};
//        double [][] numC = new double[3][2];
//        for (int i = 0; i < numC.length; i++) {
//            for (int j = 0; j < numB[i].length; i++) {
//                numC[i][j] = numA[i][j] * numB[j][i];
//            }
//        }
//        for (double[] m : numA) {
//            for (double n : m) {
//                System.out.println(n);
//            }
//            System.out.println();
//        }


////        3-задача
//        int[][]num = new int[7][4];
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                num[i][j] = (int)(Math.random() * 11) - 5;
//            }
//        }
//        for (int[] m : num) {
//            for (int n : m) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }
//        System.out.println((Math.abs(num.length)));
//        int max = num[0][0];
//        for (int i = 0; i < num.length; i++) {
//            for (int j = 0; j < num[i].length; j++) {
//                if (num[i][j] > max){
//                    max = num[i][j];
//                }
//            }
//        }
//
//        System.out.println(Arrays.binarySearch(num, max));
//        System.out.println(max);


//      2-задача
//        int[] num = {1, 2, 3, 4};
//        int count = 0;
//        int count1 = 0;
//        for (int i = 1; i < num.length; i++) {
//            if ( num[i-1] + 2 == num[i]){
//                count++;
//            }
//            else if (num[i-1] + 2 != num[i]){
//                count1--;
//
//            }
//        }
//        System.out.println(count);

//        1-задача
//        int[] num2 = {5, 3, 2, 8, 1, 4};
//        int count;
//        int num02[] = new int[num2.length];
//        for (int i = 0; i < num2.length - 1; i++) {
//            for (int j = 0; j < args.length - 1; j++) {
//                if (num2[j] < num2[j + 1] && num2[j] % 2 != 0 && num2[j + 1] % 2 != 0) {
//                    count = num2[j] = num2[j +1];
//                    num2 = num02;
//                }
//            }
//        }
//        for (int m : num02) {
//            System.out.println(m);
//        }








//        3-задача
//        int[][] num3 = new int[3][3];
//        int[][] num03 = new int[3][3];
//        int[][] num003 = new int[3][3];
//        for (int i = 0; i < num3.length; i++) {
//            for (int j = 0; j < num3[i].length; j++) {
//                num3[i][j] = (int)(Math.random() * 9);
//                num03[i][j] = (int)(Math.random() * 9);
//                num003[i][j] = num3[i][j] + num03[i][j];
//            }
//        }
//        for (int[] m : num3) {
//            for (int n: m) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int[] m : num03) {
//            for (int n: m) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }
//        System.out.println();
//        for (int[] m : num003) {
//            for (int n: m) {
//                System.out.print(n);
//            }
//            System.out.println();
//        }










//        4-задача
//         String str = "&(**)_9)(&%@09765DCR%$^^*786809764345679";
//         char[] num = str.toCharArray();
//        boolean b = true;
//        System.out.println("Введите длину пароля");
//        Scanner scanner1 = new Scanner(System.in);
//        int a = scanner1.nextInt();
//        if (a < 6 || a > 20){
//            while (true){
//                a = scanner1.nextInt();
//                if (a > 6 || a < 20);
//                b = false;
//                break;
//
//
//            }
//
//        }
//        for (int i = 0; i < a; i++) {
//            System.out.print(num[i]);
//        }




        



















    }
}
