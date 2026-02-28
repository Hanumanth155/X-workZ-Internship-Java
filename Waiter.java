class Waiter {

    static void takeOrder() {
        System.out.println("Order taking started");
        OrderSystem.sendToKitchen();
        System.out.println("Order taking ended");
    }
}