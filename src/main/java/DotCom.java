import java.util.ArrayList;

public class DotCom {

    private ArrayList<String> positions;
    int numOfHits=0;
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPositions(ArrayList<String> locs){
        positions=locs;
    }

    public String checkYourself(String userGuess){
        String result="Miss";
        int index=positions.indexOf(userGuess);
        if(index>=0){
            positions.remove(index);
            if(positions.isEmpty()){
                result="kill";
            }
            else{
                result="hit";
            }
        }
        return result;
    }
}
