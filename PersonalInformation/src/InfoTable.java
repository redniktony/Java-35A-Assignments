//Hua Xia
//CIS 35A Spring 2016
//Assignment 2
//Due Date April 25th
//Date Submitted April 25th
public class InfoTable {
	private String name;
	private String address;
	private int age;
	private long pnumber;
	public InfoTable() {}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPnumber() {
		return pnumber;
	}

	public void setPnumber(long pnumber) {
		this.pnumber = pnumber;
	}
	
	public InfoTable(String name, String address, int age, long pnumber) {
		this.name = name;
		this.address = address;
		this.age = age;
		this.pnumber = pnumber;
	}
}
