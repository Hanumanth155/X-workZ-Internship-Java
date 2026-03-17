class Garlic {
    String variety;
    boolean isOrganic;
    int clovesPerBulb;
    char sizeGrade;
    double pricePerKg;
    float weightInGrams;
    short shelfLifeDays;
    byte pungencyLevel;
    long annualProductionTons;
    String originCountry;
    String skinColor;
    boolean isPeeled;
    String flavorProfile;
    float moistureContent;
    int harvestedYear;
    short optimalGrowthTemp;
    byte maturityStage;
    long exportVolumeTons;
    double lengthCm;
    char qualityClass;

    public Garlic(String variety, boolean isOrganic, int clovesPerBulb, char sizeGrade, double pricePerKg, float weightInGrams, short shelfLifeDays, byte pungencyLevel, long annualProductionTons, String originCountry, String skinColor, boolean isPeeled, String flavorProfile, float moistureContent, int harvestedYear, short optimalGrowthTemp, byte maturityStage, long exportVolumeTons, double lengthCm, char qualityClass) {
        this.variety = variety;
        this.isOrganic = isOrganic;
        this.clovesPerBulb = clovesPerBulb;
        this.sizeGrade = sizeGrade;
        this.pricePerKg = pricePerKg;
        this.weightInGrams = weightInGrams;
        this.shelfLifeDays = shelfLifeDays;
        this.pungencyLevel = pungencyLevel;
        this.annualProductionTons = annualProductionTons;
        this.originCountry = originCountry;
        this.skinColor = skinColor;
        this.isPeeled = isPeeled;
        this.flavorProfile = flavorProfile;
        this.moistureContent = moistureContent;
        this.harvestedYear = harvestedYear;
        this.optimalGrowthTemp = optimalGrowthTemp;
        this.maturityStage = maturityStage;
        this.exportVolumeTons = exportVolumeTons;
        this.lengthCm = lengthCm;
        this.qualityClass = qualityClass;
    }

    public void display() {
        System.out.println("Variety: " + this.variety);
        System.out.println("Organic: " + this.isOrganic);
        System.out.println("Cloves Per Bulb: " + this.clovesPerBulb);
        System.out.println("Size Grade: " + this.sizeGrade);
        System.out.println("Price Per Kg: $" + this.pricePerKg);
        System.out.println("Weight: " + this.weightInGrams + "g");
        System.out.println("Shelf Life: " + this.shelfLifeDays + " days");
        System.out.println("Pungency: " + this.pungencyLevel);
        System.out.println("Production: " + this.annualProductionTons + " tons");
        System.out.println("Origin: " + this.originCountry);
        System.out.println("Skin Color: " + this.skinColor);
        System.out.println("Peeled: " + this.isPeeled);
        System.out.println("Flavor: " + this.flavorProfile);
        System.out.println("Moisture: " + this.moistureContent + "%");
        System.out.println("Harvest Year: " + this.harvestedYear);
        System.out.println("Optimal Temp: " + this.optimalGrowthTemp + "C");
        System.out.println("Maturity Stage: " + this.maturityStage);
        System.out.println("Export Volume: " + this.exportVolumeTons + " tons");
        System.out.println("Length: " + this.lengthCm + " cm");
        System.out.println("Quality Class: " + this.qualityClass);
        System.out.println();
    }
}

