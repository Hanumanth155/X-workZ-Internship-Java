class Hospital {

    static void bookAppointment(String patientName, String symptom) {

        System.out.println("Hospital: Appointment confirmed for " + patientName);

        int bp = 118;
        boolean sugar = false;

        Nurse.basicCheck(patientName, symptom, bp, sugar);
    }
}