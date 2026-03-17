class EducationRunner {
    public static void main(String[] args) {
       
	   Education ed1 = new Education("Harvard", "University", 21000, false, 55000.0, 97.5f, 50000000000L, 'A', "MA, USA", (short)2400, (byte)1, 1636, true, 'L', 3.9, 20000000L, true, "English", 1200.0f, (byte)11);
        
		Education ed2 = new Education("Oxford", "University", 24000, true, 38000.0, 96.0f, 8000000000L, 'A', "Oxford, UK", (short)1800, (byte)2, 1096, true, 'L', 3.8, 13000000L, true, "English", 900.0f, (byte)39);
        
		Education ed3 = new Education("Central High", "Secondary", 2500, true, 0.0, 85.0f, 100000L, 'B', "Chicago, USA", (short)150, (byte)100, 1950, false, 'M', 3.0, 50000L, true, "English", 0.0f, (byte)1);
        
		Education ed4 = new Education("MIT", "University", 11000, false, 58000.0, 95.0f, 25000000000L, 'A', "MA, USA", (short)1000, (byte)3, 1861, true, 'M', 4.0, 5000000L, true, "English", 1800.0f, (byte)5);
        
		Education ed5 = new Education("Delhi University", "University", 132000, true, 500.0, 78.0f, 50000000L, 'B', "Delhi, India", (short)5000, (byte)50, 1922, true, 'X', 3.2, 2000000L, true, "Hindi/English", 100.0f, (byte)77);
        
		Education ed6 = new Education("Polytechnic", "Technical", 5000, true, 12000.0, 80.0f, 5000000L, 'C', "Milan, Italy", (short)400, (byte)80, 1863, true, 'M', 3.4, 300000L, true, "Italian", 50.0f, (byte)1);
        
		Education ed7 = new Education("Sorbonne", "University", 55000, true, 300.0, 75.0f, 200000000L, 'A', "Paris, France", (short)2000, (byte)20, 1150, false, 'L', 3.5, 4000000L, true, "French", 150.0f, (byte)13);
        
		Education ed8 = new Education("Tokyo Uni", "University", 28000, true, 5000.0, 92.0f, 1000000000L, 'A', "Tokyo, Japan", (short)2500, (byte)15, 1877, true, 'L', 3.7, 8000000L, true, "Japanese", 400.0f, (byte)10);
        
		Education ed9 = new Education("Eton College", "Prep", 1300, false, 45000.0, 99.0f, 500000000L, 'A', "Windsor, UK", (short)160, (byte)1, 1440, false, 'S', 3.9, 100000L, false, "English", 5.0f, (byte)1);
        
		Education ed10 = new Education("Stanford", "University", 17000, false, 56000.0, 96.5f, 37000000000L, 'A', "CA, USA", (short)2200, (byte)4, 1885, true, 'L', 3.9, 9000000L, true, "English", 1600.0f, (byte)7);

        ed1.display(); ed2.display(); ed3.display(); ed4.display(); ed5.display();
        ed6.display(); ed7.display(); ed8.display(); ed9.display(); ed10.display();
    }
}