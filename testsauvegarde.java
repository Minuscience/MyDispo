import java.util.Arrays;
import java.util.Date;
import java.util.List;

import Class.Admin;
import Class.Event;
import Class.Member;

public class testsauvegarde {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		List<Member> members = Arrays.<Member>asList(
		        new Admin("Time", "dispo", "OPERMAN", "Timoty", "0695069058", "o.timoty@hotmail.fr", "GOD"),
		        new Member("Emma Jones", "emma.jones@example.com"),
		        new Member("Michael Brown", "michael.brown@example.com"),
		        new Member("Anna Black", "anna.black@example.com"),
		        new Member("Rodger York", "roger.york@example.com"),
		        new Member("Susan Collins", "susan.collins@example.com"));
		
		
		Member.saveMemberList(members, "savuser");
		List<Member> memberload = Member.LoadMemberList("savuser");
		
		Date start = new Date(2016,1,11);
		Date end = new Date(2016,10,11);
		Event test = new Event("Test", start, end,"piniata");
		test.saveEvent("test");
		test = Event.loadEvent("test");
		System.out.println(test);
		
		
	}

}
