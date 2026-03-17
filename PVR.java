class PVR {
    String location;
    boolean hasIMAX;
    int screenCount;
    double ticketPrice;
    float rating;
    long dailyVisitors;
    short seatingCapacity;
    byte premiumLounges;
    char cinemaGrade;
    String managerName;
    int parkingCapacity;
    boolean servesAlcohol;
    String openingTime;
    String closingTime;
    boolean hasRecliners;
    double foodRevenue;
    int totalEmployees;
    short yearOpened;
    boolean has3D;
    String contactNumber;

    public PVR(String location, boolean hasIMAX, int screenCount, double ticketPrice, float rating, long dailyVisitors, short seatingCapacity, byte premiumLounges, char cinemaGrade, String managerName, int parkingCapacity, boolean servesAlcohol, String openingTime, String closingTime, boolean hasRecliners, double foodRevenue, int totalEmployees, short yearOpened, boolean has3D, String contactNumber) {
        this.location = location;
        this.hasIMAX = hasIMAX;
        this.screenCount = screenCount;
        this.ticketPrice = ticketPrice;
        this.rating = rating;
        this.dailyVisitors = dailyVisitors;
        this.seatingCapacity = seatingCapacity;
        this.premiumLounges = premiumLounges;
        this.cinemaGrade = cinemaGrade;
        this.managerName = managerName;
        this.parkingCapacity = parkingCapacity;
        this.servesAlcohol = servesAlcohol;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.hasRecliners = hasRecliners;
        this.foodRevenue = foodRevenue;
        this.totalEmployees = totalEmployees;
        this.yearOpened = yearOpened;
        this.has3D = has3D;
        this.contactNumber = contactNumber;
    }

    public void display() {
        System.out.println("Location: " + this.location);
        System.out.println("Has IMAX: " + this.hasIMAX);
        System.out.println("Screen Count: " + this.screenCount);
        System.out.println("Ticket Price: Rs " + this.ticketPrice);
        System.out.println("Rating: " + this.rating);
        System.out.println("Daily Visitors: " + this.dailyVisitors);
        System.out.println("Seating Capacity: " + this.seatingCapacity);
        System.out.println("Premium Lounges: " + this.premiumLounges);
        System.out.println("Cinema Grade: " + this.cinemaGrade);
        System.out.println("Manager Name: " + this.managerName);
        System.out.println("Parking Capacity: " + this.parkingCapacity);
        System.out.println("Serves Alcohol: " + this.servesAlcohol);
        System.out.println("Opening Time: " + this.openingTime);
        System.out.println("Closing Time: " + this.closingTime);
        System.out.println("Has Recliners: " + this.hasRecliners);
        System.out.println("Food Revenue: Rs " + this.foodRevenue);
        System.out.println("Total Employees: " + this.totalEmployees);
        System.out.println("Year Opened: " + this.yearOpened);
        System.out.println("Has 3D: " + this.has3D);
        System.out.println("Contact Number: " + this.contactNumber);
        System.out.println();
    }
}
