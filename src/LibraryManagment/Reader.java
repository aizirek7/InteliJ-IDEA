package LibraryManagment;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Reader implements Serializable {
    private int id;
    protected String password;
    protected ArrayList<Books> issuedBooks;
    protected int moneyEmployee;
    private String name;
    protected String login;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public void setLogin(String login) {
        this.login = login;
    }



    public void setPassword(String password) {
        this.password = password;
    }

    public Reader(String name, String login, String password) {
        this.id = getId();
        this.name = name;
        this.login = login;
        this.password = password;
    }
    public void setMoneyEmployee(int moneyEmployee) {
        this.moneyEmployee = moneyEmployee;
    }
    public abstract void getMoneyFromEmployee(int money);

    public abstract void AddissueBook(Books books);

    public abstract Object getPassword();

    public abstract Object getLogin();
}
