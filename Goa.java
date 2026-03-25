class Goa {

    private String beachNames[] = new String[19];
    int index;

    public boolean addBeachName(String beachName) {
        boolean isBeachAdded = false;

        if (beachName != null && !beachName.isEmpty()) {
            beachNames[index] = beachName;
            index++;
            isBeachAdded = true;
        } else {
            System.out.println("Enter valid Beach Name");
        }

        return isBeachAdded;
    }

    public void getBeachNames() {
        for (String beachName : beachNames)
            System.out.println(beachName);
    }
}