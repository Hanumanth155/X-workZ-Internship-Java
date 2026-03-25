class GymRunner {

    public static void main(String[] args) {

        String name = "Dumbbell";
        Gym obj = new Gym();
        boolean isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Treadmill";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Bench Press";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Barbell";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Pull Up Bar";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Leg Press Machine";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Chest Fly Machine";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Lat Pulldown Machine";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Cable Machine";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Elliptical Trainer";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Rowing Machine";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Exercise Bike";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Smith Machine";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Kettlebell";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Medicine Ball";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        name = "Resistance Bands";
        isAdded = obj.addEquipment(name);
        System.out.println("Equipment " + name + " added " + isAdded);

        obj.getEquipments();
    }
}