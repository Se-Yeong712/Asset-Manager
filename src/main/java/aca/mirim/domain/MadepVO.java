package aca.mirim.domain;

public class MadepVO {
	
	private String account;
	private int week;
	private int month;
	private int year;
	private String id;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getWeek() {
		return week;
	}
	public void setWeek(int week) {
		this.week = week;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "MadepVO [account=" + account + ", week=" + week + ", month=" + month + ", year=" + year + ", id=" + id
				+ "]";
	}
	
	


}
