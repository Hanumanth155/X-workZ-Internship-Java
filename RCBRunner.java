class RCBRunner {

    public static void main(String[] args) {

        String name = "Virat Kohli";
        RCB obj = new RCB();
        boolean isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Faf du Plessis";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Glenn Maxwell";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Mohammed Siraj";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Dinesh Karthik";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Rajat Patidar";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Anuj Rawat";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Mahipal Lomror";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Shahbaz Ahmed";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Karn Sharma";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Josh Hazlewood";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Wanindu Hasaranga";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Reece Topley";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Harshal Patel";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        name = "Suyash Prabhudessai";
        isAdded = obj.addPlayerName(name);
        System.out.println("Player " + name + " added " + isAdded);

        obj.getPlayerNames();
    }
}