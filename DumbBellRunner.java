class DumbBellRunner {
    public static void main(String[] args) {
        
		DumbBell d1 = new DumbBell("Bowflex", 52, true, 399.00, "Steel/Plastic", 34.5f, "Black/Red", true, (short)24, 40.0, "Round", 500, 4.8f, 1001L, false, "Textured Rubber", 52, (byte)15, "BOW52", "Full Body");
        
		DumbBell d2 = new DumbBell("Rogue", 50, false, 120.00, "Cast Iron", 32.0f, "Black", false, (short)120, 35.0, "Hex", 200, 4.9f, 1002L, true, "Chrome", 50, (byte)0, "ROG50", "Chest/Arms");
        
		DumbBell d3 = new DumbBell("AmazonBasics", 20, false, 25.99, "Neoprene", 28.0f, "Blue", true, (short)12, 25.0, "Hex", 1500, 4.5f, 1003L, true, "Neoprene", 20, (byte)0, "AMZ20", "Shoulders");
        
		DumbBell d4 = new DumbBell("PowerBlock", 50, true, 350.00, "Urethane", 35.0f, "Black", true, (short)60, 30.0, "Square", 300, 4.7f, 1004L, false, "Rubber", 50, (byte)10, "PB50", "Full Body");
        
		DumbBell d5 = new DumbBell("CAP Barbell", 15, false, 18.50, "Cast Iron", 30.0f, "Grey", false, (short)12, 22.0, "Hex", 800, 4.4f, 1005L, true, "Cast Iron", 15, (byte)0, "CAP15", "Arms");
        
		DumbBell d6 = new DumbBell("NordicTrack", 55, true, 429.00, "Steel", 34.0f, "Black", true, (short)12, 42.0, "Round", 150, 4.6f, 1006L, false, "Steel", 55, (byte)12, "NT55", "Full Body");
        
		DumbBell d7 = new DumbBell("Yes4All", 40, true, 65.00, "Cast Iron", 30.0f, "Black", false, (short)12, 38.0, "Round", 600, 4.3f, 1007L, false, "Chrome", 40, (byte)8, "Y4A40", "Chest/Back");
        
		DumbBell d8 = new DumbBell("Eleiko", 30, false, 150.00, "Urethane", 33.0f, "Black", true, (short)36, 28.0, "Round", 100, 5.0f, 1008L, false, "Knurled Steel", 30, (byte)0, "ELK30", "Chest");
        
		DumbBell d9 = new DumbBell("Titan Fitness", 60, false, 95.00, "Cast Iron", 35.0f, "Black", true, (short)12, 40.0, "Hex", 250, 4.5f, 1009L, true, "Chrome", 60, (byte)0, "TIT60", "Back/Legs");
        
		DumbBell d10 = new DumbBell("Rep Fitness", 10, false, 20.00, "Rubber Coated", 25.0f, "Red", true, (short)24, 20.0, "Hex", 1000, 4.8f, 1010L, true, "Chrome", 10, (byte)0, "REP10", "Shoulders");

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
