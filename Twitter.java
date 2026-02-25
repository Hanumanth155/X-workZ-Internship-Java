class Twitter {

    public static void createAccount(String email, String password) {
        System.out.println("Twitter Account created using Email: " + email);
        System.out.println("Password: " + password);
    }

    public static void createAccount(long mobileNumber, String password) {
        System.out.println("Twitter Account created using Mobile Number: " + mobileNumber);
        System.out.println("Password: " + password);
    }
}