class DiabetesRunner {
    public static void main(String[] args) {
        
		Diabetes d1 = new Diabetes("Type 1", true, 9, 150.5, 7.5f, 100000000000L, (short)14, (byte)8, 'E', "Insulin", true, 4, 100.0, 140.0f, 200000L, "Low Carb", (byte)5, 'H', "Excessive thirst, fatigue", false);
        
		Diabetes d2 = new Diabetes("Type 2", false, 462, 135.0, 6.8f, 760000000000L, (short)45, (byte)6, 'E', "Metformin", false, 1, 110.0, 160.0f, 1500000L, "Mediterranean", (byte)4, 'M', "Frequent urination, blurred vision", true);
        
		Diabetes d3 = new Diabetes("Gestational", false, 20, 120.0, 6.0f, 5000000000L, (short)28, (byte)4, 'O', "Dietary Control", false, 2, 95.0, 120.0f, 10000L, "Balanced Pregnancy Diet", (byte)3, 'L', "Often asymptomatic", true);
        
		Diabetes d4 = new Diabetes("Type 1.5 (LADA)", true, 5, 145.0, 7.2f, 15000000000L, (short)35, (byte)7, 'E', "Insulin/Metformin", true, 3, 100.0, 140.0f, 50000L, "Low Glycemic Index", (byte)4, 'H', "Weight loss, extreme hunger", false);
        
		Diabetes d5 = new Diabetes("MODY", false, 2, 130.0, 6.5f, 2000000000L, (short)20, (byte)5, 'E', "Sulfonylureas", false, 1, 100.0, 140.0f, 5000L, "Balanced", (byte)4, 'M', "Mild hyperglycemia", false);
        
		Diabetes d6 = new Diabetes("Type 2 - Severe", false, 150, 180.0, 8.5f, 400000000000L, (short)55, (byte)9, 'E', "Insulin + Metformin", true, 3, 130.0, 180.0f, 800000L, "Strict Low Carb", (byte)2, 'S', "Neuropathy, frequent infections", false);
        
		Diabetes d7 = new Diabetes("Neonatal", true, 1, 160.0, 7.8f, 500000000L, (short)0, (byte)9, 'P', "Insulin", true, 5, 110.0, 150.0f, 1000L, "Specialized Formula", (byte)0, 'S', "Failure to thrive, dehydration", false);
        
		Diabetes d8 = new Diabetes("Type 3c", false, 3, 140.0, 7.0f, 3000000000L, (short)50, (byte)7, 'K', "Pancreatic Enzymes", true, 2, 100.0, 140.0f, 15000L, "Low Fat", (byte)3, 'M', "Abdominal pain, weight loss", false);
        
		Diabetes d9 = new Diabetes("Steroid-Induced", false, 10, 155.0, 7.4f, 8000000000L, (short)40, (byte)6, 'Y', "Insulin/Diet", true, 2, 110.0, 150.0f, 20000L, "Carb Counted", (byte)3, 'M', "Increased thirst, fatigue", true);
        
		Diabetes d10 = new Diabetes("Brittle", true, 1, 200.0, 9.5f, 25000000000L, (short)25, (byte)10, 'E', "Insulin Pump", true, 6, 120.0, 180.0f, 10000L, "Highly Regulated", (byte)2, 'S', "Severe swings in blood sugar", false);

        d1.display();
        d2.display();
        d3.display();
        d4.display();
        d5.display();
        d6.display();
        d7.display();
        d8.display();
        d9.display();
        d10.display();
    }
}