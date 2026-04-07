class VercelExecutor{

   public static void main(String[] a){
	   
	   Vercel vercel = new Vercel();
	   
	   VercelAccount userOne = new VercelAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Ratan");
	   userOne.setLastName("Tata");
	   userOne.setPassword("Ratan@Vercel");
	   userOne.setEmailId("ratan.tata@gmail.com");
	   userOne.setProjectName("Tata-Digital-App");
	   userOne.setMobileNumber(9448001122L);
	   
	   boolean isAccountCreated = vercel.createVercelAccount(userOne);
	   System.out.println("The vercelAccount is created : " + isAccountCreated);
	   vercel.getVercelDetails();
	   
	   VercelAccount userTwo = new VercelAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Alia");
	   userTwo.setLastName("Bhatt");
	   userTwo.setPassword("Alia@123");
	   userTwo.setEmailId("alia.b@gmail.com");
	   userTwo.setProjectName("Ed-a-Mamma-Web");
	   userTwo.setMobileNumber(8123456700L);
	   
	   isAccountCreated = vercel.createVercelAccount(userTwo);
	   System.out.println("The vercelAccount is created : " + isAccountCreated);
	   vercel.getVercelDetails();

	   VercelAccount userThree = new VercelAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Ranbir");
	   userThree.setLastName("Kapoor");
	   userThree.setPassword("Ranbir@456");
	   userThree.setEmailId("ranbir.k@gmail.com");
	   userThree.setProjectName("Animal-Movie-Site");
	   userThree.setMobileNumber(7766550011L);
	   
	   isAccountCreated = vercel.createVercelAccount(userThree);
	   System.out.println("The vercelAccount is created : " + isAccountCreated);
	   vercel.getVercelDetails();

	   VercelAccount userFour = new VercelAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Kiara");
	   userFour.setLastName("Advani");
	   userFour.setPassword("Kiara@789");
	   userFour.setEmailId("kiara.a@gmail.com");
	   userFour.setProjectName("Bridal-Portfolio");
	   userFour.setMobileNumber(6362841199L);
	   
	   isAccountCreated = vercel.createVercelAccount(userFour);
	   System.out.println("The vercelAccount is created : " + isAccountCreated);
	   vercel.getVercelDetails();

	   VercelAccount userFive = new VercelAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Kartik");
	   userFive.setLastName("Aaryan");
	   userFive.setPassword("Kartik@2026");
	   userFive.setEmailId("kartik.a@gmail.com");
	   userFive.setProjectName("Bhool-Bhulaiyaa-3");
	   userFive.setMobileNumber(9900114477L);
	   
	   isAccountCreated = vercel.createVercelAccount(userFive);
	   System.out.println("The vercelAccount is created : " + isAccountCreated);
	   vercel.getVercelDetails();
	   
   }

}