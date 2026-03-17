class Cell {
    String type;
    boolean hasNucleus;
    int lifespanDays;
    double diameterMicrometers;
    float divisionRateHours;
    long moleculesCount;
    short mitochondriaCount;
    byte chromosomePairs;
    char shapeCategory;
    String primaryFunction;
    boolean isEukaryotic;
    int energyAtpProduced;
    double proteinSynthesisRate;
    float waterContentPercent;
    long geneticMarkerId;
    short ribosomeCount;
    byte membraneLayers;
    char sizeGrade;
    boolean canSelfRepair;
    String discoveryYear;

    public Cell(String type, boolean hasNucleus, int lifespanDays, double diameterMicrometers, float divisionRateHours, long moleculesCount, short mitochondriaCount, byte chromosomePairs, char shapeCategory, String primaryFunction, boolean isEukaryotic, int energyAtpProduced, double proteinSynthesisRate, float waterContentPercent, long geneticMarkerId, short ribosomeCount, byte membraneLayers, char sizeGrade, boolean canSelfRepair, String discoveryYear) {
        this.type = type;
        this.hasNucleus = hasNucleus;
        this.lifespanDays = lifespanDays;
        this.diameterMicrometers = diameterMicrometers;
        this.divisionRateHours = divisionRateHours;
        this.moleculesCount = moleculesCount;
        this.mitochondriaCount = mitochondriaCount;
        this.chromosomePairs = chromosomePairs;
        this.shapeCategory = shapeCategory;
        this.primaryFunction = primaryFunction;
        this.isEukaryotic = isEukaryotic;
        this.energyAtpProduced = energyAtpProduced;
        this.proteinSynthesisRate = proteinSynthesisRate;
        this.waterContentPercent = waterContentPercent;
        this.geneticMarkerId = geneticMarkerId;
        this.ribosomeCount = ribosomeCount;
        this.membraneLayers = membraneLayers;
        this.sizeGrade = sizeGrade;
        this.canSelfRepair = canSelfRepair;
        this.discoveryYear = discoveryYear;
    }

    public void display() {
        System.out.println("Cell Type: " + type + " | Nucleus: " + hasNucleus + " | Life: " + lifespanDays + " days");
        System.out.println("Function: " + primaryFunction + " | ATP: " + energyAtpProduced + " units");
        System.out.println("Structure: " + shapeCategory + " | Eukaryotic: " + isEukaryotic + " | Repair: " + canSelfRepair);
        System.out.println();
    }
}
