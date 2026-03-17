class Map {
    String title;
    boolean isDigital;
    int scaleRatio;
    char regionCode;
    double price;
    float areaSqKm;
    short publishedYear;
    byte zoomLevels;
    long downloadCount;
    String publisher;
    String language;
    boolean isTopographic;
    int updateFrequencyDays;
    char projectionType;
    double accuracyMeters;
    float fileSizeBytes;
    long mapId;
    double minLatitude;
    double maxLongitude;
    String theme;

    public Map(String title, boolean isDigital, int scaleRatio, char regionCode, double price, float areaSqKm, short publishedYear, byte zoomLevels, long downloadCount, String publisher, String language, boolean isTopographic, int updateFrequencyDays, char projectionType, double accuracyMeters, float fileSizeBytes, long mapId, double minLatitude, double maxLongitude, String theme) {
        this.title = title;
        this.isDigital = isDigital;
        this.scaleRatio = scaleRatio;
        this.regionCode = regionCode;
        this.price = price;
        this.areaSqKm = areaSqKm;
        this.publishedYear = publishedYear;
        this.zoomLevels = zoomLevels;
        this.downloadCount = downloadCount;
        this.publisher = publisher;
        this.language = language;
        this.isTopographic = isTopographic;
        this.updateFrequencyDays = updateFrequencyDays;
        this.projectionType = projectionType;
        this.accuracyMeters = accuracyMeters;
        this.fileSizeBytes = fileSizeBytes;
        this.mapId = mapId;
        this.minLatitude = minLatitude;
        this.maxLongitude = maxLongitude;
        this.theme = theme;
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Is Digital: " + this.isDigital);
        System.out.println("Scale Ratio: 1:" + this.scaleRatio);
        System.out.println("Region Code: " + this.regionCode);
        System.out.println("Price: $" + this.price);
        System.out.println("Area: " + this.areaSqKm + " sq km");
        System.out.println("Published Year: " + this.publishedYear);
        System.out.println("Zoom Levels: " + this.zoomLevels);
        System.out.println("Download Count: " + this.downloadCount);
        System.out.println("Publisher: " + this.publisher);
        System.out.println("Language: " + this.language);
        System.out.println("Is Topographic: " + this.isTopographic);
        System.out.println("Update Frequency: " + this.updateFrequencyDays + " days");
        System.out.println("Projection Type: " + this.projectionType);
        System.out.println("Accuracy: " + this.accuracyMeters + " meters");
        System.out.println("File Size: " + this.fileSizeBytes + " MB");
        System.out.println("Map ID: " + this.mapId);
        System.out.println("Min Latitude: " + this.minLatitude);
        System.out.println("Max Longitude: " + this.maxLongitude);
        System.out.println("Theme: " + this.theme);
        System.out.println();
    }
}
