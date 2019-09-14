package aca.mirim.domain;

public class Search {

	private int type;
	private int account;
	private int term;
	
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}

	public int getAccount() {
		return account;
	}
	public void setAccount(int account) {
		this.account = account;
	}
	
	public int getTerm() {
		return term;
	}
	public void setTerm(int term) {
		this.term = term;
	}
	@Override
	public String toString() {
		return "Search [type=" + type + ", account=" + account + ", term=" + term + "]";
	}

	
	
}
