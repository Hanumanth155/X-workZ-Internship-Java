
class TrophyRunner {
    public static void main(String[] args) {
        
		Trophy t1 = new Trophy("FIFA World Cup", true, 2022, 6.175, 36.8f, 42000000L, (short)26, (byte)1, 'A', "Argentina", 500, true, "18-Carat Gold", "Football", 13.0, 3.5f, 10001L, (short)0, true, "Silvio Gazzaniga");
        
		Trophy t2 = new Trophy("Wimbledon Men's Singles", true, 2023, 3.5, 47.0f, 2975000L, (short)1, (byte)1, 'A', "Carlos Alcaraz", 250, true, "Silver Gilt", "Tennis", 19.0, 5.0f, 10002L, (short)0, true, "All England Club");
        
		Trophy t3 = new Trophy("Vince Lombardi Trophy", false, 2024, 3.2, 56.0f, 5000000L, (short)53, (byte)1, 'A', "Kansas City Chiefs", 400, false, "Sterling Silver", "American Football", 15.0, 0.0f, 10003L, (short)0, false, "Tiffany & Co.");
        
		Trophy t4 = new Trophy("Larry O'Brien Trophy", true, 2023, 6.5, 61.0f, 3500000L, (short)15, (byte)1, 'A', "Denver Nuggets", 300, true, "Brass", "Basketball", 25.0, 4.0f, 10004L, (short)0, false, "Tiffany & Co.");
        
		Trophy t5 = new Trophy("Stanley Cup", false, 2023, 15.5, 89.5f, 4000000L, (short)23, (byte)1, 'A', "Vegas Golden Knights", 1500, true, "Silver and Nickel", "Ice Hockey", 28.0, 10.0f, 10005L, (short)0, true, "Lord Stanley");
        
		Trophy t6 = new Trophy("ICC Cricket World Cup", true, 2023, 11.0, 60.0f, 4000000L, (short)15, (byte)1, 'A', "Australia", 600, true, "Gold and Silver", "Cricket", 20.0, 6.0f, 10006L, (short)0, true, "Garrard & Co");
        
		Trophy t7 = new Trophy("Olympic Gold Medal", true, 2020, 0.556, 8.5f, 50000L, (short)1, (byte)1, 'B', "Neeraj Chopra", 50, false, "Silver plated with Gold", "Athletics", 8.5, 0.0f, 10007L, (short)0, false, "Junichi Kawanishi");
        
		Trophy t8 = new Trophy("Champions League", false, 2023, 7.5, 73.5f, 21500000L, (short)25, (byte)1, 'A', "Manchester City", 450, false, "Sterling Silver", "Football", 25.0, 0.0f, 10008L, (short)0, true, "Jürg Stadelmann");
        
		Trophy t9 = new Trophy("Masters Tournament", false, 2024, 15.0, 8.5f, 3600000L, (short)1, (byte)1, 'A', "Scottie Scheffler", 0, true, "Sterling Silver", "Golf", 44.0, 15.0f, 10009L, (short)0, true, "Augusta National");
        
		Trophy t10 = new Trophy("Local Spelling Bee", false, 2023, 0.5, 20.0f, 500L, (short)1, (byte)1, 'C', "John Doe", 15, true, "Plastic", "Academic", 8.0, 2.0f, 10010L, (short)12, false, "Trophy Shop");

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