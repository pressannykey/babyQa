package task1;

import task1.interfaces.Displayable;

public class Book implements Displayable {
    private String title;
    private String author;
    private int year;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void display() {
        System.out.printf("Book '%s' of %s", this.title, this.author);
    }
}
