class ShampooRunner {
    public static void main(String[] args) {
        
		Shampoo s1 = new Shampoo("Head & Shoulders", false, 400, 6.99, 6.5f, 1234567890L, (short)24, (byte)4, 'A', "Classic Clean", "Pyrithione Zinc", false, 450.0, 15.0f, 5000000, 998877L, (short)7, (byte)8, 'M', "Adults");
        
		Shampoo s2 = new Shampoo("Shea Moisture", true, 384, 11.50, 5.5f, 1234567891L, (short)12, (byte)5, 'C', "Coconut & Hibiscus", "Coconut Oil", true, 420.0, 20.0f, 1500000, 998878L, (short)14, (byte)5, 'M', "Women");
        
		Shampoo s3 = new Shampoo("Olaplex No. 4", true, 250, 30.00, 6.0f, 1234567892L, (short)36, (byte)5, 'D', "Citrus", "Bis-Aminopropyl Diglycol", true, 280.0, 25.0f, 800000, 998879L, (short)30, (byte)6, 'S', "Professionals");
        
		Shampoo s4 = new Shampoo("Pantene Pro-V", false, 500, 5.99, 6.0f, 1234567893L, (short)24, (byte)4, 'S', "Floral", "Pro-Vitamin B5", false, 550.0, 12.0f, 10000000, 998880L, (short)5, (byte)9, 'L', "Adults");
        
		Shampoo s5 = new Shampoo("Herbal Essences", true, 400, 7.50, 5.8f, 1234567894L, (short)24, (byte)4, 'O', "Argan Oil", "Aloe Vera", true, 440.0, 18.0f, 3000000, 998881L, (short)10, (byte)7, 'M', "Teens/Adults");
        
		Shampoo s6 = new Shampoo("Dove Nutritive", false, 355, 4.99, 6.2f, 1234567895L, (short)24, (byte)4, 'D', "Fresh", "Keratin Actives", false, 400.0, 14.0f, 8000000, 998882L, (short)7, (byte)8, 'M', "Women");
        
		Shampoo s7 = new Shampoo("Aveeno", true, 354, 8.99, 5.5f, 1234567896L, (short)18, (byte)5, 'S', "Oat Milk", "Colloidal Oatmeal", false, 390.0, 16.0f, 2000000, 998883L, (short)15, (byte)6, 'M', "Sensitive Scalp");
        
		Shampoo s8 = new Shampoo("Paul Mitchell", true, 1000, 25.00, 5.0f, 1234567897L, (short)36, (byte)5, 'A', "Tea Tree", "Tea Tree Oil", true, 1100.0, 22.0f, 500000, 998884L, (short)30, (byte)7, 'X', "Salon/Men");
        
		Shampoo s9 = new Shampoo("Suave Essentials", false, 887, 2.99, 7.0f, 1234567898L, (short)24, (byte)3, 'N', "Ocean Breeze", "Sea Algae Extract", false, 950.0, 8.0f, 12000000, 998885L, (short)3, (byte)10, 'L', "Family");
        
		Shampoo s10 = new Shampoo("Pura D'or", true, 473, 29.99, 5.2f, 1234567899L, (short)24, (byte)4, 'T', "Herbal", "Biotin", true, 520.0, 28.0f, 600000, 998886L, (short)20, (byte)4, 'M', "Hair Thinning");

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