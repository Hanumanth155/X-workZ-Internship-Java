class PetShop {

    private String petAccessories[] = new String[20];
    int index;

    public boolean addAccessory(String accessoryName) {
        boolean isAccessoryAdded = false;

        if (accessoryName != null && !accessoryName.isEmpty()) {
            petAccessories[index] = accessoryName;
            index++;
            isAccessoryAdded = true;
        } else {
            System.out.println("Enter valid Accessory Name");
        }

        return isAccessoryAdded;
    }

    public void getAccessories() {
        for (String accessoryName : petAccessories)
            System.out.println(accessoryName);
    }
}