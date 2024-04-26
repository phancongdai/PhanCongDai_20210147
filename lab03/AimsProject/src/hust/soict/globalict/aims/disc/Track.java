package hust.soict.globalict.aims.disc;

public class Track implements Playable {
    private String title;
    private int length;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Track(){}
    public Track(String title, int lentgh) {
        this.title = title;
        this.length = lentgh;
    }

    @Override
    public void play() {
        System.out.println("Playing track: "+ this.getTitle() +" with track length: "+this.getLength());
    }
}
