class Cricket {
    String playerName;
    int age;
    String country;
    String role;
    String battingStyle;
    String bowlingStyle;
    int matches;
    int runs;
    int wickets;
    int catches;
    int strikeRate;
    int average;
    int centuries;
    int halfCenturies;
    int bestScore;
    int economy;
    int overs;
    int maidens;
    String team;
    String format;

    Cricket() {

    }

    Cricket(String playerName,int age,String country,String role,String battingStyle,String bowlingStyle,int matches,int runs,int wickets,int catches,int strikeRate,int average,int centuries,int halfCenturies,int bestScore,int economy,int overs,int maidens,String team,String format) {
        this.playerName = playerName;
        this.age = age;
        this.country = country;
        this.role = role;
        this.battingStyle = battingStyle;
        this.bowlingStyle = bowlingStyle;
        this.matches = matches;
        this.runs = runs;
        this.wickets = wickets;
        this.catches = catches;
        this.strikeRate = strikeRate;
        this.average = average;
        this.centuries = centuries;
        this.halfCenturies = halfCenturies;
        this.bestScore = bestScore;
        this.economy = economy;
        this.overs = overs;
        this.maidens = maidens;
        this.team = team;
        this.format = format;
    }
}
