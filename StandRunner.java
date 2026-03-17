class StandRunner {
    public static void main(String[] args) {
        
		Stand s1 = new Stand("Lamicall", true, 5, 'S', 25.99, 15.0f, (short)12, (byte)3, 9876543210L, "Aluminum", "Silver", true, 10.5, 0.4f, 500, (short)15, (byte)5, 112233L, "Laptop", 'A');
        
		Stand s2 = new Stand("On-Stage", true, 40, 'M', 39.50, 120.0f, (short)24, (byte)5, 8765432109L, "Steel", "Black", true, 45.0, 3.5f, 200, (short)0, (byte)4, 223344L, "Keyboard", 'B');
        
		Stand s3 = new Stand("VIVO", false, 20, 'L', 45.00, 80.0f, (short)36, (byte)0, 7654321098L, "Steel/Glass", "Black", false, 55.0, 15.0f, 150, (short)32, (byte)4, 334455L, "Monitor", 'A');
        
		Stand s4 = new Stand("Hercules", true, 15, 'M', 65.00, 110.0f, (short)12, (byte)4, 6543210987L, "Steel", "Yellow/Black", true, 30.0, 2.8f, 300, (short)0, (byte)5, 445566L, "Guitar", 'A');
        
		Stand s5 = new Stand("UGREEN", true, 3, 'S', 15.99, 12.0f, (short)6, (byte)6, 5432109876L, "Plastic", "White", true, 8.0, 0.2f, 1000, (short)11, (byte)4, 556677L, "Tablet", 'C');
        
		Stand s6 = new Stand("AmazonBasics", false, 10, 'M', 19.99, 15.0f, (short)12, (byte)0, 4321098765L, "Metal Mesh", "Black", true, 35.0, 1.2f, 800, (short)17, (byte)4, 667788L, "Laptop", 'B');
        
		Stand s7 = new Stand("Gator", true, 50, 'L', 120.00, 180.0f, (short)36, (byte)10, 3210987654L, "Aluminum", "Black", true, 100.0, 5.0f, 50, (short)0, (byte)5, 778899L, "Speaker", 'A');
        
		Stand s8 = new Stand("Roost", true, 8, 'S', 89.95, 20.0f, (short)12, (byte)3, 2109876543L, "Carbon Fiber", "Black", true, 5.0, 0.15f, 120, (short)16, (byte)5, 889900L, "Laptop", 'A');
        
		Stand s9 = new Stand("K&M", true, 5, 'M', 55.00, 160.0f, (short)60, (byte)2, 1098765432L, "Steel", "Chrome", true, 60.0, 2.5f, 400, (short)0, (byte)5, 990011L, "Microphone", 'A');
        
		Stand s10 = new Stand("WALI", false, 10, 'M', 22.99, 40.0f, (short)12, (byte)0, 1987654320L, "Glass/Metal", "Clear", true, 40.0, 2.0f, 600, (short)27, (byte)4, 101112L, "Monitor", 'B');

        s1.display(); 
		s2.display(); 
		s3.display(); 
		s4.display(); 
		s5.display();
        s6.display(); 
		s7.display(); 
		s8.display(); 
		s9.display(); 
		s10.display();
    }
}