package session2;

public class CustomException extends Exception{
	private String message;
	CustomException(String s)
	{
		message=s;
	}
	@Override
	public String getMessage()
	{
		return message;
		
	}

}

