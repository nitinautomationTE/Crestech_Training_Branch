package assignment8april;

public class Vehicle 
{  
	// Properties of Vehicle.
    int no_of_seats;
    int no_of_wheels;
    
    // Method to insert the data in Vehicle properties.
    void setInfo(int seats,int wheels)
    {
    	this.no_of_seats=seats;
    	this.no_of_wheels=wheels;
    }
    
    //Method to display the data of Vehicle attributes.
    void display()
    {
    	System.out.println("No of sheet in this vehicle is:"+no_of_seats);
    	System.out.println("Not of wheels in this vehicle is:"+no_of_wheels);
    }
}
