
public class Car 
{
	int c_gear;
	int c_highestSpeed;
	String c_carColor;
	int c_yearOfMake;
	String c_currentOwner;
	Car(String name)
	{
		this.c_currentOwner=name;
	}
	public void car_Details(int gear,int highestSpeed,String carColor,int yearOfMake)
	{
		this.c_gear=gear;
		this.c_highestSpeed=highestSpeed;
		this.c_carColor=carColor;
		this.c_yearOfMake=yearOfMake;



		System.out.println(" this is my car");
		System.out.println(c_gear +"\n"+ c_highestSpeed+"\n"+c_carColor+"\n"+c_yearOfMake+"\n"+c_currentOwner );
	}
}
