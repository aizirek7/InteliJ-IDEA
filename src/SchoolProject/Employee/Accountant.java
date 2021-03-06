package SchoolProject.Employee;

public class Accountant extends Employee{
    private final String LOGIN = "1";
    private  final String PASSWORD = "1";

    public String getLOGIN() {
        return LOGIN;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public Accountant(String name, String lasName, int salary, String subject) {
        super(name, lasName, salary, subject);

    }

    @Override
    public void getMoneyFromEmployee(int money) {
        moneyEmployee += money;

    }
}
