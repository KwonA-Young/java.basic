package poly.instanceof_;

public class Cup {
	
	private String itemName;
	private int price;
	private String companyName;
	
	public Cup(String itemName, int price) {
		 this.itemName = itemName;
	        this.price = price;
	        this.companyName = "컵회사";
	}
	
	public Cup() {
		this.price = 0;
		this.itemName = "입력안됨";
		this.companyName = "컵회사";
		
	}
       
	

}
