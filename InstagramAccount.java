public class InstagramAccount{

   private int userId;
   private String fullName;
   private String username;
   private String password;
   private String email;
   private String bio;
   private long mobileNumber;
   
   public void setUserId(int userId){
     this.userId=userId;
   }
   
   public int getUserId(){
     return this.userId;
   }
   
   public void setFullName(String fullName){
     this.fullName=fullName;
   }
   
   public String getFullName(){
     return this.fullName;
   }
   
   public void setUsername(String username){
     this.username=username;
   }
   
   public String getUsername(){
     return this.username;
   }
   
   public void setPassword(String password){
     this.password=password;
   }
   
   public String getPassword(){
     return this.password;
   }
   
   public void setEmail(String email){
     this.email=email;
   }
   
   public String getEmail(){
     return this.email;
   }
   
   public void setBio(String bio){
     this.bio=bio;
   }
   
   public String getBio(){
     return this.bio;
   }
   
   public void setMobileNumber(long mobileNumber){
     this.mobileNumber=mobileNumber;
   }
   
   public long getMobileNumber(){
     return this.mobileNumber;
   }

}