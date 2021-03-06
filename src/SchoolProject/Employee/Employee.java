package SchoolProject.Employee;

public  abstract class Employee {
    private String name;
    private String lasName;
    private int salary;
    private String subject;
    private int id;
    protected int moneyEmployee;

    public Employee(String name, String lasName, int salary, String subject) {
        this.name = name;
        this.lasName = lasName;
        this.salary = salary;
        this.subject = subject;
        this.id = getId();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLasName() {
        return lasName;
    }

    public void setLasName(String lasName) {
        this.lasName = lasName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMoneyEmployee() {
        return moneyEmployee;
    }

    public void setMoneyEmployee(int moneyEmployee) {
        this.moneyEmployee = moneyEmployee;
    }

    public abstract void getMoneyFromEmployee(int money);
}
