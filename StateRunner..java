class StateRunner {

    public static void main(String[] args) {

        String name = "NH44";
        State obj = new State();
        boolean isAdded = obj.addHighwayName(name);
        System.out.println("Highway " + name + " added " + isAdded);

        name = "NH48";
        isAdded = obj.addHighwayName(name);
        System.out.println("Highway " + name + " added " + isAdded);

        name = "NH16";
        isAdded = obj.addHighwayName(name);
        System.out.println("Highway " + name + " added " + isAdded);

        name = "NH66";
        isAdded = obj.addHighwayName(name);
        System.out.println("Highway " + name + " added " + isAdded);

        name = "NH19";
        isAdded = obj.addHighwayName(name);
        System.out.println("Highway " + name + " added " + isAdded);

        name = "NH27";
        isAdded = obj.addHighwayName(name);
        System.out.println("Highway " + name + " added " + isAdded);

        name = "NH30";
        isAdded = obj.addHighwayName(name);
        System.out.println("Highway " + name + " added " + isAdded);

        name = "NH52";
        isAdded = obj.addHighwayName(name);
        System.out.println("Highway " + name + " added " + isAdded);

        name = "NH75";
        isAdded = obj.addHighwayName(name);
        System.out.println("Highway " + name + " added " + isAdded);

        obj.getHighwayNames();
    }
}