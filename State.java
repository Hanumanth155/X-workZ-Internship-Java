class State {

    private String highwayNames[] = new String[9];
    int index;

    public boolean addHighwayName(String highwayName) {
        boolean isHighwayAdded = false;

        if (highwayName != null && !highwayName.isEmpty()) {
            highwayNames[index] = highwayName;
            index++;
            isHighwayAdded = true;
        } else {
            System.out.println("Enter valid Highway Name");
        }

        return isHighwayAdded;
    }

    public void getHighwayNames() {
        for (String highwayName : highwayNames)
            System.out.println(highwayName);
    }
}