class AbhibusExecutor{

   public static void main(String[] a){
	   
	   Abhibus abhibus = new Abhibus();
	   
	   AbhibusAccount userOne = new AbhibusAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Ramesh");
	   userOne.setLastName("Naik");
	   userOne.setPassword("Ram@123");
	   userOne.setEmailId("ramesh@gmail.com");
	   userOne.setSource("Bangalore");
	   userOne.setMobileNumber(9845011223L);
	   
	   boolean isAccountCreated = abhibus.createAbhibusAccount(userOne);
	   System.out.println("The abhibusAccount is created : " + isAccountCreated);
	   abhibus.getAbhibusDetails();
	   
	   AbhibusAccount userTwo = new AbhibusAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Suresh");
	   userTwo.setLastName("Bhat");
	   userTwo.setPassword("Sur@123");
	   userTwo.setEmailId("suresh@gmail.com");
	   userTwo.setSource("Hubli");
	   userTwo.setMobileNumber(8112244556L);
	   
	   isAccountCreated = abhibus.createAbhibusAccount(userTwo);
	   System.out.println("The abhibusAccount is created : " + isAccountCreated);
	   abhibus.getAbhibusDetails();

	   AbhibusAccount userThree = new AbhibusAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Kiran");
	   userThree.setLastName("Kumar");
	   userThree.setPassword("Kir@123");
	   userThree.setEmailId("kiran@gmail.com");
	   userThree.setSource("Mysore");
	   userThree.setMobileNumber(7334499887L);
	   
	   isAccountCreated = abhibus.createAbhibusAccount(userThree);
	   System.out.println("The abhibusAccount is created : " + isAccountCreated);
	   abhibus.getAbhibusDetails();

	   AbhibusAccount userFour = new AbhibusAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Pooja");
	   userFour.setLastName("Hegde");
	   userFour.setPassword("Pooja@123");
	   userFour.setEmailId("pooja@gmail.com");
	   userFour.setSource("Udupi");
	   userFour.setMobileNumber(6360055443L);
	   
	   isAccountCreated = abhibus.createAbhibusAccount(userFour);
	   System.out.println("The abhibusAccount is created : " + isAccountCreated);
	   abhibus.getAbhibusDetails();

	   AbhibusAccount userFive = new AbhibusAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Deepak");
	   userFive.setLastName("Gowda");
	   userFive.setPassword("Deep@123");
	   userFive.setEmailId("deep@gmail.com");
	   userFive.setSource("Shimoga");
	   userFive.setMobileNumber(9900112233L);
	   
	   isAccountCreated = abhibus.createAbhibusAccount(userFive);
	   System.out.println("The abhibusAccount is created : " + isAccountCreated);
	   abhibus.getAbhibusDetails();
   }
}