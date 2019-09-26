package templateMethod.pg;

import templateMethod.ItemVo;
import templateMethod.ReceiptTemplate;

/*
 * Template를 상속받아 만들어진 클래스
 */
public class Danal extends ReceiptTemplate{

	//영수증 출력을 위해 필수적으로 상품에 대한 정보가 필요하다.	
	public Danal(ItemVo item) {
		super(item);
	}

	/*
	 * Hook method
	 * Danal의 경우 환불이 불가능 하므로 오버라이딩을 통해
	 * 변경된 환불정보를 출력해준다.
	 */
	@Override
	protected String printRefundInfo() {
		return "환불이 불가능합니다.\n";
	}
	
	//KG에서 사용하는 할인율을 적용한다.	
	@Override
	public double printDiscount() {
		return 0.9;
	}

	//어떤 PG사를 사용했는지 출력해준다.
	@Override
	public String printPaymentGate() {
		return "결제사 - Danal";
	}

}
