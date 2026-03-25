class TravelAgencyRunner {

    public static void main(String[] args) {

        String name = "Goa";
        TravelAgency obj = new TravelAgency();
        boolean isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Manali";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Ooty";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Coorg";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Mysore";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Hampi";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Jaipur";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Udaipur";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Delhi";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Mumbai";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Kolkata";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Chennai";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Hyderabad";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Bangalore";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Kerala";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Andaman";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        name = "Ladakh";
        isAdded = obj.addPlace(name);
        System.out.println("Place " + name + " added " + isAdded);

        obj.getPlaces();
    }
}