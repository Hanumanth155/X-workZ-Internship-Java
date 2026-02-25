class InstagramExecutor{



    public static void main(String[] args){
	
	String password = "Abc@123";
	String email = "hanumanth@gmail.com";
	Long mobileNumber = 6362849372l;
	
	Instagram.createAccount(email,password);
	Instagram.createAccount(mobileNumber,password);
	
	}



}