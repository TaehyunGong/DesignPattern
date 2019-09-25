package templateMethod.pg;

import templateMethod.ItemVo;
import templateMethod.ReceiptTemplate;

public class Danal extends ReceiptTemplate{

	public Danal(ItemVo item) {
		super(item);
	}

	//hook method
	@Override
	protected String printRefundInfo() {
		return "환불이 불가능합니다.";
	}
	
	@Override
	public double printDiscount() {
		return 0.9;
	}

	@Override
	public String printPaymentGate() {
		return "결제사 - Danal";
	}

}
