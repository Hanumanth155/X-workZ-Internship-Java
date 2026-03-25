class UniverseRunner {

    public static void main(String[] args) {

        String name = "Milky Way";
        Universe obj = new Universe();
        boolean isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Andromeda";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Triangulum";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Whirlpool Galaxy";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Sombrero Galaxy";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Pinwheel Galaxy";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Cartwheel Galaxy";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Black Eye Galaxy";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Cigar Galaxy";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Sunflower Galaxy";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Centaurus A";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "NGC 1300";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "NGC 6744";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Messier 81";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Messier 82";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Large Magellanic Cloud";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        name = "Small Magellanic Cloud";
        isAdded = obj.addGalaxy(name);
        System.out.println("Galaxy " + name + " added " + isAdded);

        obj.getGalaxies();
    }
}