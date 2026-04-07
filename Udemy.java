class Udemy{

   UdemyAccount udemyAccount;
   
   public boolean createUdemyAccount(UdemyAccount udemyAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isCategoryValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = udemyAccount.getUserId();
   String firstName = udemyAccount.getFirstName();
   String lastName = udemyAccount.getLastName();
   String password = udemyAccount.getPassword();
   String emailId = udemyAccount.getEmailId();
   String interestedCategory = udemyAccount.getInterestedCategory();
   long mobileNumber = udemyAccount.getMobileNumber();
   
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
   if(interestedCategory!=null && !interestedCategory.isEmpty()){
	   isCategoryValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isCategoryValid&&isMobileNumberValid){
	   this.udemyAccount = udemyAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getUdemyDetails(){
	   System.out.println("The User Id is : " + udemyAccount.getUserId());
	   System.out.println("The firstName is : " + udemyAccount.getFirstName());
	   System.out.println("The lastName is : " + udemyAccount.getLastName());
	   System.out.println("The password is : " + udemyAccount.getPassword());
	   System.out.println("The emailId is : " + udemyAccount.getEmailId());
	   System.out.println("The interestedCategory is : " + udemyAccount.getInterestedCategory());
	   System.out.println("The mobileNumber is : " + udemyAccount.getMobileNumber());
   }
}