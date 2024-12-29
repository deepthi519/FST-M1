
public class MountainBike extends Bicycle {
	int seatHeight;
	MountainBike(int gears, int currentspeed,int seatheight)
	{
		super(gears, currentspeed);
		this.seatHeight=seatheight;
	}

	public void setHeight(int seatheight) {
		seatHeight=seatheight;
	}
	public String bicycleDesc() {
		 return (super.bicycleDesc()+ "\nSeat height is " + seatHeight);
	}
}
