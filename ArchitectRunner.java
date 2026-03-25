class ArchitectRunner {

    public static void main(String[] args) {

        String name = "Modern Interior";
        Architect obj = new Architect();
        boolean isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Minimalist Design";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Industrial Style";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Contemporary Design";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Traditional Design";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Bohemian Style";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Scandinavian Design";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Rustic Style";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Art Deco";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Vintage Style";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        name = "Luxury Interior";
        isAdded = obj.addDesignName(name);
        System.out.println("Design " + name + " added " + isAdded);

        obj.getDesignNames();
    }
}