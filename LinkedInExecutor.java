class LinkedInExecutor {

    public static void main(String[] args) {

        String password = "Li@123";
        String email = "hanumanth@linkedin.com";
        long mobileNumber = 9456789012L;

        LinkedIn.createAccount(email, password);
        LinkedIn.createAccount(mobileNumber, password);
    }
}