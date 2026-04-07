class Passport{

   PassportAccount passportAccount;
   
   public boolean createPassportAccount(PassportAccount passportAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isDateOfBirthValid = false;
   boolean isAddressValid = false;
   boolean isNationalityValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = passportAccount.getUserId();
   String firstName = passportAccount.getFirstName();
   String lastName = passportAccount.getLastName();
   String dateOfBirth = passportAccount.getDateOfBirth();
   String address = passportAccount.getAddress();
   String nationality = passportAccount.getNationality();
   long mobileNumber = passportAccount.getMobileNumber();
   
   if(userId > 0 ){
	  isUserIdValid = true;
   }
   if(firstName!=null && !firstName.isEmpty()){
	   isFirstNameValid = true;
   }
   if(lastName!=null && !lastName.isEmpty()){
	   isLastNameValid = true;
   }
   if(dateOfBirth!=null&&!dateOfBirth.isEmpty()){
	   isDateOfBirthValid= true;
   }
   if(address!=null && !address.isEmpty()){
	   isAddressValid = true;
   }
   if(nationality!=null && !nationality.isEmpty()){
	   isNationalityValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isDateOfBirthValid&&isAddressValid&&isNationalityValid&&isMobileNumberValid){
	   this.passportAccount = passportAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getPassportDetails(){
	   System.out.println("The User Id is : " + passportAccount.getUserId());
	   System.out.println("The firstName is : " + passportAccount.getFirstName());
	   System.out.println("The lastName is : " + passportAccount.getLastName());
	   System.out.println("The dateOfBirth is : " + passportAccount.getDateOfBirth());
	   System.out.println("The address is : " + passportAccount.getAddress());
	   System.out.println("The nationality is : " + passportAccount.getNationality());
	   System.out.println("The mobileNumber is : " + passportAccount.getMobileNumber());
   }
}