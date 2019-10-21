package assign1;

public class Assignment1Tester {

    public static void main(String[] args) {

        Song song = new Song();
        Musician slash = new Musician("Slash");
        System.out.println(slash.toString());
        System.out.println(slash.name);
        System.out.println(slash.numKnownSongs);
        System.out.println(slash.knownSongs.length);
        slash.playAllKnownSongs();

        slash.learnSong(song);
        slash.learnSong(Song.randomSong());
        slash.learnSong(Song.randomSong());

        slash.playAllKnownSongs();

        Musician duff = new Musician("Duff",1);
        duff.learnSong(Song.randomSong());
        if (duff.learnSong(Song.randomSong())){
            System.out.println("This should not have happened. Duff learned too many songs.");
        }

        System.out.println(duff);
        duff.playAllKnownSongs();


        Song song2 = new Song("Weird Song", "punk");
        System.out.println(song2);

        System.out.println(song2.toString());

        System.out.println("This song should be printed twice.");

        duff.playSong(song2);

        Song song3 = new Song("Baby");

        System.out.println(song3);
        System.out.println(song3.name);
        System.out.println(song3.genre);
        System.out.println(song3.equals(song2)+" - Should be false.");
        System.out.println(song.equals(new Song())+" - Should be true.");


    }

}
