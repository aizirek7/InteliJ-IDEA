package TestBank;

import java.util.ArrayList;

public class Bank {
    private String bankName;
    protected ArrayList<User> costumers = new ArrayList<>();
    protected ArrayList<Account> accounts = new ArrayList<>();

    public Bank(String bankName, ArrayList<User> costumers, ArrayList<Account> accounts) {
        this.bankName = bankName;
        this.costumers = costumers;
        this.accounts = accounts;
    }
    public Bank(String bankName){
        this.bankName = bankName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public ArrayList<User> getCostumers() {
        return costumers;
    }

    public void setCostumers(ArrayList<User> costumers) {
        this.costumers = costumers;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
