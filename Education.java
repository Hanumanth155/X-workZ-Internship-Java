class Education {
    String institutionName;
    String level;
    int studentCount;
    boolean isPublic;
    double annualTuition;
    float graduationRate;
    long endowment;
    char accreditation;
    String location;
    short staffCount;
    byte worldRanking;
    int foundedYear;
    boolean hasOnlineCourses;
    char sizeCategory;
    double averageGPA;
    long booksInLibrary;
    boolean isCoed;
    String primaryLanguage;
    float researchFundingMillions;
    byte collegeCount;

    public Education(String institutionName, String level, int studentCount, boolean isPublic, double annualTuition, float graduationRate, long endowment, char accreditation, String location, short staffCount, byte worldRanking, int foundedYear, boolean hasOnlineCourses, char sizeCategory, double averageGPA, long booksInLibrary, boolean isCoed, String primaryLanguage, float researchFundingMillions, byte collegeCount) {
        this.institutionName = institutionName;
        this.level = level;
        this.studentCount = studentCount;
        this.isPublic = isPublic;
        this.annualTuition = annualTuition;
        this.graduationRate = graduationRate;
        this.endowment = endowment;
        this.accreditation = accreditation;
        this.location = location;
        this.staffCount = staffCount;
        this.worldRanking = worldRanking;
        this.foundedYear = foundedYear;
        this.hasOnlineCourses = hasOnlineCourses;
        this.sizeCategory = sizeCategory;
        this.averageGPA = averageGPA;
        this.booksInLibrary = booksInLibrary;
        this.isCoed = isCoed;
        this.primaryLanguage = primaryLanguage;
        this.researchFundingMillions = researchFundingMillions;
        this.collegeCount = collegeCount;
    }

    public void display() {
        System.out.println("Institution: " + institutionName + " | Level: " + level + " | Students: " + studentCount);
        System.out.println("Public: " + isPublic + " | Tuition: $" + annualTuition + " | Grad Rate: " + graduationRate + "%");
        System.out.println("Ranking: " + worldRanking + " | Founded: " + foundedYear + " | Online: " + hasOnlineCourses);
        System.out.println();
    }
}