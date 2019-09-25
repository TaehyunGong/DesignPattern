package templateMethod;

public class ItemVo {

	private String itemNo;
	private String itemName;
	private int price;
	
	public ItemVo() {}
	
	public ItemVo(String itemNo, String itemName, int price) {
		super();
		this.itemNo = itemNo;
		this.itemName = itemName;
		this.price = price;
	}

	public String getItemNo() {
		return itemNo;
	}
	public void setItemNo(String itemNo) {
		this.itemNo = itemNo;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "ItemVo [itemNo=" + itemNo + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	
	
}
