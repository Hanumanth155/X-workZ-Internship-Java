class WhatsAppExecutor {

    public static void main(String[] args) {

        String password = "Wa@123";
        String email = "hanumanth@whatsapp.com";
        long mobileNumber = 9234567890L;

        WhatsApp.createAccount(email, password);
        WhatsApp.createAccount(mobileNumber, password);
    }
}