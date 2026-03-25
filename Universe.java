class Universe {

    private String galaxies[] = new String[17];
    int index;

    public boolean addGalaxy(String galaxyName) {
        boolean isGalaxyAdded = false;

        if (galaxyName != null && !galaxyName.isEmpty()) {
            galaxies[index] = galaxyName;
            index++;
            isGalaxyAdded = true;
        } else {
            System.out.println("Enter valid Galaxy Name");
        }

        return isGalaxyAdded;
    }

    public void getGalaxies() {
        for (String galaxyName : galaxies)
            System.out.println(galaxyName);
    }
}