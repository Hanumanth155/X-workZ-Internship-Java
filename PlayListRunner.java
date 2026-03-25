class PlayListRunner {

    public static void main(String[] args) {

        String name = "Shape of You";
        PlayList obj = new PlayList();
        boolean isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Believer";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Blinding Lights";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Perfect";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Closer";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Levitating";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Senorita";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Havana";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Peaches";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Stay";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Faded";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Counting Stars";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Rockstar";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Cheap Thrills";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        name = "Dance Monkey";
        isAdded = obj.addSong(name);
        System.out.println("Song " + name + " added " + isAdded);

        obj.getSongs();
    }
}