package hust.soict.globalict.aims.disc;

import hust.soict.globalict.aims.media.Media;

public class Disc extends Media {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    private String director;
}
