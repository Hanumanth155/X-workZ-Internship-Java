class Facebook{

   FacebookAccount facebookAccount;
   
   public boolean createFacebookAccount(FacebookAccount facebookAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isDateOfBirthValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = facebookAccount.getUserId();
   String firstName = facebookAccount.getFirstName();
   String lastName = facebookAccount.getLastName();
   String password = facebookAccount.getPassword();
   String emailId = facebookAccount.getEmailId();
   String dateOfBirth = facebookAccount.getDateOfBirth();
   long mobileNumber = facebookAccount.getMobileNumber();
   
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
   if(dateOfBirth!=null && !dateOfBirth.isEmpty()){
	   isDateOfBirthValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isDateOfBirthValid&&isMobileNumberValid){
	   this.facebookAccount = facebookAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getFacebookDetails(){
	   System.out.println("The User Id is : " + facebookAccount.getUserId());
	   System.out.println("The firstName is : " + facebookAccount.getFirstName());
	   System.out.println("The lastName is : " + facebookAccount.getLastName());
	   System.out.println("The password is : " + facebookAccount.getPassword());
	   System.out.println("The emailId is : " + facebookAccount.getEmailId());
	   System.out.println("The dateOfBirth is : " + facebookAccount.getDateOfBirth());
	   System.out.println("The mobileNumber is : " + facebookAccount.getMobileNumber());
   }
}