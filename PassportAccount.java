public class PassportAccount{

   private int userId;
   private String firstName;
   private String lastName;
   private String dateOfBirth;
   private String address;
   private String nationality;
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
   
   public void setDateOfBirth(String dateOfBirth){
     this.dateOfBirth=dateOfBirth;
   }
   
   public String getDateOfBirth(){
     return this.dateOfBirth;
   }
   
   public void setAddress(String address){
     this.address=address;
   }
   
   public String getAddress(){
     return this.address;
   }
   
   public void setNationality(String nationality){
     this.nationality=nationality;
   }
   
   public String getNationality(){
     return this.nationality;
   }
   
   public void setMobileNumber(long mobileNumber){
     this.mobileNumber=mobileNumber;
   }
   
   public long getMobileNumber(){
     return this.mobileNumber;
   }

}