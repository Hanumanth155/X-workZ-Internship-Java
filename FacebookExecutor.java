class FacebookExecutor{

   public static void main(String[] a){
	   
	   Facebook facebook = new Facebook();
	   
	   FacebookAccount userOne = new FacebookAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Manjunath");
	   userOne.setLastName("Kulkarni");
	   userOne.setPassword("Manju@123");
	   userOne.setEmailId("manju.k@gmail.com");
	   userOne.setDateOfBirth("15-08-1995");
	   userOne.setMobileNumber(9988776655L);
	   
	   boolean isAccountCreated = facebook.createFacebookAccount(userOne);
	   System.out.println("The facebookAccount is created : " + isAccountCreated);
	   facebook.getFacebookDetails();
	   
	   FacebookAccount userTwo = new FacebookAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Sangeeta");
	   userTwo.setLastName("Bhat");
	   userTwo.setPassword("Sangy@456");
	   userTwo.setEmailId("sangeeta.b@gmail.com");
	   userTwo.setDateOfBirth("22-05-1998");
	   userTwo.setMobileNumber(8877665544L);
	   
	   isAccountCreated = facebook.createFacebookAccount(userTwo);
	   System.out.println("The facebookAccount is created : " + isAccountCreated);
	   facebook.getFacebookDetails();

	   FacebookAccount userThree = new FacebookAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Ramesh");
	   userThree.setLastName("Jadav");
	   userThree.setPassword("Ram@789");
	   userThree.setEmailId("ramesh.j@gmail.com");
	   userThree.setDateOfBirth("10-12-1992");
	   userThree.setMobileNumber(7766554433L);
	   
	   isAccountCreated = facebook.createFacebookAccount(userThree);
	   System.out.println("The facebookAccount is created : " + isAccountCreated);
	   facebook.getFacebookDetails();

	   FacebookAccount userFour = new FacebookAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Kavita");
	   userFour.setLastName("Reddy");
	   userFour.setPassword("Kavi@101");
	   userFour.setEmailId("kavita.r@gmail.com");
	   userFour.setDateOfBirth("05-03-2000");
	   userFour.setMobileNumber(6655443322L);
	   
	   isAccountCreated = facebook.createFacebookAccount(userFour);
	   System.out.println("The facebookAccount is created : " + isAccountCreated);
	   facebook.getFacebookDetails();

	   FacebookAccount userFive = new FacebookAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Prakash");
	   userFive.setLastName("Rao");
	   userFive.setPassword("Prakash@202");
	   userFive.setEmailId("prakash.rao@gmail.com");
	   userFive.setDateOfBirth("18-07-1994");
	   userFive.setMobileNumber(9110223344L);
	   
	   isAccountCreated = facebook.createFacebookAccount(userFive);
	   System.out.println("The facebookAccount is created : " + isAccountCreated);
	   facebook.getFacebookDetails();
	   
   }

}