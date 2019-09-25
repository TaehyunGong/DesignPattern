package strategy.pg;

import java.util.List;

import strategy.ItemVo;
import strategy.PaymentGate;

/*
 * 전략에 해당되는 클래스
 * KGinicis와 동일
 */
public class Danal implements PaymentGate{

	@Override
	public String pay(ItemVo items) {
		/*
		 *  Something Process
		 *  get Danal API data
		*/
		
		return "Danal_123456";
	}

	@Override
	public String pay(List<ItemVo> items) {
		/*
		 *  Something Process
		 *  get Danal API data
		*/
		
		return "Danal_m_123456";
	}

	@Override
	public String receipt(String payId) {
		/*
		 *  Something Process
		 *  get Danal API data
		*/
		
		return "Bill";
	}

}
