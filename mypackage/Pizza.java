package mypackage;

public class Pizza {
	
	// these are global variables: the global variable should always be created inside of the class 
	
    static String pizzaType = "Chicken"; // this is a declared and initialized variable static variable 
	static int pizzaPrice = 5;
	int waitingTime = 15;
	String locationName = "brooklyn"; // this is  a declared and initialized variable Non static variable 
	double sliceSize = 1.5;
	

	
	
	
	public Pizza () { // in here we created a default constructor : ( default constructor means that the constructor has no parameters )
		
	}
	
	public Pizza(String favoritePizza) { // this is  PARAMETRIZED constructor ( with one parameter )
		System.out.println("my favorite piazza is :"+favoritePizza);
	}

	

	public static void main(String[] args) { 
		
		String myFavoriteSlice="BuffaloChicken"; // this is a local variable since it was created inside the method
	
		
		System.out.println(pizzaType);          
		System.out.println(Pizza.pizzaPrice); 
		
		
		Pizza obj1 = new Pizza(); // in here we created the object to be able to call the non static variables , as well as the non static methods
		
		
		
		Pizza obj2 = new Pizza("chicken Slice"); // this object was created to call the parameterized constructor 
		
		System.out.println(obj1.waitingTime);
		System.out.println(obj1.locationName); 
		System.out.println(obj1.sliceSize);
		
		obj1.ownerName(); // the non static method has been called by using the object
		shopAddress(); // the static method has been called directly  WITHOUT using the object 
		
		
		//for loop
		
		for(int abc=0; abc<10; abc++) {
			System.out.println("i like pizza so much");
			
		}
		
		// if---else statement :
		
		if(myFavoriteSlice=="BuffaloChicken") {
			System.out.println("the statment is correct");
			
		}else {
			System.out.println("the statement is incorrect ");
		}
		
			

	}
	
	// Creating methods:
	
	public void ownerName() { // this is a none static method , it can only be called by creating an object inside the main method and call it by using the object name .
		System.out.println(" the owner name is john doe");
		
	}
	
	public static void shopAddress() { // this is a static method , it will be called directly from the main method by using this method name , there is no need for the object 
		System.out.println("the address 111 main street , brooklyn , NY 11111");
	}
	

	
	

	
	
	
	
	
	

}





