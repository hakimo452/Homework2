package mypackage;

public class Mobile {
	static String  mobilType = "sumsung";
	static int mobilPrice = 900;
    Double mobilyear = 15.6;
    String mobilColor = "white";
    
    
    
    public Mobile() {
    	
    }
    public Mobile (String favoriteMobil, int series) {
    	System.out.println("my favorite mobil is ; "+ favoriteMobil + " " + series);
    }
    
    public static void main(String[] args) { 
		
		String myFavoriteSeries="blue"; 

		System.out.println(mobilType);
		System.out.println(mobilPrice);
		
		Mobile obj = new Mobile();
		
		System.out.println(obj.mobilyear);
		System.out.println(obj.mobilColor);
		
		Mobile obj1 = new Mobile ("iphone" , 11);
		mobilShop();
		obj.mobilMaintenance();
		
		
		// if---else statement :
		
		if(myFavoriteSeries =="blue") {
 			System.out.println("buy it");
 			
 		}else {
 			System.out.println("don't buy it ");
 		}
		
		//for loop
    	for(int charge=5; charge<9; charge++) {
			System.out.println("mobile need to be charged :");
			
		}

	}
    
	    // Creating methods:

        public static void mobilShop() {
    	System.out.println( "mobilshop is located in quens ");
    }
        public void mobilMaintenance() {
    	System.out.println("the mobil should be updated everyday");{
    }
    	
     
    
     
 		
 			

    }

}
