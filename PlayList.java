class PlayList {

    private String songNames[] = new String[15];
    int index;

    public boolean addSong(String songName) {
        boolean isSongAdded = false;

        if (songName != null && !songName.isEmpty()) {
            songNames[index] = songName;
            index++;
            isSongAdded = true;
        } else {
            System.out.println("Enter valid Song Name");
        }

        return isSongAdded;
    }

    public void getSongs() {
        for (String songName : songNames)
            System.out.println(songName);
    }
}