class GovernmentRunner {

    public static void main(String[] args) {

        String name = "UPSC";
        Government obj = new Government();
        boolean isAdded = obj.addExamName(name);
        System.out.println("Exam " + name + " added " + isAdded);

        name = "SSC";
        isAdded = obj.addExamName(name);
        System.out.println("Exam " + name + " added " + isAdded);

        name = "IBPS PO";
        isAdded = obj.addExamName(name);
        System.out.println("Exam " + name + " added " + isAdded);

        name = "IBPS Clerk";
        isAdded = obj.addExamName(name);
        System.out.println("Exam " + name + " added " + isAdded);

        name = "RRB NTPC";
        isAdded = obj.addExamName(name);
        System.out.println("Exam " + name + " added " + isAdded);

        name = "RRB Group D";
        isAdded = obj.addExamName(name);
        System.out.println("Exam " + name + " added " + isAdded);

        name = "NDA";
        isAdded = obj.addExamName(name);
        System.out.println("Exam " + name + " added " + isAdded);

        name = "CDS";
        isAdded = obj.addExamName(name);
        System.out.println("Exam " + name + " added " + isAdded);

        name = "State PSC";
        isAdded = obj.addExamName(name);
        System.out.println("Exam " + name + " added " + isAdded);

        obj.getExamNames();
    }
}