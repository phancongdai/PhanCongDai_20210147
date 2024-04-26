package hust.soict.globalict.aims.media;

import java.util.*;

public class MediaComparatorByCostTitle implements Comparator<Media>{

    @Override
    public int compare(Media o1, Media o2) {
        int tmp = Float.compare(o1.getCost(), o2.getCost());
        if(tmp!=0) return tmp;
        return o1.getTitle().compareTo(o2.getTitle());
    }
}

