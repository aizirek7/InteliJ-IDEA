package LibraryManagment;

public class Teachers extends Reader{




    public Teachers(String name, String login, String password) {
        super(name, login, password);
    }

    @Override
    public void getMoneyFromEmployee(int money) {
        moneyEmployee += money;
    }

    @Override
    public void AddissueBook(Books books) {

    }

    @Override
    public Object getPassword() {
        return password;
    }

    @Override
    public Object getLogin() {
        return login;
    }


}
