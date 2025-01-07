package session2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		Random indexgen= new Random();
		System.out.print("Enter integers  ");
        System.out.println("(EOF or non-integer to terminate): ");
        
        while(scan.hasNextInt()) {
        	arr.add(scan.nextInt());
        }
        
        Integer[] arra=arr.toArray(new Integer[0]);
        int index = indexgen.nextInt(arra.length);
        System.out.println("Index value generated: " + index);
        System.out.println("Value in arary at generated index: " + arra[index]);
 
        scan.close();

	}

}
