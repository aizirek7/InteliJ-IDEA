package Exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.Arrays.sort;

public class Algorithm {
    public static void main(String[] args) throws IOException {
//        Практикум 1
//        Задача: ввести с клавиатуры 30 чисел. Вывести 10-е и 11-е минимальные числа.
//        Пояснение:
//        Самое минимальное число - 1-е минимальное.
//                Следующее минимальное после него - 2-е минимальное
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int[] array = new int[30];
//        for (int i = 0; i < 30; i++) {
//            array[i] = Integer.parseInt(reader.readLine());
//        }
//        sort(array);
//        System.out.println(array[10]);
//        System.out.println(array[11]);
//    }
//    public static void sort(int[] array){
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


//        Задача: Введи с клавиатуры 20 слов и выведи их в алфавитном порядке. Каждое слово - с новой
//        строки.
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String[] array = new String[5];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = reader.readLine();
//        }
//        sort(array);
//        for (String world : array) {
//            System.out.println(world);
//        }
//    }
//    public static void sort(String[] array){
//        for (int i = 0; i < array.length - 1; i++) {
//            for (int j = 1; j < array.length; j++) {
//                isGreaterThan(array[i],array[j]);
//            }
//        }
//    }
//    public static boolean isGreaterThan(String a, String b){
//        return a.compareTo(b) > 0;
//    }


    }
}
