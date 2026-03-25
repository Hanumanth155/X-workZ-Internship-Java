class Wonderla {

    private String waterGames[] = new String[20];
    int index;

    public boolean addWaterGame(String gameName) {
        boolean isGameAdded = false;

        if (gameName != null && !gameName.isEmpty()) {
            waterGames[index] = gameName;
            index++;
            isGameAdded = true;
        } else {
            System.out.println("Enter valid Game Name");
        }

        return isGameAdded;
    }

    public void getWaterGames() {
        for (String gameName : waterGames)
            System.out.println(gameName);
    }
}