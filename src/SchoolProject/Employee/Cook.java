package SchoolProject.Employee;

public class Cook extends Employee{
    public Cook(String name, String lasName, int salary, String subject) {
        super(name, lasName, salary, subject);
    }

    @Override
    public void getMoneyFromEmployee(int money) {
        moneyEmployee += money;

    }
}
