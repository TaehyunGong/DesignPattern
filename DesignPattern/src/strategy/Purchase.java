package strategy;

/*
 * 전략패턴에서 Context에 해당되는 부분으로 
 * PaymentGate의 객체에 따라 다른 결과값이 나온다. 
 */
public class Purchase {

	private PaymentGate pg;
	
	//결제하기 위해선 필수적으로 PG사가 필요하다.
	public Purchase(PaymentGate pg) {
		this.pg = pg;
	}
	
	//받는 아이템에 따라 결제 금액이 달라진다.
	public String pay(ItemVo item) {
		return pg.pay(item);
	}
}
