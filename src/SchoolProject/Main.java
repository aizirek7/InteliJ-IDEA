package SchoolProject;

import SchoolProject.Employee.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    //Лист всех сотруднков
    public static ArrayList<Employee> listEmployee;
    public static ArrayList<Students> listStudents;
    public static School school = new School();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        listEmployee = new ArrayList<>();
        listStudents = new ArrayList<>();

        listEmployee.add(new Accountant("Inna", "Petrovna", 600, "Accountant"));
        listEmployee.add(new Teacher("Mahabat", "Ismailova", 1000, "Teacher", 12, "Math"));
        listEmployee.add(new Cook("Marusya", "Nikolaevna", 400, "Cook"));
        listEmployee.add(new Garden("Inna", "Inovna", 390, "Garden"));

        listStudents.add(new Students("Ivan", "Ivanov", "10B",1000));
        listStudents.add(new Students("Aizirek", "Dockturbek kyzy", "8", 1000));


        authEmployee(listEmployee, reader);

    }

    public static void auth(BufferedReader reader) throws IOException {
        boolean answer = true;
        while (answer) {
            System.out.println("1. Информация о сотрудниках");
            System.out.println("2. Информация о учениках");
            System.out.println("3. Информация о школе");
            System.out.println("4. Бухгалтерский учет");
            System.out.println("5. Добавить");
            System.out.println("9. Выход");
            int num = Integer.parseInt(reader.readLine());

            switch (num) {
                case 1:
                    getInfoEmployee(reader);
                    break;
                case 2:
                    getInfoStudents(reader);
                    break;
                case 3:
                    getInfoSchool(reader);
                    break;
                case 4:
                    accountMethod(reader);
                    break;
                case 5:
                    addNewPerson(reader);
                    break;
                case 9:
                    answer = false;
                    System.exit(0);

            }

            System.out.println();
            System.out.println("Вернуться в гланое меню? 1-Да");
            int a = Integer.parseInt(reader.readLine());
            if (a == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }

    public static void addNewPerson(BufferedReader reader) throws IOException {
        System.out.println("1 - Студент");
        System.out.println("2 - Сотрудник");
        int answer = Integer.parseInt(reader.readLine());
        switch (answer){
            case 1:
                addNewStudents(reader);
                break;
            case 2:
                addNewEmployee(reader);
                break;
        }
    }

    public static void addNewEmployee(BufferedReader reader) throws IOException {
        System.out.println("Кого вы хотите добавить");
        System.out.println("1 - Повар");
        System.out.println("2 - Учитель");
        System.out.println("3 - Охраник");
        System.out.println("4 - Техничка");
        int a = Integer.parseInt(reader.readLine());
        switch (a){
            case 1:
                addNewCook(reader);
                break;
            case 2:
                addNewTeacher(reader);
                break;
            case 3:
                addNewGarden(reader);
                break;
            case 4:
                addNewClear(reader);



        }

    }

    public static void addNewClear(BufferedReader reader) throws IOException {
        System.out.println("Вы увурены что хотите добавить clear");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Enter name");
            String name = reader.readLine();
            System.out.println("Enter lastName");
            String lastName = reader.readLine();
            System.out.println("Enter salary");
            int c = Integer.parseInt(reader.readLine());
            listEmployee.add(new Cook(name, lastName, c, "Clear"));
        } else if (a == 2) {
            System.out.println("Вернуться в гланое меню? 1-Да");
            int c = Integer.parseInt(reader.readLine());
            if (c == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }

    public static void addNewGarden(BufferedReader reader) throws IOException {
        System.out.println("Вы увурены что хотите добавить guard");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Enter name");
            String name = reader.readLine();
            System.out.println("Enter lastName");
            String lastName = reader.readLine();
            System.out.println("Enter salary");
            int c = Integer.parseInt(reader.readLine());
            listEmployee.add(new Cook(name, lastName, c, "Guard"));
        } else if (a == 2) {
            System.out.println("Вернуться в гланое меню? 1-Да");
            int c = Integer.parseInt(reader.readLine());
            if (c == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }

    public static void addNewTeacher(BufferedReader reader) throws IOException {
        System.out.println("Вы увурены что хотите добавить teacher");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Enter name");
            String name = reader.readLine();
            System.out.println("Enter lastName");
            String lastName = reader.readLine();
            System.out.println("Enter salary");
            int c = Integer.parseInt(reader.readLine());
            System.out.println("Enter staj");
            int s = Integer.parseInt(reader.readLine());
            System.out.println("Enter predmet");
            String predmet = reader.readLine();
            listEmployee.add(new Teacher(name, lastName, c, "Teacher",s, predmet));
        }
        else if (a == 2) {
            System.out.println("Вернуться в гланое меню? 1-Да");
            int c = Integer.parseInt(reader.readLine());
            if (c == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }

    public static void addNewCook(BufferedReader reader) throws IOException {
        System.out.println("Вы увурены что хотите добавить cook");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Enter name");
            String name = reader.readLine();
            System.out.println("Enter lastName");
            String lastName = reader.readLine();
            System.out.println("Enter salary");
            int c = Integer.parseInt(reader.readLine());
            listEmployee.add(new Cook(name, lastName, c, "Cook"));
        } else if (a == 2) {
            System.out.println("Вернуться в гланое меню? 1-Да");
            int c = Integer.parseInt(reader.readLine());
            if (c == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }


    public static void addNewStudents(BufferedReader reader) throws IOException {
        System.out.println("Вы увурены что хотите добавить студента");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1){
            System.out.println("Enter name");
            String name = reader.readLine();
            System.out.println("Enter lastName");
            String lastName = reader.readLine();
            System.out.println("Number of class");
            String numberOfClass = reader.readLine();
            System.out.println("Enter contract");
            int b = Integer.parseInt(reader.readLine());
            listStudents.add(new Students(name, lastName, numberOfClass,b));

        }
        else if (a == 2){
            System.out.println("Вернуться в гланое меню? 1-Да");
            int c = Integer.parseInt(reader.readLine());
            if (c == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }

    public static void accountMethod(BufferedReader reader) throws IOException {
        System.out.println("1 - Оплатить контракт");
        System.out.println("2 - Начислить ЗП");
        int answer = Integer.parseInt(reader.readLine());
        switch (answer) {
            case 1:
                contractStudent(reader);
                break;
            case 2:
                transferSalary(reader);
                break;
        }
    }




    //Для ввода логин пароль сотридника для авторизации
    public static void authEmployee(ArrayList<Employee> list, BufferedReader reader) throws IOException     {
        System.out.println("Приветсудвуем вас в нашей школе Ага Хана");
        System.out.println("Пожалуйства авторизуйтесь");
        String login;
        String password;
        int count = 2;
        for (int i = 3; i >= 1; i--) {
            System.out.println("Введите логин");
            login = reader.readLine();
            System.out.println("Введите пароль");
            password = reader.readLine();
            for (Employee employee : list) {
                if (employee instanceof Accountant) {
                    Accountant accountant = (Accountant) employee;
                    if (login.equals(accountant.getLOGIN()) && password.equals(accountant.getPASSWORD())) {
                        System.out.println("Здравствуйте " + accountant.getName() + " " + accountant.getLasName());
                        auth(reader);
                    } else {
                        System.out.println("Неверные данные у вас осталось попыток " + (count--));
                    }
                }
            }
        }
    }

    public static void getInfoEmployee(BufferedReader reader) {
        for (Object employee : listEmployee) {
            Employee employee1 = (Employee) employee;

            if (employee instanceof Teacher) {
                Teacher teacher = (Teacher) employee;
                System.out.println("Сотрудник: " + teacher.getName() + " " + teacher.getLasName()
                        + "   " + "Зарплата: " + teacher.getSalary() + "$  "
                        + "Должность " + teacher.getSubject() + "  " + "ID: " + generateID() +
                        "  " + "Predmet: " + teacher.getPredmet() +
                        " Бюджет " + teacher.getMoneyEmployee());
            }
            if (employee instanceof Accountant) {
                Accountant accountant = (Accountant) employee;
                System.out.println("Сотрудник: " + accountant.getName() + " " + accountant.getLasName()
                        + "   " + "Зарплата: " + accountant.getSalary() + "$  "
                        + "Должность " + accountant.getSubject() + "  " + "ID: " + generateID() +
                        " Бюджет " + accountant.getMoneyEmployee());

            }
            if (employee instanceof Cook) {
                Cook cook = (Cook) employee;
                System.out.println("Сотрудник: " + cook.getName() + " " + cook.getLasName()
                        + "   " + "Зарплата: " + cook.getSalary() + "$  "
                        + "Должность " + cook.getSubject() + "  " + "ID: " + generateID() +
                        " Бюджет " + cook.getMoneyEmployee());
            }
            if (employee instanceof Garden) {
                Garden garden = (Garden) employee;
                System.out.println("Сотрудник: " + garden.getName() + " " + garden.getLasName()
                        + "   " + "Зарплата: " + garden.getSalary() + "$  "
                        + "Должность " + garden.getSubject() + "  " + "ID: " + generateID() +
                        " Бюджет " + garden.getMoneyEmployee());
            }
            if (employee instanceof Cleaner) {
                Cleaner cleaner = (Cleaner) employee;
                System.out.println("Сотрудник: " + cleaner.getName() + " " + cleaner.getLasName()
                        + "   " + "Зарплата: " + cleaner.getSalary() + "$  "
                        + "Должность " + cleaner.getSubject() + "  " + "ID: " + generateID() +
                        " Бюджет " + cleaner.getMoneyEmployee());
            }
        }
    }

    //Вывод информатии всех студентов
    public static void getInfoSchool(BufferedReader reader) throws IOException {
        int quantityEmployee = 0;
        int quantityStudents = 0;
        for (Employee employee : listEmployee) {
            quantityEmployee++;
        }
        for (Students students : listStudents) {
            quantityStudents++;
        }
        System.out.println("Название школы: " + school.getNAME() + " |Год основания: " + school.getYEAR() + "год " +
                "| Количество учеников: " + quantityStudents + " |Количество сотрудников: " + quantityEmployee +
                " Бюджет: " + school.getAllMoney());
    }

    public static void getInfoStudents(BufferedReader reader) {
        System.out.println("Список учеников");
        for (Students students : listStudents) {
            System.out.println("Имя: " + students.getName() + " " + students.getLastName() + " Класс "
                    + students.getKlass() + " Contract " + students.getContract() + " ID: " + generateID());
        }
    }

    //Генерация индивидуального ID
    public static int generateID() {
        int id = (int) (Math.random() * 899) + 100;
        boolean answer = checkID(id);
        if (answer) {
            return id;
        } else {
            return generateID();
        }
    }

    //Проверка на индидуальное ID
    public static boolean checkID(int id) {
        for (Employee employee : listEmployee) {
            if (id == employee.getId()) {
                return false;
            }
        }
        return true;
    }

    public static void contractStudent(BufferedReader reader) throws IOException {
        System.out.println("Введите имя студента");
        boolean anwer = true;
        String name = "";

        while (anwer) {
            name = reader.readLine();
            for (Students students : listStudents) {
                if (name.equals(students.getName())) {
                    if (students instanceof Students) {
                        System.out.println("Имя: " + students.getName() + " " + students.getLastName() + " Класс "
                                + students.getKlass() + " Contract " + students.getContract() +
                                " ID: " + students.getId() + " Contract " + students.getContract() + "" +
                                " Debt " + students.getContractDebt());

                        System.out.println("У " + students.getName() + "Задолжность равна: " + students.getContractDebt());
                        System.out.println("Введите оплату");
                        int money = Integer.parseInt(reader.readLine());
                        if (students.getContractDebt() > 0) {
                            if (money < 0) {
                                System.out.println("У тебя есть совесть!?");
                            } else {
                                System.out.println("Ваши " + money);
                                System.out.println("----------Оплата произведена----------");
                                students.setContractDebt(students.getContractDebt() - money);

                                System.out.println("Имя: " + students.getName() + " " + students.getLastName() + " Класс "
                                        + students.getKlass() + " Contract " + students.getContract() +
                                        " ID: " + students.getId() + " Conract " + students.getContract() +
                                        " Debt " + students.getContractDebt());
                                school.getMoneyFromStudents(money, listStudents);
                                break;
                            }
                        }
                    } else {
                        System.out.println("Невeрные данные");
                        break;
                    }
                }
            }
            System.out.println("Вернуться в гланое меню? 1-Да");
            int a = Integer.parseInt(reader.readLine());
            if (a == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }

    public static void transferSalary(BufferedReader reader) throws IOException {
        if (school.getAllMoney() <= 0) {
            System.out.println("Денег нету, но вы держитесь");
        } else {
            boolean answer = true;
            while (answer) {
            System.out.println("Введите имя сотрудника");
            String nameEmployee = reader.readLine();
            for (Employee employee : listEmployee) {
                if (nameEmployee.equals(employee.getName())) {
                    if (employee instanceof Teacher) {
                        Teacher teacher = (Teacher) employee;
                        System.out.println("Сотрудник: " + teacher.getName() + " " + teacher.getLasName()
                                + "   " + "Зарплата: " + teacher.getSalary() + "$  "
                                + "Должность " + teacher.getSubject() + "  " + "ID: " + generateID() +
                                "  " + "Predmet: " + teacher.getPredmet());
                        System.out.println("Введите деньги");
                        int money = Integer.parseInt(reader.readLine());
                        if (money == teacher.getSalary()) {
                            school.setAllMoney(school.getAllMoney() - money);
                            teacher.getMoneyFromEmployee(money);
                        }
                        else {
                            System.out.println("У ткбя советь есть? Его ЗП равна: " + teacher.getSalary());
                        }
                    }


                    if (employee instanceof Cook) {
                        Cook Cook = (Cook) employee;
                        System.out.println("Сотрудник: " + Cook.getName() + " " + Cook.getLasName()
                                + "   " + "Зарплата: " + Cook.getSalary() + "$  "
                                + "Должность " + Cook.getSubject() + "  " + "ID: " + generateID());

                        System.out.println("Введите деньги");
                        int money = Integer.parseInt(reader.readLine());
                        if (money == Cook.getSalary()) {
                            school.setAllMoney(school.getAllMoney() - money);
                            Cook.getMoneyFromEmployee(money);
                        }
                        else {
                            System.out.println("У ткбя советь есть? Его ЗП равна: " + Cook.getSalary());
                        }
                    }
                    if (employee instanceof Cleaner) {
                        Cleaner Cleaner = (Cleaner) employee;
                        System.out.println("Сотрудник: " + Cleaner.getName() + " " + Cleaner.getLasName()
                                + "   " + "Зарплата: " + Cleaner.getSalary() + "$  "
                                + "Должность " + Cleaner.getSubject() + "  " + "ID: " + generateID());

                        System.out.println("Введите деньги");
                        int money = Integer.parseInt(reader.readLine());
                        if (money == Cleaner.getSalary()) {
                            school.setAllMoney(school.getAllMoney() - money);
                            Cleaner.getMoneyFromEmployee(money);
                        }
                        else {
                            System.out.println("У ткбя советь есть? Его ЗП равна: " + Cleaner.getSalary());
                        }
                    }
                    if (employee instanceof Garden) {
                        Garden Garden = (Garden) employee;
                        System.out.println("Сотрудник: " + Garden.getName() + " " + Garden.getLasName()
                                + "   " + "Зарплата: " + Garden.getSalary() + "$  "
                                + "Должность " + Garden.getSubject() + "  " + "ID: " + generateID());

                        System.out.println("Введите деньги");
                        int money = Integer.parseInt(reader.readLine());
                        if (money == Garden.getSalary()) {
                            school.setAllMoney(school.getAllMoney() - money);
                            Garden.getMoneyFromEmployee(money);
                        }
                        else {
                            System.out.println("У ткбя советь есть? Его ЗП равна: " + Garden.getSalary());
                        }
                    }
                }
            }
                System.out.println("Вернуться в гланое меню? 1-Да");
                int a = Integer.parseInt(reader.readLine());
                if (a == 1) {
                    auth(reader);
                } else {
                    System.exit(0);
                }

            }

        }
    }

}









