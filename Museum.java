class Museum {

    private String historicalMonuments[] = new String[16];
    int index;

    public boolean addMonument(String monumentName) {
        boolean isMonumentAdded = false;

        if (monumentName != null && !monumentName.isEmpty()) {
            historicalMonuments[index] = monumentName;
            index++;
            isMonumentAdded = true;
        } else {
            System.out.println("Enter valid Monument Name");
        }

        return isMonumentAdded;
    }

    public void getMonuments() {
        for (String monumentName : historicalMonuments)
            System.out.println(monumentName);
    }
}