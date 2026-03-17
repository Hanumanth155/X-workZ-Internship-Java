class Trophy {
    String eventName;
    boolean isGoldPlated;
    int winningYear;
    double weightKg;
    float heightCm;
    long prizeMoney;
    short teamSize;
    byte rankPosition;
    char grade;
    String recipient;
    int engravingCost;
    boolean hasBase;
    String material;
    String sportType;
    double widthCm;
    float baseThickness;
    long serialNumber;
    short warrantyMonths;
    boolean isPerpetual;
    String designerName;

    public Trophy(String eventName, boolean isGoldPlated, int winningYear, double weightKg, float heightCm, long prizeMoney, short teamSize, byte rankPosition, char grade, String recipient, int engravingCost, boolean hasBase, String material, String sportType, double widthCm, float baseThickness, long serialNumber, short warrantyMonths, boolean isPerpetual, String designerName) {
        this.eventName = eventName;
        this.isGoldPlated = isGoldPlated;
        this.winningYear = winningYear;
        this.weightKg = weightKg;
        this.heightCm = heightCm;
        this.prizeMoney = prizeMoney;
        this.teamSize = teamSize;
        this.rankPosition = rankPosition;
        this.grade = grade;
        this.recipient = recipient;
        this.engravingCost = engravingCost;
        this.hasBase = hasBase;
        this.material = material;
        this.sportType = sportType;
        this.widthCm = widthCm;
        this.baseThickness = baseThickness;
        this.serialNumber = serialNumber;
        this.warrantyMonths = warrantyMonths;
        this.isPerpetual = isPerpetual;
        this.designerName = designerName;
    }

    public void display() {
        System.out.println("Event Name: " + this.eventName);
        System.out.println("Gold Plated: " + this.isGoldPlated);
        System.out.println("Winning Year: " + this.winningYear);
        System.out.println("Weight: " + this.weightKg + "kg");
        System.out.println("Height: " + this.heightCm + "cm");
        System.out.println("Prize Money: $" + this.prizeMoney);
        System.out.println("Team Size: " + this.teamSize);
        System.out.println("Rank Position: " + this.rankPosition);
        System.out.println("Grade: " + this.grade);
        System.out.println("Recipient: " + this.recipient);
        System.out.println("Engraving Cost: $" + this.engravingCost);
        System.out.println("Has Base: " + this.hasBase);
        System.out.println("Material: " + this.material);
        System.out.println("Sport Type: " + this.sportType);
        System.out.println("Width: " + this.widthCm + "cm");
        System.out.println("Base Thickness: " + this.baseThickness + "cm");
        System.out.println("Serial Number: " + this.serialNumber);
        System.out.println("Warranty Months: " + this.warrantyMonths);
        System.out.println("Is Perpetual: " + this.isPerpetual);
        System.out.println("Designer Name: " + this.designerName);
        System.out.println();
    }
}

