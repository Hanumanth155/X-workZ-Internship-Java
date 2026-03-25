class Television {

    private String channelNames[] = new String[17];
    int index;

    public boolean addChannel(String channelName) {
        boolean isChannelAdded = false;

        if (channelName != null && !channelName.isEmpty()) {
            channelNames[index] = channelName;
            index++;
            isChannelAdded = true;
        } else {
            System.out.println("Enter valid Channel Name");
        }

        return isChannelAdded;
    }

    public void getChannels() {
        for (String channelName : channelNames)
            System.out.println(channelName);
    }
}