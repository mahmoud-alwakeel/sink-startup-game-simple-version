public class SimpleStartup {
    private int[] locationCells;
    private int numOfHits;

    public void setLocationCells(int[] loc) {
        locationCells = loc;
    }

    public String checkYourSelf(int guess) {
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

}
