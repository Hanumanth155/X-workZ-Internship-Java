class ElectricalShopRunner {

    public static void main(String[] args) {

        String name = "Fan";
        ElectricalShop obj = new ElectricalShop();
        boolean isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Air Conditioner";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Refrigerator";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Washing Machine";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Microwave Oven";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Mixer Grinder";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Iron Box";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Water Heater";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Television";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Air Cooler";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Induction Stove";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Toaster";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Juicer";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Vacuum Cleaner";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Ceiling Light";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Table Lamp";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Exhaust Fan";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Room Heater";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Dishwasher";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        name = "Coffee Maker";
        isAdded = obj.addAppliance(name);
        System.out.println("Appliance " + name + " added " + isAdded);

        obj.getAppliances();
    }
}