package assign2;

public class Musician {

    //Q8
    protected static final String drums = "\uD83E\uDD41";
    protected static final String guitar = "\uD83C\uDFB8";
    protected static final String microphone = "\uD83C\uDFA4";

    protected static final int defaultNumberOfKnownSongs = 3;
    protected String name;
    protected Song[] knownSongs;
    protected int numKnownSongs;

    public Song[] getKnownSongs() {
        return knownSongs;
    }

    public int getNumKnownSongs() {
        return numKnownSongs;
    }

    // Q1
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String numKnownSongs() {
        return this.name;
    }
    public void numKnownSongs(String name) {
        this.name = name;
    }
//Q2
    public Song getSongAtIndex(int index){
        int numSongs = knownSongs.length;
        if (numSongs == 0){
            return null;
        }
        if(index <= numSongs) {
            return knownSongs[index];
        }
        else return null;
    }

    public Musician(String name, int numOfSongs) {
        this.name = name;
        knownSongs = new Song[numOfSongs];
        numKnownSongs = 0;
    }

    public Musician(String name) {
        this(name, defaultNumberOfKnownSongs);
    }


    public boolean learnSong(Song song) {
        if (numKnownSongs>= knownSongs.length) {
            return false;
        }
        knownSongs[numKnownSongs++] = song;
        return true;
    }

    public void playAllKnownSongs() {
        for (int i=0; i< numKnownSongs; i++) {
            playSong(knownSongs[i]);
        }
    }

    public String toString() {
        return "My name is "+name+" and I know "+numKnownSongs+" song"+(numKnownSongs==1?".":"s.");
    }


    public boolean playSong(Song song) {
        for (int i = 0; i< numKnownSongs; i++) {
            if (song.equals(knownSongs[i])) {
                System.out.println(name + " plays "+song.toString());
                return true;
            }
        }
        System.out.println(name + " does not know "+song.toString());
        return false;
    }



    public static void main(String args[]) {
        System.out.println(drums);
        System.out.println(guitar);
        System.out.println(microphone);

    }
}
