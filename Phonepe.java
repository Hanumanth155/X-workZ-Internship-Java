class Phonepe {

    private String insuranceNames[] = new String[27];
    int index;

    public boolean addInsuranceName(String insuranceName) {
        boolean isInsuranceAdded = false;

        if (insuranceName != null && !insuranceName.isEmpty()) {
            insuranceNames[index] = insuranceName;
            index++;
            isInsuranceAdded = true;
        } else {
            System.out.println("Enter valid Insurance Name");
        }

        return isInsuranceAdded;
    }

    public void getInsuranceNames() {
        for (String insuranceName : insuranceNames)
            System.out.println(insuranceName);
    }
}