package j200;

import java.util.ArrayList;
import java.util.Scanner;

public class newGenerics {
    public static void main(String[] args) {
//     Generics = обобщение
//        ArrayList arrayList = new ArrayList();
//        arrayList.add("Islam");
//        arrayList.add(12345);
//
//        String st = (String) arrayList.get(0);
//        System.out.println(st);
//        String st1 = arrayList.get(0) + " ";
//
//        ArrayList<String> list =new ArrayList<>();
//        list.add("Dooron");




//        Задача 1
//        Ввести с клавиатуры 10 чисел и заполнить ими список.
//                Вывести их в обратном порядке. Каждый элемент - с новой строки.
//        Использовать только цикл for.
//        Scanner scanner = new Scanner(System.in);
//        String n1 = scanner.next();
//        String n2 = scanner.next();
//        String n3 = scanner.next();
//        String n4 = scanner.next();
//        String n5 = scanner.next();
//        String n6 = scanner.next();
//        String n7 = scanner.next();
//        String n8 = scanner.next();
//        String n9 = scanner.next();
//        String n10 = scanner.next();
//        ArrayList<String> list = new ArrayList<>();
//        list.add(n1);
//        list.add(n2);
//        list.add(n3);
//        list.add(n4);
//        list.add(n5);
//        list.add(n6);
//        list.add(n7);
//        list.add(n8);
//        list.add(n9);
//        list.add(n10);
//        for (int i = 9; i >= 0; i--) {
//            System.out.println(list.get(i));
//
//        }


//        Задача 2
//        Ввести с клавиатуры 2 числа N и M.
//        Ввести N строк и заполнить ими список.
//                Переставить M первых строк в конец списка.
//        Вывести список на экран, каждое значение с новой строки.
//        Примечание: запрещено создавать больше одного списка.
//
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int m = scanner.nextInt();
//        ArrayList<String> list = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            list.add(i,scanner.next());
//        }
//        for (int i = 0; i < m; i++) {
//            list.add(list.get(0));
//            list.remove(0);
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.println(list.get(i));
//        }


//        Задача 3
//        Создать список строк.
//                Ввести строки с клавиатуры и добавить их в список.
//        Вводить с клавиатурыстроки, пока пользователь не введет строку "end". Саму строку "end" не
//        учитывать.
//                Вывести строки на экран, каждую с новой строки.
//
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//         boolean end = true;
//         while (true){
//             list.add(scanner.nextLine());
//             for (int i = 0; i < list.size(); i++) {
//                 if (list.get(i).equals("end")){
//                    list.remove(i);
//                     System.out.println(list);
//                     end = false;
//                      break;
//                 }
//             }
//         }

//        Задача 4
//        Написать программу, которая ведёт обратный отсчёт с 30 до 0, а в конце выводит на экран текст
//        "Бум!".
//                Программа должна уменьшать число 10 раз в секунду. Для того чтобы вставить в программу
//        задержку, воспользуйся функцией:
//        Thread.sleep(100); //задержка на одну десятую секунды.
//        for (int i = 30; i >= 0 ; i--) {
//            System.out.println(i);
//        }
//        System.out.println("Бууууум");



//        Задача 5
//        Создай класс Human с полями имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
//                Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое
//        детей. Вывести объекты на экран.
//        Примечание:
//        Если написать свой метод String toString() в классе Human, то именно он будет использоваться при
//        выводе объекта на экран.
        class Human{

        }














//        Задача 6
//        Задача: Программа вводит строки, пока пользователь не введёт пустую строку (нажав enter).
//                Потом она конвертирует строки в верхний регистр (Мама превращается в МАМА) и выводит их на
//        экран.
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
         boolean end = true;
         while (true){
             list.add(scanner.nextLine());
             for (int i = 0; i < list.size(); i++) {
                 if (list.get(i).equals(" ")){
                    list.remove(i);
                     for (int j = 0; j < list.size(); j++) {
                         String n = " ";
                        n += list.get(j).toUpperCase();
                         System.out.println(n);
                     }
                    end = false;
                     break;
                 }
             }
         }

//        Задача 7
//        Продолжение Задачи No6: Программа вводит строки, пока пользователь не введёт пустую строку
//                (нажав enter).
//                Потом программа строит новый список. Если в строке чётное число букв, строка удваивается, если
//        нечётное - утраивается.
//        Scanner scanner = new Scanner(System.in);
//        ArrayList<String> list = new ArrayList<>();
//         boolean end = true;
//         while (true){
//             list.add(scanner.nextLine());
//             for (int i = 0; i < list.size(); i++) {
//                 if (list.get(i).equals(" ")){
//                    list.remove(i);
//                     System.out.println(list);
//                     System.out.println();
//                     ArrayList<String> list2 =new ArrayList<>();
//                     for (int j = 0; j < list.size(); j++) {
//                         if (list.get(j).length() % 2 == 0){
//                             list2.add(list.get(j));
//                             list2.add(list.get(j));
//                             System.out.println(list2);
//
//                         }
//                          list2.clear();
//                         if (list.get(j).length() % 2 == 1){
//                             list2.add(list.get(j));
//                             list2.add(list.get(j));
//                             list2.add(list.get(j));
//                             System.out.println(list2);
//                             list2.clear();
//                         }
//                     }
//                     end = false;
//                      break;
//                 }
//             }
//         }














    }
}
