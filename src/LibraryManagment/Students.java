package LibraryManagment;

import java.util.ArrayList;

public class Students extends Reader{
    public Students(String name, String login, String password) {
        super(name, login, password);
    }

    @Override
    public void getMoneyFromEmployee(int money) {
        moneyEmployee += money;
    }

    @Override
    public void AddissueBook(Books books) {
        issuedBooks = new ArrayList<>();
        issuedBooks.add(books);
    }

    @Override
    public Object getPassword() {
        return login;
    }

    @Override
    public Object getLogin() {
        return password;
    }




    @Override
    public void setLogin(String login) {
        this.login = login;
    }



    @Override
    public void setPassword(String password) {
        this.password = password;

    }

}

