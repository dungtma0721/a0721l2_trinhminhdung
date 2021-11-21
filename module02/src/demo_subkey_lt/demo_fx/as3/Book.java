package demo_subkey_lt.demo_fx.as3;

public class Book {
    private String id;
    private String title;
    private String author;
    private String borrow;

    public Book(String id, String title, String author, String borrow) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrow = borrow;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String isBorrow() {
        return borrow;
    }

    public void setBorrow(String borrow) {
        this.borrow = borrow;
    }
}
