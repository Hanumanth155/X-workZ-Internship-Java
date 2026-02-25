class Nurse {

    static void basicCheck(String patientName, String symptom, int bp, boolean sugar) {

        System.out.println("Nurse started primary checkup...");

        if (bp > 120) {
            System.out.println("BP is High: " + bp);
        } else if (bp < 80) {
            System.out.println("BP is Low: " + bp);
        } else {
            System.out.println("BP is Normal: " + bp);
        }

        if (sugar) {
            System.out.println("Sugar level is High.");
        } else {
            System.out.println("Sugar level is Normal.");
        }

        Doctor.treat(patientName, symptom);

        System.out.println("Nurse checkup completed.\n");
    }
}