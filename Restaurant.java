class Restaurant {

    static void startService() {
        System.out.println("Restaurant service started");
        TableManager.seatGuest();
        System.out.println("Restaurant service ended");
    }
}