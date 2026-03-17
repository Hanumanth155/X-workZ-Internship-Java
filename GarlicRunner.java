class GarlicRunner {
    public static void main(String[] args) {
        
		Garlic g1 = new Garlic("Hardneck", true, 6, 'L', 12.50, 50.0f, (short)180, (byte)8, 500000L, "USA", "Purple", false, "Robust", 60.5f, 2023, (short)15, (byte)4, 150000L, 5.5, 'A');
        
		Garlic g2 = new Garlic("Softneck", false, 12, 'M', 8.99, 45.0f, (short)240, (byte)5, 800000L, "China", "White", false, "Mild", 55.0f, 2023, (short)20, (byte)4, 400000L, 4.5, 'B');
        
		Garlic g3 = new Garlic("Elephant", true, 4, 'X', 15.00, 150.0f, (short)120, (byte)3, 100000L, "Mexico", "Yellowish", false, "Onion-like", 65.0f, 2023, (short)18, (byte)4, 20000L, 8.0, 'A');
        
		Garlic g4 = new Garlic("Creole", true, 10, 'S', 20.00, 35.0f, (short)300, (byte)7, 50000L, "Spain", "Deep Purple", false, "Sweet", 50.0f, 2022, (short)25, (byte)5, 10000L, 3.5, 'A');
        
		Garlic g5 = new Garlic("Rocambole", true, 8, 'M', 18.50, 48.0f, (short)150, (byte)9, 75000L, "France", "Brownish", false, "Rich", 58.0f, 2023, (short)12, (byte)4, 15000L, 5.0, 'A');
        
		Garlic g6 = new Garlic("Porcelain", false, 4, 'L', 14.00, 60.0f, (short)200, (byte)8, 120000L, "Canada", "White", false, "Strong", 59.0f, 2023, (short)10, (byte)4, 30000L, 6.0, 'A');
        
		Garlic g7 = new Garlic("Purple Stripe", true, 9, 'M', 16.00, 42.0f, (short)180, (byte)7, 90000L, "Russia", "Striped", false, "Spicy", 57.0f, 2022, (short)14, (byte)4, 25000L, 4.8, 'B');
        
		Garlic g8 = new Garlic("Artichoke", false, 15, 'L', 7.50, 55.0f, (short)250, (byte)5, 1000000L, "China", "Off-white", true, "Mild", 54.0f, 2023, (short)22, (byte)4, 600000L, 5.2, 'C');
        
		Garlic g9 = new Garlic("Silverskin", true, 18, 'S', 11.00, 38.0f, (short)365, (byte)8, 200000L, "USA", "Silver", false, "Pungent", 52.0f, 2023, (short)24, (byte)5, 80000L, 3.8, 'A');
        
		Garlic g10 = new Garlic("Black Garlic", true, 12, 'M', 45.00, 40.0f, (short)90, (byte)2, 10000L, "South Korea", "Black", true, "Sweet/Savory", 20.0f, 2022, (short)60, (byte)5, 5000L, 4.0, 'A');

        g1.display(); 
		g2.display(); 
		g3.display(); 
		g4.display(); 
		g5.display();
        g6.display(); 
		g7.display(); 
		g8.display(); 
		g9.display(); 
		g10.display();
    }
}