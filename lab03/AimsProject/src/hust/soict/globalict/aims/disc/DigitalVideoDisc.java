package hust.soict.globalict.aims.disc;

import hust.soict.globalict.aims.media.Media;

public class DigitalVideoDisc extends Media implements Playable{
    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;
    public DigitalVideoDisc() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @Override
    public void setCost(float cost) {
        this.cost = cost;
    }
    @Override
    public float getCost() {
        return this.cost;
    }

    public DigitalVideoDisc(String title) {
        this.title = title;
    }
    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }

    public boolean equals(DigitalVideoDisc x) {
        if((this.title.equals(x.title)) && (this.category.equals(x.category)) && (this.director.equals(x.director)) && (this.length == x.length) && (this.cost==x.cost)) {
            return true;
        }
        else return false;
    }

    public String toString() {
        if(category==null) return String.format("DVD - %s", title);
        else {
            if(director==null) return String.format("DVD - %s - %s: %.2f $", title, category, cost);
            else {
                if (length == 0) return String.format("DVD - %s - %s -%: %.2f $", title, category, director, cost);
                else return String.format("DVD - %s - %s - %s - %d: %.2f $", title, category, director, length, cost);
            }
        }
    }

    public static void main(String args[]) {
        DigitalVideoDisc A = new DigitalVideoDisc("A", "B", 100);
        System.out.println(A.toString());
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
}
