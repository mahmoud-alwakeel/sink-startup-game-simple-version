public  class SimpleStartupTestDrive {
    public static  void main(String[] args) {
        SimpleStartup dot = new SimpleStartup();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);
        int guess = 3;
        String res = dot.checkYourSelf(guess);
        String testRes = "failed";
        if (res.equals("hit")) {
            testRes = "passed";
        }
        System.out.println(testRes);
    }
}