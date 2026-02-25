class Patient {

    static void sick() {

        System.out.println("Patient is not feeling well");

        String patientName = "Manoj Kumar";
        String symptom = "Dengue";
        String email = "manoj@gmail.com";
        long mobile = 9123456780L;

        Mobile.register(patientName, symptom, email, mobile);


    }
}