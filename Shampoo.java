class Shampoo {
    String brand;
    boolean isSulfateFree;
    int volumeMl;
    double priceUsd;
    float phLevel;
    long barcode;
    short shelfLifeMonths;
    byte rating;
    char hairType;
    String scent;
    String mainIngredient;
    boolean isVegan;
    double weightGrams;
    float concentrationPercent;
    int bottlesSold;
    long batchNumber;
    short restockDays;
    byte foamLevel;
    char bottleSizeCode;
    String targetAudience;

    public Shampoo(String brand, boolean isSulfateFree, int volumeMl, double priceUsd, float phLevel, long barcode, short shelfLifeMonths, byte rating, char hairType, String scent, String mainIngredient, boolean isVegan, double weightGrams, float concentrationPercent, int bottlesSold, long batchNumber, short restockDays, byte foamLevel, char bottleSizeCode, String targetAudience) {
        this.brand = brand;
        this.isSulfateFree = isSulfateFree;
        this.volumeMl = volumeMl;
        this.priceUsd = priceUsd;
        this.phLevel = phLevel;
        this.barcode = barcode;
        this.shelfLifeMonths = shelfLifeMonths;
        this.rating = rating;
        this.hairType = hairType;
        this.scent = scent;
        this.mainIngredient = mainIngredient;
        this.isVegan = isVegan;
        this.weightGrams = weightGrams;
        this.concentrationPercent = concentrationPercent;
        this.bottlesSold = bottlesSold;
        this.batchNumber = batchNumber;
        this.restockDays = restockDays;
        this.foamLevel = foamLevel;
        this.bottleSizeCode = bottleSizeCode;
        this.targetAudience = targetAudience;
    }

    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Sulfate Free: " + this.isSulfateFree);
        System.out.println("Volume: " + this.volumeMl + " ml");
        System.out.println("Price: $" + this.priceUsd);
        System.out.println("pH Level: " + this.phLevel);
        System.out.println("Barcode: " + this.barcode);
        System.out.println("Shelf Life: " + this.shelfLifeMonths + " months");
        System.out.println("Rating: " + this.rating);
        System.out.println("Hair Type: " + this.hairType);
        System.out.println("Scent: " + this.scent);
        System.out.println("Main Ingredient: " + this.mainIngredient);
        System.out.println("Vegan: " + this.isVegan);
        System.out.println("Weight: " + this.weightGrams + " g");
        System.out.println("Concentration: " + this.concentrationPercent + "%");
        System.out.println("Bottles Sold: " + this.bottlesSold);
        System.out.println("Batch Number: " + this.batchNumber);
        System.out.println("Restock Days: " + this.restockDays);
        System.out.println("Foam Level: " + this.foamLevel);
        System.out.println("Size Code: " + this.bottleSizeCode);
        System.out.println("Target Audience: " + this.targetAudience);
        System.out.println();
    }
}
