class Diabetes {
    String diabetesType;
    boolean isType1;
    int patientCountMillions;
    double averageBloodSugar;
    float hba1cLevel;
    long globalExpenditureUsd;
    short averageOnsetAge;
    byte riskLevel;
    char diagnosticCode;
    String primaryMedication;
    boolean requiresInsulin;
    int dailyCheckups;
    double fastingGlucoseTarget;
    float postprandialGlucoseTarget;
    long annualDeaths;
    String recommendedDiet;
    byte exerciseHoursWeekly;
    char severityIndex;
    String commonSymptoms;
    boolean isReversible;

    public Diabetes(String diabetesType, boolean isType1, int patientCountMillions, double averageBloodSugar, float hba1cLevel, long globalExpenditureUsd, short averageOnsetAge, byte riskLevel, char diagnosticCode, String primaryMedication, boolean requiresInsulin, int dailyCheckups, double fastingGlucoseTarget, float postprandialGlucoseTarget, long annualDeaths, String recommendedDiet, byte exerciseHoursWeekly, char severityIndex, String commonSymptoms, boolean isReversible) {
        this.diabetesType = diabetesType;
        this.isType1 = isType1;
        this.patientCountMillions = patientCountMillions;
        this.averageBloodSugar = averageBloodSugar;
        this.hba1cLevel = hba1cLevel;
        this.globalExpenditureUsd = globalExpenditureUsd;
        this.averageOnsetAge = averageOnsetAge;
        this.riskLevel = riskLevel;
        this.diagnosticCode = diagnosticCode;
        this.primaryMedication = primaryMedication;
        this.requiresInsulin = requiresInsulin;
        this.dailyCheckups = dailyCheckups;
        this.fastingGlucoseTarget = fastingGlucoseTarget;
        this.postprandialGlucoseTarget = postprandialGlucoseTarget;
        this.annualDeaths = annualDeaths;
        this.recommendedDiet = recommendedDiet;
        this.exerciseHoursWeekly = exerciseHoursWeekly;
        this.severityIndex = severityIndex;
        this.commonSymptoms = commonSymptoms;
        this.isReversible = isReversible;
    }

    public void display() {
        System.out.println("Diabetes Type: " + this.diabetesType);
        System.out.println("Is Type 1: " + this.isType1);
        System.out.println("Patient Count: " + this.patientCountMillions + " million");
        System.out.println("Average Blood Sugar: " + this.averageBloodSugar + " mg/dL");
        System.out.println("HbA1c Level: " + this.hba1cLevel + "%");
        System.out.println("Global Expenditure: $" + this.globalExpenditureUsd);
        System.out.println("Average Onset Age: " + this.averageOnsetAge);
        System.out.println("Risk Level: " + this.riskLevel);
        System.out.println("Diagnostic Code: " + this.diagnosticCode);
        System.out.println("Primary Medication: " + this.primaryMedication);
        System.out.println("Requires Insulin: " + this.requiresInsulin);
        System.out.println("Daily Checkups: " + this.dailyCheckups);
        System.out.println("Fasting Target: " + this.fastingGlucoseTarget + " mg/dL");
        System.out.println("Postprandial Target: " + this.postprandialGlucoseTarget + " mg/dL");
        System.out.println("Annual Deaths: " + this.annualDeaths);
        System.out.println("Recommended Diet: " + this.recommendedDiet);
        System.out.println("Exercise Hours Weekly: " + this.exerciseHoursWeekly);
        System.out.println("Severity Index: " + this.severityIndex);
        System.out.println("Common Symptoms: " + this.commonSymptoms);
        System.out.println("Is Reversible: " + this.isReversible);
        System.out.println();
    }
}
