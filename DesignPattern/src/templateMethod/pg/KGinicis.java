package templateMethod.pg;

import templateMethod.ItemVo;
import templateMethod.ReceiptTemplate;

/*
 * Template를 상속받아 만들어진 클래스
 */
public class KGinicis extends ReceiptTemplate{

	//영수증 출력을 위해 필수적으로 상품에 대한 정보가 필요하다.
	public KGinicis(ItemVo item) {
		super(item);
	}
	
	//KG에서 사용하는 할인율을 적용한다.
	@Override
	public double printDiscount() {
		return 0.75;
	}

	//어떤 PG사를 사용했는지 출력해준다.
	@Override
	public String printPaymentGate() {
		return "결제사 - KGinicis";
	}
	
}
