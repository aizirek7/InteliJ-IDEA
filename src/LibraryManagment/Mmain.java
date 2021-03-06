package LibraryManagment;

import SchoolProject.Employee.Accountant;
import SchoolProject.Employee.Employee;
import SchoolProject.Employee.Teacher;

import java.io.*;
import java.util.ArrayList;

public class Mmain {
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static Library library = new Library();
    public static Books books = new Books();
    public static ArrayList<Books> list = new ArrayList<>();
    public static ArrayList<Books> libries = new ArrayList<>();
    public static ArrayList<Students> students = new ArrayList<>();
    public static ArrayList<Teachers> teachers = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        libries.add(new Books("War", "qawsdf", "sdf", true));
        libries.add(new Books("Warr", "qawsdf", "sdf", true));
        libries.add(new Books("Warvb", "qawsdf", "sdf", true));
        libries.add(new Books("Warrty", "qawsdf", "sdf", true));

        try {
            FileInputStream inputStream = new FileInputStream("books");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

            libries = (ArrayList<Books>) objectInputStream.readObject();
            objectInputStream.close();

        } catch (Exception e) {

        }

        try {
            FileInputStream inputStream = new FileInputStream("people");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            students = (ArrayList<Students>) objectInputStream.readObject();
            teachers = (ArrayList<Teachers>) objectInputStream.readObject();
        }
        catch (Exception e){

        }
//        try {
//            FileInputStream fileInputStream = new FileInputStream("books");
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//        }


        auth(reader);


    }

    //Гланое меню
    public static void auth(BufferedReader reader) throws IOException {
        boolean answer = true;
        while (answer) {
            System.out.println("1. Поиск книг");
            System.out.println("2. Просмотр доступных книг");
            System.out.println("3. Просмотр пользователей");
            System.out.println("4. Зарегистрироваться");
            System.out.println("5. Добавить книгу");
            System.out.println("6. Авторизоваться");
            System.out.println("7. Информация о библиотеке");
            System.out.println("9. Выход");
            int num = Integer.parseInt(reader.readLine());

            switch (num) {
                case 1:
                    searchBook(reader);
                    break;
                case 2:
                    availableBook(reader);
                    break;
                case 3:
                    watchUsers(reader);
                    break;
                case 4:
                    Register(reader);
                    break;
                case 5:
                    addNewBook(reader);
                    break;
                case 6:
                    Auth( reader);
                    break;
                case 7:
                    getInfoLibrary(reader);
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

    //Информация о библиотеке
    private static void getInfoLibrary(BufferedReader reader) throws IOException {
        int quantityEmployee = 0;
        int quantityStudents = 0;
        for (Teachers employee : teachers) {
            quantityEmployee++;
        }
        for (Students students : students) {
            quantityStudents++;
        }
        System.out.println("Название библиотеки: Библиотека" + " Кол - во студентов: " + quantityStudents
                + " Кол - во: " + quantityEmployee + " Бюджет: " + library.getAllMoney());
        System.out.println();
        System.out.println("Вернуться в гланое меню? 1-Да");
        try {
            int a = Integer.parseInt(reader.readLine());
            if (a == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
        catch (Exception e){

        }
        System.out.println("Введите цифры");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            auth(reader);
        } else {
            System.exit(0);
        }
    }

    //Выбор между студентом и учителем относительно регистрации
    private static void Register(BufferedReader reader) throws IOException {
        System.out.println("Как вы хотите зарегистрироваться");
        System.out.println("1 - Студент");
        System.out.println("2 - Учитель");
        try {
            int num = Integer.parseInt(reader.readLine());
            switch (num) {
                case 1:
                    RegisterStudent(reader);
                case 2:
                    RegisterTeachers(reader);
            }
        }
        catch (Exception e){

        }
        System.out.println("Только цифры");
        int num = Integer.parseInt(reader.readLine());
        switch (num) {
            case 1:
                RegisterStudent(reader);
            case 2:
                RegisterTeachers(reader);
        }

    }

    //Регестрация студента
    private static void RegisterStudent(BufferedReader reader) throws IOException {
        System.out.println("Вы увурены что хотите добавить студента");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        System.out.println("Только цифры");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Введите ваше имя");
            String name = reader.readLine();
            System.out.println("Придумайте логин");
            String name1 = reader.readLine();
            System.out.println("Придумайте пароль");
            String name3 = reader.readLine();
            students.add(new Students(name, name1, name3));
            try {
                FileOutputStream outputStream = new FileOutputStream("people");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                objectOutputStream.writeObject(students);
            }
            catch (Exception e){

            }


        } else {
            System.out.println("Вернуться в гланое меню? 1-Да");
            try {
                int b = Integer.parseInt(reader.readLine());
                if (b == 1) {
                    auth(reader);
                } else {
                    System.exit(0);
                }
            }
            catch (Exception e){

            }
            System.out.println("Только цифры");
            int b = Integer.parseInt(reader.readLine());
            if (b == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }

    //регистрация учителя
    private static void RegisterTeachers(BufferedReader reader) throws IOException {
        System.out.println("Вы увурены что хотите добавить учителя");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Введите ваше имя");
            String name = reader.readLine();
            System.out.println("Придумайте логин");
            String name1 = reader.readLine();
            System.out.println("Придумайте пароль");
            String name3 = reader.readLine();
            teachers.add(new Teachers(name, name1, name3));
            try {
                FileOutputStream outputStream = new FileOutputStream("people");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                objectOutputStream.writeObject(students);
            }
            catch (Exception e){

            }

        } else {
            System.out.println("Вернуться в гланое меню? 1-Да");
            int b = Integer.parseInt(reader.readLine());
            if (b == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }

    //Информация о студентах
    private static void InfoStudents(BufferedReader reader) throws IOException {
        for (Object students : students) {
            Students students1 = (Students) students;
            System.out.println("Учинк: " + students1.getName() + " ID: " + generateID());
        }
    }

    //Информация о учителях
    private static void InfoTeachers(BufferedReader reader) throws IOException {
        for (Object students : teachers) {
            Teachers students1 = (Teachers) students;
            System.out.println("Учитель: " + students1.getName() + " ID: " + generateID());

        }
    }

    //Добавление книг
    private static void addNewBook(BufferedReader reader) throws IOException {
        System.out.println("Вы увурены что хотите добавить книгу");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Введите имя книги");
            String name = reader.readLine();
            System.out.println("Введте имя автора");
            String name1 = reader.readLine();
            System.out.println("Введите жанр книги");
            String name2 = reader.readLine();
            libries.add(new Books(name, name1, name2 , true));

            try {
                FileOutputStream outputStream = new FileOutputStream("books");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                objectOutputStream.writeObject(libries);
                objectOutputStream.close();

            } catch (Exception e) {
            }

        } else {
            System.out.println("Вернуться в гланое меню? 1-Да");
            int b = Integer.parseInt(reader.readLine());
            if (b == 1) {
                auth(reader);
            } else {
                System.exit(0);
            }
        }
    }

    //Просморт пользователей
    private static void watchUsers(BufferedReader reader) throws IOException {
        System.out.println("1 - Информация о студентах");
        System.out.println("2 - Информация о учителях");
        int num = Integer.parseInt(reader.readLine());
        if (num == 1) {
            InfoStudents(reader);
        } else {
            InfoTeachers(reader);
        }

    }

    //Просморт доступных книг
    private static void availableBook(BufferedReader reader) throws IOException {
        System.out.println("Доступные книги:");
        for (Books books : libries) {
            if (books.getInStock()) {
                System.out.println("Название книги: " + books.getName() + " Автор: " + books.getNameAuthors() +
                        " Жанр: " + books.getJanr());
            }

        }
    }

    //Поиск книг
    private static void searchBook(BufferedReader reader) throws IOException {
        int a = 0;
        System.out.println("Введите название книги");
        String name = reader.readLine();
        for (Books book : libries) {
            if (book.getName().toLowerCase().matches("(.*)" + name.toLowerCase() + "(.*)")) {
                System.out.println(book.getName());
                a++;
            }
        }
        if (a < 1) {
            System.out.println("К сожилению у нас нет такого книга");
        }
        while (true) {
            System.out.println("1. Вернуться в гланое меню");
            System.out.println("2. Взять книгу");
            System.out.println("9. Выйти из программы");
            int num = 0;
            try {
                num = Integer.parseInt(reader.readLine());
            } catch (NumberFormatException e) {
                System.out.println("Только цифры");
                continue;
            }
            if (num == 1) {
                auth(reader);
            } else if (num == 2) {
                Auth(reader);
            } else if (num == 9) {
                System.exit(0);
            }
        }
    }

    //Выбор между учителем и студентом относительно авторизации
    public static void Auth(BufferedReader reader) throws IOException {
        System.out.println("Авторизоваться как:");
        System.out.println("1 - Студент");
        System.out.println("2 - Учитель");
        int num = Integer.parseInt(reader.readLine());
        switch (num) {
            case 1:
                AuthStudents(reader, students);
            case 2:
                AuthTeachers(reader, teachers);
        }

    }

    //Авторизация студентов
    public static void AuthStudents(BufferedReader reader, ArrayList<Students> list) throws IOException {
        System.out.println("Приветсудвуем вас в нашей библиотеке");
        System.out.println("Пожалуйства авторизуйтесь");
        int count = 2;
        for (int i = 3; i >= 1; i--) {
            System.out.println("Введите логин");
            String login = reader.readLine();
            System.out.println("Введите пароль");
            String password = reader.readLine();
            for (Object students : list) {
                Students students1 = (Students) students;
                if (login.equals(students1.getLogin()) && password.equals(students1.getPassword())) {
                    System.out.println("Добро пожаловать " + students1.getName());
                    System.out.println("1 - Взять книгу");
                    System.out.println("2 - Вернуть книгу");
                    int n = Integer.parseInt(reader.readLine());
                    if (n == 1) {
                        takeBookStudents(reader, login, password);
                    }
                    if (n == 2) {
                        returnBookStudents(reader, login, password);
                    }
                } else {
                    System.out.println("Неверные данные у вас осталось попыток " + (count--));
                    break;
                }
            }
        }
    }


    //Вернуть книгу
    private static void returnBookStudents(BufferedReader reader, String login, String password) throws IOException {
        int sum = 0;
        int temp = 0;
        for (Reader reader1 : students) {
            if (reader1 instanceof Students) {
                Students students = (Students) reader1;
                if (students.getLogin().equals(login)&&students.getPassword().equals(password)) {
                    System.out.println();
                    System.out.println("\nВведите название или автора книги");
                    String name1 = reader.readLine();
                    for (Books book1 : libries) {
                        sum++;
                        if (book1.getInStock()) {
                            if (book1.getUser().getName().equals(students.getName())) {
                                if (book1.getName().toLowerCase().matches("(.*)" + name1.toLowerCase() + "(.*)") ||
                                        book1.getNameAuthors().toLowerCase().matches("(.*)" + name1.toLowerCase() + "(.*)")) {
                                    System.out.println("№" + sum + ". " + book1.getName()
                                            + " Автор: " + book1.getNameAuthors() + " ID: " + generateID());
                                    temp = sum;
                                    list.add(book1);
                                }
                            }
                        }
                    }
                    sum = 0;
                    String lust1 = "";
                    System.out.println("Если хотите вернуть книгу то нажмите номер книги");
                    int number = Integer.parseInt(reader.readLine());
                    for (Books book : libries) {
                        sum++;
                        if (sum == number) {
                            lust1 = book.getName();
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).getName().equals(lust1)) {
                                    if (temp >= sum) {
                                        if (book.getInStock()) {
                                            book.setInStock(true);
                                            book.setUser(students);
                                            students.AddissueBook(book);
                                            try {
                                                FileOutputStream outputStream = new FileOutputStream("books");
                                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                                                objectOutputStream.writeObject(book);

                                            }catch (Exception e){

                                            }
                                            System.out.println("Вернуться в главное меню?");
                                            System.out.println("1- Да");
                                            int b = Integer.parseInt(reader.readLine());
                                            if (b == 1){
                                                auth(reader);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    //Взять книгу
    private static void takeBookStudents(BufferedReader reader,String login,String passwor) throws IOException {
        int sum = 0;
        int temp = 0;
        for (Reader reader1 : students) {
            if (reader1 instanceof Students) {
                Students students = (Students) reader1;
                if (students.getLogin().equals(login)&&students.getPassword().equals(passwor)) {
                    System.out.println("\nВведите название или автора книги");
                    String name1 = reader.readLine();
                    for (Books book1 : libries) {
                        sum++;
                        if (book1.getInStock()) {
                            if (book1.getName().toLowerCase().matches("(.*)" + name1.toLowerCase() + "(.*)") ||
                                    book1.getNameAuthors().toLowerCase().matches("(.*)" + name1.toLowerCase() + "(.*)")) {
                                System.out.println("№" + sum + ". " + book1.getName()
                                        + " Автор: " + book1.getNameAuthors() + " ID: " + generateID());
                                temp = sum;
                                list.add(book1);
                            }
                        }
                    }
                    sum = 0;
                    String lust = "";
                    System.out.println("Если хотите взять книгу то нажмите номер книги");
                    int number = Integer.parseInt(reader.readLine());
                    for (Books book : libries) {
                        sum++;
                        if (sum == number) {
                            lust = book.getName();
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).getName().equals(lust)) {
                                    if (temp >= sum) {
                                        if (book.getInStock()) {
                                            book.setInStock(false);
                                            book.setUser(students);
                                            students.AddissueBook(book);
                                            //book.getUser().getName();
                                            try {
                                                FileOutputStream outputStream = new FileOutputStream("books");
                                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                                                objectOutputStream.writeObject(book);

                                            }catch (Exception e){

                                            }
                                            System.out.println("Вернуться в главное меню?");
                                            System.out.println("1- Да");
                                            int b = Integer.parseInt(reader.readLine());
                                            if (b == 1){
                                                auth(reader);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }


    //Авторизация учителей
    public static void AuthTeachers(BufferedReader reader, ArrayList<Teachers> list) throws IOException {
        System.out.println("Приветсудвуем вас в нашей библиотеке");
        System.out.println("Пожалуйства авторизуйтесь");
        String login;
        String password;
        int count = 2;
        for (int i = 3; i >= 1; i--) {
            System.out.println("Введите логин");
            login = reader.readLine();
            System.out.println("Введите пароль");
            password = reader.readLine();
            for (Object students1 : list) {
                Teachers teachers = (Teachers) students1;
                if (login.equals(teachers.getLogin()) && password.equals(teachers.getPassword())) {
                    System.out.println("Добро пожаловать " + teachers.getName());
                    System.out.println("1 - Взять книгу");
                    System.out.println("2 - Вернуть книгу");
                    int n = Integer.parseInt(reader.readLine());
                    if (n == 1) {
                        takeBookTeacher(reader, login, password);
                    }
                    if (n == 2) {
                        returnBookTeacher(reader, login, password);
                    }
                } else {
                    System.out.println("Неверные данные у вас осталось попыток " + (count--));
                    break;
                }
            }
        }
    }

    public static void returnBookTeacher(BufferedReader reader, String login, String password) throws IOException{
        int sum = 0;
        int temp = 0;
        for (Reader reader1 : teachers) {
            if (reader1 instanceof Teachers) {
                Teachers students = (Teachers) reader1;
                if (students.getLogin().equals(login)&&students.getPassword().equals(password)) {
                    System.out.println();
                    System.out.println("\nВведите название или автора книги");
                    String name1 = reader.readLine();
                    for (Books book1 : list) {
                        sum++;
                        if (book1.getName().toLowerCase().matches("(.*)" + name1.toLowerCase() + "(.*)") ||
                                book1.getNameAuthors().toLowerCase().matches("(.*)" + name1.toLowerCase() + "(.*)")) {
                            System.out.println("№" + sum + ". " + book1.getName()
                                    + " Автор: " + book1.getNameAuthors() + " ID: " + generateID());
                            temp = sum;
                            list.remove(book1);
                        }
                    }
                    sum = 0;
                    String lust = "";
                    System.out.println("Если хотите вернуть книгу то нажмите номер книги");
                    int number = Integer.parseInt(reader.readLine());
                    for (Books book : list) {
                        sum++;
                        if (sum == number) {
                            lust = book.getName();
                            for (int i = 0; i < list.size(); i++) {
                                if (libries.get(i).getName().equals(lust)) {
                                    if (temp >= sum) {
                                        if (book.getInStock()) {
                                            book.setInStock(true);
                                            book.setUser(students);
                                            students.AddissueBook(book);
                                            try {
                                                FileOutputStream outputStream = new FileOutputStream("books");
                                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                                                objectOutputStream.writeObject(book);

                                            }catch (Exception e){

                                            }
                                            System.out.println("Вернуться в главное меню?");
                                            System.out.println("1- Да");
                                            int b = Integer.parseInt(reader.readLine());
                                            if (b == 1){
                                                auth(reader);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static void takeBookTeacher(BufferedReader reader, String login, String password) throws IOException {
        int sum = 0;
        int temp = 0;
        for (Reader reader1 : teachers) {
            if (reader1 instanceof Teachers) {
                Teachers students = (Teachers) reader1;
                if (students.getLogin().equals(login)&&students.getPassword().equals(password)) {
                    System.out.println("\nВведите название или автора книги");
                    String name1 = reader.readLine();
                    for (Books book1 : libries) {
                        sum++;
                        if (book1.getName().toLowerCase().matches("(.*)" + name1.toLowerCase() + "(.*)") ||
                                book1.getNameAuthors().toLowerCase().matches("(.*)" + name1.toLowerCase() + "(.*)")) {
                            System.out.println("№" + sum + ". " + book1.getName()
                                    + " Автор: " + book1.getNameAuthors() + " ID: " + generateID());
                            temp = sum;
                            list.add(book1);
                        }
                    }
                    sum = 0;
                    String lust = "";
                    System.out.println("Если хотите взять книгу то нажмите номер книги");
                    int number = Integer.parseInt(reader.readLine());
                    for (Books book : libries) {
                        sum++;
                        if (sum == number) {
                            lust = book.getName();
                            for (int i = 0; i < list.size(); i++) {
                                if (list.get(i).getName().equals(lust)) {
                                    if (temp >= sum) {
                                        if (book.getInStock()) {
                                            book.setInStock(false);
                                            book.setUser(students);
                                            students.AddissueBook(book);
                                            //book.getUser().getName();
                                            try {
                                                FileOutputStream outputStream = new FileOutputStream("books");
                                                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

                                                objectOutputStream.writeObject(book);

                                            }catch (Exception e){

                                            }
                                            System.out.println("Вернуться в главное меню?");
                                            System.out.println("1- Да");
                                            int b = Integer.parseInt(reader.readLine());
                                            if (b == 1){
                                                auth(reader);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    //Генерация случайного ID
    public static int generateID() {
        int id = (int) (Math.random() * 899) + 100;
        boolean answer = checkID(id);
        if (answer) {
            return id;
        } else {
            return generateID();
        }
    }

    //Проверка ID
    public static boolean checkID(int id) {
        for (Students students : students) {
            if (id == students.getId()) {
                return false;
            }
        }
        return true;
    }

}