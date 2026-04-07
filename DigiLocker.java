class DigiLocker{

   DigiLockerAccount digiLockerAccount;
   
   public boolean createDigiLockerAccount(DigiLockerAccount digiLockerAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isAadhaarValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = digiLockerAccount.getUserId();
   String firstName = digiLockerAccount.getFirstName();
   String lastName = digiLockerAccount.getLastName();
   String password = digiLockerAccount.getPassword();
   String emailId = digiLockerAccount.getEmailId();
   String aadhaarNumber = digiLockerAccount.getAadhaarNumber();
   long mobileNumber = digiLockerAccount.getMobileNumber();
   
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
   if(aadhaarNumber!=null && !aadhaarNumber.isEmpty()){
	   isAadhaarValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isAadhaarValid&&isMobileNumberValid){
	   this.digiLockerAccount = digiLockerAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getDigiLockerDetails(){
	   System.out.println("The User Id is : " + digiLockerAccount.getUserId());
	   System.out.println("The firstName is : " + digiLockerAccount.getFirstName());
	   System.out.println("The lastName is : " + digiLockerAccount.getLastName());
	   System.out.println("The password is : " + digiLockerAccount.getPassword());
	   System.out.println("The emailId is : " + digiLockerAccount.getEmailId());
	   System.out.println("The aadhaarNumber is : " + digiLockerAccount.getAadhaarNumber());
	   System.out.println("The mobileNumber is : " + digiLockerAccount.getMobileNumber());
   }
}