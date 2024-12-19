
public class Activity2 {
private static final String Static = null;
public static void main(String[] args) {
	int array [] = {12,13,15,20,25,40};
	Activity2 test= new Activity2();
	System.out.println(sum(array));
	
}
public static boolean sum(int array[]) {
	int sum=0;
	for (int i=0;i<array.length;i++)
	{
		if(array[i]%10==0)
		{
			sum=sum+array[i];
		}
	}
	if (sum==30)
		return true;
	else
		return false;
}
}
