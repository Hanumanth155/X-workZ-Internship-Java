class PVRRunner {
    public static void main(String[] args) {
        
		PVR p1 = new PVR("Forum Mall, Bengaluru", true, 11, 350.50, 4.6f, 15000L, (short)2200, (byte)3, 'A', "Rajesh Kumar", 500, false, "09:00 AM", "11:30 PM", true, 45000.0, 85, (short)2010, true, "1800-111-1111");
        
		PVR p2 = new PVR("Orion Mall, Bengaluru", false, 8, 250.00, 4.2f, 12000L, (short)1800, (byte)1, 'B', "Suresh Menon", 400, false, "10:00 AM", "11:00 PM", false, 30000.0, 60, (short)2012, true, "1800-111-2222");
        
		PVR p3 = new PVR("Phoenix Marketcity, Mumbai", true, 14, 450.00, 4.8f, 25000L, (short)3000, (byte)5, 'A', "Amit Singh", 800, true, "08:30 AM", "12:00 AM", true, 75000.0, 120, (short)2015, true, "1800-111-3333");
        
		PVR p4 = new PVR("Select Citywalk, Delhi", true, 9, 500.00, 4.7f, 18000L, (short)2000, (byte)4, 'A', "Vikram Verma", 600, true, "09:00 AM", "11:45 PM", true, 60000.0, 95, (short)2014, true, "1800-111-4444");
        
		PVR p5 = new PVR("Elante Mall, Chandigarh", false, 7, 280.00, 4.3f, 10000L, (short)1500, (byte)2, 'B', "Deepak Chopra", 350, false, "10:00 AM", "10:30 PM", false, 25000.0, 50, (short)2016, true, "1800-111-5555");
        
		PVR p6 = new PVR("Ambience Mall, Gurugram", true, 12, 400.00, 4.5f, 20000L, (short)2500, (byte)4, 'A', "Rahul Sharma", 700, true, "09:30 AM", "11:30 PM", true, 55000.0, 105, (short)2013, true, "1800-111-6666");
        
		PVR p7 = new PVR("Express Avenue, Chennai", true, 10, 320.00, 4.4f, 16000L, (short)2100, (byte)3, 'A', "Karthik Raja", 450, false, "09:00 AM", "11:00 PM", true, 40000.0, 80, (short)2011, true, "1800-111-7777");
        
		PVR p8 = new PVR("Inorbit Mall, Hyderabad", false, 6, 220.00, 4.1f, 8000L, (short)1200, (byte)1, 'B', "Anil Reddy", 250, false, "10:30 AM", "10:00 PM", false, 18000.0, 40, (short)2017, false, "1800-111-8888");
        
		PVR p9 = new PVR("Lulu Mall, Kochi", true, 11, 380.00, 4.6f, 19000L, (short)2400, (byte)4, 'A', "Mohammed Ali", 650, false, "09:00 AM", "11:30 PM", true, 52000.0, 100, (short)2018, true, "1800-111-9999");
        
		PVR p10 = new PVR("South City Mall, Kolkata", false, 8, 260.00, 4.2f, 14000L, (short)1900, (byte)2, 'B', "Arijit Das", 400, false, "10:00 AM", "11:00 PM", true, 32000.0, 70, (short)2015, true, "1800-111-0000");

        p1.display();
        p2.display();
        p3.display();
        p4.display();
        p5.display();
        p6.display();
        p7.display();
        p8.display();
        p9.display();
        p10.display();
    }
}