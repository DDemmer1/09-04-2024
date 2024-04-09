package de.demmer.dennis;

public class Item {
	
	private double price;
	private String name;
	private String desc;
	
	
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double neuerPrice) {
		
		if(neuerPrice <= 0) {
			System.out.println("Der Preis ist zu klein. "
					+ "Preis wurde automatisch auf 0 gesetzt");
			price = 0;
		} else {
			price = neuerPrice;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	
	
	
	
	
	
	
	
	
	

}
