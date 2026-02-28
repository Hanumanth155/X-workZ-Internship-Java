class Kitchen {

    static void receiveOrder() {
        System.out.println("Receiving order started");
        HeadChef.cook();
        System.out.println("Receiving order ended");
    }
}