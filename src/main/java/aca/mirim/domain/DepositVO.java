package aca.mirim.domain;

import java.sql.Date;

public class DepositVO {

	private int code;
	private Date regdate;
	private String account;
	private int amount;
	private String category;
	private String id;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "DepositVO [code=" + code + ", regdate=" + regdate + ", account=" + account + ", amount=" + amount
				+ ", category=" + category + ", id=" + id + "]";
	}
	
	
	
	
}
