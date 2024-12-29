
public class Activity6 {

	public static void main(String[] args) {
		Plane plane=new Plane(10);
		plane.onboard("Deepthi");
		plane.onboard("Deepthi1");
		plane.onboard("Deepthi2");
		plane.onboard("Deepthi3");
		plane.onboard("Deepthi4");
		plane.onboard("Deepthi5");
		plane.onboard("Deepthi6");
		plane.onboard("Deepthi7");
		plane.onboard("Deepthi8");
		plane.onboard("Deepthi9");
		System.out.println("plane takeoff time "+plane.takeOff());
		System.out.println("list of passengers in the plane "+plane.getPassesngers());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		plane.land();
		System.out.println("plane landed time "+plane.getLastTimeLanded());
	}
}
