class TravelAgency {

    private String places[] = new String[17];
    int index;

    public boolean addPlace(String placeName) {
        boolean isPlaceAdded = false;

        if (placeName != null && !placeName.isEmpty()) {
            places[index] = placeName;
            index++;
            isPlaceAdded = true;
        } else {
            System.out.println("Enter valid Place Name");
        }

        return isPlaceAdded;
    }

    public void getPlaces() {
        for (String placeName : places)
            System.out.println(placeName);
    }
}