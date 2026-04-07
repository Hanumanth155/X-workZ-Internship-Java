public class FacebookAccount{

   private int userId;
   private String firstName;
   private String lastName;
   private String password;
   private String emailId;
   private String dateOfBirth;
   private long mobileNumber;
   
   public void setUserId(int userId){
     this.userId=userId;
   }
   
   public int getUserId(){
     return this.userId;
   }
   
   public void setFirstName(String firstName){
     this.firstName=firstName;
   }
   
   public String getFirstName(){
     return this.firstName;
   }
   
   public void setLastName(String lastName){
     this.lastName=lastName;
   }
   
   public String getLastName(){
     return this.lastName;
   }
   
   public void setPassword(String password){
     this.password=password;
   }
   
   public String getPassword(){
     return this.password;
   }
   
   public void setEmailId(String emailId){
     this.emailId=emailId;
   }
   
   public String getEmailId(){
     return this.emailId;
   }
   
   public void setDateOfBirth(String dateOfBirth){
     this.dateOfBirth=dateOfBirth;
   }
   
   public String getDateOfBirth(){
     return this.dateOfBirth;
   }
   
   public void setMobileNumber(long mobileNumber){
     this.mobileNumber=mobileNumber;
   }
   
   public long getMobileNumber(){
     return this.mobileNumber;
   }

}