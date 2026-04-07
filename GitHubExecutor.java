class GitHubExecutor{

   public static void main(String[] a){
	   
	   GitHub gitHub = new GitHub();
	   
	   GitHubAccount userOne = new GitHubAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Pavan");
	   userOne.setLastName("Kalyan");
	   userOne.setUsername("pavan-developer");
	   userOne.setPassword("Pavan@GitHub");
	   userOne.setEmailId("pavan.k@gmail.com");
	   userOne.setMobileNumber(9480112233L);
	   
	   boolean isAccountCreated = gitHub.createGitHubAccount(userOne);
	   System.out.println("The gitHubAccount is created : " + isAccountCreated);
	   gitHub.getGitHubDetails();
	   
	   GitHubAccount userTwo = new GitHubAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Deepika");
	   userTwo.setLastName("Padukone");
	   userTwo.setUsername("deepika-codes");
	   userTwo.setPassword("Deepika@123");
	   userTwo.setEmailId("deepika.p@gmail.com");
	   userTwo.setMobileNumber(8123445566L);
	   
	   isAccountCreated = gitHub.createGitHubAccount(userTwo);
	   System.out.println("The gitHubAccount is created : " + isAccountCreated);
	   gitHub.getGitHubDetails();

	   GitHubAccount userThree = new GitHubAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Mahesh");
	   userThree.setLastName("Babu");
	   userThree.setUsername("mahesh-java-pro");
	   userThree.setPassword("Mahesh@456");
	   userThree.setEmailId("mahesh.b@gmail.com");
	   userThree.setMobileNumber(7766113355L);
	   
	   isAccountCreated = gitHub.createGitHubAccount(userThree);
	   System.out.println("The gitHubAccount is created : " + isAccountCreated);
	   gitHub.getGitHubDetails();

	   GitHubAccount userFour = new GitHubAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Rashmika");
	   userFour.setLastName("Mandanna");
	   userFour.setUsername("rashmika-git");
	   userFour.setPassword("Rashmika@789");
	   userFour.setEmailId("rashmika.m@gmail.com");
	   userFour.setMobileNumber(6362001122L);
	   
	   isAccountCreated = gitHub.createGitHubAccount(userFour);
	   System.out.println("The gitHubAccount is created : " + isAccountCreated);
	   gitHub.getGitHubDetails();

	   GitHubAccount userFive = new GitHubAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Yash");
	   userFive.setLastName("Rocky");
	   userFive.setUsername("yash-kgf-dev");
	   userFive.setPassword("Yash@2026");
	   userFive.setEmailId("yash.rocky@gmail.com");
	   userFive.setMobileNumber(9900881177L);
	   
	   isAccountCreated = gitHub.createGitHubAccount(userFive);
	   System.out.println("The gitHubAccount is created : " + isAccountCreated);
	   gitHub.getGitHubDetails();
	   
   }

}