class Brain {
    String species;
    int weightGrams;
    boolean isHealthy;
    float volumeCc;
    double neuronCountBillions;
    long synapseCountTrillions;
    short iqScore;
    byte lobeCount;
    char dominantHemisphere;
    String bloodType;
    String disease;
    double oxygenConsumptionPercent;
    int bloodFlowMlPerMin;
    float surfaceAreaSqCm;
    boolean hasConcussion;
    long memoryCapacityTb;
    short reactionTimeMs;
    byte brainWavesHz;
    char gender;
    String cognitiveStatus;

    public Brain(String species, int weightGrams, boolean isHealthy, float volumeCc, double neuronCountBillions, long synapseCountTrillions, short iqScore, byte lobeCount, char dominantHemisphere, String bloodType, String disease, double oxygenConsumptionPercent, int bloodFlowMlPerMin, float surfaceAreaSqCm, boolean hasConcussion, long memoryCapacityTb, short reactionTimeMs, byte brainWavesHz, char gender, String cognitiveStatus) {
        this.species = species;
        this.weightGrams = weightGrams;
        this.isHealthy = isHealthy;
        this.volumeCc = volumeCc;
        this.neuronCountBillions = neuronCountBillions;
        this.synapseCountTrillions = synapseCountTrillions;
        this.iqScore = iqScore;
        this.lobeCount = lobeCount;
        this.dominantHemisphere = dominantHemisphere;
        this.bloodType = bloodType;
        this.disease = disease;
        this.oxygenConsumptionPercent = oxygenConsumptionPercent;
        this.bloodFlowMlPerMin = bloodFlowMlPerMin;
        this.surfaceAreaSqCm = surfaceAreaSqCm;
        this.hasConcussion = hasConcussion;
        this.memoryCapacityTb = memoryCapacityTb;
        this.reactionTimeMs = reactionTimeMs;
        this.brainWavesHz = brainWavesHz;
        this.gender = gender;
        this.cognitiveStatus = cognitiveStatus;
    }

    public void display() {
        System.out.println("Species: " + this.species);
        System.out.println("Weight: " + this.weightGrams + "g");
        System.out.println("Healthy: " + this.isHealthy);
        System.out.println("Volume: " + this.volumeCc + "cc");
        System.out.println("Neurons: " + this.neuronCountBillions + " Billion");
        System.out.println("Synapses: " + this.synapseCountTrillions + " Trillion");
        System.out.println("IQ Score: " + this.iqScore);
        System.out.println("Lobe Count: " + this.lobeCount);
        System.out.println("Dominant Hemisphere: " + this.dominantHemisphere);
        System.out.println("Blood Type: " + this.bloodType);
        System.out.println("Disease: " + this.disease);
        System.out.println("Oxygen Consumption: " + this.oxygenConsumptionPercent + "%");
        System.out.println("Blood Flow: " + this.bloodFlowMlPerMin + " ml/min");
        System.out.println("Surface Area: " + this.surfaceAreaSqCm + " sq cm");
        System.out.println("Concussion: " + this.hasConcussion);
        System.out.println("Memory Capacity: " + this.memoryCapacityTb + " TB");
        System.out.println("Reaction Time: " + this.reactionTimeMs + " ms");
        System.out.println("Brain Waves: " + this.brainWavesHz + " Hz");
        System.out.println("Gender: " + this.gender);
        System.out.println("Cognitive Status: " + this.cognitiveStatus);
        System.out.println();
    }
}
