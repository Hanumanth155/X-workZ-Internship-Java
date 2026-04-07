class FigmaExecutor{

   public static void main(String[] a){
	   
	   Figma figma = new Figma();
	   
	   FigmaAccount userOne = new FigmaAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Arun");
	   userOne.setLastName("Kumar");
	   userOne.setPassword("Arun@123");
	   userOne.setEmailId("arun@gmail.com");
	   userOne.setToolName("Design");
	   userOne.setMobileNumber(9445011223L);
	   
	   boolean isAccountCreated = figma.createFigmaAccount(userOne);
	   System.out.println("The figmaAccount is created : " + isAccountCreated);
	   figma.getFigmaDetails();
	   
	   FigmaAccount userTwo = new FigmaAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Sneha");
	   userTwo.setLastName("Rai");
	   userTwo.setPassword("Sneha@123");
	   userTwo.setEmailId("sneha@gmail.com");
	   userTwo.setToolName("UI/UX");
	   userTwo.setMobileNumber(8112244556L);
	   
	   isAccountCreated = figma.createFigmaAccount(userTwo);
	   System.out.println("The figmaAccount is created : " + isAccountCreated);
	   figma.getFigmaDetails();

	   FigmaAccount userThree = new FigmaAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Karthik");
	   userThree.setLastName("M");
	   userThree.setPassword("Kart@123");
	   userThree.setEmailId("kart@gmail.com");
	   userThree.setToolName("Prototype");
	   userThree.setMobileNumber(7334499887L);
	   
	   isAccountCreated = figma.createFigmaAccount(userThree);
	   System.out.println("The figmaAccount is created : " + isAccountCreated);
	   figma.getFigmaDetails();

	   FigmaAccount userFour = new FigmaAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Ananya");
	   userFour.setLastName("Gowda");
	   userFour.setPassword("Ananya@123");
	   userFour.setEmailId("ananya@gmail.com");
	   userFour.setToolName("Frame");
	   userFour.setMobileNumber(6360055443L);
	   
	   isAccountCreated = figma.createFigmaAccount(userFour);
	   System.out.println("The figmaAccount is created : " + isAccountCreated);
	   figma.getFigmaDetails();

	   FigmaAccount userFive = new FigmaAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Vikram");
	   userFive.setLastName("V");
	   userFive.setPassword("Vik@123");
	   userFive.setEmailId("vik@gmail.com");
	   userFive.setToolName("Vector");
	   userFive.setMobileNumber(9900112233L);
	   
	   isAccountCreated = figma.createFigmaAccount(userFive);
	   System.out.println("The figmaAccount is created : " + isAccountCreated);
	   figma.getFigmaDetails();
   }
}