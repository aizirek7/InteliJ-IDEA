package LibraryManagment;

import java.io.Serializable;

public class Books implements Serializable {
    private int id;
    private String name;
    private boolean inStock;
    private Reader user;
    private String NameAuthors;
    private String janr;

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

    public String getNameAuthors() {
        return NameAuthors;
    }

    public void setNameAuthors(String nameAuthors) {
        NameAuthors = nameAuthors;
    }

    public boolean getInStock() {
        return inStock;
    }

    public void setInStock(boolean inStock) {
        this.inStock = inStock;
    }

    public Reader getUser() {
        return user;
    }

    public void setUser(Reader user) {
        this.user = user;
    }

    public Books(String name, String NameAuthors, String janr, boolean inStock) {
        this.id = id;
        this.name = name;
        this.NameAuthors = NameAuthors;
        this.janr = janr;
        this.inStock = inStock;
    }
    public Books(){}

    public String getJanr() {
        return janr;
    }
}
