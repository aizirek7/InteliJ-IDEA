package TestBank;

import java.io.Serializable;
import java.util.ArrayList;

public class User implements Serializable {
    private int id;
    private String firsName;
    private String lastName;
    protected ArrayList<Account> accountsList = new ArrayList<>();
    protected ArrayList<Account> accountsList1 = new ArrayList<>();
    private String login;
    private String password;
    private int moneySom;
    private int money$;


    public User(String firsName, String lastName,String login, String password, int moneySom, int money$) {
        this.firsName = firsName;
        this.lastName = lastName;
        this.login = login;
        this.password = password;
        this.moneySom = moneySom;
        this.money$ = money$;

    }
    public User(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Account> getAccountsList() {
        return accountsList;
    }

    public void setAccountsList(ArrayList<Account> accountsList) {
        this.accountsList = accountsList;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMoneySom(int moneySom){
         this.moneySom += moneySom;

    }
    public void setMoney$(int money$){
         this.money$ += money$;

    }

    public void setMoneySom_(int moneySom){
         this.moneySom -= moneySom;
    }

    public void setMoney$_(int money$){
         this.money$ -= money$;
    }

    public int getMoneySom() {
        return moneySom;
    }

    public int getMoney$() {
        return money$;
    }
}
