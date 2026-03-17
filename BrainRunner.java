class BrainRunner {
    public static void main(String[] args) {
        
		Brain b1 = new Brain("Human", 1400, true, 1260.0f, 86.0, 150L, (short)110, (byte)4, 'L', "O+", "None", 20.0, 750, 2500.0f, false, 2500000L, (short)250, (byte)12, 'M', "Normal");
        
		Brain b2 = new Brain("Chimpanzee", 420, true, 380.0f, 28.0, 45L, (short)40, (byte)4, 'R', "A-", "None", 18.0, 200, 800.0f, false, 50000L, (short)180, (byte)10, 'F', "High Functioning");
        
		Brain b3 = new Brain("Dolphin", 1600, true, 1500.0f, 37.0, 60L, (short)85, (byte)4, 'B', "B+", "None", 22.0, 800, 3000.0f, false, 150000L, (short)150, (byte)14, 'F', "Normal");
        
		Brain b4 = new Brain("Elephant", 5000, true, 4800.0f, 257.0, 300L, (short)60, (byte)4, 'L', "O-", "None", 25.0, 2000, 6000.0f, false, 300000L, (short)400, (byte)8, 'M', "Normal");
        
		Brain b5 = new Brain("Human", 1350, false, 1200.0f, 80.0, 130L, (short)95, (byte)4, 'R', "AB+", "Alzheimer's", 15.0, 600, 2200.0f, false, 1000000L, (short)450, (byte)6, 'F', "Impaired");
        
		Brain b6 = new Brain("Dog", 72, true, 65.0f, 2.2, 5L, (short)30, (byte)4, 'L', "A+", "None", 12.0, 50, 150.0f, false, 10000L, (short)200, (byte)15, 'M', "Alert");
        
		Brain b7 = new Brain("Cat", 30, true, 25.0f, 0.25, 1L, (short)25, (byte)4, 'R', "B-", "None", 10.0, 20, 80.0f, false, 5000L, (short)120, (byte)18, 'F', "Alert");
        
		Brain b8 = new Brain("Human", 1450, false, 1300.0f, 86.0, 140L, (short)105, (byte)4, 'L', "A+", "None", 21.0, 800, 2600.0f, true, 2400000L, (short)350, (byte)9, 'M', "Concussed");
        
		Brain b9 = new Brain("Blue Whale", 8000, true, 7500.0f, 30.0, 50L, (short)50, (byte)4, 'B', "O+", "None", 15.0, 5000, 10000.0f, false, 200000L, (short)800, (byte)5, 'M', "Normal");
        
		Brain b10 = new Brain("Human", 1380, true, 1240.0f, 85.0, 148L, (short)135, (byte)4, 'B', "O-", "None", 20.5, 760, 2550.0f, false, 2600000L, (short)210, (byte)13, 'F', "Gifted");

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        b5.display();
        b6.display();
        b7.display();
        b8.display();
        b9.display();
        b10.display();
    }
}
