class Amazon{

   UserAccount userAccount;
   
   public boolean createUserAccount(UserAccount userAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isGenderValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = userAccount.getUserId();
   String firstName = userAccount.getFirstName();
   String lastName = userAccount.getLastName();
   String password = userAccount.getPassword();
   String emailId = userAccount.getEmailId();
   String gender = userAccount.getGender();
   long mobileNumber = userAccount.getMobileNumber();
   
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
   if(gender!=null && !gender.isEmpty()){
	   isGenderValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isGenderValid&&isMobileNumberValid){
	   this.userAccount = userAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getUserDetails(){
	   System.out.println("The User Id is : " + userAccount.getUserId());
	   System.out.println("The firstName is : " + userAccount.getFirstName());
	   System.out.println("The lastName is : " + userAccount.getLastName());
	   System.out.println("The password is : " + userAccount.getPassword());
	   System.out.println("The emailId is : " + userAccount.getEmailId());
	   System.out.println("The gender is : " + userAccount.getGender());
	   System.out.println("The mobileNumber is : " + userAccount.getMobileNumber());
   }
}