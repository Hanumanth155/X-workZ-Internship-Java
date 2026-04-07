class VTUInternshipExecutor{

   public static void main(String[] a){
	   
	   VTUInternship portal = new VTUInternship();
	   
	   VTUInternshipAccount userOne = new VTUInternshipAccount();
	   userOne.setUserId(1);
	   userOne.setFirstName("Hanumanth");
	   userOne.setLastName("Gouda");
	   userOne.setUniversitySeatNumber("1VZ22EC001");
	   userOne.setEmailId("hanumanth.g@gmail.com");
	   userOne.setCollegeName("VTU University");
	   userOne.setMobileNumber(6362849028L);
	   
	   boolean isAccountCreated = portal.createVTUInternshipAccount(userOne);
	   System.out.println("The vtuInternshipAccount is created : " + isAccountCreated);
	   portal.getVTUInternshipDetails();
	   
	   VTUInternshipAccount userTwo = new VTUInternshipAccount();
	   userTwo.setUserId(2);
	   userTwo.setFirstName("Sushmitha");
	   userTwo.setLastName("Rai");
	   userTwo.setUniversitySeatNumber("4BD22CS045");
	   userTwo.setEmailId("sush.rai@gmail.com");
	   userTwo.setCollegeName("BIET Davangere");
	   userTwo.setMobileNumber(9123456780L);
	   
	   isAccountCreated = portal.createVTUInternshipAccount(userTwo);
	   System.out.println("The vtuInternshipAccount is created : " + isAccountCreated);
	   portal.getVTUInternshipDetails();

	   VTUInternshipAccount userThree = new VTUInternshipAccount();
	   userThree.setUserId(3);
	   userThree.setFirstName("Karthik");
	   userThree.setLastName("Nayaka");
	   userThree.setUniversitySeatNumber("2GI21ME012");
	   userThree.setEmailId("karthik.n@gmail.com");
	   userThree.setCollegeName("GIT Belagavi");
	   userThree.setMobileNumber(8877661122L);
	   
	   isAccountCreated = portal.createVTUInternshipAccount(userThree);
	   System.out.println("The vtuInternshipAccount is created : " + isAccountCreated);
	   portal.getVTUInternshipDetails();

	   VTUInternshipAccount userFour = new VTUInternshipAccount();
	   userFour.setUserId(4);
	   userFour.setFirstName("Meena");
	   userFour.setLastName("Kumari");
	   userFour.setUniversitySeatNumber("3VC23IS088");
	   userFour.setEmailId("meena.k@gmail.com");
	   userFour.setCollegeName("VVIET Mysore");
	   userFour.setMobileNumber(7766554433L);
	   
	   isAccountCreated = portal.createVTUInternshipAccount(userFour);
	   System.out.println("The vtuInternshipAccount is created : " + isAccountCreated);
	   portal.getVTUInternshipDetails();

	   VTUInternshipAccount userFive = new VTUInternshipAccount();
	   userFive.setUserId(5);
	   userFive.setFirstName("Sunil");
	   userFive.setLastName("Prasad");
	   userFive.setUniversitySeatNumber("1RN22CV034");
	   userFive.setEmailId("sunil.p@gmail.com");
	   userFive.setCollegeName("RNSIT Bangalore");
	   userFive.setMobileNumber(9900223344L);
	   
	   isAccountCreated = portal.createVTUInternshipAccount(userFive);
	   System.out.println("The vtuInternshipAccount is created : " + isAccountCreated);
	   portal.getVTUInternshipDetails();
	   
   }

}