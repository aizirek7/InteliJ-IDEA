package TestBank;

import java.util.Date;

public class Transaction {
    private int amount;
    private Date timeStamp;
    private String account;
    private String getAccount;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getGetAccount() {
        return getAccount;
    }

    public void setGetAccount(String getAccount) {
        this.getAccount = getAccount;
    }
    public Transaction(){}

    public Transaction(int amount, Date timeStamp, String account, String getAccount) {
        this.amount = amount;
        this.timeStamp = timeStamp;
        this.account = account;
        this.getAccount = getAccount;

    }
}
