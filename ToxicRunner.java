class ToxicRunner {
    public static void main(String[] args) {
        Toxic t1 = new Toxic("Toxic: A Fairy Tale for Grown-ups", true, 2025, 'A', 150.5, 8.5f, (short)4000, (byte)1, 15000000L, "Geetu Mohandas", "Yash", false, 165, 'A', 75.0, 92.5f, (short)0, (byte)0, 500000L, "Kannada");
        
        Toxic t2 = new Toxic("Toxic Venger", false, 1984, 'R', 0.8, 6.2f, (short)150, (byte)2, 200000L, "Michael Herz", "Mitch Cohen", true, 82, 'H', 0.5, 70.0f, (short)3, (byte)1, 1200000L, "English");
        
        Toxic t3 = new Toxic("Toxicity", true, 2021, 'P', 45.0, 7.1f, (short)2500, (byte)1, 4000000L, "John Doe", "Jane Smith", false, 110, 'T', 20.0, 80.5f, (short)0, (byte)3, 8500000L, "English");
        
        Toxic t4 = new Toxic("Toxic City", false, 2018, 'U', 12.5, 5.8f, (short)800, (byte)1, 1000000L, "Alan Smithee", "Bob Actor", false, 95, 'D', 15.0, 55.0f, (short)0, (byte)0, 300000L, "Spanish");
        
        Toxic t5 = new Toxic("Toxic Waste", false, 2010, 'R', 5.2, 4.5f, (short)300, (byte)1, 500000L, "Horror Guy", "Scream Queen", true, 88, 'H', 2.0, 45.0f, (short)1, (byte)0, 150000L, "English");
        
        Toxic t6 = new Toxic("Toxic Love", true, 2023, 'U', 85.0, 7.8f, (short)3000, (byte)1, 8000000L, "Romance Dir", "Romance Lead", false, 120, 'R', 30.0, 88.0f, (short)0, (byte)2, 12000000L, "French");
        
        Toxic t7 = new Toxic("Toxic Shock", false, 1999, 'A', 18.0, 6.9f, (short)1200, (byte)1, 2500000L, "Thriller Master", "Action Star", false, 105, 'T', 10.0, 75.5f, (short)0, (byte)1, 900000L, "English");
        
        Toxic t8 = new Toxic("Toxic Spill", true, 2015, 'P', 210.0, 8.1f, (short)4500, (byte)2, 20000000L, "Disaster Dir", "Hero Guy", true, 140, 'A', 100.0, 85.0f, (short)1, (byte)4, 45000000L, "English");
        
        Toxic t9 = new Toxic("Toxic Skies", false, 2008, 'U', 2.5, 5.1f, (short)100, (byte)1, 300000L, "Indie Maker", "Unknown Actor", false, 90, 'S', 1.5, 50.0f, (short)0, (byte)0, 200000L, "German");
        
        Toxic t10 = new Toxic("Toxic Legacy", true, 2026, 'A', 350.0, 8.8f, (short)5000, (byte)1, 30000000L, "Epic Director", "Mega Star", false, 155, 'D', 120.0, 94.0f, (short)0, (byte)5, 0L, "Hindi");

        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
        t6.display();
        t7.display();
        t8.display();
        t9.display();
        t10.display();
    }
}