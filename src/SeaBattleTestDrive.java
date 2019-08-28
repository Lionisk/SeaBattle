
public class SeaBattleTestDrive {

    public static void main(String[] args) {

        SeaBattle seaBattle = new SeaBattle();

        int[] locations = {2,3,4};
        seaBattle.setLocationCells(locations);

        String userGuess ="2";
        String result = seaBattle.checkYouself(userGuess);
        String testResult = "Неудача";
        if (result.equals("Попал")) {
            testResult = "Попал";
        }
        System.out.println(testResult);
    }
}
