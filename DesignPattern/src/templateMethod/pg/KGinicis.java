package templateMethod.pg;

import templateMethod.ItemVo;
import templateMethod.ReceiptTemplate;

public class KGinicis extends ReceiptTemplate{

	public KGinicis(ItemVo item) {
		super(item);
	}
	
	@Override
	public double printDiscount() {
		return 0.75;
	}

	@Override
	public String printPaymentGate() {
		return "결제사 - KGinicis";
	}
	
}
