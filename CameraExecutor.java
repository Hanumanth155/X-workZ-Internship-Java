class CameraExecutor {

    public static void main(String[] args) {

        boolean isCamera1  = Camera.createCamera("Canon","EOS",55000.00,24,true,"Black",10,450.00,"Li-Ion",true);
        boolean isCamera2  = Camera.createCamera(null,"EOS",55000,24,true,"Black",10,450,"Li-Ion",true);
        boolean isCamera3  = Camera.createCamera("Canon",null,55000,24,true,"Black",10,450,"Li-Ion",true);
        boolean isCamera4  = Camera.createCamera("Canon","EOS",0,24,true,"Black",10,450,"Li-Ion",true);
        boolean isCamera5  = Camera.createCamera("Canon","EOS",55000,0,true,"Black",10,450,"Li-Ion",true);
        boolean isCamera6  = Camera.createCamera("Canon","EOS",55000,24,false,"Black",10,450,"Li-Ion",true);
        boolean isCamera7  = Camera.createCamera("Canon","EOS",55000,24,true,null,10,450,"Li-Ion",true);
        boolean isCamera8  = Camera.createCamera("Canon","EOS",55000,24,true,"",10,450,"Li-Ion",true);
        boolean isCamera9  = Camera.createCamera("Canon","EOS",55000,24,true,"Black",0,450,"Li-Ion",true);
        boolean isCamera10 = Camera.createCamera("Canon","EOS",55000,24,true,"Black",10,0,"Li-Ion",true);
        boolean isCamera11 = Camera.createCamera("Canon","EOS",55000,24,true,"Black",10,450,null,true);
        boolean isCamera12 = Camera.createCamera("Canon","EOS",55000,24,true,"Black",10,450,"",true);
        boolean isCamera13 = Camera.createCamera("Canon","EOS",55000,24,true,"Black",10,450,"Li-Ion",false);

        boolean isCamera14 = Camera.createCamera(null,null,0,0,false,null,0,0,null,false);
        boolean isCamera15 = Camera.createCamera("","",0,0,false,"",0,0,"",false);

        boolean isCamera16 = Camera.createCamera("Sony","Alpha",65000,32,true,"Silver",20,480,"Li-Ion",true);
        boolean isCamera17 = Camera.createCamera("Nikon","D7500",72000,20,true,"Black",8,500,"Li-Ion",true);
        boolean isCamera18 = Camera.createCamera("Fuji","XT4",90000,26,true,"Black",15,460,"Li-Ion",false);
        boolean isCamera19 = Camera.createCamera("Panasonic","Lumix",80000,25,true,"Grey",12,430,"Li-Ion",true);

        boolean isCamera20 = Camera.createCamera("Canon","",55000,24,true,"Black",10,450,"Li-Ion",true);
        boolean isCamera21 = Camera.createCamera("","EOS",55000,24,true,"Black",10,450,"Li-Ion",true);
        boolean isCamera22 = Camera.createCamera("Canon","EOS",-1,24,true,"Black",10,450,"Li-Ion",true);
        boolean isCamera23 = Camera.createCamera("Canon","EOS",55000,-5,true,"Black",10,450,"Li-Ion",true);
        boolean isCamera24 = Camera.createCamera("Canon","EOS",55000,24,true,"Black",-2,450,"Li-Ion",true);
        boolean isCamera25 = Camera.createCamera("Canon","EOS",55000,24,true,"Black",10,-1,"Li-Ion",true);

        boolean isCamera26 = Camera.createCamera("GoPro","Hero",45000,12,true,"Black",5,120,"Li-Ion",true);
        boolean isCamera27 = Camera.createCamera("DJI","Action",38000,10,true,"Black",4,130,"Li-Ion",true);
        boolean isCamera28 = Camera.createCamera("Insta360","X3",42000,18,true,"Black",6,140,"Li-Ion",true);

        boolean isCamera29 = Camera.createCamera(null,"X3",42000,18,true,"Black",6,140,"Li-Ion",true);
        boolean isCamera30 = Camera.createCamera("Insta360",null,42000,18,true,"Black",6,140,"Li-Ion",true);
        boolean isCamera31 = Camera.createCamera("Insta360","X3",0,18,true,"Black",6,140,"Li-Ion",true);
        boolean isCamera32 = Camera.createCamera("Insta360","X3",42000,0,true,"Black",6,140,"Li-Ion",true);
        boolean isCamera33 = Camera.createCamera("Insta360","X3",42000,18,false,"Black",6,140,"Li-Ion",true);
        boolean isCamera34 = Camera.createCamera("Insta360","X3",42000,18,true,"Black",0,140,"Li-Ion",true);
        boolean isCamera35 = Camera.createCamera("Insta360","X3",42000,18,true,"Black",6,0,"Li-Ion",true);
        boolean isCamera36 = Camera.createCamera("Insta360","X3",42000,18,true,"Black",6,140,"",true);
        boolean isCamera37 = Camera.createCamera("Insta360","X3",42000,18,true,"Black",6,140,null,true);

	}
}