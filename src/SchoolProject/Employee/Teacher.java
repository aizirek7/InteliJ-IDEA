package SchoolProject.Employee;

public class Teacher extends Employee{
    private int staj;
    private String predmet;

    public int getStaj() {
        return staj;
    }

    public void setStaj(int staj) {
        this.staj = staj;
    }

    public String getPredmet() {
        return predmet;
    }

    public void setPredmet(String predmet) {
        this.predmet = predmet;
    }

    public Teacher(String name, String lasName, int salary, String subject, int staj, String predmet) {
        super(name, lasName, salary, subject);
        this.staj = staj;
        this.predmet = predmet;

    }

    @Override
    public void getMoneyFromEmployee(int money) {
        moneyEmployee += money;
    }
}
