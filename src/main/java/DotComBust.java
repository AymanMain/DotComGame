import java.util.ArrayList;

public class DotComBust {
    GameHelper helper=new GameHelper();
    ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    int numOfGuesses = 0;

    public void setUpGame() {
        DotCom com1 = new DotCom();
        DotCom com2 = new DotCom();
        DotCom com3 = new DotCom();
        com1.setName("google");
        com2.setName("facebook");
        com3.setName("x");
        dotComsList.add(com1);
        dotComsList.add(com2);
        dotComsList.add(com3);
        for (DotCom dotComToSet : dotComsList) {
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setPositions(newLocation);
        }
    }

    public void startPlaying () {
        while (!dotComsList.isEmpty()) {
            String userGuess = helper.getUserInput("Enter Your Guess :");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    public void checkUserGuess (String userGuess){
        numOfGuesses++;
        String result = "miss";
        for (DotCom dotComToTest : dotComsList) {
            result = dotComToTest.checkYourself(userGuess);
            if (result.equals("hit")) {
                break;
            }
            if (result.equals("kill")) {
                dotComsList.remove(dotComToTest);
                break;
            }
        }
        System.out.println(result);
    }

    public void finishGame () {
        System.out.println("Game Over");
        if (numOfGuesses == 9) {
            System.out.println("How ? Impossible , You must Have Cheated ," + numOfGuesses + " times");
        } else if (numOfGuesses < 20) {
            System.out.println("Nice, " + numOfGuesses + " that's sub 20 , pretty nice");
        } else {
            System.out.println("Zzz , ... oh you're done , it only took you ... " + numOfGuesses + " Tries ,that's ... i mean , it would have taken you less time to make all of those Websites.");
        }
    }

    public static void main (String[]args){
        DotComBust dotComBust = new DotComBust();
        dotComBust.setUpGame();
        dotComBust.startPlaying();
    }
}


