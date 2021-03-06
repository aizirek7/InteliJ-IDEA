package TestBank;

import java.util.ArrayList;

public class Account {
    private int id;
    private int balance;
    private String name;
    private User accountHolder;
    private ArrayList<Transaction> transactions;

    public Account(int id, int balance, String name, User accountHolder) {
        this.id = id;
        this.balance = balance;
        this.name = name;
        this.accountHolder = accountHolder;

    }
    public Account(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(User accountHolder) {
        this.accountHolder = accountHolder;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void getMoneyFromAnotherAccount(int money){
        this.balance += money;
    }
}
