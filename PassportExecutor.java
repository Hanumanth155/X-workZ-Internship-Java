class PassportExecutor{

   public static void main(String[] a){
	   
	   Passport passport = new Passport();
	   
	   PassportAccount userOne = new PassportAccount();
	   userOne.setUserId(101);
	   userOne.setFirstName("Amit");
	   userOne.setLastName("Sharma");
	   userOne.setDateOfBirth("12-04-1990");
	   userOne.setAddress("MG Road, Bengaluru");
	   userOne.setNationality("Indian");
	   userOne.setMobileNumber(9845011223L);
	   
	   boolean isAccountCreated = passport.createPassportAccount(userOne);
	   System.out.println("The passportAccount is created : " + isAccountCreated);
	   passport.getPassportDetails();
	   
	   PassportAccount userTwo = new PassportAccount();
	   userTwo.setUserId(102);
	   userTwo.setFirstName("Priya");
	   userTwo.setLastName("Nair");
	   userTwo.setDateOfBirth("25-08-1995");
	   userTwo.setAddress("Marine Drive, Mumbai");
	   userTwo.setNationality("Indian");
	   userTwo.setMobileNumber(8112244556L);
	   
	   isAccountCreated = passport.createPassportAccount(userTwo);
	   System.out.println("The passportAccount is created : " + isAccountCreated);
	   passport.getPassportDetails();

	   PassportAccount userThree = new PassportAccount();
	   userThree.setUserId(103);
	   userThree.setFirstName("John");
	   userThree.setLastName("Doe");
	   userThree.setDateOfBirth("01-01-1988");
	   userThree.setAddress("5th Avenue, New York");
	   userThree.setNationality("American");
	   userThree.setMobileNumber(7334499887L);
	   
	   isAccountCreated = passport.createPassportAccount(userThree);
	   System.out.println("The passportAccount is created : " + isAccountCreated);
	   passport.getPassportDetails();

	   PassportAccount userFour = new PassportAccount();
	   userFour.setUserId(104);
	   userFour.setFirstName("Sita");
	   userFour.setLastName("Kumari");
	   userFour.setDateOfBirth("14-11-2001");
	   userFour.setAddress("Park Street, Kolkata");
	   userFour.setNationality("Indian");
	   userFour.setMobileNumber(6360055443L);
	   
	   isAccountCreated = passport.createPassportAccount(userFour);
	   System.out.println("The passportAccount is created : " + isAccountCreated);
	   passport.getPassportDetails();

	   PassportAccount userFive = new PassportAccount();
	   userFive.setUserId(105);
	   userFive.setFirstName("Ravi");
	   userFive.setLastName("Teja");
	   userFive.setDateOfBirth("30-06-1992");
	   userFive.setAddress("Banjara Hills, Hyderabad");
	   userFive.setNationality("Indian");
	   userFive.setMobileNumber(9900112233L);
	   
	   isAccountCreated = passport.createPassportAccount(userFive);
	   System.out.println("The passportAccount is created : " + isAccountCreated);
	   passport.getPassportDetails();
	   
   }

}