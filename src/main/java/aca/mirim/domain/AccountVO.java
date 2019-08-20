package aca.mirim.domain;

public class AccountVO {
	
	private String account;
	private String bank;
	private String aname;
	private String id;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "AccountVO [account=" + account + ", bank=" + bank + ", aname=" + aname + ", id=" + id + "]";
	}
	
	

}
