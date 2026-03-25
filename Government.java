class Government {

    private String competitiveExamNames[] = new String[9];
    int index;

    public boolean addExamName(String examName) {
        boolean isExamAdded = false;

        if (examName != null && !examName.isEmpty()) {
            competitiveExamNames[index] = examName;
            index++;
            isExamAdded = true;
        } else {
            System.out.println("Enter valid Exam Name");
        }

        return isExamAdded;
    }

    public void getExamNames() {
        for (String examName : competitiveExamNames)
            System.out.println(examName);
    }
}