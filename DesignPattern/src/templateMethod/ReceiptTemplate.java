package templateMethod;

/*
 * Template에 해당하는 abstract 클래스
 * 이 추상 클래스에 상속받는 클래스는 동일한 관점 및 양식으로 작성되어야 한다.
 */
public abstract class ReceiptTemplate {

	ItemVo item;
	
	//모든 영수증은 해당 물품에 대한 정보를 받아와야한다.
	public ReceiptTemplate(ItemVo item) {
		this.item = item;
	}

	//영수증에 출력하기 위한 정보들을 모아 출력해준다.
	public final void printReceipt() {
		StringBuffer sbf = new StringBuffer();
		sbf.append(printCompanyInfo());
		sbf.append(getTotalPrice());
		
		/*
		 * 환불 정보를 출력해주는 printRefundInfo의 경우
		 * PG사 마다 환불정책이 다를수 있다.
		 * Danal의 경우는 환불이 불가능하여 오버라이딩을 통해 처리했다. 
		 */
		sbf.append(printRefundInfo());
		
		sbf.append(printPaymentGate());
		
		System.out.println(sbf.toString());
	}
	
	//모든 영수증에는 우리 플랫폼에 대한 인사가 필수로 들어가기에 추상클래스에서 불러와준다.
	private String printCompanyInfo() {
		return "저희 쇼핑몰을 이용해주셔서 감사합니다.\n";
	}
	
	//할인율은 PG사에 따라 다를수 있기 때문에 상속받은 할인율로 추가적인 연산을 해준다.
	private String getTotalPrice() {
		return "총 결제 금액은 : "+item.getPrice()*printDiscount()+"원 입니다. \n";
	}
	
	//PG사의 환불정책이 따로 없을 경우 우리 플랫폼의 환불정책을 따라간다.
	protected String printRefundInfo() {
		return "환불은 10일이내로 하실수 있습니다.\n";
	}
	
	//추상 메소드로 상속받은 PG사들은 필수적으로 작성해주어야 한다.
	public abstract double printDiscount();
	public abstract String printPaymentGate();
}
