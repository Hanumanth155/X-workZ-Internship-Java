class Figma{

   FigmaAccount figmaAccount;
   
   public boolean createFigmaAccount(FigmaAccount figmaAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isToolNameValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = figmaAccount.getUserId();
   String firstName = figmaAccount.getFirstName();
   String lastName = figmaAccount.getLastName();
   String password = figmaAccount.getPassword();
   String emailId = figmaAccount.getEmailId();
   String toolName = figmaAccount.getToolName();
   long mobileNumber = figmaAccount.getMobileNumber();
   
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
   if(toolName!=null && !toolName.isEmpty()){
	   isToolNameValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isToolNameValid&&isMobileNumberValid){
	   this.figmaAccount = figmaAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getFigmaDetails(){
	   System.out.println("The User Id is : " + figmaAccount.getUserId());
	   System.out.println("The firstName is : " + figmaAccount.getFirstName());
	   System.out.println("The lastName is : " + figmaAccount.getLastName());
	   System.out.println("The password is : " + figmaAccount.getPassword());
	   System.out.println("The emailId is : " + figmaAccount.getEmailId());
	   System.out.println("The toolName is : " + figmaAccount.getToolName());
	   System.out.println("The mobileNumber is : " + figmaAccount.getMobileNumber());
   }
}