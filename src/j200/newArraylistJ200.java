package j200;

import java.util.ArrayList;
import java.util.Scanner;

public class newArraylistJ200 {
    public static void main(String[] args) {
        //        ArrayList заполняется случайными числами
//        ArrayList<Integer> list = new ArrayList<>();
//        int num;
//        for (int i = 0; i < 10; i++) {
//            num= (int)(Math.random() * 10);
//            list.add(i,num);
//        }
//        System.out.println(list);

//        ArrayList<Integer> arrayList = new ArrayList();
//        arrayList.add(1); // ArrayList заполняется
//        arrayList.add(2);
//        arrayList.add(3);
//        arrayList.add(4);
//        arrayList.add(5);
//        arrayList.add(0,10);
//        System.out.println(arrayList);

//        ArrayList<String> list = new ArrayList<>();
//        list.add("Islam");
//        list.add("Dooron");
//        list.add("Ainagul");

//        list.remove(3);// Удаляется элемент под индексом 3
////      list.remove(list.size()-1);// Удаляется элемент под индексом 3
//        String name = list.get(2); //Метод котрый передает 1 параметр
//        list.set(0,"Abdulkadyr");//Метод котрый изменяет 1 параметр
//        System.out.println(list);

//        ArrayList<String> list2 = (ArrayList<String>) list.clone();//Клонирует элементы
////        list2.addAll(list);// Дабавляет коллекцию
//        list2.add("Dayr");
//        list2.add("Timur");
//        list2.add("Aizirek");
//        System.out.println(list2);
//        list2.clear();// Удаляет все элементы
//        list.removeAll(list2);// Удаляет коллекцию
//        System.out.println(list2);

//        int answer = 0;
//        for (int i = 0; i < list2.size(); i++) {
//            if(list2.get(i).equals("Timur")){
//                String name1 = list2.get(i);
//                for (int j = 0; j < list2.size(); j++) {
//                    if (list2.get(j).equals("Dooron")){
//                        String name2 = list2.get(j);
//                        list2.set(1,name1);
//                        list2.set(list2.size()-1, name2);
//                        answer++;
//                        break;
//                    }
//                }
//            }
//            if (answer > 0){
//                break;
//            }
//        }
//        System.out.println(list2);


//        ПРАКТИКА 1
//        1. Создай список строк.
//        2. Добавь в него 5 различных строк.
//        3. Выведи его размер на экран.
//        4. Используя цикл выведи его содержимое на экран, каждое значение с новой
//        строки.
//        ArrayList<String> arrayList = new ArrayList<>();
//        arrayList.add("дедушка");
//        arrayList.add("бабушка");
//        arrayList.add("машина");
//        arrayList.add("программа");
//        arrayList.add("ночь");
//        System.out.println(arrayList.size());
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));
//        }



//        ПРАКТИКА 2
//        1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую длинную строку в списке.
//        4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую
//        с новой строки.
//        Scanner scanner = new Scanner(System.in);
//        String n1 = scanner.next();
//        String n2 = scanner.next();
//        String n3 = scanner.next();
//        String n4 = scanner.next();
//        String n5 = scanner.next();
//        ArrayList<String> list = new ArrayList<>();
//        list.add(n1);
//        list.add(n2);
//        list.add(n3);
//        list.add(n4);
//        list.add(n5);
//        int index = 0;
//        int mortal = list.get(0).length();
//        for (int i = 0; i < 5; i++) {
//            if (list.get(i).length() > mortal){
//                mortal = list.get(i).length();
//                index = i;
//                System.out.println("Самая длинная строка: " + list.get(index));
//            }
//            else if (list.get(i).length() == mortal){
//                index = i;
//                System.out.println("Самая длинная строка: " + list.get(index) + " " + list.get(index + 1));
//            }
//        }

//        ПРАКТИКА 3
//        1. Создай список строк.
//        2. Считай с клавиатуры 5 строк и добавь в список.
//        3. Используя цикл, найди самую короткую строку в списке.
//        4. Выведи найденную строку на экран.
//        5. Если таких строк несколько, выведи каждую с новой строки.
//        Scanner scanner = new Scanner(System.in);
//        String n1 = scanner.next();
//        String n2 = scanner.next();
//        String n3 = scanner.next();
//        String n4 = scanner.next();
//        String n5 = scanner.next();
//        ArrayList<String> list = new ArrayList<>();
//        list.add(n1);
//        list.add(n2);
//        list.add(n3);
//        list.add(n4);
//        list.add(n5);
//        int index = 0;
//        int mortal = list.get(0).length();
//        for (int i = 0; i < 5; i++) {
//            if (list.get(i).length() < mortal){
//                mortal = list.get(i).length();
//                index = i;
//                System.out.println("Самая короткая строка: " + list.get(index));
//            }
//            else if (list.get(i).length() == mortal){
//                index = i;
//                System.out.println("Самая короткая короткая: " + list.get(index) + " " + list.get(index + 1));
//            }
//        }

//        ПРАКТИКА 4
//        1. Создай список строк в методе main.
//        2. Добавь в него 10 строчек с клавиатуры, но только добавлять не в конец списка, а
//        в начало.
//        3. Используя цикл выведи содержимое на экран, каждое значение с новой строки.
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
//        list.add(n10);
//        list.add(n9);
//        list.add(n8);
//        list.add(n7);
//        list.add(n6);
//        list.add(n5);
//        list.add(n4);
//        list.add(n3);
//        list.add(n2);
//        list.add(n1);
//        for (int i = 0; i < list.size(); i++) {
//            System.out.println(list.get(i));
//        }

//        ПРАКТИКА 5
//        1. Создай список строк.
//        2. Добавь в него 5 строк с клавиатуры.
//        3. Выполни 13 раз: удалить последнюю строку и вставить её в начало.
//        4. Используя цикл выведи содержимое результирующего списка на экран, каждое
//        значение с новой строки.
//        Scanner scanner = new Scanner(System.in);
//        String n1 = scanner.next();
//        String n2 = scanner.next();
//        String n3 = scanner.next();
//        String n4 = scanner.next();
//        String n5 = scanner.next();
//        ArrayList<String> list = new ArrayList<>();
//        list.add(n1);
//        list.add(n2);
//        list.add(n3);
//        list.add(n4);
//        list.add(n5);
//        for (int i = 0; i < 13; i++) {
//            list.set(0,)
//            System.out.println(list);
//        }


//        ПРАКТИКА 6
//        1. Создай список строк.
//        2. Добавь в него 10 строчек с клавиатуры.
//        3. Узнай, какая строка в списке встретится раньше: самая короткая или самая
//        длинная.
//                Если таких строк несколько, то должны быть учтены самые первые из них.
//        4. Выведи на экран строку из п.3. Должна быть выведена одна строка.
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
//        int index = 0;
//        int mortal = list.get(0).length();
//        for (int i = 0; i < 5; i++) {
//            if (list.get(i).length() < mortal) {
//                mortal = list.get(i).length();
//                index = i;
//            }
//        }
//            int index1 = 0;
//        int mortal1 = list.get(0).length();
//        for (int i = 0; i < 5; i++) {
//            if (list.get(i).length() < mortal1) {
//                mortal1 = list.get(i).length();
//                index1 = i;
//            }
//            if (index > index1) {
//                System.out.println();
//            }
//        }
















    }
}
