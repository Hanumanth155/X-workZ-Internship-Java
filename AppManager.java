class AppManager{

private String appNames[] = new String[4];
int index ;

public boolean addAppName(String appName){
boolean isAppNameAdded = false;
if(appName != null && !appName.isEmpty()){
 appNames[index] =appName ;
 index++;
 isAppNameAdded =true;
  
}else{
System.out.println("Enter valid App Name");
}
return isAppNameAdded;

}
public void getAppNames(){
	for(String appName :appNames)
		System.out.println(appName);
	
	
	
}

}