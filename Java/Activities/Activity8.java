package session2;

public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Activity8 a8=new Activity8();
		a8.exceptionTest(null);
		a8.exceptionTest("Hi Deepthi");
		}
		catch (CustomException mae ) {
		
	            System.out.println("Inside catch block: " + mae.getMessage());
		}
	}
	public void exceptionTest(String s)throws CustomException {
		if( s.equals(null))
		{
			throw new CustomException("String value is null");
		}
		else {
			System.out.println(s);
		}
	}
}
