class Canva{

   CanvaAccount canvaAccount;
   
   public boolean createCanvaAccount(CanvaAccount canvaAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isDesignTypeValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = canvaAccount.getUserId();
   String firstName = canvaAccount.getFirstName();
   String lastName = canvaAccount.getLastName();
   String password = canvaAccount.getPassword();
   String emailId = canvaAccount.getEmailId();
   String designType = canvaAccount.getDesignType();
   long mobileNumber = canvaAccount.getMobileNumber();
   
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
   if(designType!=null && !designType.isEmpty()){
	   isDesignTypeValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isDesignTypeValid&&isMobileNumberValid){
	   this.canvaAccount = canvaAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getCanvaDetails(){
	   System.out.println("The User Id is : " + canvaAccount.getUserId());
	   System.out.println("The firstName is : " + canvaAccount.getFirstName());
	   System.out.println("The lastName is : " + canvaAccount.getLastName());
	   System.out.println("The password is : " + canvaAccount.getPassword());
	   System.out.println("The emailId is : " + canvaAccount.getEmailId());
	   System.out.println("The designType is : " + canvaAccount.getDesignType());
	   System.out.println("The mobileNumber is : " + canvaAccount.getMobileNumber());
   }
}