package mypackage;

public class Computer {
	
	static String  computerType = "dell";
	static int computerPrice = 1000;
    Double computerSize = 15.6;
    int computerRam = 512;
    
    
    
    public Computer() {
    	
    }
    public Computer (String favoritecomputer, int series) {
    	System.out.println("my favorite Computer is ; "+ favoritecomputer + " " + series);
    }
    
    public static void main(String[] args) { 
		 
    	
    	String Computerbattery="charged";  
    	
    	
		System.out.println(computerType);
		System.out.println(computerPrice);
		
		Computer obj = new Computer();
		
		System.out.println(obj.computerSize);
		System.out.println(obj.computerRam);
		
		Computer obj1 = new Computer("macbook" , 9);
		computerShop();
		obj.computerMaintenance();
		
		//for loop
		for(int P=0; P<=8; P++) {
			System.out.println("computer system issue:"+P);
			
		}
		
		// if---else statement :
		
		if(Computerbattery=="charger") {
			System.out.println("computer battery fully charged");
			
		}else {
			System.out.println("computer need to be charged ");
		}
		
 
	}
	   // Creating methods:

    
       public static void computerShop() {
    	System.out.println( "computershop is located in brooklyn ");
    }
       public void computerMaintenance() {
    	System.out.println("the computer should be maintain every day");
    }

}

   


	
	
	    
	
	
	
	
	
	  
