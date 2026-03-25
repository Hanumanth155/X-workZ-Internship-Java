class MuseumRunner {

    public static void main(String[] args) {

        String name = "Taj Mahal";
        Museum obj = new Museum();
        boolean isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Qutub Minar";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Red Fort";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "India Gate";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Hampi";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Mysore Palace";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Charminar";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Gateway of India";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Sun Temple";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Ajanta Caves";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Ellora Caves";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Golconda Fort";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Sanchi Stupa";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Meenakshi Temple";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Golden Temple";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        name = "Konark Temple";
        isAdded = obj.addMonument(name);
        System.out.println("Monument " + name + " added " + isAdded);

        obj.getMonuments();
    }
}