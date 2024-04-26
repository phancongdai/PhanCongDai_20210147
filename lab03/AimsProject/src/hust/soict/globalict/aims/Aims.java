package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.Media;
import hust.soict.globalict.aims.store.Store;

import java.util.ArrayList;
import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        System.out.println("AIMS: ");
        System.out.println("--------------------------------");
        System.out.println("1. View store");
        System.out.println("2. Update store");
        System.out.println("3. See current cart");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3");
    }
    public static void storeMenu() {

        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. See a media’s details");
        System.out.println("2. Add a media to cart");
        System.out.println("3. Play a media");
        System.out.println("4. See current cart");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");

    }

    public static void mediaDetailsMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Add to cart");
        System.out.println("2. Play");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2");
    }
    public static void cartMenu() {
        System.out.println("Options: ");
        System.out.println("--------------------------------");
        System.out.println("1. Filter media in cart");
        System.out.println("2. Sort media in cart");
        System.out.println("3. Remove media from cart");
        System.out.println("4. Play a media");
        System.out.println("5. Place order");
        System.out.println("0. Back");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4-5");
    }
    public static ArrayList<Media> findByTitle(Store store, String title){
        ArrayList<Media> tmp = new ArrayList<>();
        ArrayList<Media> itemsInStore = store.getItemsInStore();
        for(Media item: itemsInStore) {
            if(item.getTitle().equals(title)) {
                tmp.add(item);
                System.out.println(item.toString());
            }
        }
        return tmp;
    }

    public static void main(){
        Store store = new Store();
        Cart cart = new Cart();
        Scanner sc = new Scanner(System.in);
        //int op = sc.nextInt();
        while(1==1) {
            showMenu();
            int op = sc.nextInt();
            switch(op) {
                case 1: {
                    while(1==1){
                        storeMenu();
                        int op1 = sc.nextInt();
                        switch(op1) {
                            case 1: {
                                String title = sc.next();
                                ArrayList<Media> findByTitle = findByTitle(store, title);
                                while(1==1)  {
                                    mediaDetailsMenu();
                                    int op2 = sc.nextInt();
                                    switch (op2) {
                                    }
                                }
                            }
                        }

                    }


                }
            }

        }


    }
}
