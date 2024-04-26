package hust.soict.globalict.aims.cart;
import  hust.soict.globalict.aims.disc.DigitalVideoDisc;
import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;

public class Cart {
    public static final int MAX_NUMBERS_ORDERD = 20;
    //private int qtyOrder;
    //private Media product[] = new Media[MAX_NUMBERS_ORDERD];
    private float total_cost;
    private ArrayList<Media> itemsOrdered = new ArrayList<>();
    /*public boolean findMedia(Media x) {
        int index = itemsOrdered.indexOf(x);
        if(index == -1) return false;
        else return true;
    }*/
    public void addMedia(Media x) {
        if(itemsOrdered.size() == MAX_NUMBERS_ORDERD-1) {
            System.out.println("Cart is full!");
            return;
        }
        int index = itemsOrdered.indexOf(x);
        if(index!=-1) {
            System.out.println(x.toString() + "exists in cart");
            return;
        }
        itemsOrdered.add(x);
        this.total_cost += x.getCost();
    }
    public void removeDigitalVideoDisc(Media x) {
        if(itemsOrdered.size() == 0) {
            System.out.println("Cart is empty!");
            return;
        }
        int index = itemsOrdered.indexOf(x);
        if(index==-1) {
            System.out.println(x.toString()+" is not found in cart");
            return;
        }
        itemsOrdered.remove(index);
        this.total_cost -= x.getCost();
    }

    public void print() {
        System.out.println("***********************CART***********************");
        for(int i=0; i<itemsOrdered.size(); i++) {
            //System.out.println("okoko");
            System.out.println(itemsOrdered.get(i).toString());
        }
        System.out.println("Total cost: "+total_cost+"\n***************************************************");
    }
    public float totalCost() {
        return total_cost;
    }

    public static void main(String arg[]) {
        Cart anOrder = new Cart();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
        anOrder.addMedia(dvd1);
        anOrder.addMedia(dvd2);
        anOrder.addMedia(dvd3);
        anOrder.print();
    }
}
