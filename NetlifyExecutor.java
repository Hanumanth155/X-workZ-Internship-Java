class NetlifyExecutor{

   public static void main(String[] a){
	   
	   Netlify netlify = new Netlify();
	   
	   NetlifyAccount userOne = new NetlifyAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Sandeep");
	   userOne.setLastName("Maheshwari");
	   userOne.setPassword("Sandeep@Netlify");
	   userOne.setEmailId("sandeep.m@gmail.com");
	   userOne.setTeamName("Inspiration-Web");
	   userOne.setMobileNumber(9886044332L);
	   
	   boolean isAccountCreated = netlify.createNetlifyAccount(userOne);
	   System.out.println("The netlifyAccount is created : " + isAccountCreated);
	   netlify.getNetlifyDetails();
	   
	   NetlifyAccount userTwo = new NetlifyAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Shraddha");
	   userTwo.setLastName("Kapoor");
	   userTwo.setPassword("Shraddha@123");
	   userTwo.setEmailId("shraddha.k@gmail.com");
	   userTwo.setTeamName("Bollywood-Devs");
	   userTwo.setMobileNumber(8112233998L);
	   
	   isAccountCreated = netlify.createNetlifyAccount(userTwo);
	   System.out.println("The netlifyAccount is created : " + isAccountCreated);
	   netlify.getNetlifyDetails();

	   NetlifyAccount userThree = new NetlifyAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Varun");
	   userThree.setLastName("Dhawan");
	   userThree.setPassword("Varun@456");
	   userThree.setEmailId("varun.d@gmail.com");
	   userThree.setTeamName("Coolie-No1-Apps");
	   userThree.setMobileNumber(7766551100L);
	   
	   isAccountCreated = netlify.createNetlifyAccount(userThree);
	   System.out.println("The netlifyAccount is created : " + isAccountCreated);
	   netlify.getNetlifyDetails();

	   NetlifyAccount userFour = new NetlifyAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Kriti");
	   userFour.setLastName("Sanon");
	   userFour.setPassword("Kriti@789");
	   userFour.setEmailId("kriti.s@gmail.com");
	   userFour.setTeamName("Mimi-Productions");
	   userFour.setMobileNumber(6362847755L);
	   
	   isAccountCreated = netlify.createNetlifyAccount(userFour);
	   System.out.println("The netlifyAccount is created : " + isAccountCreated);
	   netlify.getNetlifyDetails();

	   NetlifyAccount userFive = new NetlifyAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Ayushmann");
	   userFive.setLastName("Khurrana");
	   userFive.setPassword("Ayush@2026");
	   userFive.setEmailId("ayush.k@gmail.com");
	   userFive.setTeamName("Vicky-Donor-Web");
	   userFive.setMobileNumber(9900228833L);
	   
	   isAccountCreated = netlify.createNetlifyAccount(userFive);
	   System.out.println("The netlifyAccount is created : " + isAccountCreated);
	   netlify.getNetlifyDetails();
	   
   }

}