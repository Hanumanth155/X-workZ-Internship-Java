class CanvaExecutor{

   public static void main(String[] a){
	   Canva canva = new Canva();
	   
	   CanvaAccount userOne = new CanvaAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Vijay");
	   userOne.setLastName("Thalapathy");
	   userOne.setPassword("Vijay@Canva");
	   userOne.setEmailId("vijay.t@gmail.com");
	   userOne.setDesignType("Movie Poster");
	   userOne.setMobileNumber(9445566778L);
	   
	   boolean isAccountCreated = canva.createCanvaAccount(userOne);
	   System.out.println("The canvaAccount is created : " + isAccountCreated);
	   canva.getCanvaDetails();

       CanvaAccount userTwo = new CanvaAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Rashmika");
	   userTwo.setLastName("Mandanna");
	   userTwo.setPassword("Rashmika@123");
	   userTwo.setEmailId("rashu.m@gmail.com");
	   userTwo.setDesignType("Social Media Post");
	   userTwo.setMobileNumber(8123456789L);
	   canva.createCanvaAccount(userTwo);
	   canva.getCanvaDetails();

       CanvaAccount userThree = new CanvaAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Allu");
	   userThree.setLastName("Arjun");
	   userThree.setPassword("Arjun@789");
	   userThree.setEmailId("allu.arjun@gmail.com");
	   userThree.setDesignType("Business Card");
	   userThree.setMobileNumber(7766554433L);
	   canva.createCanvaAccount(userThree);
	   canva.getCanvaDetails();

       CanvaAccount userFour = new CanvaAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Keerthy");
	   userFour.setLastName("Suresh");
	   userFour.setPassword("Keerthy@101");
	   userFour.setEmailId("keerthy.s@gmail.com");
	   userFour.setDesignType("YouTube Thumbnail");
	   userFour.setMobileNumber(6362841122L);
	   canva.createCanvaAccount(userFour);
	   canva.getCanvaDetails();

       CanvaAccount userFive = new CanvaAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Mahesh");
	   userFive.setLastName("Babu");
	   userFive.setPassword("Mahesh@202");
	   userFive.setEmailId("mahesh.b@gmail.com");
	   userFive.setDesignType("Infographic");
	   userFive.setMobileNumber(9900887766L);
	   canva.createCanvaAccount(userFive);
	   canva.getCanvaDetails();
   }
}