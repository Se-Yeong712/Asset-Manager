package aca.mirim.domain;

public class Table {
	
	private String owner;
	private String table_name;
	private String table_type;
	private String comments;
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getTable_name() {
		return table_name;
	}
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	public String getTable_type() {
		return table_type;
	}
	public void setTable_type(String table_type) {
		this.table_type = table_type;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	@Override
	public String toString() {
		return "TableVO [owner=" + owner + ", table_name=" + table_name + ", table_type=" + table_type + ", comments="
				+ comments + "]";
	}
	
	

}
