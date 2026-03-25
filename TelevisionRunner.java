class TelevisionRunner {

    public static void main(String[] args) {

        String name = "Star Plus";
        Television obj = new Television();
        boolean isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Zee TV";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Sony TV";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Colors TV";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Sun TV";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Star Sports";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Sony Sports";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Discovery";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "National Geographic";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "History TV18";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Cartoon Network";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Pogo";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "Nickelodeon";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "MTV";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "VH1";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "BBC World News";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        name = "CNN";
        isAdded = obj.addChannel(name);
        System.out.println("Channel " + name + " added " + isAdded);

        obj.getChannels();
    }
}