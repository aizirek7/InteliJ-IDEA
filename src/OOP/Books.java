package OOP;


import java.io.PrintStream;

public class Books {
    String bookName;
    String author;
    String janr;
    int num;
    int price;

    Books() {
    }

    Books(String bookName, String author, String janr, int num, int price) {
        bookName = bookName;
        author = author;
        janr = janr;
        this.num = num;
        this.price = price;
    }
    void InfoBook() {
        ((PrintStream) null).println("Имя книги " + bookName + "имя автора " + author + "Жанр " + janr
                + "Кол-во строаниц " + num + "Цена " + price);
    }
}

