class WallPaperRunner {
    public static void main(String[] args) {
       
	   WallPaper w1 = new WallPaper("Graham & Brown", "Vinyl", "Navy Blue", "Damask", 10.0, 0.52, 45.0, false, true, true, false, "Embossed", 250, "Living Room", 5, "Paste the Wall", "Matte", "UK", "Majestic", 100);
       
	   WallPaper w2 = new WallPaper("RoomMates", "Vinyl", "Green", "Leaves", 5.0, 0.45, 30.0, true, true, false, true, "Smooth", 150, "Bathroom", 1, "Self-Adhesive", "Glossy", "USA", "Tropical", 500);
        
		WallPaper w3 = new WallPaper("York Wallcoverings", "Paper", "Beige", "Stripes", 8.2, 0.68, 60.0, false, false, true, true, "Textured", 180, "Bedroom", 3, "Paste the Paper", "Satin", "USA", "Classic Lines", 200);
       
	   WallPaper w4 = new WallPaper("Brewster", "Non-Woven", "Grey", "Brick Faux", 10.05, 0.53, 25.0, false, true, true, true, "3D Textured", 220, "Kitchen", 2, "Paste the Wall", "Matte", "Germany", "Urban Loft", 350);
       
	   WallPaper w5 = new WallPaper("Versace Home", "Heavy Vinyl", "Gold", "Baroque", 10.0, 0.70, 150.0, false, true, true, false, "Deep Embossed", 300, "Dining Room", 10, "Paste the Wall", "Metallic", "Italy", "Palazzo", 50);
       
	   WallPaper w6 = new WallPaper("Spoonflower", "Woven Fabric", "Multicolor", "Floral", 3.0, 0.60, 40.0, true, false, false, true, "Fabric", 190, "Nursery", 1, "Self-Adhesive", "Matte", "USA", "Spring Bloom", 150);
       
	   WallPaper w7 = new WallPaper("Tempaper", "Vinyl", "Black/White", "Geometric", 6.0, 0.52, 35.0, true, true, false, false, "Smooth", 160, "Office", 2, "Self-Adhesive", "Satin", "USA", "Modernist", 400);
       
	   WallPaper w8 = new WallPaper("Cole & Son", "Paper", "Teal", "Woods", 10.0, 0.53, 120.0, false, false, true, true, "Smooth", 170, "Hallway", 5, "Paste the Paper", "Matte", "UK", "Contemporary Restyled", 80);
       
	   WallPaper w9 = new WallPaper("NuWallpaper", "Vinyl", "White", "Shiplap", 5.5, 0.52, 28.0, true, true, false, false, "Faux Wood", 155, "Living Room", 1, "Self-Adhesive", "Matte", "USA", "Farmhouse", 600);
       
	   WallPaper w10 = new WallPaper("Farrow & Ball", "Paper", "Blush Pink", "Bumble Bee", 10.0, 0.53, 135.0, false, false, true, true, "Handcrafted", 200, "Bedroom", 5, "Paste the Paper", "Matte", "UK", "Archive", 40);

        w1.display(); 
		w2.display(); 
		w3.display(); 
		w4.display();
		w5.display();
        w6.display(); 
		w7.display(); 
		w8.display(); 
		w9.display(); 
		w10.display();
    }
}