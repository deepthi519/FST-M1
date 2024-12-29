package session2;

import java.util.ArrayList;

public class Activity9 {
	ArrayList<String>mylist;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>mylist= new ArrayList<String>();
		mylist.add("Deepthi");
		mylist.add("hello");
		mylist.add("dear");
		mylist.add("hai");
		mylist.add("ram");
		/*
		 * for(int i=0;i<mylist.size();i++) { System.out.println(mylist.get(i)); }
		 */
		for (String string : mylist) {
			System.out.println(string);
		}
		System.out.println("third element in list is "+mylist.get(2));
		System.out.println("checking if deepu is there in mylist "+mylist.contains("Deepthi"));
		System.out.println("size of array is "+mylist.size());
	}

}
