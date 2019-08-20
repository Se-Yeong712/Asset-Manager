package aca.mirim.domain;

import java.util.Date;

public class WithdrawVO {

	private int wcode;
	private Date withdate;
	private String withaccount;
	private int withamount;
	private String withcate;
	private String id;
	
	public int getWcode() {
		return wcode;
	}
	public void setWcode(int wcode) {
		this.wcode = wcode;
	}
	public Date getWithdate() {
		return withdate;
	}
	public void setWithdate(Date withdate) {
		this.withdate = withdate;
	}
	public String getWithaccount() {
		return withaccount;
	}
	public void setWithaccount(String withaccount) {
		this.withaccount = withaccount;
	}
	public int getWithamount() {
		return withamount;
	}
	public void setWithamount(int withamount) {
		this.withamount = withamount;
	}
	public String getWithcate() {
		return withcate;
	}
	public void setWithcate(String withcate) {
		this.withcate = withcate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "WithdrawVO [wcode=" + wcode + ", withdate=" + withdate + ", withaccount=" + withaccount
				+ ", withamount=" + withamount + ", withcate=" + withcate + ", id=" + id + "]";
	}
	
	
	
}
