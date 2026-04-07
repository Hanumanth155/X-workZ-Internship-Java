class LatexExecutor{

   public static void main(String[] a){
	   
	   Latex latex = new Latex();
	   
	   LatexAccount userOne = new LatexAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Sunil");
	   userOne.setLastName("R");
	   userOne.setPassword("Sun@123");
	   userOne.setEmailId("sun@gmail.com");
	   userOne.setDocumentName("Thesis");
	   userOne.setMobileNumber(9844011223L);
	   
	   boolean isAccountCreated = latex.createLatexAccount(userOne);
	   System.out.println("The latexAccount is created : " + isAccountCreated);
	   latex.getLatexDetails();
	   
	   LatexAccount userTwo = new LatexAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Megha");
	   userTwo.setLastName("S");
	   userTwo.setPassword("Megha@123");
	   userTwo.setEmailId("megha@gmail.com");
	   userTwo.setDocumentName("Resume");
	   userTwo.setMobileNumber(8112233440L);
	   
	   isAccountCreated = latex.createLatexAccount(userTwo);
	   System.out.println("The latexAccount is created : " + isAccountCreated);
	   latex.getLatexDetails();

	   LatexAccount userThree = new LatexAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Kavita");
	   userThree.setLastName("D");
	   userThree.setPassword("Kavi@123");
	   userThree.setEmailId("kavi@gmail.com");
	   userThree.setDocumentName("Report");
	   userThree.setMobileNumber(7334455660L);
	   
	   isAccountCreated = latex.createLatexAccount(userThree);
	   System.out.println("The latexAccount is created : " + isAccountCreated);
	   latex.getLatexDetails();

	   LatexAccount userFour = new LatexAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Vinay");
	   userFour.setLastName("K");
	   userFour.setPassword("Vin@123");
	   userFour.setEmailId("vin@gmail.com");
	   userFour.setDocumentName("Journal");
	   userFour.setMobileNumber(6360011220L);
	   
	   isAccountCreated = latex.createLatexAccount(userFour);
	   System.out.println("The latexAccount is created : " + isAccountCreated);
	   latex.getLatexDetails();

	   LatexAccount userFive = new LatexAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Prakash");
	   userFive.setLastName("M");
	   userFive.setPassword("Prak@123");
	   userFive.setEmailId("prak@gmail.com");
	   userFive.setDocumentName("Letter");
	   userFive.setMobileNumber(9900887700L);
	   
	   isAccountCreated = latex.createLatexAccount(userFive);
	   System.out.println("The latexAccount is created : " + isAccountCreated);
	   latex.getLatexDetails();
   }
}