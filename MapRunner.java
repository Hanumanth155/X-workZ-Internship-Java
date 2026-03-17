class MapRunner {
    public static void main(String[] args) {
        
		Map m1 = new Map("World Political", false, 30000000, 'W', 15.99, 510100000.0f, (short)2023, (byte)1, 0L, "National Geographic", "English", false, 365, 'M', 500.0, 0.0f, 1001L, -90.0, 180.0, "Political Boundaries");
        
        Map m2 = new Map("Google Maps", true, 1000, 'G', 0.0, 510100000.0f, (short)2024, (byte)21, 5000000000L, "Google", "Multilingual", true, 1, 'W', 5.0, 150.5f, 1002L, -85.0, 180.0, "Navigation");
        
        Map m3 = new Map("European Rail", false, 5000000, 'E', 12.50, 10180000.0f, (short)2022, (byte)1, 0L, "Eurail", "English", false, 730, 'C', 100.0, 0.0f, 1003L, 35.0, 40.0, "Transit");
        
        Map m4 = new Map("Himalayan Trek", false, 50000, 'A', 25.00, 5000.0f, (short)2021, (byte)1, 0L, "Trailblazer", "English", true, 1095, 'T', 10.0, 0.0f, 1004L, 27.5, 88.0, "Topographic");
        
        Map m5 = new Map("New York Subway", true, 50000, 'N', 0.0, 1213.0f, (short)2024, (byte)5, 10000000L, "MTA", "English", false, 30, 'M', 15.0, 2.5f, 1005L, 40.4, -73.7, "Transit");
        
        Map m6 = new Map("Ocean Floor", true, 20000000, 'O', 5.00, 361000000.0f, (short)2020, (byte)10, 500000L, "NOAA", "English", true, 180, 'R', 250.0, 500.0f, 1006L, -90.0, 180.0, "Bathymetric");
        
        Map m7 = new Map("Mars Surface", true, 5000000, 'M', 0.0, 144798500.0f, (short)2023, (byte)15, 2000000L, "NASA", "English", true, 30, 'P', 20.0, 1024.0f, 1007L, -90.0, 180.0, "Astrogeology");
        
        Map m8 = new Map("London A-Z", false, 10000, 'L', 9.99, 1572.0f, (short)2023, (byte)1, 0L, "Geographers' A-Z", "English", false, 365, 'M', 5.0, 0.0f, 1008L, 51.2, 0.3, "Street Directory");
        
        Map m9 = new Map("OpenStreetMap", true, 1000, 'G', 0.0, 510100000.0f, (short)2024, (byte)19, 100000000L, "OSM Foundation", "Multilingual", false, 1, 'W', 10.0, 85000.0f, 1009L, -85.0, 180.0, "Open Source");
        
        Map m10 = new Map("Yellowstone Park", true, 100000, 'N', 4.99, 8983.0f, (short)2024, (byte)8, 300000L, "NPS", "English", true, 90, 'T', 15.0, 45.5f, 1010L, 44.0, -111.0, "Tourism");

        m1.display();
        m2.display();
        m3.display();
        m4.display();
        m5.display();
        m6.display();
        m7.display();
        m8.display();
        m9.display();
        m10.display();
    }
}