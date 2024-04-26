package hust.soict.globalict.aims.store;

import hust.soict.globalict.aims.media.Media;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Store {

    //DigitalVideoDisc itemInStore[] = new DigitalVideoDisc ... ;
    ArrayList<Media> itemsInStore = new ArrayList<>();
    //private int numberItemsInStore = itemsInStore.size();
    public ArrayList<Media> getItemsInStore() {
        return itemsInStore;
    }
    public void addMedia(Media dvd) {
        int index = itemsInStore.indexOf(dvd);
        if(index == -1)  {
            itemsInStore.add(dvd);
            System.out.println(String.format("%s is added in Store", dvd.toString()));
        } else System.out.println(String.format("%s  exists in Store",dvd.toString()));
        //numberItemsInStore++;
    }
    public void removeMedia(Media dvd) {
        /*for(int i=0; i<itemsInStore.size(); i++) {
            if(itemsInStore.get(i).equals(dvd)){
                itemsInStore.remove(i);
                return;
            }
        }*/
        int index = itemsInStore.indexOf(dvd);
        if(index!=-1)  {
            itemsInStore.remove(index);
            System.out.println(dvd.toString() + " is removed from Store");
        } else System.out.println(dvd.toString() + " does not exist in Store");
    }
}
