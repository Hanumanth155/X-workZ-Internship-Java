class InstagramExecutor{

   public static void main(String[] a){
	   
	   Instagram instagram = new Instagram();
	   
	   InstagramAccount userOne = new InstagramAccount();
	   userOne.setUserId(1);
	   userOne.setFullName("Rahul Sharma");
	   userOne.setUsername("rahul_sharma_99");
	   userOne.setPassword("Rahul@123");
	   userOne.setEmail("rahul.s@gmail.com");
	   userOne.setBio("Traveler | Foodie");
	   userOne.setMobileNumber(9886012345L);
	   
	   boolean isAccountCreated = instagram.createInstagramAccount(userOne);
	   System.out.println("The instagramAccount is created : " + isAccountCreated);
	   instagram.getInstagramDetails();
	   
	   InstagramAccount userTwo = new InstagramAccount();
	   userTwo.setUserId(2);
	   userTwo.setFullName("Sneha Patil");
	   userTwo.setUsername("sneha_p_art");
	   userTwo.setPassword("Sneha@456");
	   userTwo.setEmail("sneha.patil@gmail.com");
	   userTwo.setBio("Artist | Dreamer");
	   userTwo.setMobileNumber(9845098765L);
	   
	   isAccountCreated = instagram.createInstagramAccount(userTwo);
	   System.out.println("The instagramAccount is created : " + isAccountCreated);
	   instagram.getInstagramDetails();

	   InstagramAccount userThree = new InstagramAccount();
	   userThree.setUserId(3);
	   userThree.setFullName("Vikram Singh");
	   userThree.setUsername("vicky_fit");
	   userThree.setPassword("Vicky@789");
	   userThree.setEmail("vicky.fitness@gmail.com");
	   userThree.setBio("Fitness Freak");
	   userThree.setMobileNumber(7760123456L);
	   
	   isAccountCreated = instagram.createInstagramAccount(userThree);
	   System.out.println("The instagramAccount is created : " + isAccountCreated);
	   instagram.getInstagramDetails();

	   InstagramAccount userFour = new InstagramAccount();
	   userFour.setUserId(4);
	   userFour.setFullName("Ananya Hegde");
	   userFour.setUsername("ananya_official");
	   userFour.setPassword("Ananya@101");
	   userFour.setEmail("ananya.h@gmail.com");
	   userFour.setBio("Classical Dancer");
	   userFour.setMobileNumber(8892055443L);
	   
	   isAccountCreated = instagram.createInstagramAccount(userFour);
	   System.out.println("The instagramAccount is created : " + isAccountCreated);
	   instagram.getInstagramDetails();

	   InstagramAccount userFive = new InstagramAccount();
	   userFive.setUserId(5);
	   userFive.setFullName("Deepak Gowda");
	   userFive.setUsername("deepak_gowda_dr");
	   userFive.setPassword("Deepak@202");
	   userFive.setEmail("deepak.g@gmail.com");
	   userFive.setBio("Nature Lover");
	   userFive.setMobileNumber(6362841122L);
	   
	   isAccountCreated = instagram.createInstagramAccount(userFive);
	   System.out.println("The instagramAccount is created : " + isAccountCreated);
	   instagram.getInstagramDetails();
	   
   }

}