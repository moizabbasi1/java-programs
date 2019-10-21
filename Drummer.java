package assign2;

public class Drummer extends BandMember {
    public Drummer(String name, int songs) {
        super(name, songs);
    }
    public Drummer(String name){
        super(name);
    }

    //Q7
    public String toString() {
        return "I am the drummer "+name+" and I know "+numKnownSongs+" song"+(numKnownSongs==1?".":"s.");
    }
    //Q8
    @Override
    public boolean playSong(Song song) {
        for (int i = 0; i< numKnownSongs; i++) {
            if (song.equals(knownSongs[i])) {
                System.out.println(name + " \uD83E\uDD41 plays \uD83E\uDD41 "+song.toString());
                return true;
            }
        }
        System.out.println(name + " does not know "+song.toString());
        return false;
    }
}