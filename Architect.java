class Architect {

    private String interiorDesignNames[] = new String[11];
    int index;

    public boolean addDesignName(String designName) {
        boolean isDesignAdded = false;

        if (designName != null && !designName.isEmpty()) {
            interiorDesignNames[index] = designName;
            index++;
            isDesignAdded = true;
        } else {
            System.out.println("Enter valid Design Name");
        }

        return isDesignAdded;
    }

    public void getDesignNames() {
        for (String designName : interiorDesignNames)
            System.out.println(designName);
    }
}