package strategy;

import strategy.pg.Danal;
import strategy.pg.KGinicis;

/*
 * Strategy 패턴
 * 전략패턴으로 꽤나 많이 사용되는 패턴이다.
 * 
 * 프로젝트 전체에서 변경이 일어나지 않는 부분에서 변경이 일어나는 부분을 찾아서 따로 캡슐화 한다.
 * 변경되는 부분만 캡슐화하여 확장성을 용이하도록 하는 패턴
 * 
 * Context <- Interface (Strategy) 
 * Context에 전략을 넣어 전략에 따라 실행이 변경된다.
 */
public class main{

	public static void main(String[] args) {
		
		//판매할 아이템
		ItemVo item = new ItemVo("01", "사과", 1000);

		//결제할 PG사 선택
		
		//Context에 PG사 KGinicis를 넣어 결제
		Purchase KGpurchase = new Purchase(new KGinicis());
		String KGpayId = KGpurchase.pay(item);
		
		//Context에 PG사 Danal를 넣어 결제
		Purchase DGpurchase = new Purchase(new Danal());
		String DpayId = DGpurchase.pay(item);
		
		//결제한 PG사에 따라 다른 구매번호가 출력된다.
		//추가될 PG사가 있다면 PaymentGate Interface만 상속받아 추가시켜주면 된다.
		System.out.println("KG 구매번호 : " + KGpayId);
		System.out.println("Danal구매번호 : " + DpayId);
	}

}
