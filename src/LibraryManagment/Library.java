package LibraryManagment;

import SchoolProject.Students;

import java.util.ArrayList;

public class Library {
    private  int allMoney;
    private ArrayList<Reader> readerArrayList;


    public ArrayList<Reader> getReaderArrayList() {
        return readerArrayList;
    }

    public void setReaderArrayList(ArrayList<Reader> readerArrayList) {
        this.readerArrayList = readerArrayList;
    }

    public Library(){}

    public Library(ArrayList<Reader> readerArrayList, ArrayList<Books> booksArrayList){}

    public void addBooks(Books books){}

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
