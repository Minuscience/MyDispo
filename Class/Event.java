package Class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

	public Event(String name, Date start, Date end, String description) {
		this.name = name;
		this.start = start;
		this.end = end;
		this.description = "";
		this.participant = new ArrayList<Member>();
	}

	public Event(String name, Date start, Date end) {
		this(name, start, end, "");

	}

	@SuppressWarnings("deprecation")
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Name : ");
		sb.append(name + "\n");
		sb.append("Start time : ");
		sb.append(start.toLocaleString() + "\n");
		sb.append("End : ");
		sb.append(end.toLocaleString() + "\n");
		sb.append("Descripion : " + description);

		return sb.toString();
	}

	public static Event loadEvent(String filename) {
		Event event = null;
		try {
			FileInputStream saveFile = new FileInputStream(filename);
			ObjectInputStream restore = new ObjectInputStream(saveFile);
			event = (Event) restore.readObject();
			
			restore.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
		return event;
	}

	

	public void saveEvent(String filename) {
		FileOutputStream saveFile;
		try {
			saveFile = new FileOutputStream(filename);
			ObjectOutputStream save = new ObjectOutputStream(saveFile);
			save.writeObject(this);
			save.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

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

	public void setAdmin(Admin admin) {
		this.admin = admin;
	}

}
