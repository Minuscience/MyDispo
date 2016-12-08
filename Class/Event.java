package Class;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class Event implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4012303153178258572L;
	private Admin admin;
	private String name;
	private String description;
	private Date start;
	private Date end;
	@SuppressWarnings("unused")
	private ArrayList<Member> participant;
	
	public Event(String name, Date start, Date end){
		this.name = name;
		this.start = start;
		this.end = end;
		this.description="";
		this.participant = new ArrayList<Member>();
		
		
	}
	
	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append("Name : ");
		sb.append(name +"\n");
		sb.append("Start time : ");
		sb.append(start +"\n");
		sb.append("End : ");
		sb.append(end + "\n");
		
		return sb.toString();
	}

	public Date getStart() {
		return start;
	}
	public void setStart(Date start) {
		this.start = start;
	}
	public Date getEnd() {
		return end;
	}
	public void setEnd(Date end) {
		this.end = end;
	}
	
	public Admin getAdmin() {
		return admin;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	
}
