
public class Activity3 {
	public static void main(String[] args) {
		double agesec=1000000000;
		double EarthSeconds = 31557600;
		
        double Mercuryseconds = 0.2408467*EarthSeconds;
        double VenusSeconds = 0.61519726*EarthSeconds;
        double MarsSeconds = 1.8808158*EarthSeconds;
        double JupiterSeconds = 11.862615*EarthSeconds;
        double SaturnSeconds = 29.447498*EarthSeconds;
        double UranusSeconds = 84.016846*EarthSeconds;
        double NeptuneSeconds = 164.79132*EarthSeconds;
        
      System.out.println("age onearth = "+agesec/EarthSeconds);
      System.out.println("age on Mercury = "+agesec/Mercuryseconds);
      System.out.println("age on Mars = "+agesec/MarsSeconds);
      System.out.println("age on Jupiter = "+agesec/JupiterSeconds);
      System.out.println("age on satrun = "+agesec/SaturnSeconds);
      System.out.println("age on Uranus = "+agesec/UranusSeconds);
      System.out.println("age on Neptune = "+agesec/NeptuneSeconds);
        
	}

}
