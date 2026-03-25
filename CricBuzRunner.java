class CricBuzRunner {

    public static void main(String[] args) {

        String name = "India";
        CricBuz obj = new CricBuz();
        boolean isAdded = obj.addTeamName(name);
        System.out.println("Team " + name + " added " + isAdded);

        name = "Australia";
        isAdded = obj.addTeamName(name);
        System.out.println("Team " + name + " added " + isAdded);

        name = "England";
        isAdded = obj.addTeamName(name);
        System.out.println("Team " + name + " added " + isAdded);

        name = "New Zealand";
        isAdded = obj.addTeamName(name);
        System.out.println("Team " + name + " added " + isAdded);

        name = "South Africa";
        isAdded = obj.addTeamName(name);
        System.out.println("Team " + name + " added " + isAdded);

        name = "Pakistan";
        isAdded = obj.addTeamName(name);
        System.out.println("Team " + name + " added " + isAdded);

        name = "Sri Lanka";
        isAdded = obj.addTeamName(name);
        System.out.println("Team " + name + " added " + isAdded);

        name = "Bangladesh";
        isAdded = obj.addTeamName(name);
        System.out.println("Team " + name + " added " + isAdded);

        obj.getTeamNames();
    }
}