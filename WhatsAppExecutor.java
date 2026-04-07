class WhatsAppExecutor{

   public static void main(String[] a){
	   
	   WhatsApp whatsApp = new WhatsApp();
	   
	   WhatsAppAccount userOne = new WhatsAppAccount();
	   userOne.setUserId(1);
	   userOne.setUserName("Sagar Naik");
	   userOne.setStatus("Hey there! I am using WhatsApp.");
	   userOne.setProfilePictureUrl("sagar_dp.jpg");
	   userOne.setEmailId("sagar.naik@gmail.com");
	   userOne.setLastSeen("Today at 10:30 AM");
	   userOne.setMobileNumber(9448011223L);
	   
	   boolean isAccountCreated = whatsApp.createWhatsAppAccount(userOne);
	   System.out.println("The whatsAppAccount is created : " + isAccountCreated);
	   whatsApp.getWhatsAppDetails();
	   
	   WhatsAppAccount userTwo = new WhatsAppAccount();
	   userTwo.setUserId(2);
	   userTwo.setUserName("Megha R");
	   userTwo.setStatus("Available");
	   userTwo.setProfilePictureUrl("megha_profile.png");
	   userTwo.setEmailId("megha.r@gmail.com");
	   userTwo.setLastSeen("Yesterday");
	   userTwo.setMobileNumber(8112233445L);
	   
	   isAccountCreated = whatsApp.createWhatsAppAccount(userTwo);
	   System.out.println("The whatsAppAccount is created : " + isAccountCreated);
	   whatsApp.getWhatsAppDetails();

	   WhatsAppAccount userThree = new WhatsAppAccount();
	   userThree.setUserId(3);
	   userThree.setUserName("Kiran Kumar");
	   userThree.setStatus("At Work");
	   userThree.setProfilePictureUrl("kiran_k.jpg");
	   userThree.setEmailId("kiran.kumar@gmail.com");
	   userThree.setLastSeen("Online");
	   userThree.setMobileNumber(7334455667L);
	   
	   isAccountCreated = whatsApp.createWhatsAppAccount(userThree);
	   System.out.println("The whatsAppAccount is created : " + isAccountCreated);
	   whatsApp.getWhatsAppDetails();

	   WhatsAppAccount userFour = new WhatsAppAccount();
	   userFour.setUserId(4);
	   userFour.setUserName("Shwetha");
	   userFour.setStatus("Busy");
	   userFour.setProfilePictureUrl("shwetha_img.jpg");
	   userFour.setEmailId("shwetha.s@gmail.com");
	   userFour.setLastSeen("Today at 08:15 AM");
	   userFour.setMobileNumber(6360011223L);
	   
	   isAccountCreated = whatsApp.createWhatsAppAccount(userFour);
	   System.out.println("The whatsAppAccount is created : " + isAccountCreated);
	   whatsApp.getWhatsAppDetails();

	   WhatsAppAccount userFive = new WhatsAppAccount();
	   userFive.setUserId(5);
	   userFive.setUserName("Vinay M");
	   userFive.setStatus("Sleeping");
	   userFive.setProfilePictureUrl("vinay_m.jpg");
	   userFive.setEmailId("vinay.m@gmail.com");
	   userFive.setLastSeen("Last seen 2 hours ago");
	   userFive.setMobileNumber(9900887766L);
	   
	   isAccountCreated = whatsApp.createWhatsAppAccount(userFive);
	   System.out.println("The whatsAppAccount is created : " + isAccountCreated);
	   whatsApp.getWhatsAppDetails();
	   
   }

}