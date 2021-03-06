package TestBank;
import LibraryManagment.Books;
import SchoolProject.Employee.Employee;
import SchoolProject.Employee.Teacher;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;


public class mmain {
    public static ArrayList<User> userArrayList = new ArrayList<>();
    public static ArrayList<Transaction> transactions = new ArrayList<>();
    public static Bank bank = new Bank("Demir");
    public static Account account = new Account();
    public static User user = new User();
    public static Transaction transaction = new Transaction();

    public static void main(String[] args) throws IOException {
        userArrayList.add(new User("asdf", "wedf", "12", "12", 1000, 1000));
        userArrayList.add(new User("vbn", "sdfg", "1", "1", 100, 100));

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        aVoid(reader);

        try {
            FileInputStream fileInputStream = new FileInputStream("user");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            userArrayList = (ArrayList<User>) objectInputStream.readObject();
            user = (User) objectInputStream.readObject();
            transactions = (ArrayList<Transaction>) objectInputStream.readObject();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void auth(BufferedReader reader) throws IOException {
        boolean answer = true;
        while (answer) {
            System.out.println("1 - Детали");
            System.out.println("2 - Депозитный счет");
            System.out.println("3 - Взять деньги");
            System.out.println("4 - Перевод денег");
            System.out.println("5 - История трансакций");
            System.out.println("6 - Перевести себе деньги");
            System.out.println("9 - Выход");
            int a = Integer.parseInt(reader.readLine());
            switch (a) {
                case 1:
                    detail(reader);
                    break;
                case 2:
                    depositCash(reader);
                    break;
                case 3:
                    withdraw(reader);
                    break;
                case 4:
                    transferCash(reader);
                    break;
                case 5:
                    history(reader);
                    break;
                case 6:
                    money(reader);
                    break;
                case 9:
                    System.exit(0);
                    break;

            }
        }
    }

    public static void money(BufferedReader reader) throws IOException {
        System.out.println("Введите логин и пароль");
        String login = reader.readLine();
        String password = reader.readLine();
        for (User user : userArrayList) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                System.out.println("1 - $");
                System.out.println("1 - Сом");
                int n = Integer.parseInt(reader.readLine());
                if (n == 1) {
                    System.out.println("Введите деньги");
                    int money = Integer.parseInt(reader.readLine());
                    user.setMoney$(money);
                    System.out.println("Вам перевели " + money);
                    try {
                        FileOutputStream outputStream = new FileOutputStream("user");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeObject(user.getMoney$());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (n == 2) {
                    System.out.println("Введите деньги");
                    int money = Integer.parseInt(reader.readLine());
                    user.setMoneySom(money);
                    System.out.println("Вам перевели " + money);
                    try {
                        FileOutputStream outputStream = new FileOutputStream("user");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeObject(user.getMoneySom());
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static void aVoid(BufferedReader reader) throws IOException {
        System.out.println("1 - Авторизация");
        System.out.println("2 - Регистрация");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            aauth(reader);
        } else if (a == 2) {
            register(reader);
        }


    }

    private static void register(BufferedReader reader) throws IOException {
        System.out.println("Вы увурены что хотите загестрироваться");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            System.out.println("Введите имя");
            String n = reader.readLine();
            System.out.println("Введите фамилию");
            String lastName = reader.readLine();
            System.out.println("Придумайте логин");
            String name1 = reader.readLine();
            System.out.println("Придумайте пароль");
            String name3 = reader.readLine();
            System.out.println("Введите деньги в долларах");
            int m = Integer.parseInt(reader.readLine());
            System.out.println("Введите деньги в сомах");
            int nm = Integer.parseInt(reader.readLine());
            userArrayList.add(new User(n, lastName, name1, name3, m, nm));
            try {
                FileOutputStream outputStream = new FileOutputStream("user");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(userArrayList);
            } catch (Exception e) {
                e.printStackTrace();
            }
            auth(reader);
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

    private static void aauth(BufferedReader reader) throws IOException {
        System.out.println("Приветсудвуем вас в нашем банке");
        System.out.println("Пожалуйства авторизуйтесь");
        int count = 2;
        for (int i = 3; i >= 1; i--) {
            System.out.println("Введите логин");
            String login = reader.readLine();
            System.out.println("Введите пароль");
            String password = reader.readLine();
            for (User students1 : userArrayList) {
                if (login.equals(students1.getLogin()) && password.equals(students1.getPassword())) {
                    System.out.println("Вернуться в гланое меню? 1-Да");
                    int b = Integer.parseInt(reader.readLine());
                    if (b == 1) {
                        auth(reader);
                    } else {
                        System.exit(0);
                    }
                } else {
                    System.out.println("Неверные данные у вас осталось попыток " + (count--));
                    break;
                }
            }
        }

    }

    private static void history(BufferedReader reader) throws IOException {
        System.out.println("Введите свое имя");
        String name = reader.readLine();
        for (User user : userArrayList) {
                for (Transaction transaction : transactions) {
                    if (name.equals(transaction.getAccount())) {
                        System.out.println("Сумма " + transaction.getAmount() + " Дата " + transaction.getTimeStamp() +
                                " Перевел " + transaction.getAccount() + " Перевели " + transaction.getGetAccount());

                }
            }
        }
    }

    private static void transferCash(BufferedReader reader) throws IOException {
        Date date = new Date();
        System.out.println("Вы точно хотите перевести деньги");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int num = Integer.parseInt(reader.readLine());
        if (num == 1) {
            for (User user : userArrayList) {
                System.out.println("Имя: " + user.getFirsName() + " Фамилие: " + user.getLastName());
            }
            System.out.println("С какого счета вы хотите перевести деньги");
            System.out.println("1 - $");
            System.out.println("2 - Сом");
            int n = Integer.parseInt(reader.readLine());
            if (n == 1) {
                System.out.println("Введие свой логин и пароль");
                String login = reader.readLine();
                String password = reader.readLine();
                System.out.println("Введите логин и пароль");
                String log = reader.readLine();
                String pass = reader.readLine();
                for (User user1 : userArrayList) {
                    if (login.equals(user1.getLogin()) && password.equals(user1.getPassword())) {
                        System.out.println("Введите деньги");
                        int money = Integer.parseInt(reader.readLine());
                        user1.setMoney$_(money);
                        try {
                            FileOutputStream outputStream = new FileOutputStream("user");
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                            objectOutputStream.writeObject(user1);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Вы перевели деньги ");
                        System.out.println("У вас на счету осталось: " + user1.getMoney$());
                        for (User user2 : userArrayList) {
                            if (log.equals(user2.getLogin()) && pass.equals(user2.getPassword())) {
                                user2.setMoney$(money);
                                System.out.println("------------------------------------------------------");
                                System.out.println("Вам перевел деньги: " + user1.getFirsName() + " " + user1.getLastName());
                                Transaction transaction = new Transaction(money, date, user1.getFirsName(), user2.getFirsName());
                                transactions.add(transaction);
                                try {
                                    FileOutputStream outputStream = new FileOutputStream("user");
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                                    objectOutputStream.writeObject(user);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            } else if (n == 2) {
                String login = reader.readLine();
                String password = reader.readLine();
                System.out.println("Введите логин и пароль");
                String log = reader.readLine();
                String pass = reader.readLine();
                for (User user1 : userArrayList) {
                    if (login.equals(user1.getLogin()) && password.equals(user1.getPassword())) {
                        System.out.println("Введите деньги");
                        int money = Integer.parseInt(reader.readLine());
                        user1.setMoneySom_(money);
                        try {
                            FileOutputStream outputStream = new FileOutputStream("user");
                            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                            objectOutputStream.writeObject(user1);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        System.out.println("Вы перевели деньги " + user.getFirsName() + " " + user.getLastName());
                        System.out.println("У вас на счету осталось: " + user1.getMoneySom());
                        for (User user2 : userArrayList) {
                            if (log.equals(user2.getLogin()) && pass.equals(user2.getPassword())) {
                                user2.setMoneySom(money);
                                try {
                                    FileOutputStream outputStream = new FileOutputStream("user");
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                                    objectOutputStream.writeObject(user2);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                                System.out.println("-----------------------------------------------------------");
                                System.out.println("Вам перевел деньги: " + user1.getFirsName() + " " + user1.getLastName());
                                Transaction transaction = new Transaction(money, date, user1.getFirsName(), user2.getFirsName());
                                transactions.add(transaction);
                                try {
                                    FileOutputStream outputStream = new FileOutputStream("user");
                                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                                    objectOutputStream.writeObject(user2);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }

                        }
                    }

                }
            }
        } else {
            auth(reader);

        }
    }

    private static void withdraw(BufferedReader reader) throws IOException {
        System.out.println("Вы точно хотите взять наличные");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            withdrawCash(reader);
        }
        if (a == 2) {
            auth(reader);
        }

    }

    private static void withdrawCash(BufferedReader reader) throws IOException {
        System.out.println("С какого счета вы хотите взять деньги");
        System.out.println("1 - $");
        System.out.println("2 - P");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("Введите логин и пароль");
        String m = reader.readLine();
        String b = reader.readLine();
        if (num == 1) {
            for (User user : userArrayList) {
                if (m.equals(user.getLogin()) && b.equals(user.getPassword())) {
                    System.out.println("Введите ту сумму денег которую вы хотите");
                    int a = Integer.parseInt(reader.readLine());
                    user.setMoney$_(a);
                    try {
                        FileOutputStream outputStream = new FileOutputStream("user");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeObject(user);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Вы сняли: " + a + " денег");
                    System.out.println("У вас на счету: " + user.getMoney$());
                }
            }
        }
        if (num == 2) {
            for (User user : userArrayList) {
                if (m.equals(user.getLogin()) && b.equals(user.getPassword())) {
                    System.out.println("Введите ту сумму денег которую вы хотите");
                    int a = Integer.parseInt(reader.readLine());
                    user.setMoneySom_(a);
                    try {
                        FileOutputStream outputStream = new FileOutputStream("user");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeObject(user);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println("Вы сняли: " + a + " денег");
                    System.out.println("У вас на счету: " + user.getMoney$());
                }
            }
        }
    }

    private static void depositCash(BufferedReader reader) throws IOException {
        System.out.println("Вы хотите оставит деньги на дипозитном счету?");
        System.out.println("1 - Да");
        System.out.println("2 - Нет");
        int a = Integer.parseInt(reader.readLine());
        if (a == 1) {
            deposit(reader);

        }
        System.out.println("Вернуться в гланое меню? 1-Да");
        int b = Integer.parseInt(reader.readLine());
        if (b == 1) {
            auth(reader);
        } else {
            System.exit(0);
        }


    }

    public static void deposit(BufferedReader reader) throws IOException {
        Date date = new Date();
        System.out.println("С какого счета вы хотите открыть дипозитный счет");
        System.out.println("1 - $");
        System.out.println("2 - P");
        int num = Integer.parseInt(reader.readLine());
        System.out.println("Введите логин и пароль");
        String m = reader.readLine();
        String b = reader.readLine();
        if (num == 1) {
            for (User user : userArrayList) {
                if (m.equals(user.getLogin()) && b.equals(user.getPassword())) {
                    System.out.println("Введите ту сумму денег которую вы хотите");
                    int a = Integer.parseInt(reader.readLine());
                    user.setMoney$_(a);
                    try {
                        FileOutputStream outputStream = new FileOutputStream("user");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeObject(user);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (a <= 100) {
                        int c = a + (a / 100) * 5;
                        System.out.println(" Ваш дипозтный счет через год: " + c);
                    }
                    if (a <= 500) {
                        int c = a + (a / 100) * 15;
                        System.out.println(" Ваш дипозтный счет через год: " + c);
                    } else if (a > 500) {
                        int c = a + (a / 100) * 50;
                        System.out.println(" Ваш дипозтный счет через год: " + c);
                    }
                }

            }
        } else if (num == 2) {
            for (User user : userArrayList) {
                if (m.equals(user.getLogin()) && b.equals(user.getPassword())) {
                    System.out.println("Введите ту сумму денег которую вы хотите");
                    int a = Integer.parseInt(reader.readLine());
                    user.setMoneySom_(a);
                    try {
                        FileOutputStream outputStream = new FileOutputStream("user");
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                        objectOutputStream.writeObject(user);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    if (a <= 100) {
                        int c = a + (a / 100) * 5;
                        System.out.println(" Ваш дипозтный счет через год: " + c);
                    }
                    if (a <= 500) {
                        int c = a + (a / 100) * 15;
                        System.out.println(" Ваш дипозтный счет через год: " + c);
                    } else if (a > 500) {
                        int c = a + (a / 100) * 50;
                        System.out.println(" Ваш дипозтный счет через год: " + c);
                    }
                }

            }
        }
    }

    private static void detail(BufferedReader reader) throws IOException {
        System.out.println("Введите логин и пароль");
        String login = reader.readLine();
        String password = reader.readLine();
        for (User user : userArrayList) {
            if (login.equals(user.getLogin()) && password.equals(user.getPassword())) {
                User students1 = (User) user;
                System.out.println("Имя: " + students1.getFirsName() + " Фамилие: " + students1.getLastName() +
                        " Кол - во аккаунтов: " + "2" + " Логин " + students1.getLogin()
                        + " Пароль: " + students1.getPassword() + " ID: " + generateID() +
                        " Сумма денег в $: " + user.getMoney$() + " Сумма денег в сомах: " + user.getMoneySom());
            }
        }
    }

    public static int generateID() {
        int id = (int) (Math.random() * 899999) + 100000;
        boolean answer = checkID(id);
        if (answer) {
            return id;
        } else {
            return generateID();
        }
    }

    public static boolean checkID(int id) {
        for (User students : userArrayList) {
            try {
                FileOutputStream outputStream = new FileOutputStream("user");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
                objectOutputStream.writeObject(userArrayList);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (id == students.getId()) {
                return false;
            }
        }
        return true;
    }
}


