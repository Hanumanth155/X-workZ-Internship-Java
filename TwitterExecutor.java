class TwitterExecutor {

    public static void main(String[] args) {

        String password = "Tw@123";
        String email = "hanumanth@twitter.com";
        long mobileNumber = 9123456780L;

        Twitter.createAccount(email, password);
        Twitter.createAccount(mobileNumber, password);
    }
}