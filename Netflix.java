class Netflix {

    private String webSeries[] = new String[18];
    int index;

    public boolean addWebSeries(String webSeriesName) {
        boolean isWebSeriesAdded = false;

        if (webSeriesName != null && !webSeriesName.isEmpty()) {
            webSeries[index] = webSeriesName;
            index++;
            isWebSeriesAdded = true;
        } else {
            System.out.println("Enter valid Web Series Name");
        }

        return isWebSeriesAdded;
    }

    public void getWebSeries() {
        for (String webSeriesName : webSeries)
            System.out.println(webSeriesName);
    }
}