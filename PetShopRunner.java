class PetShopRunner {

    public static void main(String[] args) {

        String name = "Dog Collar";
        PetShop obj = new PetShop();
        boolean isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Cat Collar";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Dog Leash";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Bed";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Food Bowl";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Water Dispenser";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Shampoo";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Soap";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Dog Toy";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Cat Toy";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Comb";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Brush";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Nail Cutter";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Carrier";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Jacket";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Sweater";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet Belt";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Pet House";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Fish Tank";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        name = "Bird Cage";
        isAdded = obj.addAccessory(name);
        System.out.println("Accessory " + name + " added " + isAdded);

        obj.getAccessories();
    }
}