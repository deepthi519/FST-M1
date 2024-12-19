
public class Activity5 {
	public static void main(String[] args) {
		Mybook newNovel = new Mybook();
		String name = "Deepthis'book";
        
        //Set title
        newNovel.setTitle(name);
        
        //Print result
        System.out.println("name is: " + newNovel.getTitle());
	}
}
