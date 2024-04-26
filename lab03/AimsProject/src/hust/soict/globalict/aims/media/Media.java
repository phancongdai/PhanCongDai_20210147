package hust.soict.globalict.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

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
    public static final Comparator<Media> COMPARATOR_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARATOR_BY_COST_TITLE = new MediaComparatorByCostTitle();
}
