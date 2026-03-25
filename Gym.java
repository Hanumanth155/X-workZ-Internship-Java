class Gym {

    private String equipments[] = new String[16];
    int index;

    public boolean addEquipment(String equipmentName) {
        boolean isEquipmentAdded = false;

        if (equipmentName != null && !equipmentName.isEmpty()) {
            equipments[index] = equipmentName;
            index++;
            isEquipmentAdded = true;
        } else {
            System.out.println("Enter valid Equipment Name");
        }

        return isEquipmentAdded;
    }

    public void getEquipments() {
        for (String equipmentName : equipments)
            System.out.println(equipmentName);
    }
}