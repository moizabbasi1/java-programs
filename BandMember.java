package assign2;

public class BandMember extends Musician {

    public BandMember(String name, int songs) {
        super(name, songs);
    }

    public BandMember(String name) {
        super(name);
    }


    boolean knowsSong(Song song) {
        for (int i = 0; i < knownSongs.length; i++)
            if (song == knownSongs[i]) {
                return true;
            }
        return false;
    }

    //Q4
    boolean canLearnNewSong(Song song) {
        if (canLearnNewSong(song)) {
            return true;
        }
        for (int i = 0; i < knownSongs.length; i++) {
            if (knownSongs[i] == null) {
                return true;
            }

        }
        return false;
    }

    //Q5
    /*
    @Override
    public boolean learnSong(Song song) {

        if (canLearnNewSong(song)) {
            return true;
        }
        for (int i = 0; i < knownSongs.length; i++) {
            if (knownSongs[i] == null) {
                return true;
            }

        }
        return false;
    }

     */
}