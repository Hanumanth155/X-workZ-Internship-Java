class Elevator {

    static String companyName;
    static int loadLimit;
    static int totalStops;
    static String elevatorMode;
    static String energySource;
    static double travelSpeed;
    static boolean safetyAlarm;

    static boolean createElevator(
            String cName,
            int lLimit,
            int tStops,
            String eMode,
            String eSource,
            double tSpeed,
            boolean alarmStatus) {

        boolean isElevatorCreated = false;

        boolean isCompany = false;
        boolean isLoad = false;
        boolean isStops = false;
        boolean isMode = false;
        boolean isEnergy = false;
        boolean isSpeed = false;
        boolean isAlarm = false;

        if (cName != null && !cName.isEmpty()) {
            isCompany = true;
            companyName = cName;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (lLimit > 0) {
            isLoad = true;
            loadLimit = lLimit;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (tStops > 0) {
            isStops = true;
            totalStops = tStops;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (eMode != null && !eMode.isEmpty()) {
            isMode = true;
            elevatorMode = eMode;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (eSource != null && !eSource.isEmpty()) {
            isEnergy = true;
            energySource = eSource;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (tSpeed > 0) {
            isSpeed = true;
            travelSpeed = tSpeed;
        } else {
            System.out.println("The input is either Zero or Negative");
        }

        if (alarmStatus == true) {
            isAlarm = true;
            safetyAlarm = alarmStatus;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (isCompany == true && isLoad == true && isStops == true &&
            isMode == true && isEnergy == true &&
            isSpeed == true && isAlarm == true) {

            isElevatorCreated = true;
        }
		if (isElevatorCreated == true) {
    fetchDetails();
}

        return isElevatorCreated;
    }

    static void fetchDetails() {

        System.out.println("Fetching Elevator Details...");
        System.out.println("Company Name : " + companyName);
        System.out.println("Load Limit : " + loadLimit);
        System.out.println("Total Stops : " + totalStops);
        System.out.println("Elevator Mode : " + elevatorMode);
        System.out.println("Energy Source : " + energySource);
        System.out.println("Travel Speed : " + travelSpeed);
        System.out.println("Safety Alarm : " + safetyAlarm);
    }
}