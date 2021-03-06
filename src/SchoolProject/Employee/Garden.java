package SchoolProject.Employee;

public class Garden extends Employee{
    public Garden(String name, String lasName, int salary, String subject) {
        super(name, lasName, salary, subject);
    }

    @Override
    public void getMoneyFromEmployee(int money) {
        moneyEmployee += money;

    }


}
