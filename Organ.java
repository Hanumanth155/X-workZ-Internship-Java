
class Organ {
    String name;
    boolean isVital;
    int weightGrams;
    double bloodFlowLitersPerMin;
    float oxygenDemandPercent;
    long cellCountBillions;
    short averageLifespanYears;
    byte biologicalSystemId;
    char locationCode;
    String primaryFunction;
    boolean isTransplantable;
    int dailyOperationCycles;
    double proteinContentPercent;
    float waterContentPercent;
    long geneticMarker;
    short nerveConnectionCount;
    byte priorityLevel;
    char sizeCategory;
    boolean hasSymmetry;
    String doctorSpecialty;

    public Organ(String name, boolean isVital, int weightGrams, double bloodFlowLitersPerMin, float oxygenDemandPercent, long cellCountBillions, short averageLifespanYears, byte biologicalSystemId, char locationCode, String primaryFunction, boolean isTransplantable, int dailyOperationCycles, double proteinContentPercent, float waterContentPercent, long geneticMarker, short nerveConnectionCount, byte priorityLevel, char sizeCategory, boolean hasSymmetry, String doctorSpecialty) {
        this.name = name;
        this.isVital = isVital;
        this.weightGrams = weightGrams;
        this.bloodFlowLitersPerMin = bloodFlowLitersPerMin;
        this.oxygenDemandPercent = oxygenDemandPercent;
        this.cellCountBillions = cellCountBillions;
        this.averageLifespanYears = averageLifespanYears;
        this.biologicalSystemId = biologicalSystemId;
        this.locationCode = locationCode;
        this.primaryFunction = primaryFunction;
        this.isTransplantable = isTransplantable;
        this.dailyOperationCycles = dailyOperationCycles;
        this.proteinContentPercent = proteinContentPercent;
        this.waterContentPercent = waterContentPercent;
        this.geneticMarker = geneticMarker;
        this.nerveConnectionCount = nerveConnectionCount;
        this.priorityLevel = priorityLevel;
        this.sizeCategory = sizeCategory;
        this.hasSymmetry = hasSymmetry;
        this.doctorSpecialty = doctorSpecialty;
    }

    public void display() {
        System.out.println("Organ: " + name);
        System.out.println("Vital: " + isVital);
        System.out.println("Weight: " + weightGrams + "g");
        System.out.println("Blood Flow: " + bloodFlowLitersPerMin + "L/min");
        System.out.println("Oxygen Demand: " + oxygenDemandPercent + "%");
        System.out.println("Cell Count: " + cellCountBillions + "B");
        System.out.println("Lifespan: " + averageLifespanYears + " yrs");
        System.out.println("System ID: " + biologicalSystemId);
        System.out.println("Location: " + locationCode);
        System.out.println("Function: " + primaryFunction);
        System.out.println("Transplantable: " + isTransplantable);
        System.out.println("Daily Cycles: " + dailyOperationCycles);
        System.out.println("Protein: " + proteinContentPercent + "%");
        System.out.println("Water: " + waterContentPercent + "%");
        System.out.println("Marker: " + geneticMarker);
        System.out.println("Nerve Connections: " + nerveConnectionCount);
        System.out.println("Priority: " + priorityLevel);
        System.out.println("Size: " + sizeCategory);
        System.out.println("Symmetry: " + hasSymmetry);
        System.out.println("Specialist: " + doctorSpecialty);
        System.out.println();
    }
}
