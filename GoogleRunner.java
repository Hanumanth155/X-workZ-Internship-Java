class GoogleRunner {
    public static void main(String[] args) {
        Google g1 = new Google("Google Search", "Sundar Pichai", 1998, "Mountain View", "Alphabet", 182000, 305.6, "Search Engine", "Chrome", "Android", "GCP", "Gemini", "Gmail", "Google Maps", "YouTube", 2.1, true, "GOOGL", "Page & Brin", "Do the right thing");
        
		Google g2 = new Google("Google Cloud", "Thomas Kurian", 2008, "Sunnyvale", "Alphabet", 40000, 33.0, "Cloud Computing", "N/A", "N/A", "Google Cloud", "Vertex AI", "Workspace", "Maps API", "N/A", 0.0, true, "GOOG", "Google", "Accelerate transformation");
       
	   Google g3 = new Google("YouTube", "Neal Mohan", 2005, "San Bruno", "Google", 10000, 31.5, "Video Sharing", "N/A", "N/A", "N/A", "N/A", "N/A", "N/A", "YouTube Shorts", 0.0, false, "N/A", "Hurley, Chen, Karim", "Broadcast Yourself");
       
	   Google g4 = new Google("Android", "Hiroshi Lockheimer", 2003, "Palo Alto", "Google", 5000, 0.0, "Mobile OS", "Chrome Mobile", "Android OS", "N/A", "Nano", "N/A", "N/A", "N/A", 0.0, false, "N/A", "Rubin, Miner", "Be together, not the same");
       
	   Google g5 = new Google("Waymo", "Tekedra Mawakana", 2009, "Mountain View", "Alphabet", 2500, 0.0, "Autonomous Driving", "N/A", "N/A", "N/A", "Waymo Driver", "N/A", "Waymo Maps", "N/A", 0.0, false, "N/A", "Thrun, Urmson", "Make it safe and easy");
        
		Google g6 = new Google("DeepMind", "Demis Hassabis", 2010, "London", "Alphabet", 1200, 0.0, "Artificial Intelligence", "N/A", "N/A", "N/A", "AlphaGo", "N/A", "N/A", "N/A", 0.0, false, "N/A", "Hassabis, Legg, Suleyman", "Solve intelligence");
       
	   Google g7 = new Google("Google Workspace", "Javier Soltero", 2006, "Mountain View", "Google", 8000, 20.0, "Productivity Apps", "N/A", "N/A", "Google Drive", "Duet AI", "Gmail", "N/A", "Google Meet", 0.0, false, "N/A", "Google", "Create, collaborate, communicate");
       
	   Google g8 = new Google("Google Hardware", "Rick Osterloh", 2016, "Mountain View", "Google", 6000, 10.0, "Pixel Phones", "N/A", "Android", "N/A", "Google Assistant", "N/A", "N/A", "N/A", 0.0, false, "N/A", "Google", "Helpful hardware");
        
		Google g9 = new Google("Google Maps", "Christopher Phillips", 2005, "Mountain View", "Google", 7000, 0.0, "Navigation", "N/A", "N/A", "N/A", "Immersive View", "N/A", "Google Earth", "N/A", 0.0, false, "N/A", "Rasmussen brothers", "Navigate your world");
        
		Google g10 = new Google("Google Ads", "Jerry Dischler", 2000, "Mountain View", "Google", 25000, 237.8, "Advertising", "N/A", "N/A", "N/A", "Performance Max", "N/A", "N/A", "N/A", 0.0, false, "N/A", "Google", "Grow your business");

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