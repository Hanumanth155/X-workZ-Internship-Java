class Abhibus{

   AbhibusAccount abhibusAccount;
   
   public boolean createAbhibusAccount(AbhibusAccount abhibusAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isSourceValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = abhibusAccount.getUserId();
   String firstName = abhibusAccount.getFirstName();
   String lastName = abhibusAccount.getLastName();
   String password = abhibusAccount.getPassword();
   String emailId = abhibusAccount.getEmailId();
   String source = abhibusAccount.getSource();
   long mobileNumber = abhibusAccount.getMobileNumber();
   
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
   if(source!=null && !source.isEmpty()){
	   isSourceValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isSourceValid&&isMobileNumberValid){
	   this.abhibusAccount = abhibusAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getAbhibusDetails(){
	   System.out.println("The User Id is : " + abhibusAccount.getUserId());
	   System.out.println("The firstName is : " + abhibusAccount.getFirstName());
	   System.out.println("The lastName is : " + abhibusAccount.getLastName());
	   System.out.println("The password is : " + abhibusAccount.getPassword());
	   System.out.println("The emailId is : " + abhibusAccount.getEmailId());
	   System.out.println("The source is : " + abhibusAccount.getSource());
	   System.out.println("The mobileNumber is : " + abhibusAccount.getMobileNumber());
   }
}