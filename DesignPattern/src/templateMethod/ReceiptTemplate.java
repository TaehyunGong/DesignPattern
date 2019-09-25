package templateMethod;

public abstract class ReceiptTemplate {

	ItemVo item;
	
	public ReceiptTemplate(ItemVo item) {
		this.item = item;
	}

	public final void printReceipt() {
		StringBuffer sbf = new StringBuffer();
		sbf.append(printCompanyInfo());
		sbf.append(getTotalPrice());
		
		sbf.append(printRefundInfo());
		sbf.append(printPaymentGate());
		System.out.println(sbf.toString());
	}
	
	private String printCompanyInfo() {
		return "저희 쇼핑몰을 이용해주셔서 감사합니다.\n";
	}
	
	private String getTotalPrice() {
		return "총 결제 금액은 : "+item.getPrice()*printDiscount()+"원 입니다. \n";
	}
	
	protected String printRefundInfo() {
		return "환불은 10일이내로 하실수 있습니다.\n";
	}
	
	public abstract double printDiscount();
	public abstract String printPaymentGate();
}
