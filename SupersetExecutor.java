class SupersetExecutor{

   public static void main(String[] a){
	   
	   Superset superset = new Superset();
	   
	   SupersetAccount userOne = new SupersetAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Chetan");
	   userOne.setLastName("Kumar");
	   userOne.setPassword("Chetan@123");
	   userOne.setEmailId("chetan.k@gmail.com");
	   userOne.setOrganizationName("VTU University");
	   userOne.setMobileNumber(9876543210L);
	   
	   boolean isAccountCreated = superset.createSupersetAccount(userOne);
	   System.out.println("The supersetAccount is created : " + isAccountCreated);
	   superset.getSupersetDetails();
	   
	   SupersetAccount userTwo = new SupersetAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Rashmi");
	   userTwo.setLastName("M");
	   userTwo.setPassword("Rashmi@456");
	   userTwo.setEmailId("rashmi.m@gmail.com");
	   userTwo.setOrganizationName("JNNCE College");
	   userTwo.setMobileNumber(8123456789L);
	   
	   isAccountCreated = superset.createSupersetAccount(userTwo);
	   System.out.println("The supersetAccount is created : " + isAccountCreated);
	   superset.getSupersetDetails();

	   SupersetAccount userThree = new SupersetAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Ganesh");
	   userThree.setLastName("Hegde");
	   userThree.setPassword("Ganesh@789");
	   userThree.setEmailId("ganesh.h@gmail.com");
	   userThree.setOrganizationName("BMSIT Bangalore");
	   userThree.setMobileNumber(7766112233L);
	   
	   isAccountCreated = superset.createSupersetAccount(userThree);
	   System.out.println("The supersetAccount is created : " + isAccountCreated);
	   superset.getSupersetDetails();

	   SupersetAccount userFour = new SupersetAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Nayana");
	   userFour.setLastName("V");
	   userFour.setPassword("Nayana@101");
	   userFour.setEmailId("nayana.v@gmail.com");
	   userFour.setOrganizationName("RV College");
	   userFour.setMobileNumber(6362840011L);
	   
	   isAccountCreated = superset.createSupersetAccount(userFour);
	   System.out.println("The supersetAccount is created : " + isAccountCreated);
	   superset.getSupersetDetails();

	   SupersetAccount userFive = new SupersetAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Darshan");
	   userFive.setLastName("S");
	   userFive.setPassword("Darshan@202");
	   userFive.setEmailId("darshan.s@gmail.com");
	   userFive.setOrganizationName("PES Institute");
	   userFive.setMobileNumber(9110887766L);
	   
	   isAccountCreated = superset.createSupersetAccount(userFive);
	   System.out.println("The supersetAccount is created : " + isAccountCreated);
	   superset.getSupersetDetails();
	   
   }

}