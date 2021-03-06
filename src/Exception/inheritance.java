package Exception;

public class inheritance {
    public static void main(String[] args) {
//     Manager manager = new Manager();
//     manager.hoursOfWorkPerMonth = 72;
//     manager.managerInfo();
//     System.out.println();
//     Chief chief = new Chief();
//     chief.hoursOfWorkPerMonth = 100;
//     chief.chiefInfo();
//     System.out.println();
//     Secretary secretary = new Secretary();
//     secretary.numberOfCallsPerMonth = 1000;
//     secretary.secretaryInfo();

    }
//    Задача 1
//    Изменить четыре класса: Schoolboy (школьник), Student (студент), Worker (Сотрудник), Slave (Раб).
//    Унаследовать студента от школьника, сотрудника от студента, раба от сотрудника.
//    public class Schoolboy{
//
//    }
//    public class Student extends Schoolboy{
//
//    }
//    public class Worker extends Student{
//
//    }
//    public class Slave extends Worker{
//
//    }


//    Задача 2
//    Расставь правильно "цепочку наследования" в классах: House (дом), Cat (кот), Dog (собака), Car
//(машина), Animal (животное), Asset (имущество).
//    public class House extends Asset{
//
//    }
//    public class Cat extends Animal{
//
//    }
//    public class Dog extends Animal{
//
//    }
//    public class Car extends Asset{
//
//    }
//    public class Animal{
//
//    }
//    public class Asset{
//
//    }


//    Задача 3
//    Исправь наследование в классах: (классы Cat, Dog, Pet, House, Airplane).
//    public class Pet{
//
//    }
//    public class Dog1 extends Pet{
//
//    }
//    public class Cat1 extends Dog{
//
//    }
//    public class House1{
//
//    }
//    public class Airplane{
//
//    }


//    Задача 4
//    Написать четыре класса: Employee (сотрудник), Manager (управляющий), Chief (директор) и
//    Secretary (секретарь).
//    Унаследовать управляющего, директора и секретаря от сотрудника.
//    Класс Employee должен иметь свойства salary, experience.
//    Класс Employee должен быть метод countSalary() для расчета зарплаты сотрудника.
//    Расчет зарплаты должен быть вычеслен с формулой = salary + (salary * allowance)
//    Если стаж сотрудника от 0 до 3 лет, то идет надбавка на 10%;
//    Если стаж сотрудника от 3 до 10 лет, то идет надбавка на 20%;
//    Если стаж сотрудника от 10 и выше, то идет надбавка на 25%;
//    В классе Manager должно быть свойство hoursOfWorkPerMonth;
//    Класс Manager должен иметь соответсвующий конструктор.
//    Класс Manager должен иметь метод managerInfo() которая выводит сообщение на экран
//    Пример вывода
//    I am working 70 hours per month, and I get 31250 KGS
//    В классе Secretary должно быть свойство numberOfCallsPerMonth;
//    Класс Manager должен иметь соответсвующий конструктор.
//    Класс Manager должен иметь метод secretaryInfo() которая выводит сообщение на экран
//    Пример вывода
//    I am getting 250 calls per month, and I get 24000 KGS
//    В классе Chief должно быть свойство hoursOfWorkPerMonth;
//    Класс Chief должен иметь соответсвующий конструктор.
//    Класс Chief должен иметь метод chiefInfo() которая выводит сообщение на экран
//    Пример вывода
//    I employ 10 people per month, and I get 56250 KGS
//    public static class Employee{
//        int salary;
//        int experience;
//        public void countSalary(int salary, int experience){
//            this.experience = experience;
//            this.salary = salary;
//            if (experience > 0 && experience <= 3){
//                int a = (salary * 10) / 100;
//                int b = salary + a;
//                System.out.print("I get " + b + " KGS, ");
//            }
//            if (experience > 3 && experience <= 10){
//                int a = (salary * 20) / 100;
//                int b = salary + a;
//                System.out.print("I get " + b + " KGS, ");
//            }
//            if (experience > 10){
//                int a = (salary * 25) / 100;
//                int b = salary + a;
//                System.out.print("I get " + b + " KGS, ");
//            }
//        }
//    }
//    public static class Manager extends Employee{
//        int hoursOfWorkPerMonth;
//        public void HoursOfWorkPerMonth(int hoursOfWorkPerMonth){
//            this.hoursOfWorkPerMonth = hoursOfWorkPerMonth;
//        }
//        public void managerInfo(){
//            countSalary(20000, 3);
//            System.out.print(" and I am working " + hoursOfWorkPerMonth + " per month");
//        }
//    }
//    public static class Chief extends Employee{
//        int hoursOfWorkPerMonth;
//        public void HoursOfWorkPerMonthChief(int hoursOfWorkPerMonth){
//            this.hoursOfWorkPerMonth = hoursOfWorkPerMonth;
//        }
//        public void chiefInfo(){
//            countSalary(50000, 15);
//            System.out.print(" and I employ " + hoursOfWorkPerMonth + " per month");
//        }
//    }
//    public static class Secretary extends Employee{
//        int numberOfCallsPerMonth;
//        public void NumberOfCallsPerMonth(int numberOfCallsPerMonth){
//            this.numberOfCallsPerMonth = numberOfCallsPerMonth;
//        }
//        public void secretaryInfo() {
//            countSalary(15000, 6);
//            System.out.print(" and I am getting " + numberOfCallsPerMonth + " per month   ");
//        }
//    }

//    ПРАКТИКА 1
//    Отредактируй два класса — Horse (лошадь) и Pegasus (пегас).
//    Унаследуй пегаса от лошади.
//    public class Horse{
//
//    }
//    public class Pegasus extends Horse{
//
//    }


//    ПРАКТИКА 2
//    Отредактируй три класса: Pet (домашнее животное), Cat (кот) и Dog (собака).
//    Унаследуй кота и собаку от животного.
//    public class Pet {
//
//    }
//    public class Cat extends Pet{
//
//    }
//    public class Dog extends Pet{
//
//    }




//    ПРАКТИКА 3
//    Напиши шесть классов: Animal (животное), Cow (корова), Pig (свинья), Sheep (овца),
//    Bull (бык) и Goat (козел).
//    Унаследуй корову, свинью, овцу, быка и козла от животного.
//    public class Animal{
//
//    }
//    public class Cow extends Animal{
//
//    }
//    public class Pig extends Animal{
//
//    }
//    public class Sheep extends Animal{
//
//    }
//    public class Bull extends Animal{
//
//    }
//    public class Goat extends Animal{
//
//    }


//    ПРАКТИКА 4
//    Исправь девять классов: Worker (сотрудник), Clerk (клерк), IT (ИТ-специалист),
//    Programmer (программист), ProjectManager (менеджер проекта), CTO (технический
//                                                                              директор), HR (рекрутер), OfficeManager (офис-менеджер), Cleaner (уборщик).
//    Унаследуй программиста, менеджера проекта и технического директора от
//    ИТ-специалиста.
//    Унаследуй рекрутера, уборщика и офис-менеджера от клерка.
//    Унаследуй клерка и ИТ-специалиста от сотрудника.
//    public class Worker{
//
//    }
//    public class Clerk extends Worker{
//
//    }
//    public class IT extends Worker{
//
//    }
//    public class Programmer extends IT{
//
//    }
//    public class ProjectManager extends IT{
//
//    }
//    public class CTO extends IT{
//
//    }
//    public class HR extends Clerk{
//
//    }
//    public class OfficeManager extends Clerk{
//
//    }
//    public class Cleaner extends Clerk{
//
//    }

    

















}
