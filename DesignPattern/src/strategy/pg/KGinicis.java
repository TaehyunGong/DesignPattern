package strategy.pg;

import java.util.List;

import strategy.ItemVo;
import strategy.PaymentGate;

/*
 * 전략에 해당되는 클래스
 * PG사 중 하나인 KGinicis에만 해당하는 기능을 넣어준다.
 */
public class KGinicis implements PaymentGate {

	@Override
	public String pay(ItemVo items) {
		/*
		 *  Something Process
		 *  get KGinicis API data
		*/
		
		return "KGinicis_123456";
	}

	@Override
	public String pay(List<ItemVo> items) {
		/*
		 *  Something Process
		 *  get KGinicis API data
		*/
		
		return "KGinicis_m_123456";
	}

	@Override
	public String receipt(String payId) {
		/*
		 *  Something Process
		 *  get KGinicis API data
		*/
		
		return "Bill";
	}

}
