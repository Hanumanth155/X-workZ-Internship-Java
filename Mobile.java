class Mobile {

    static void register(String patientName, String symptom, String email, long mobile) {

        System.out.println("Mobile App: Registration in progress...");
        
		
        System.out.println("Mobile App: Registration successful.\n");


        Reception.book(patientName, symptom, email, mobile);

    }
}