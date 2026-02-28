class TableManager {

    static void seatGuest() {
        System.out.println("Seating guest started");
        Waiter.takeOrder();
        System.out.println("Seating guest ended");
    }
}