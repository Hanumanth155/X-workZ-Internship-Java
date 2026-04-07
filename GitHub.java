class GitHub{

   GitHubAccount gitHubAccount;
   
   public boolean createGitHubAccount(GitHubAccount gitHubAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isUsernameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = gitHubAccount.getUserId();
   String firstName = gitHubAccount.getFirstName();
   String lastName = gitHubAccount.getLastName();
   String username = gitHubAccount.getUsername();
   String password = gitHubAccount.getPassword();
   String emailId = gitHubAccount.getEmailId();
   long mobileNumber = gitHubAccount.getMobileNumber();
   
   if(userId > 0 ){
	  isUserIdValid = true;
   }
   if(firstName!=null && !firstName.isEmpty()){
	   isFirstNameValid = true;
   }
   if(lastName!=null && !lastName.isEmpty()){
	   isLastNameValid = true;
   }
   if(username!=null && !username.isEmpty()){
	   isUsernameValid = true;
   }
   if(password!=null&&!password.isEmpty()){
	   isPasswordValid= true;
   }
   if(emailId!=null && !emailId.isEmpty()){
	   isEmailIdValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isUsernameValid&&isPasswordValid&&isEmailIdValid&&isMobileNumberValid){
	   this.gitHubAccount = gitHubAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getGitHubDetails(){
	   System.out.println("The User Id is : " + gitHubAccount.getUserId());
	   System.out.println("The firstName is : " + gitHubAccount.getFirstName());
	   System.out.println("The lastName is : " + gitHubAccount.getLastName());
	   System.out.println("The username is : " + gitHubAccount.getUsername());
	   System.out.println("The password is : " + gitHubAccount.getPassword());
	   System.out.println("The emailId is : " + gitHubAccount.getEmailId());
	   System.out.println("The mobileNumber is : " + gitHubAccount.getMobileNumber());
   }
}