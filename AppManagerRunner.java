class AppManagerRunner{

public static void main(String []args){

String appName = "BGMI";
AppManager appManager = new AppManager();
boolean isNameAdded = appManager.addAppName(appName);
System.out.println("App name " +appName +" is added "+ isNameAdded);
appName = "Google Pay";
isNameAdded = appManager.addAppName(appName);
System.out.println("App name " +appName +" is added "+ isNameAdded);

appName = "Dominos Pizza";
isNameAdded = appManager.addAppName(appName);
System.out.println("App name " +appName+ " is added "+ isNameAdded);

appName = "Book Myshow";
isNameAdded = appManager.addAppName(appName);
System.out.println("App name " +appName+ " is added "+ isNameAdded);

appManager.getAppNames();


}
}