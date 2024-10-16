public class SimpleDotCom {

    int[] positions;
    int numOfHits=0;

    public void setPositions(int[] locs){
        positions=locs;
    }
    public String checkYourself(String userGuess){
       int guess=Integer.parseInt(userGuess);
       String result="Miss";
       for(int cell:positions){
           if(guess==cell){
               result="hit";
               numOfHits++;
               break;
           }
       }
       if(numOfHits== positions.length){
           result="kill";
       }
        System.out.println(result);
        return result;
    }
}
