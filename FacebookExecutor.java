class FacebookExecutor {

    public static void main(String[] args) {

        String password = "Fb@123";
        String email = "hanumanth@facebook.com";
        long mobileNumber = 9876543210L;

        Facebook.createAccount(email, password);
        Facebook.createAccount(mobileNumber, password);
    }
}