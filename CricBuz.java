class CricBuz {

    private String teamNames[] = new String[8];
    int index;

    public boolean addTeamName(String teamName) {
        boolean isTeamAdded = false;

        if (teamName != null && !teamName.isEmpty()) {
            teamNames[index] = teamName;
            index++;
            isTeamAdded = true;
        } else {
            System.out.println("Enter valid Team Name");
        }

        return isTeamAdded;
    }

    public void getTeamNames() {
        for (String teamName : teamNames)
            System.out.println(teamName);
    }
}