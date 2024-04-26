package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
    int id;
    private String title;
    private String category;
    private float cost;
    private List<String> authors = new ArrayList<String>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public void addAuthor(String authorName) {
        int index = authors.indexOf(authorName);
        if(index==-1) {
            authors.add(authorName);
            System.out.println(authorName +" is added in author list");
        } else System.out.println(authorName+" exists in author list");

    }

    public void removeAuhtor(String authorName) {
        int index = authors.indexOf(authorName);
        if(index!=-1) {
            authors.remove(index);
            System.out.println(authorName + "is removed from author list");
        } else System.out.println(authorName + " does not exist in author list");
    }

    public Book() {

    }


    public String toString() {
        return String.format("Book %s - %s - %s: %.2f", title, category, authors, cost);
    }
    public static void main(String arg[]) {
        Book b1 = new Book();
        b1.setTitle("abc");
        ArrayList<String> auth = new ArrayList<>();
        auth.add("abc");
        auth.add("xyz");
        b1.setAuthors(auth);
        System.out.println(b1.toString());
    }
}
