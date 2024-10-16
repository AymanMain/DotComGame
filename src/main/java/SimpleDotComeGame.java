import java.util.Scanner;

public class SimpleDotComeGame {
    public static void main(String[] args) {
        SimpleDotCom simple=new SimpleDotCom();
        int numOfGuesses;

        Scanner sc=new Scanner(System.in);

        int head =(int) (Math.random()*4);
        int[]locs =new int[]{head,head+1,head+2};
        simple.setPositions(locs);

        while(simple.numOfHits<3){
            System.out.println("Where do you wanna hit ?");
            String input=sc.nextLine();
            simple.checkYourself(input);
        }
    }
}
