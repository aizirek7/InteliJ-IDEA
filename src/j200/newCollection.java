package j200;

import java.util.*;

public class newCollection {
    public static void main(String[] args) {
//    map - словарь
//    set - множество
//    list - список

//        Set<String> set = new HashSet<>();
//        set.add("Islam");
//        set.add("Aizirek");
//        set.add("Dayr");
//        set.add("Ainagul");
//        set.add("Timur");


////      Iterator - объект который помогает взять данные с "set"
//        Iterator<String> iterator = set.iterator();
//        while (iterator.hasNext()){
//            String name = iterator.next();
//            if (name.equals("Islam")){
//                System.out.println(name);
//            }
//        }


//        List<String> list = new ArrayList<>();
//        list.add("Islam");
//        list.add("Aizirek");
//        list.add("Dayr");
//        list.add("Ainagul");
//        list.add("Timur");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String name = iterator.next();
//                System.out.println(name);
//        }


//        Map<String, String> map = new HashMap<>();
//        map.put("11234","Islam");
//        map.put("113tdsf","Aizirek");
//        map.put("11235576","Dayr");
//        map.put("908654","Ainagul");
//        map.put("1123434","Dooron");
//        System.out.println(map);

//        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
//        String n = "11234";
//        while (iterator.hasNext()){
//            Map.Entry<String, String> i = iterator.next();
//            String id = i.getKey();
//            String name = i.getValue();
//            if (i.equals(id)){
//                System.out.println("Имя студета: " + name);
//            }
//        }


//        for (Map.Entry<String, String> st : map.entrySet()) {
//            System.out.println("ID: " + st.getKey() + " Имя студента" + st.getValue());
//        }

//        Задача 1
//        Создать коллекцию Set (реализация HashSet) с типом элементов String.
//        Добавить в неё 10 строк:
//        арбуз, банан, вишня, груша, дыня, ежевика, женьшень, , ирис, картофель.
//        Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//        Посмотреть, как изменился порядок добавленных элементов.
//        Set<String> set = new HashSet<>();
//        set.add("арбуз");
//        set.add("банан");
//        set.add("вишня");
//        set.add("груша");
//        set.add("дыня");
//        set.add("ежевика");
//        set.add("женьшень");
//        set.add("земляника");
//        set.add("ирис");
//        set.add("картофель");
//        for (String st : set) {
//            System.out.println(st);
//        }


//        Задача 2
//        Создать коллекцию Map<String, String> (реализация HashMap), занести туда 10 пар строк:
//        арбуз - ягода, банан - трава, вишня - ягода, груша -фрукт, дыня - овощ, ежевика - куст, жень-шень - корень,
//        земляника - ягода, ирис - цветок, картофель - клубень.
//                Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//        Map<String, String> map = new HashMap<>();
//        map.put("арбуз", "ягода");
//        map.put("банан", "трава");
//        map.put("вишня", "ягода");
//        map.put("груша", "фрукт");
//        map.put("дыня", "овощь");
//        map.put("ежевика", "куст");
//        map.put("жень-шень", "корень");
//        map.put("земляника", "ягода");
//        map.put("ирис", "цветок");
//        map.put("картофель", "клубень");
//        for (Map.Entry<String, String> st : map.entrySet()) {
//            System.out.println(st.getKey() + " - " + st.getValue());
//        }


//        Задача 3
//        Есть класс Cat с полем имя (name, String).
//        Создать коллекцию Map<String, Cat> (реализация HashMap).
//        Добавить в коллекцию 10 котов, в качестве ключа использовать имя кота.
//                Вывести результат на экран, каждый элемент с новой строки.
//
//        String[] cats = new String[]{"васька", "мурка", "дымка", "рыжик", "серый", "снежок",
//                "босс", "борис", "визя", "гарфи"};
//        Map<String, newCat> map = addCatToMap(cats);
//        for (Map.Entry<String, newCat> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " - " + pair.getValue());
//        }
//    }
//    public static Map <String, newCat> addCatToMap(String[] cats){
//        Map<String, newCat> m = new HashMap<>();
//        for (int i = 0; i < cats.length; i++) {
//            m.put(cats[i], new newCat(cats[i]));
//        }
//        return m;
//
//    }
//    public static class newCat {
//        String name;
//        public newCat(String name) {
//            this.name = name;
//        }
//        public String toString() {
//            return name != null ? name.toUpperCase(): null;
//        }
//   }


//        Задача 4
//        Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
//        Вывести на экран список ключей, каждый элемент с новой строки.
//        Map<String, String> map = new HashMap<>();
//        map.put("Sim","Sim");
//        map.put("Tom","Tom");
//        map.put("Arbus","Arbus");
//        map.put("Baby","Baby");
//        map.put("Cat","Cat");
//        map.put("Dog","Dog");
//        map.put("Eat","Eat");
//        map.put("Food","Food");
//        map.put("Gevey","Gevey");
//        map.put("Hugs","Hugs");
//        for (Map.Entry<String, String> st : map.entrySet()) {
//            System.out.println(st.getKey());
//        }


//        Задача 5
//        Есть коллекция Map<String, String> (реализация HashMap), туда занесли 10 различных строк.
//        Вывести на экран список значений, каждый элемент с новой строки.
//        Map<String, String> map = new HashMap<>();
//        map.put("Sim","Sim");
//        map.put("Tom","Tom");
//        map.put("Arbus","Arbus");
//        map.put("Baby","Baby");
//        map.put("Cat","Cat");
//        map.put("Dog","Dog");
//        map.put("Eat","Eat");
//        map.put("Food","Food");
//        map.put("Gevey","Gevey");
//        map.put("Hugs","Hugs");
//        for (Map.Entry<String, String> st : map.entrySet()) {
//            System.out.println(st.getValue());
//        }



//        Задача 6
//        Есть коллекция Map<String, Object> (реализация HashMap), туда занесли 10 различных пар
//        объектов.
//                Вывести содержимое коллекции на экран, каждый элемент с новой строки.
//        Map<String,Object> map = new HashMap<>();
//        map.put("Sim",5);
//        map.put("Tom",5.5);
//        map.put("Arbus",false);
//        map.put("Baby",null);
//        map.put("Cat",new Long(56));
//        map.put("Dog",new Character('3'));
//        map.put("Eat",'6');
//        map.put("Food",1111111111111111111L);
//        map.put("Gevey",(double) 123);
//        map.put("Hugs","Cat");
//        for (Map.Entry<String, Object> st : map.entrySet()) {
//            System.out.println("Key: " + st.getKey() + " Value: " + st.getValue());
//        }
































    }

}