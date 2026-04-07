class Latex{

   LatexAccount latexAccount;
   
   public boolean createLatexAccount(LatexAccount latexAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isDocumentValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = latexAccount.getUserId();
   String firstName = latexAccount.getFirstName();
   String lastName = latexAccount.getLastName();
   String password = latexAccount.getPassword();
   String emailId = latexAccount.getEmailId();
   String documentName = latexAccount.getDocumentName();
   long mobileNumber = latexAccount.getMobileNumber();
   
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
   if(documentName!=null && !documentName.isEmpty()){
	   isDocumentValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isDocumentValid&&isMobileNumberValid){
	   this.latexAccount = latexAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getLatexDetails(){
	   System.out.println("The User Id is : " + latexAccount.getUserId());
	   System.out.println("The firstName is : " + latexAccount.getFirstName());
	   System.out.println("The lastName is : " + latexAccount.getLastName());
	   System.out.println("The password is : " + latexAccount.getPassword());
	   System.out.println("The emailId is : " + latexAccount.getEmailId());
	   System.out.println("The documentName is : " + latexAccount.getDocumentName());
	   System.out.println("The mobileNumber is : " + latexAccount.getMobileNumber());
   }
}