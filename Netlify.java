class Netlify{

   NetlifyAccount netlifyAccount;
   
   public boolean createNetlifyAccount(NetlifyAccount netlifyAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailIdValid = false;
   boolean isTeamNameValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = netlifyAccount.getUserId();
   String firstName = netlifyAccount.getFirstName();
   String lastName = netlifyAccount.getLastName();
   String password = netlifyAccount.getPassword();
   String emailId = netlifyAccount.getEmailId();
   String teamName = netlifyAccount.getTeamName();
   long mobileNumber = netlifyAccount.getMobileNumber();
   
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
   if(teamName!=null && !teamName.isEmpty()){
	   isTeamNameValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isPasswordValid&&isEmailIdValid&&isTeamNameValid&&isMobileNumberValid){
	   this.netlifyAccount = netlifyAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getNetlifyDetails(){
	   System.out.println("The User Id is : " + netlifyAccount.getUserId());
	   System.out.println("The firstName is : " + netlifyAccount.getFirstName());
	   System.out.println("The lastName is : " + netlifyAccount.getLastName());
	   System.out.println("The password is : " + netlifyAccount.getPassword());
	   System.out.println("The emailId is : " + netlifyAccount.getEmailId());
	   System.out.println("The teamName is : " + netlifyAccount.getTeamName());
	   System.out.println("The mobileNumber is : " + netlifyAccount.getMobileNumber());
   }
}