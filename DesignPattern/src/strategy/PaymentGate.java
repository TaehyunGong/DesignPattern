package strategy;

import java.util.List;

/*
 * PG사 공통 Interface
 * 모든 PG사는 필수적으로 pay 메소드와 receipt 메소드를 가지고있어야한다. 
 */
public interface PaymentGate {

	public String pay(ItemVo items);
	
	public String pay(List<ItemVo> items);
	
	public String receipt(String payId);
	
}
