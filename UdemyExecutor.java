class UdemyExecutor{

   public static void main(String[] a){
	   
	   Udemy udemy = new Udemy();
	   
	   UdemyAccount userOne = new UdemyAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Rohan");
	   userOne.setLastName("Desai");
	   userOne.setPassword("Rohan@123");
	   userOne.setEmailId("rohan.desai@gmail.com");
	   userOne.setInterestedCategory("Java Development");
	   userOne.setMobileNumber(9988771122L);
	   
	   boolean isAccountCreated = udemy.createUdemyAccount(userOne);
	   System.out.println("The udemyAccount is created : " + isAccountCreated);
	   udemy.getUdemyDetails();
	   
	   UdemyAccount userTwo = new UdemyAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Anjali");
	   userTwo.setLastName("Sharma");
	   userTwo.setPassword("Anjali@456");
	   userTwo.setEmailId("anjali.s@gmail.com");
	   userTwo.setInterestedCategory("Data Science");
	   userTwo.setMobileNumber(8877662233L);
	   
	   isAccountCreated = udemy.createUdemyAccount(userTwo);
	   System.out.println("The udemyAccount is created : " + isAccountCreated);
	   udemy.getUdemyDetails();

	   UdemyAccount userThree = new UdemyAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Suresh");
	   userThree.setLastName("Raina");
	   userThree.setPassword("Suresh@789");
	   userThree.setEmailId("suresh.r@gmail.com");
	   userThree.setInterestedCategory("Web Design");
	   userThree.setMobileNumber(7766553344L);
	   
	   isAccountCreated = udemy.createUdemyAccount(userThree);
	   System.out.println("The udemyAccount is created : " + isAccountCreated);
	   udemy.getUdemyDetails();

	   UdemyAccount userFour = new UdemyAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Kavya");
	   userFour.setLastName("Madhavan");
	   userFour.setPassword("Kavya@101");
	   userFour.setEmailId("kavya.m@gmail.com");
	   userFour.setInterestedCategory("Digital Marketing");
	   userFour.setMobileNumber(6655444455L);
	   
	   isAccountCreated = udemy.createUdemyAccount(userFour);
	   System.out.println("The udemyAccount is created : " + isAccountCreated);
	   udemy.getUdemyDetails();

	   UdemyAccount userFive = new UdemyAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Nitin");
	   userFive.setLastName("Gadkari");
	   userFive.setPassword("Nitin@202");
	   userFive.setEmailId("nitin.g@gmail.com");
	   userFive.setInterestedCategory("Cyber Security");
	   userFive.setMobileNumber(9110334455L);
	   
	   isAccountCreated = udemy.createUdemyAccount(userFive);
	   System.out.println("The udemyAccount is created : " + isAccountCreated);
	   udemy.getUdemyDetails();
	   
   }

}