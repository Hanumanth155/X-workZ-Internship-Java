class OrganRunner {
    public static void main(String[] args) {
        
		Organ o1 = new Organ("Heart", true, 300, 5.0, 10.0f, 2000L, (short)80, (byte)1, 'C', "Pumping Blood", true, 100000, 18.5, 75.0f, 9901L, (short)120, (byte)10, 'M', true, "Cardiologist");
        
		Organ o2 = new Organ("Lungs", true, 1300, 4.5, 5.0f, 300L, (short)80, (byte)2, 'C', "Gas Exchange", true, 22000, 15.0, 80.0f, 9902L, (short)80, (byte)10, 'L', true, "Pulmonologist");
        
		Organ o3 = new Organ("Liver", true, 1500, 1.5, 20.0f, 100L, (short)80, (byte)3, 'A', "Detoxification", true, 1, 20.0, 70.0f, 9903L, (short)50, (byte)10, 'L', false, "Hepatologist");
        
		Organ o4 = new Organ("Brain", true, 1400, 0.75, 20.0f, 86L, (short)80, (byte)4, 'H', "Control Center", false, 1, 12.0, 77.0f, 9904L, (short)5000, (byte)10, 'M', true, "Neurologist");
        
		Organ o5 = new Organ("Kidney", true, 150, 1.2, 7.0f, 10L, (short)80, (byte)5, 'A', "Filtration", true, 1, 14.0, 80.0f, 9905L, (short)40, (byte)9, 'S', true, "Nephrologist");
        
		Organ o6 = new Organ("Pancreas", false, 100, 0.5, 3.0f, 5L, (short)80, (byte)3, 'A', "Insulin Production", true, 1, 16.0, 75.0f, 9906L, (short)30, (byte)8, 'S', false, "Endocrinologist");
        
		Organ o7 = new Organ("Skin", true, 5000, 0.4, 2.0f, 1000L, (short)80, (byte)6, 'O', "Protection", true, 1, 25.0, 64.0f, 9907L, (short)1000, (byte)7, 'X', true, "Dermatologist");
        
		Organ o8 = new Organ("Stomach", false, 500, 0.6, 4.0f, 20L, (short)80, (byte)3, 'A', "Digestion", true, 3, 15.0, 80.0f, 9908L, (short)60, (byte)7, 'M', false, "Gastroenterologist");
        
		Organ o9 = new Organ("Spleen", false, 170, 0.3, 2.0f, 15L, (short)80, (byte)7, 'A', "Blood Filtering", true, 1, 17.0, 78.0f, 9909L, (short)20, (byte)5, 'S', false, "Hematologist");
        
		Organ o10 = new Organ("Bladder", false, 150, 0.2, 1.0f, 5L, (short)80, (byte)5, 'P', "Urine Storage", true, 6, 10.0, 82.0f, 9910L, (short)15, (byte)6, 'S', true, "Urologist");

        o1.display(); o2.display(); o3.display(); o4.display(); o5.display();
        o6.display(); o7.display(); o8.display(); o9.display(); o10.display();
    }
}