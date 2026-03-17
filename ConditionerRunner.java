class ConditionerRunner {
    public static void main(String[] args) {
        Conditioner c1 = new Conditioner("Pantene", false, 350, 5.99, 7.5f, 1001L, (short)24, (byte)6, 'U', "Pro-Vitamin B5", 500, true, "Floral", 380.0, 5.5f, 123456789L, (short)7, (byte)1, 'M', false);
        Conditioner c2 = new Conditioner("Tresemme", false, 500, 7.50, 8.0f, 1002L, (short)24, (byte)7, 'U', "Keratin", 400, true, "Salon Fresh", 540.0, 5.0f, 223456789L, (short)10, (byte)1, 'L', false);
        Conditioner c3 = new Conditioner("Shea Moisture", true, 300, 12.99, 9.5f, 1003L, (short)12, (byte)9, 'F', "Raw Shea Butter", 200, true, "Nutty", 320.0, 4.5f, 323456789L, (short)14, (byte)2, 'S', true);
        Conditioner c4 = new Conditioner("Garnier Fructis", false, 400, 4.50, 6.5f, 1004L, (short)36, (byte)5, 'U', "Fruit Actives", 800, false, "Apple", 430.0, 5.2f, 423456789L, (short)5, (byte)1, 'M', false);
        Conditioner c5 = new Conditioner("Dove", false, 355, 6.25, 8.5f, 1005L, (short)24, (byte)6, 'U', "Moisturizing Serum", 600, true, "Soap Clean", 390.0, 5.5f, 523456789L, (short)7, (byte)1, 'M', false);
        Conditioner c6 = new Conditioner("Olaplex No.5", false, 250, 30.00, 10.0f, 1006L, (short)36, (byte)8, 'U', "Bond Builder", 150, true, "Mild Citrus", 270.0, 4.8f, 623456789L, (short)30, (byte)1, 'S', false);
        Conditioner c7 = new Conditioner("Aveeno", false, 354, 8.99, 7.0f, 1007L, (short)18, (byte)5, 'U', "Oat Milk", 300, true, "Oatmeal", 385.0, 5.4f, 723456789L, (short)15, (byte)1, 'M', true);
        Conditioner c8 = new Conditioner("L'Oreal Elvive", false, 375, 5.50, 7.8f, 1008L, (short)24, (byte)6, 'F', "Castor Oil", 450, true, "Sweet Amber", 410.0, 5.3f, 823456789L, (short)12, (byte)1, 'M', false);
        Conditioner c9 = new Conditioner("Redken", false, 300, 24.00, 9.0f, 1009L, (short)36, (byte)7, 'U', "Protein", 200, true, "Fresh", 330.0, 4.5f, 923456789L, (short)20, (byte)1, 'M', false);
        Conditioner c10 = new Conditioner("Pureology", false, 266, 35.00, 9.8f, 1010L, (short)24, (byte)8, 'F', "Jojoba", 100, true, "Peppermint", 295.0, 4.0f, 102345678L, (short)30, (byte)1, 'S', true);

        c1.display(); c2.display(); c3.display(); c4.display(); c5.display();
        c6.display(); c7.display(); c8.display(); c9.display(); c10.display();
    }
}
