package factoryMethod.pg;

import factoryMethod.PaymentGate;

/*
 * 팩토리에서 생성되는 객체.
 */
public class KGinicis implements PaymentGate{

	@Override
	public void printPG() {
		System.out.println("KGinicis를 선택");
	}

}
