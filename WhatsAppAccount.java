public class WhatsAppAccount{

   private int userId;
   private String userName;
   private String status;
   private String profilePictureUrl;
   private String emailId;
   private String lastSeen;
   private long mobileNumber;
   
   public void setUserId(int userId){
     this.userId=userId;
   }
   
   public int getUserId(){
     return this.userId;
   }
   
   public void setUserName(String userName){
     this.userName=userName;
   }
   
   public String getUserName(){
     return this.userName;
   }
   
   public void setStatus(String status){
     this.status=status;
   }
   
   public String getStatus(){
     return this.status;
   }
   
   public void setProfilePictureUrl(String profilePictureUrl){
     this.profilePictureUrl=profilePictureUrl;
   }
   
   public String getProfilePictureUrl(){
     return this.profilePictureUrl;
   }
   
   public void setEmailId(String emailId){
     this.emailId=emailId;
   }
   
   public String getEmailId(){
     return this.emailId;
   }
   
   public void setLastSeen(String lastSeen){
     this.lastSeen=lastSeen;
   }
   
   public String getLastSeen(){
     return this.lastSeen;
   }
   
   public void setMobileNumber(long mobileNumber){
     this.mobileNumber=mobileNumber;
   }
   
   public long getMobileNumber(){
     return this.mobileNumber;
   }

}