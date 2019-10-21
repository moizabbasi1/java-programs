package assign2;

public class Band extends BandMember {
    private BandMember[] members;
    private int trackBand;

    public Band(String name, int numOfSongs) {
        super(name, numOfSongs);
        trackBand = 0;
        members= new BandMember[4];
    }
    public Band(String name){
        super(name);
        trackBand = 0;
        members= new BandMember[4];
    }

    boolean addMember( BandMember m){
        if (trackBand < 4){
            members[trackBand++] = m;
            return true;
        }
        return false;
    }
    boolean removeMember(BandMember m){
        for (int i = 0; i < trackBand; i++){
            if(m.getName().equalsIgnoreCase(members[i].getName())){
                for(int j = i; j < members.length - 1; j++){
                    members[j] = members[j+1];
                }
                return true;
            }
        }
        return false;
    }

}