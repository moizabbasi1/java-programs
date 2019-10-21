package assign2;

import java.util.Random;

public class Song {

    static final String[] songGenre = {"pop", "rap", "rock", "country"};
    static final String[] songName = {"Black Me Out", "Thrash Unreal", "Little Metal Baby Fist", "Zombie Eyed"};

    private String name;
    private String genre;

// Q1
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGenre() {
        return this.name;
    }
    public void setGenre(String name) {
        this.name = name;
    }

    /*
     * Write 3 constructors. Default songType = "pop"
     */
    public Song() {
        name = "unknown";
        genre = "pop";
    }

    public Song(String name) {
        this.name = name;
        this.genre = "pop";
    }

    public Song (String name, String genre) {
        this.name = name;
        this.genre = genre;
    }

    public boolean equals(Song song) {
        return name.equals(song.name)&&genre.equals(song.genre);
    }

    public String toString() {
        return "the "+genre+" song '"+name+"'.";
    }

    public static Song randomSong() {
        Random random = new Random();
        return new Song(Song.songName[random.nextInt(3)],Song.songGenre[random.nextInt(3)]);
    }
}
