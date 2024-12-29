package session2;

import java.util.HashMap;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hm=new HashMap<Integer, String>();
		hm.put(1, "pink");
		hm.put(2, "purpule");
		hm.put(3, "violet");
		hm.put(4, "white");
		hm.put(5, "black");
		hm.remove(5);
		System.out.println("checking if hashmap has greencolor value "+hm.containsValue("green"));
		System.out.println("size of map is "+hm.size());
		
	}

}
