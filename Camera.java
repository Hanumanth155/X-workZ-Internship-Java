class Camera {

    static String brand;
    static String model;
    static double price;
    static int megaPixel;
    static boolean isDigital;
    static String color;
    static int zoom;
    static double weight;
    static String batteryType;
    static boolean hasFlash;

    public static boolean createCamera(
            String camBrand, String camModel, double camPrice, int camMegaPixel,
            boolean digital, String camColor, int camZoom,
            double camWeight, String camBattery, boolean flash) {

        boolean isCameraCreated = false;

        boolean isBrand = false;
        boolean isModel = false;
        boolean isPrice = false;
        boolean isMegaPixel = false;
        boolean isDigitalSet = false;
        boolean isColor = false;
        boolean isZoom = false;
        boolean isWeight = false;
        boolean isBattery = false;
        boolean isFlashSet = false;

        if (camBrand != null && !camBrand.isEmpty()) {
            isBrand = true;
            brand = camBrand;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (camModel != null && !camModel.isEmpty()) {
            isModel = true;
            model = camModel;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (camPrice > 0) {
            isPrice = true;
            price = camPrice;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (camMegaPixel > 0) {
            isMegaPixel = true;
            megaPixel = camMegaPixel;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (digital) {
            isDigitalSet = true;
            isDigital = digital;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (camColor != null && !camColor.isEmpty()) {
            isColor = true;
            color = camColor;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (camZoom > 0) {
            isZoom = true;
            zoom = camZoom;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (camWeight > 0) {
            isWeight = true;
            weight = camWeight;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (camBattery != null && !camBattery.isEmpty()) {
            isBattery = true;
            batteryType = camBattery;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (flash) {
            isFlashSet = true;
            hasFlash = flash;
        } else {
            System.out.println("The input is either null or empty");
        }

        if (isBrand == true && isModel == true && isPrice == true &&
            isMegaPixel == true && isDigitalSet == true &&
            isColor == true && isZoom == true &&
            isWeight == true && isBattery == true &&
            isFlashSet == true) {

            isCameraCreated = true;
        }
		if (isCameraCreated == true) {
    getCameraDetails();
    }


        return isCameraCreated;
    }

    public static void getCameraDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Price : " + price);
        System.out.println("MegaPixel : " + megaPixel);
        System.out.println("Is Digital : " + isDigital);
        System.out.println("Color : " + color);
        System.out.println("Zoom : " + zoom);
        System.out.println("Weight : " + weight);
        System.out.println("Battery Type : " + batteryType);
        System.out.println("Has Flash : " + hasFlash);
    }
}