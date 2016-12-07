
public class Admin extends Member {

	private String role;

	public Admin(String userName,String FN, String LN, String num, String email, String role) {
		super(userName, FN, LN, num, email);
		this.role = role;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}
