class Vercel{

   VercelAccount vercelAccount;
   
   public boolean createVercelAccount(VercelAccount vercelAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isProjectNameValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = vercelAccount.getUserId();
   String firstName = vercelAccount.getFirstName();
   String lastName = vercelAccount.getLastName();
   String password = vercelAccount.getPassword();
   String emailId = vercelAccount.getEmailId();
   String projectName = vercelAccount.getProjectName();
   long mobileNumber = vercelAccount.getMobileNumber();
   
   if(userId > 0 ){
	  isUserIdValid = true;
   }
   if(firstName!=null && !firstName.isEmpty()){
	   isFirstNameValid = true;
   }
   if(lastName!=null && !lastName.isEmpty()){
	   isLastNameValid = true;
   }
   if(password!=null&&!password.isEmpty()){
	   isPasswordValid= true;
   }
   if(emailId!=null && !emailId.isEmpty()){
	   isEmailIdValid = true;
   }
   if(projectName!=null && !projectName.isEmpty()){
	   isProjectNameValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isProjectNameValid&&isMobileNumberValid){
	   this.vercelAccount = vercelAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getVercelDetails(){
	   System.out.println("The User Id is : " + vercelAccount.getUserId());
	   System.out.println("The firstName is : " + vercelAccount.getFirstName());
	   System.out.println("The lastName is : " + vercelAccount.getLastName());
	   System.out.println("The password is : " + vercelAccount.getPassword());
	   System.out.println("The emailId is : " + vercelAccount.getEmailId());
	   System.out.println("The projectName is : " + vercelAccount.getProjectName());
	   System.out.println("The mobileNumber is : " + vercelAccount.getMobileNumber());
   }
}