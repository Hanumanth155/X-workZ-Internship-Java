class Conditioner {
    String brand;
    boolean isLeaveIn;
    int volumeMl;
    double priceUsd;
    float hydrationLevel;
    long productCode;
    short shelfLifeMonths;
    byte viscosityLevel;
    char targetGender;
    String keyIngredient;
    int stockQuantity;
    boolean isColorSafe;
    String scent;
    double weightGrams;
    float phBalance;
    long barcode;
    short restockDays;
    byte packagingType;
    char bottleSizeCode;
    boolean isOrganic;

    public Conditioner(String brand, boolean isLeaveIn, int volumeMl, double priceUsd, float hydrationLevel, long productCode, short shelfLifeMonths, byte viscosityLevel, char targetGender, String keyIngredient, int stockQuantity, boolean isColorSafe, String scent, double weightGrams, float phBalance, long barcode, short restockDays, byte packagingType, char bottleSizeCode, boolean isOrganic) {
        this.brand = brand;
        this.isLeaveIn = isLeaveIn;
        this.volumeMl = volumeMl;
        this.priceUsd = priceUsd;
        this.hydrationLevel = hydrationLevel;
        this.productCode = productCode;
        this.shelfLifeMonths = shelfLifeMonths;
        this.viscosityLevel = viscosityLevel;
        this.targetGender = targetGender;
        this.keyIngredient = keyIngredient;
        this.stockQuantity = stockQuantity;
        this.isColorSafe = isColorSafe;
        this.scent = scent;
        this.weightGrams = weightGrams;
        this.phBalance = phBalance;
        this.barcode = barcode;
        this.restockDays = restockDays;
        this.packagingType = packagingType;
        this.bottleSizeCode = bottleSizeCode;
        this.isOrganic = isOrganic;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Leave-In: " + isLeaveIn);
        System.out.println("Volume: " + volumeMl + "ml");
        System.out.println("Price: $" + priceUsd);
        System.out.println("Hydration: " + hydrationLevel + "/10");
        System.out.println("Product Code: " + productCode);
        System.out.println("Shelf Life: " + shelfLifeMonths + " months");
        System.out.println("Viscosity: " + viscosityLevel);
        System.out.println("Gender: " + targetGender);
        System.out.println("Ingredient: " + keyIngredient);
        System.out.println("Stock: " + stockQuantity);
        System.out.println("Color Safe: " + isColorSafe);
        System.out.println("Scent: " + scent);
        System.out.println("Weight: " + weightGrams + "g");
        System.out.println("pH Balance: " + phBalance);
        System.out.println("Barcode: " + barcode);
        System.out.println("Restock Days: " + restockDays);
        System.out.println("Packaging: " + packagingType);
        System.out.println("Size Code: " + bottleSizeCode);
        System.out.println("Organic: " + isOrganic);
        System.out.println();
    }


