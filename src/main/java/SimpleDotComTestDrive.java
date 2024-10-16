public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom simple=new SimpleDotCom();
        int[] Locations={2,3,4};
        simple.setPositions(Locations);
        String userGuess="2";
        String result=simple.checkYourself(userGuess);

        String testResult="failed";
        if(result.equals("hit")||result.equals("kill")){
            testResult="Passed";
        }
        System.out.println(testResult);
    }
}
