class ECommerce {

    private String productNames[] = new String[26];
    int index;

    public boolean addProduct(String productName) {
        boolean isProductAdded = false;

        if (productName != null && !productName.isEmpty()) {
            productNames[index] = productName;
            index++;
            isProductAdded = true;
        } else {
            System.out.println("Enter valid Product Name");
        }

        return isProductAdded;
    }

    public void getProducts() {
        for (String productName : productNames)
            System.out.println(productName);
    }
}