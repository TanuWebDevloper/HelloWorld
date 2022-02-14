package comparable;

public class Bean_Class1 {
	 public Bean_Class1(int id, long contact, String name) {
		super();
		this.id = id;
		this.contact = contact;
		this.name = name;
	}
	private int id;
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getContact() {
		return contact;
	}
	public void setContact(long contact) {
		this.contact = contact;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private long contact;
	 private String name;
	
	
}
