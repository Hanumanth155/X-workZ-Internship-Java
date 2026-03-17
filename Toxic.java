class Toxic {
    String title;
    boolean isBlockbuster;
    int releaseYear;
    char ageRating;
    double boxOfficeGrossMillions;
    float imdbRating;
    short screenCount;
    byte discCount;
    long ticketSales;
    String director;
    String leadActor;
    boolean hasSequel;
    int durationMinutes;
    char genreCode;
    double productionBudgetMillions;
    float audienceScore;
    short sequelCount;
    byte awardWins;
    long streamedHours;
    String language;

    public Toxic(String title, boolean isBlockbuster, int releaseYear, char ageRating, double boxOfficeGrossMillions, float imdbRating, short screenCount, byte discCount, long ticketSales, String director, String leadActor, boolean hasSequel, int durationMinutes, char genreCode, double productionBudgetMillions, float audienceScore, short sequelCount, byte awardWins, long streamedHours, String language) {
        this.title = title;
        this.isBlockbuster = isBlockbuster;
        this.releaseYear = releaseYear;
        this.ageRating = ageRating;
        this.boxOfficeGrossMillions = boxOfficeGrossMillions;
        this.imdbRating = imdbRating;
        this.screenCount = screenCount;
        this.discCount = discCount;
        this.ticketSales = ticketSales;
        this.director = director;
        this.leadActor = leadActor;
        this.hasSequel = hasSequel;
        this.durationMinutes = durationMinutes;
        this.genreCode = genreCode;
        this.productionBudgetMillions = productionBudgetMillions;
        this.audienceScore = audienceScore;
        this.sequelCount = sequelCount;
        this.awardWins = awardWins;
        this.streamedHours = streamedHours;
        this.language = language;
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Blockbuster: " + this.isBlockbuster);
        System.out.println("Release Year: " + this.releaseYear);
        System.out.println("Age Rating: " + this.ageRating);
        System.out.println("Box Office (M): $" + this.boxOfficeGrossMillions);
        System.out.println("IMDb Rating: " + this.imdbRating);
        System.out.println("Screen Count: " + this.screenCount);
        System.out.println("Disc Count: " + this.discCount);
        System.out.println("Ticket Sales: " + this.ticketSales);
        System.out.println("Director: " + this.director);
        System.out.println("Lead Actor: " + this.leadActor);
        System.out.println("Has Sequel: " + this.hasSequel);
        System.out.println("Duration: " + this.durationMinutes + " mins");
        System.out.println("Genre Code: " + this.genreCode);
        System.out.println("Budget (M): $" + this.productionBudgetMillions);
        System.out.println("Audience Score: " + this.audienceScore + "%");
        System.out.println("Sequel Count: " + this.sequelCount);
        System.out.println("Award Wins: " + this.awardWins);
        System.out.println("Streamed Hours: " + this.streamedHours);
        System.out.println("Language: " + this.language);
        System.out.println();
    }
}
