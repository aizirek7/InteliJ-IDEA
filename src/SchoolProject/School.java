package SchoolProject;

import java.util.ArrayList;

public class School {
    private final String NAME = "Ага Хан";
    private final String YEAR = "2002";
    private int quantityEmployee;
    private int quantityStudent;
    private int allMoney;

    public String getNAME() {
        return NAME;
    }

    public String getYEAR() {
        return YEAR;
    }

    public void getInfoSchool(){
        System.out.println("Name: " + NAME + "  " + " Year: " + YEAR + "  "
                + " Quantity of employee: " + quantityEmployee + "  "
                + " Quantity of students: " + quantityStudent);

    }

    public int getAllMoney() {
        return allMoney;
    }

    public void setAllMoney(int allMoney) {
        this.allMoney = allMoney;
    }
    public void getMoneyFromStudents(int money, ArrayList<Students> students){
        allMoney += money;
    }
}
