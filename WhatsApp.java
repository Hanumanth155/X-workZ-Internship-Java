class WhatsApp{

   WhatsAppAccount whatsAppAccount;
   
   public boolean createWhatsAppAccount(WhatsAppAccount whatsAppAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isUserNameValid = false;
   boolean isStatusValid = false;
   boolean isProfilePictureUrlValid = false;
   boolean isEmailIdValid = false;
   boolean isLastSeenValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = whatsAppAccount.getUserId();
   String userName = whatsAppAccount.getUserName();
   String status = whatsAppAccount.getStatus();
   String profilePictureUrl = whatsAppAccount.getProfilePictureUrl();
   String emailId = whatsAppAccount.getEmailId();
   String lastSeen = whatsAppAccount.getLastSeen();
   long mobileNumber = whatsAppAccount.getMobileNumber();
   
   if(userId > 0 ){
	  isUserIdValid = true;
   }
   if(userName!=null && !userName.isEmpty()){
	   isUserNameValid = true;
   }
   if(status!=null && !status.isEmpty()){
	   isStatusValid = true;
   }
   if(profilePictureUrl!=null&&!profilePictureUrl.isEmpty()){
	   isProfilePictureUrlValid= true;
   }
   if(emailId!=null && !emailId.isEmpty()){
	   isEmailIdValid = true;
   }
   if(lastSeen!=null && !lastSeen.isEmpty()){
	   isLastSeenValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isUserNameValid&&isStatusValid&&isProfilePictureUrlValid&&isEmailIdValid&&isLastSeenValid&&isMobileNumberValid){
	   this.whatsAppAccount = whatsAppAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getWhatsAppDetails(){
	   System.out.println("The User Id is : " + whatsAppAccount.getUserId());
	   System.out.println("The userName is : " + whatsAppAccount.getUserName());
	   System.out.println("The status is : " + whatsAppAccount.getStatus());
	   System.out.println("The profilePictureUrl is : " + whatsAppAccount.getProfilePictureUrl());
	   System.out.println("The emailId is : " + whatsAppAccount.getEmailId());
	   System.out.println("The lastSeen is : " + whatsAppAccount.getLastSeen());
	   System.out.println("The mobileNumber is : " + whatsAppAccount.getMobileNumber());
   }
}