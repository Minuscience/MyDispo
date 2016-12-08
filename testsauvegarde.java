import java.util.Arrays;
import java.util.List;

import Class.Admin;
import Class.Member;

public class testsauvegarde {
	public static void main(String[] args) {
		List<Member> members = Arrays.<Member>asList(
		        new Admin("Time", "dispo", "OPERMAN", "Timoty", "0695069058", "o.timoty@hotmail.fr", "GOD"),
		        new Member("Emma Jones", "emma.jones@example.com"),
		        new Member("Michael Brown", "michael.brown@example.com"),
		        new Member("Anna Black", "anna.black@example.com"),
		        new Member("Rodger York", "roger.york@example.com"),
		        new Member("Susan Collins", "susan.collins@example.com"));
		
		
		Member.saveMemberList(members, "sav");
		List<Member> test = Member.LoadMemberList("sav");
		System.out.println(test);
		
	}

}
