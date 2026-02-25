class Doctor {

    static void treat(String patientName, String symptom) {

        System.out.println("Doctor Consultation Started.");
        System.out.println("Patient patientName: " + patientName);
        System.out.println("Symptoms Observed: " + symptom);

        System.out.println("Prescription given for: " + symptom);
        System.out.println("Advised follow-up after 3 days if symptoms continue.");

        System.out.println("Doctor Consultation Ended.");
    }
}