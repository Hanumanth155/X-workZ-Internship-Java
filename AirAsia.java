class AirAsia {

    private String passengers[] = new String[30];
    int index;

    public boolean addPassenger(String passengerName) {
        boolean isPassengerAdded = false;

        if (passengerName != null && !passengerName.isEmpty()) {
            passengers[index] = passengerName;
            index++;
            isPassengerAdded = true;
        } else {
            System.out.println("Enter valid Passenger Name");
        }

        return isPassengerAdded;
    }

    public void getPassengers() {
        for (String passengerName : passengers)
            System.out.println(passengerName);
    }
}