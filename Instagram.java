class Instagram{

   InstagramAccount instagramAccount;
   
   public boolean createInstagramAccount(InstagramAccount instagramAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFullNameValid = false;
   boolean isUsernameValid = false;
   boolean isPasswordValid = false;
   boolean isEmailValid = false;
   boolean isBioValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = instagramAccount.getUserId();
   String fullName = instagramAccount.getFullName();
   String username = instagramAccount.getUsername();
   String password = instagramAccount.getPassword();
   String email = instagramAccount.getEmail();
   String bio = instagramAccount.getBio();
   long mobileNumber = instagramAccount.getMobileNumber();
   
   if(userId > 0 ){
	  isUserIdValid = true;
   }
   if(fullName!=null && !fullName.isEmpty()){
	   isFullNameValid = true;
   }
   if(username!=null && !username.isEmpty()){
	   isUsernameValid = true;
   }
   if(password!=null&&!password.isEmpty()){
	   isPasswordValid= true;
   }
   if(email!=null && !email.isEmpty()){
	   isEmailValid = true;
   }
   if(bio!=null && !bio.isEmpty()){
	   isBioValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFullNameValid&&isUsernameValid&&isPasswordValid&&isEmailValid&&isBioValid&&isMobileNumberValid){
	   this.instagramAccount = instagramAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getInstagramDetails(){
	   System.out.println("The User Id is : " + instagramAccount.getUserId());
	   System.out.println("The fullName is : " + instagramAccount.getFullName());
	   System.out.println("The username is : " + instagramAccount.getUsername());
	   System.out.println("The password is : " + instagramAccount.getPassword());
	   System.out.println("The email is : " + instagramAccount.getEmail());
	   System.out.println("The bio is : " + instagramAccount.getBio());
	   System.out.println("The mobileNumber is : " + instagramAccount.getMobileNumber());
   }
}