package SchoolProject.Employee;

public class Cleaner extends Employee{
    public Cleaner(String name, String lasName, int salary, String subject) {
        super(name, lasName, salary, subject);
    }

    @Override
    public void getMoneyFromEmployee(int money) {
        moneyEmployee += money;

    }
}
