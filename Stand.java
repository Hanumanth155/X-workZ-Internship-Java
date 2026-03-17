class Stand {
    String brand;
    boolean isFoldable;
    int weightCapacityKg;
    char sizeCategory;
    double priceUsd;
    float heightCm;
    short warrantyMonths;
    byte adjustableLevels;
    long serialNumber;
    String material;
    String color;
    boolean hasAntiSlip;
    double widthCm;
    float weightOfStandKg;
    int stockAvailable;
    short maxScreenSizeInches;
    byte rating;
    long manufacturerId;
    String usageType;
    char grade;

    public Stand(String brand, boolean isFoldable, int weightCapacityKg, char sizeCategory, double priceUsd, float heightCm, short warrantyMonths, byte adjustableLevels, long serialNumber, String material, String color, boolean hasAntiSlip, double widthCm, float weightOfStandKg, int stockAvailable, short maxScreenSizeInches, byte rating, long manufacturerId, String usageType, char grade) {
        this.brand = brand;
        this.isFoldable = isFoldable;
        this.weightCapacityKg = weightCapacityKg;
        this.sizeCategory = sizeCategory;
        this.priceUsd = priceUsd;
        this.heightCm = heightCm;
        this.warrantyMonths = warrantyMonths;
        this.adjustableLevels = adjustableLevels;
        this.serialNumber = serialNumber;
        this.material = material;
        this.color = color;
        this.hasAntiSlip = hasAntiSlip;
        this.widthCm = widthCm;
        this.weightOfStandKg = weightOfStandKg;
        this.stockAvailable = stockAvailable;
        this.maxScreenSizeInches = maxScreenSizeInches;
        this.rating = rating;
        this.manufacturerId = manufacturerId;
        this.usageType = usageType;
        this.grade = grade;
    }

    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Foldable: " + this.isFoldable);
        System.out.println("Capacity: " + this.weightCapacityKg + "kg");
        System.out.println("Size Category: " + this.sizeCategory);
        System.out.println("Price: $" + this.priceUsd);
        System.out.println("Height: " + this.heightCm + "cm");
        System.out.println("Warranty: " + this.warrantyMonths + " months");
        System.out.println("Adjustable Levels: " + this.adjustableLevels);
        System.out.println("Serial: " + this.serialNumber);
        System.out.println("Material: " + this.material);
        System.out.println("Color: " + this.color);
        System.out.println("Anti-Slip: " + this.hasAntiSlip);
        System.out.println("Width: " + this.widthCm + "cm");
        System.out.println("Stand Weight: " + this.weightOfStandKg + "kg");
        System.out.println("Stock: " + this.stockAvailable);
        System.out.println("Max Screen: " + this.maxScreenSizeInches + " inches");
        System.out.println("Rating: " + this.rating);
        System.out.println("Manufacturer ID: " + this.manufacturerId);
        System.out.println("Usage: " + this.usageType);
        System.out.println("Grade: " + this.grade);
        System.out.println();
    }
}

