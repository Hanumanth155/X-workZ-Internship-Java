class RCB {

    private String playerNames[] = new String[15];
    int index;

    public boolean addPlayerName(String playerName) {
        boolean isPlayerAdded = false;

        if (playerName != null && !playerName.isEmpty()) {
            playerNames[index] = playerName;
            index++;
            isPlayerAdded = true;
        } else {
            System.out.println("Enter valid Player Name");
        }

        return isPlayerAdded;
    }

    public void getPlayerNames() {
        for (String playerName : playerNames)
            System.out.println(playerName);
    }
}