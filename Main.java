import java.util.Date;

import Class.Event;
import Class.Member;

public class Main {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Member user1 = new Member("yoyo","Tom", "Odell");
		Date start = new Date(1016,1,11,0,0);
		Date end = new Date(1016,10,11,12,0);
		Event test = new Event("Test", start, end);
		System.out.println(test);
		System.out.println(user1);
		
		
	}

}
