class Google {
    String companyName;
    String ceo;
    int foundedYear;
    String headquarters;
    String parentCompany;
    long numberOfEmployees;
    double revenueBillions;
    String coreProduct;
    String browser;
    String mobileOS;
    String cloudPlatform;
    String aiModel;
    String emailService;
    String mapService;
    String videoPlatform;
    double marketCapTrillions;
    boolean isPubliclyTraded;
    String stockTicker;
    String founders;
    String motto;

    public Google(String companyName, String ceo, int foundedYear, String headquarters, String parentCompany, 
                  long numberOfEmployees, double revenueBillions, String coreProduct, String browser, 
                  String mobileOS, String cloudPlatform, String aiModel, String emailService, String mapService, 
                  String videoPlatform, double marketCapTrillions, boolean isPubliclyTraded, String stockTicker, 
                  String founders, String motto) {
        this.companyName = companyName;
        this.ceo = ceo;
        this.foundedYear = foundedYear;
        this.headquarters = headquarters;
        this.parentCompany = parentCompany;
        this.numberOfEmployees = numberOfEmployees;
        this.revenueBillions = revenueBillions;
        this.coreProduct = coreProduct;
        this.browser = browser;
        this.mobileOS = mobileOS;
        this.cloudPlatform = cloudPlatform;
        this.aiModel = aiModel;
        this.emailService = emailService;
        this.mapService = mapService;
        this.videoPlatform = videoPlatform;
        this.marketCapTrillions = marketCapTrillions;
        this.isPubliclyTraded = isPubliclyTraded;
        this.stockTicker = stockTicker;
        this.founders = founders;
        this.motto = motto;
    }

    public void display() {
        System.out.println("--- " + this.companyName + " Details ---");
        System.out.println("CEO: " + this.ceo);
        System.out.println("Founded: " + this.foundedYear);
        System.out.println("HQ: " + this.headquarters);
        System.out.println("Parent: " + this.parentCompany);
        System.out.println("Employees: " + this.numberOfEmployees);
        System.out.println("Revenue: $" + this.revenueBillions + "B");
        System.out.println("Core Product: " + this.coreProduct);
        System.out.println("Browser: " + this.browser);
        System.out.println("Mobile OS: " + this.mobileOS);
        System.out.println("Cloud Platform: " + this.cloudPlatform);
        System.out.println("AI Model: " + this.aiModel);
        System.out.println("Email Service: " + this.emailService);
        System.out.println("Map Service: " + this.mapService);
        System.out.println("Video Platform: " + this.videoPlatform);
        System.out.println("Market Cap: $" + this.marketCapTrillions + "T");
        System.out.println("Publicly Traded: " + this.isPubliclyTraded);
        System.out.println("Stock Ticker: " + this.stockTicker);
        System.out.println("Founders: " + this.founders);
        System.out.println("Motto: " + this.motto + "\n");
    }
}

