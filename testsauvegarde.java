import java.util.Arrays;
import java.util.List;

public class testsauvegarde {
	public static void main(String[] args) {
		List<Member> members = Arrays.<Member>asList(
		        new Member("Ethan Williams", "ethan.williams@example.com"),
		        new Member("Emma Jones", "emma.jones@example.com"),
		        new Member("Michael Brown", "michael.brown@example.com"),
		        new Member("Anna Black", "anna.black@example.com"),
		        new Member("Rodger York", "roger.york@example.com"),
		        new Member("Susan Collins", "susan.collins@example.com"));
		
		
		Member.saveMemberList(members, "Save.sav");
		List<Member> test = Member.LoadMemberList("Save.sav");
		System.out.println(test);
		
	}

}
