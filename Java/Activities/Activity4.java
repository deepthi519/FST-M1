
public class Activity4 {
	public static void main(String[] args) {
		int array [] = {12,13,15,20,25,40,70,1};
		int sortedarray[];
		int small=0;
for (int i : array) {
	System.out.print(i +",");
	
}
System.out.println();
		for( int i=0;i<array.length;i++)
		{
			
			for(int j=i+1;j<array.length;j++)
			{
				if(array[i]>array[j])
				{
					int temp=array[i];
					array[i]=array[j];
					array[j]=temp;
					
				}

			}
		}
		for (int i : array) {
			System.out.print(i +",");
		}
	}

}
