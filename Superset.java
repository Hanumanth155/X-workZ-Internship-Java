class Superset{

   SupersetAccount supersetAccount;
   
   public boolean createSupersetAccount(SupersetAccount supersetAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isOrganizationNameValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = supersetAccount.getUserId();
   String firstName = supersetAccount.getFirstName();
   String lastName = supersetAccount.getLastName();
   String password = supersetAccount.getPassword();
   String emailId = supersetAccount.getEmailId();
   String organizationName = supersetAccount.getOrganizationName();
   long mobileNumber = supersetAccount.getMobileNumber();
   
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
   if(organizationName!=null && !organizationName.isEmpty()){
	   isOrganizationNameValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isOrganizationNameValid&&isMobileNumberValid){
	   this.supersetAccount = supersetAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getSupersetDetails(){
	   System.out.println("The User Id is : " + supersetAccount.getUserId());
	   System.out.println("The firstName is : " + supersetAccount.getFirstName());
	   System.out.println("The lastName is : " + supersetAccount.getLastName());
	   System.out.println("The password is : " + supersetAccount.getPassword());
	   System.out.println("The emailId is : " + supersetAccount.getEmailId());
	   System.out.println("The organizationName is : " + supersetAccount.getOrganizationName());
	   System.out.println("The mobileNumber is : " + supersetAccount.getMobileNumber());
   }
}