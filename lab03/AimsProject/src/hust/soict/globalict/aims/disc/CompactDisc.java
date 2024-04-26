package hust.soict.globalict.aims.disc;

import hust.soict.globalict.aims.media.Media;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{
    private int id;
    private String title;
    private String category;
    private float cost;
    //private int length;

    private String artist;
    private ArrayList<Track> tracks = new ArrayList<>();

    public ArrayList<Track> getTracks() {
        return this.tracks;
    }
    public void addTrack(Track t) {
        int index = tracks.indexOf(t);
        if(index!=-1) {
            System.out.println("This track exists");
        } else {
            tracks.add(t);
            System.out.println("This track is added");
        }
    }

    public void removeTrack(Track t) {
        int index = tracks.indexOf(t);
        if(index==-1) {
            System.out.println("This track does not exist");
        } else {
            tracks.remove(t);
            System.out.println("This track is removed");
        }
    }

    public int getLength() {
        int tmp = 0;
        for(int i=0; i<tracks.size(); i++) {
            tmp+=tracks.get(i).getLength();
        }
        return tmp;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: "+this.title);
        for(int i=0; i<tracks.size(); i++) {
           tracks.get(i).play();
        }
    }
}
