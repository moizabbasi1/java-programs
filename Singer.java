package assign2;

class Singer extends BandMember {
    public Singer(String name, int songs) {
        super(name, songs);
    }
    public Singer(String name){
        super(name);
    }

    //Q7
    public String toString() {
        return "I am the singer "+name+" and I know "+numKnownSongs+" song"+(numKnownSongs==1?".":"s.");
    }
    //Q8
    @Override
    public boolean playSong(Song song) {
        for (int i = 0; i< numKnownSongs; i++) {
            if (song.equals(knownSongs[i])) {
                System.out.println(name + " \uD83C\uDFA4 sings \uD83C\uDFA4  "+song.toString());
                return true;
            }
        }
        System.out.println(name + " does not know "+song.toString());
        return false;
    }

}
