public class SimpleGame {
    public static void main(String[] args) {
        int userGuesses = 0;
        SimpleStartup startup = new SimpleStartup();
        GameHelper helper = new GameHelper();
        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        startup.setLocationCells(locations);
        boolean isAlive = true;
        while (isAlive) {
            int guess = helper.getUserInput("enter a number");
            String result = startup.checkYourSelf(guess);
            userGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("you took " + userGuesses + " guesses");
            }
        }
    }
}
