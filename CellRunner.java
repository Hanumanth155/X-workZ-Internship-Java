class CellRunner {
    public static void main(String[] args) {
        
		Cell c1 = new Cell("Neuron", true, 30000, 100.0, 0.0f, 1000000L, (short)2000, (byte)23, 'S', "Signal Transmission", true, 5000, 10.5, 75.0f, 101L, (short)5000, (byte)2, 'L', true, "1837");
        
		Cell c2 = new Cell("Red Blood Cell", false, 120, 7.5, 0.0f, 500000L, (short)0, (byte)0, 'D', "Oxygen Transport", true, 100, 2.0, 65.0f, 102L, (short)0, (byte)1, 'S', false, "1658");
        
		Cell c3 = new Cell("Skin Cell", true, 21, 30.0, 24.0f, 200000L, (short)300, (byte)23, 'F', "Protection", true, 800, 5.0, 70.0f, 103L, (short)1000, (byte)2, 'M', true, "1665");
        
		Cell c4 = new Cell("Muscle Cell", true, 5000, 50.0, 0.0f, 800000L, (short)5000, (byte)23, 'C', "Movement", true, 10000, 15.0, 78.0f, 104L, (short)8000, (byte)2, 'L', true, "1840");
        
		Cell c5 = new Cell("Sperm Cell", true, 5, 5.0, 0.0f, 50000L, (short)50, (byte)23, 'T', "Reproduction", true, 2000, 1.0, 60.0f, 105L, (short)100, (byte)1, 'X', false, "1677");
        
		Cell c6 = new Cell("Stem Cell", true, 365, 20.0, 12.0f, 150000L, (short)400, (byte)23, 'R', "Differentiation", true, 1200, 8.0, 72.0f, 106L, (short)2000, (byte)2, 'M', true, "1963");
        
		Cell c7 = new Cell("Bacteria", false, 2, 2.0, 0.5f, 10000L, (short)0, (byte)1, 'B', "Survival", false, 50, 0.5, 80.0f, 107L, (short)50, (byte)3, 'X', true, "1676");
        
		Cell c8 = new Cell("Adipose Cell", true, 3650, 100.0, 0.0f, 400000L, (short)200, (byte)23, 'G', "Fat Storage", true, 400, 3.0, 15.0f, 108L, (short)500, (byte)2, 'L', true, "1850");
        
		Cell c9 = new Cell("Osteoblast", true, 90, 40.0, 48.0f, 250000L, (short)600, (byte)23, 'I', "Bone Formation", true, 1500, 12.0, 50.0f, 109L, (short)3000, (byte)2, 'M', true, "1853");
        
		Cell c10 = new Cell("Hepatocyte", true, 150, 35.0, 72.0f, 350000L, (short)1500, (byte)23, 'P', "Metabolism", true, 3000, 20.0, 75.0f, 110L, (short)5000, (byte)2, 'L', true, "1833");

        c1.display(); c2.display(); c3.display(); c4.display(); c5.display();
        c6.display(); c7.display(); c8.display(); c9.display(); c10.display();
    }
}