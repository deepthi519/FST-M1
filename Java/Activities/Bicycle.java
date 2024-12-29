
public class Bicycle implements BicycleParts, BicycleOperations {
	int gears;
	int currentSpeed;
	Bicycle(int gears,int currentspeed)
	{
		this.gears=gears;
		this.currentSpeed=currentspeed;
	}
	public void applyBrake(int num){
		currentSpeed=currentSpeed-num;
	}
	public void speedUp(int num)
	{
		currentSpeed=currentSpeed+num;
	}
	public String bicycleDesc()
	{
		return ("num of gears for the bicycle are "+gears+" and max speed is "+ maxSpeed);
	}
}
