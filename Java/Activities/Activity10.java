package session2;

import java.util.HashSet;

public class Activity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>hs= new HashSet<String>();
		hs.add("D");
		hs.add("e");
		hs.add("e");
		hs.add("p");
		hs.add("t");
		hs.add("h");
		hs.add("I");
		System.out.println("original hash set "+hs);
		hs.remove("h");
		try {
			hs.remove("z");
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("check if given is there in set "+hs.contains("D"));
		System.out.println("updated hash set "+hs);
	}

}
