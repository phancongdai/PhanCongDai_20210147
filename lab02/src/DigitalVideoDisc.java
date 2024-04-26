public class DigitalVideoDisc {
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

    public DigitalVideoDisc(String title) {
        this.title = title;
    }

    public float getCost() {
        return this.cost;
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
        return String.format("DVD - %s - %s - %s - %d: %f $", title, category, director, length, cost);
    }
    public static void main(String args[]) {
        DigitalVideoDisc A = new DigitalVideoDisc("A", "B", "C", 120, 100);
        System.out.println(A.toString());
    }
}
