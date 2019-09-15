package aca.mirim.domain;

public class Category {
	
	private int amount;
	private String category;
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
	@Override
	public String toString() {
		return "category [amount=" + amount + ", category=" + category + "]";
	}
	

	
	
}
