class Reception {

    static void book(String patientName, String symptom, String email, long mobile) {

        System.out.println("Reception Desk received patient details.");
        System.out.println("Email ID: " + email);
        System.out.println("Phone: " + mobile);

        Hospital.bookAppointment(patientName, symptom);
    }
}