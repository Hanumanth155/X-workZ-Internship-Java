class DumbBell {
    String brand;
    int weightLbs;
    boolean isAdjustable;
    double price;
    String material;
    float gripDiameterMm;
    String color;
    boolean isRubberCoated;
    short warrantyMonths;
    double lengthCm;
    String shape;
    int stockQuantity;
    float rating;
    long manufacturerId;
    boolean isHexagonal;
    String handleMaterial;
    int maxWeightCapacityLbs;
    byte plateCount;
    String skuCode;
    String targetMuscleGroup;

    public DumbBell(String brand, int weightLbs, boolean isAdjustable, double price, String material, float gripDiameterMm, String color, boolean isRubberCoated, short warrantyMonths, double lengthCm, String shape, int stockQuantity, float rating, long manufacturerId, boolean isHexagonal, String handleMaterial, int maxWeightCapacityLbs, byte plateCount, String skuCode, String targetMuscleGroup) {
        this.brand = brand;
        this.weightLbs = weightLbs;
        this.isAdjustable = isAdjustable;
        this.price = price;
        this.material = material;
        this.gripDiameterMm = gripDiameterMm;
        this.color = color;
        this.isRubberCoated = isRubberCoated;
        this.warrantyMonths = warrantyMonths;
        this.lengthCm = lengthCm;
        this.shape = shape;
        this.stockQuantity = stockQuantity;
        this.rating = rating;
        this.manufacturerId = manufacturerId;
        this.isHexagonal = isHexagonal;
        this.handleMaterial = handleMaterial;
        this.maxWeightCapacityLbs = maxWeightCapacityLbs;
        this.plateCount = plateCount;
        this.skuCode = skuCode;
        this.targetMuscleGroup = targetMuscleGroup;
    }

    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Weight: " + this.weightLbs + " lbs");
        System.out.println("Is Adjustable: " + this.isAdjustable);
        System.out.println("Price: $" + this.price);
        System.out.println("Material: " + this.material);
        System.out.println("Grip Diameter: " + this.gripDiameterMm + " mm");
        System.out.println("Color: " + this.color);
        System.out.println("Rubber Coated: " + this.isRubberCoated);
        System.out.println("Warranty: " + this.warrantyMonths + " months");
        System.out.println("Length: " + this.lengthCm + " cm");
        System.out.println("Shape: " + this.shape);
        System.out.println("Stock Quantity: " + this.stockQuantity);
        System.out.println("Rating: " + this.rating);
        System.out.println("Manufacturer ID: " + this.manufacturerId);
        System.out.println("Hexagonal: " + this.isHexagonal);
        System.out.println("Handle Material: " + this.handleMaterial);
        System.out.println("Max Weight Capacity: " + this.maxWeightCapacityLbs + " lbs");
        System.out.println("Plate Count: " + this.plateCount);
        System.out.println("SKU Code: " + this.skuCode);
        System.out.println("Target Muscle Group: " + this.targetMuscleGroup);
        System.out.println();
    }
}
