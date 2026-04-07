class VTUInternship{

   VTUInternshipAccount vtuInternshipAccount;
   
   public boolean createVTUInternshipAccount(VTUInternshipAccount vtuInternshipAccount){
   boolean isAccountCreated = false;
   boolean isUserIdValid = false;
   boolean isFirstNameValid = false;
   boolean isLastNameValid = false;
   boolean isUSNValid = false;
   boolean isEmailIdValid = false;
   boolean isCollegeNameValid = false;
   boolean isMobileNumberValid = false;
   
   int userId = vtuInternshipAccount.getUserId();
   String firstName = vtuInternshipAccount.getFirstName();
   String lastName = vtuInternshipAccount.getLastName();
   String universitySeatNumber = vtuInternshipAccount.getUniversitySeatNumber();
   String emailId = vtuInternshipAccount.getEmailId();
   String collegeName = vtuInternshipAccount.getCollegeName();
   long mobileNumber = vtuInternshipAccount.getMobileNumber();
   
   if(userId > 0 ){
	  isUserIdValid = true;
   }
   if(firstName!=null && !firstName.isEmpty()){
	   isFirstNameValid = true;
   }
   if(lastName!=null && !lastName.isEmpty()){
	   isLastNameValid = true;
   }
   if(universitySeatNumber!=null&&!universitySeatNumber.isEmpty()){
	   isUSNValid= true;
   }
   if(emailId!=null && !emailId.isEmpty()){
	   isEmailIdValid = true;
   }
   if(collegeName!=null && !collegeName.isEmpty()){
	   isCollegeNameValid = true;
   }
   if(mobileNumber>0){
	   isMobileNumberValid = true;
   }
   
   if(isUserIdValid&&isFirstNameValid&&isLastNameValid&&isUSNValid&&isEmailIdValid&&isCollegeNameValid&&isMobileNumberValid){
	   this.vtuInternshipAccount = vtuInternshipAccount;
	   isAccountCreated=true;
   }
   
   return isAccountCreated;
   }
   
   public void getVTUInternshipDetails(){
	   System.out.println("The User Id is : " + vtuInternshipAccount.getUserId());
	   System.out.println("The firstName is : " + vtuInternshipAccount.getFirstName());
	   System.out.println("The lastName is : " + vtuInternshipAccount.getLastName());
	   System.out.println("The USN is : " + vtuInternshipAccount.getUniversitySeatNumber());
	   System.out.println("The emailId is : " + vtuInternshipAccount.getEmailId());
	   System.out.println("The collegeName is : " + vtuInternshipAccount.getCollegeName());
	   System.out.println("The mobileNumber is : " + vtuInternshipAccount.getMobileNumber());
   }
}