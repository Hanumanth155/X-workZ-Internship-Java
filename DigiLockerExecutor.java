class DigiLockerExecutor{

   public static void main(String[] a){
	   
	   DigiLocker digiLocker = new DigiLocker();
	   
	   DigiLockerAccount userOne = new DigiLockerAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Manju");
	   userOne.setLastName("N");
	   userOne.setPassword("Manju@123");
	   userOne.setEmailId("manju@gmail.com");
	   userOne.setAadhaarNumber("123456789012");
	   userOne.setMobileNumber(9445001122L);
	   
	   boolean isAccountCreated = digiLocker.createDigiLockerAccount(userOne);
	   System.out.println("The digiLockerAccount is created : " + isAccountCreated);
	   digiLocker.getDigiLockerDetails();
	   
	   DigiLockerAccount userTwo = new DigiLockerAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Sangeeta");
	   userTwo.setLastName("B");
	   userTwo.setPassword("Sang@123");
	   userTwo.setEmailId("sang@gmail.com");
	   userTwo.setAadhaarNumber("234567890123");
	   userTwo.setMobileNumber(8112233004L);
	   
	   isAccountCreated = digiLocker.createDigiLockerAccount(userTwo);
	   System.out.println("The digiLockerAccount is created : " + isAccountCreated);
	   digiLocker.getDigiLockerDetails();

	   DigiLockerAccount userThree = new DigiLockerAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Rahul");
	   userThree.setLastName("S");
	   userThree.setPassword("Rah@123");
	   userThree.setEmailId("rah@gmail.com");
	   userThree.setAadhaarNumber("345678901234");
	   userThree.setMobileNumber(7334455006L);
	   
	   isAccountCreated = digiLocker.createDigiLockerAccount(userThree);
	   System.out.println("The digiLockerAccount is created : " + isAccountCreated);
	   digiLocker.getDigiLockerDetails();

	   DigiLockerAccount userFour = new DigiLockerAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Nayana");
	   userFour.setLastName("V");
	   userFour.setPassword("Nay@123");
	   userFour.setEmailId("nay@gmail.com");
	   userFour.setAadhaarNumber("456789012345");
	   userFour.setMobileNumber(6360011008L);
	   
	   isAccountCreated = digiLocker.createDigiLockerAccount(userFour);
	   System.out.println("The digiLockerAccount is created : " + isAccountCreated);
	   digiLocker.getDigiLockerDetails();

	   DigiLockerAccount userFive = new DigiLockerAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Santosh");
	   userFive.setLastName("K");
	   userFive.setPassword("Sant@123");
	   userFive.setEmailId("sant@gmail.com");
	   userFive.setAadhaarNumber("567890123456");
	   userFive.setMobileNumber(9900110011L);
	   
	   isAccountCreated = digiLocker.createDigiLockerAccount(userFive);
	   System.out.println("The digiLockerAccount is created : " + isAccountCreated);
	   digiLocker.getDigiLockerDetails();
   }
}