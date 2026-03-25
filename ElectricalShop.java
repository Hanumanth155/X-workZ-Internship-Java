class ElectricalShop {

    private String appliances[] = new String[20];
    int index;

    public boolean addAppliance(String applianceName) {
        boolean isApplianceAdded = false;

        if (applianceName != null && !applianceName.isEmpty()) {
            appliances[index] = applianceName;
            index++;
            isApplianceAdded = true;
        } else {
            System.out.println("Enter valid Appliance Name");
        }

        return isApplianceAdded;
    }

    public void getAppliances() {
        for (String applianceName : appliances)
            System.out.println(applianceName);
    }
}