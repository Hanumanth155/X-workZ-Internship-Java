class OrderSystem {

    static void sendToKitchen() {
        System.out.println("Sending order to kitchen started");
        Kitchen.receiveOrder();
        System.out.println("Sending order to kitchen ended");
    }
}