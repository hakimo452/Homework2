package mypackage;

public class Car {
	static String  carType = "toyota";
	static int carPrice = 10000;
    Double carMailage = 22.600;
    String carColor = "black";
    
    
    
    public Car() {
    	
    }
    public Car (String favoriteCar, int series) {
    	System.out.println("my favorite Car is ; "+ favoriteCar + " " + series);
    }
    
    public static void main(String[] args) { 
		  
    	
    	String cargaz = "full";
    	
		System.out.println(carType);
		System.out.println(carPrice);
		
		Car obj = new Car();
		
		System.out.println(obj.carMailage);
		System.out.println(obj.carColor);
		
		Car obj1 = new Car("mercedes" , 10);
		CarShop();
		obj.CarMaintenance();
		
	   // if---else statement :
		
		if(cargaz =="full") {
 			System.out.println("gaz not need");
 			
 		}else {
 			System.out.println("feel up the gaz ");
 		}
		
		//for loop
    	for(int H=5; H<=9; H++) {
			System.out.println("maintenance requered :");
			
		}

	}
	   // Creating methods:

    
       public static void CarShop() {
    	System.out.println( "carshop is located in manhattan ");
    }
       public void CarMaintenance() {
    	System.out.println("car  should be maintain every day");
    }



}
