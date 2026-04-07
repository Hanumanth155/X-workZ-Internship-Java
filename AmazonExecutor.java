class AmazonExecutor{

   public static void main(String[] a){
	   
	   Amazon amazon = new Amazon();
	   
	   UserAccount userOne = new UserAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Hanumanth");
	   userOne.setLastName("Devu Gouda");
	   userOne.setPassword("Hanumanth@123");
	   userOne.setEmailId("hanumanta17@gmail.com");
	   userOne.setGender("Male");
	   userOne.setMobileNumber(6362849028L);
	   
	   boolean isAccountCreated = amazon.createUserAccount(userOne);
	   System.out.println("The useAccount is created : " + isAccountCreated);
	   amazon.getUserDetails();
	   
	   UserAccount userTwo = new UserAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Dayananda");
	   userTwo.setLastName("Naik");
	   userTwo.setPassword("Dayananda@123");
	   userTwo.setEmailId("Dayananda@gmail.com");
	   userTwo.setGender("Male");
	   userTwo.setMobileNumber(6323409028L);
	   
	    isAccountCreated = amazon.createUserAccount(userTwo);
	   System.out.println("The useAccount is created : " + isAccountCreated);
	   amazon.getUserDetails();
	   amazon.getUserDetails();
	   
   }

}