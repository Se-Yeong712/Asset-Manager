package aca.mirim.domain;

public class Search {

	private int type;
	private int sort;
	private int account;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
	@Override
	public String toString() {
		return "SearchVO [type=" + type + ", sort=" + sort + ", account=" + account + "]";
	}
	
	
	
}
