package aca.mirim.domain;

import java.util.Date;

public class DepositVO {

	private int dcode;
	private Date depdate;
	private String depaccount;
	private int depamount;
	private String depcate;
	private String id;
	public int getDcode() {
		return dcode;
	}
	public void setDcode(int dcode) {
		this.dcode = dcode;
	}
	public Date getDepdate() {
		return depdate;
	}
	public void setDepdate(Date depdate) {
		this.depdate = depdate;
	}
	public String getDepaccount() {
		return depaccount;
	}
	public void setDepaccount(String depaccount) {
		this.depaccount = depaccount;
	}
	public int getDepamount() {
		return depamount;
	}
	public void setDepamount(int depamount) {
		this.depamount = depamount;
	}
	public String getDepcate() {
		return depcate;
	}
	public void setDepcate(String depcate) {
		this.depcate = depcate;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "DepositVO [dcode=" + dcode + ", depdate=" + depdate + ", depaccount=" + depaccount + ", depamount="
				+ depamount + ", depcate=" + depcate + ", id=" + id + "]";
	}
	
	
	
}
