class WallPaper {
    String brand;
    String material;
    String primaryColor;
    String pattern;
    double rollLengthMeters;
    double rollWidthMeters;
    double pricePerRoll;
    boolean isPeelAndStick;
    boolean isWashable;
    boolean isFireResistant;
    boolean isEcoFriendly;
    String texture;
    int weightGramsPerSqm;
    String recommendedRoom;
    int warrantyYears;
    String adhesiveType;
    String finishType;
    String originCountry;
    String collectionName;
    int stockQuantity;

    public WallPaper(String brand, String material, String primaryColor, String pattern, double rollLengthMeters, double rollWidthMeters, double pricePerRoll, boolean isPeelAndStick, boolean isWashable, boolean isFireResistant, boolean isEcoFriendly, String texture, int weightGramsPerSqm, String recommendedRoom, int warrantyYears, String adhesiveType, String finishType, String originCountry, String collectionName, int stockQuantity) {
      
	  this.brand = brand;
        this.material = material;
        this.primaryColor = primaryColor;
        this.pattern = pattern;
        this.rollLengthMeters = rollLengthMeters;
        this.rollWidthMeters = rollWidthMeters;
        this.pricePerRoll = pricePerRoll;
        this.isPeelAndStick = isPeelAndStick;
        this.isWashable = isWashable;
        this.isFireResistant = isFireResistant;
        this.isEcoFriendly = isEcoFriendly;
        this.texture = texture;
        this.weightGramsPerSqm = weightGramsPerSqm;
        this.recommendedRoom = recommendedRoom;
        this.warrantyYears = warrantyYears;
        this.adhesiveType = adhesiveType;
        this.finishType = finishType;
        this.originCountry = originCountry;
        this.collectionName = collectionName;
        this.stockQuantity = stockQuantity;
    }

    // Instance Method to display all variables
    public void display() {
        System.out.println("--- WallPaper: " + this.brand + " (" + this.collectionName + ") ---");
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.primaryColor);
        System.out.println("Pattern: " + this.pattern);
        System.out.println("Dimensions: " + this.rollLengthMeters + "m x " + this.rollWidthMeters + "m");
        System.out.println("Price/Roll: $" + this.pricePerRoll);
        System.out.println("Peel & Stick: " + this.isPeelAndStick);
        System.out.println("Washable: " + this.isWashable);
        System.out.println("Fire Resistant: " + this.isFireResistant);
        System.out.println("Eco Friendly: " + this.isEcoFriendly);
        System.out.println("Texture: " + this.texture);
        System.out.println("Weight: " + this.weightGramsPerSqm + " g/sqm");
        System.out.println("Room: " + this.recommendedRoom);
        System.out.println("Warranty: " + this.warrantyYears + " years");
        System.out.println("Adhesive: " + this.adhesiveType);
        System.out.println("Finish: " + this.finishType);
        System.out.println("Origin: " + this.originCountry);
        System.out.println("Stock: " + this.stockQuantity + " rolls\n");
    }
}
