class ElevatorExecutor {

    public static void main(String[] args) {

        Elevator.createElevator("Otis", 1000, 20, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator(null, 1000, 20, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator("Otis", 0, 20, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator("Otis", 1000, 0, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator("Otis", 1000, 20, null, "Electric", 2.5, true);
        Elevator.createElevator("Otis", 1000, 20, "Passenger", null, 2.5, true);
        Elevator.createElevator("Otis", 1000, 20, "Passenger", "Electric", 0, true);
        Elevator.createElevator("Otis", 1000, 20, "Passenger", "Electric", 2.5, false);

        Elevator.createElevator("", 1000, 20, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator("Kone", -500, 15, "Passenger", "Electric", 1.8, true);
        Elevator.createElevator("Kone", 800, -10, "Passenger", "Electric", 1.8, true);
        Elevator.createElevator("Kone", 800, 15, "", "Electric", 1.8, true);
        Elevator.createElevator("Kone", 800, 15, "Passenger", "", 1.8, true);
        Elevator.createElevator("Kone", 800, 15, "Passenger", "Electric", -1.8, true);
        Elevator.createElevator("Kone", 800, 15, "Passenger", "Electric", 1.8, false);

        Elevator.createElevator("Schindler", 1200, 25, "Passenger", "Electric", 3.0, true);
        Elevator.createElevator("Schindler", 1500, 30, "Freight", "Hydraulic", 2.0, true);
        Elevator.createElevator("ThyssenKrupp", 1800, 40, "Freight", "Electric", 4.0, true);
        Elevator.createElevator("Mitsubishi", 1000, 50, "Passenger", "Electric", 5.0, true);
        Elevator.createElevator("Hitachi", 900, 35, "Passenger", "Electric", 3.5, true);

        Elevator.createElevator("Otis", 1000, 20, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator("Kone", 1100, 22, "Passenger", "Electric", 2.6, true);
        Elevator.createElevator("Schindler", 1300, 28, "Passenger", "Electric", 2.8, true);
        Elevator.createElevator("Mitsubishi", 1400, 32, "Passenger", "Electric", 3.2, true);
        Elevator.createElevator("Hitachi", 1500, 36, "Passenger", "Electric", 3.6, true);

        Elevator.createElevator("Otis", 1000, 20, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator("Otis", 1000, 20, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator("Otis", 1000, 20, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator("Otis", 1000, 20, "Passenger", "Electric", 2.5, true);
        Elevator.createElevator("Otis", 1000, 20, "Passenger", "Electric", 2.5, true);

        Elevator.createElevator(null,0, 0, null, null, 0, false);
        Elevator.createElevator("", 0, 0, "", "", 0, false);
        Elevator.createElevator("Generic", 500, 10, "Service", "Hydraulic", 1.2, true);
        Elevator.createElevator("Express", 2000, 60, "Passenger", "Electric", 6.0, true);
        Elevator.createElevator("CargoLift", 3000, 80, "Freight", "Hydraulic", 1.0, true);
    }
}