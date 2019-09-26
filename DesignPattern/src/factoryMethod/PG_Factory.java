package factoryMethod;

/*
 * 객체 생성의 역할을 하는 팩토리 클래스
 * 사용자로부터 원하는 객체를 파라메터로 받아 인스턴스 생성후 넘겨준다.
 */
public class PG_Factory {
	
	public PaymentGate get(String pgName) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		pgName = "factoryMethod.pg."+pgName;
		
		Class instance = Class.forName(pgName);
		PaymentGate pg = (PaymentGate) instance.newInstance();
		
		return pg;
	}
}
