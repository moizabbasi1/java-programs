package assign2;

public class Guitarist extends BandMember {
    public Guitarist(String name, int songs) {
        super(name, songs);
    }
    public Guitarist(String name){
        super(name);
    }

    //Q7
    public String toString() {
        return "I am the Guitarist "+name+" and I know "+numKnownSongs+" song"+(numKnownSongs==1?".":"s.");
    }
    //Q8
    @Override
    public boolean playSong(Song song) {
        for (int i = 0; i< numKnownSongs; i++) {
            if (song.equals(knownSongs[i])) {
                System.out.println(name + " (guitar) plays (guitar) "+song.toString());
                return true;
            }
        }
        System.out.println(name + " does not know "+song.toString());
        return false;
    }

}
