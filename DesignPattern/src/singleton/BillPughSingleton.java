package singleton;

/*
 * Bill Pugh Singleton
 * 장점
 * 1. JLS Class load 법칙에 의거해 Thread Safe 방지
 * 2. Run-time Dynamic loading으로 getInstance 실행시 메모리 적재
 * 3. Double if에 비해 상대적으로 간소화된 코드
 * 
 * 단점
 * 1. Holder 클래스로 인한 추가된 static class 생성 (BillPughSingleton$BillPughSingletonHolder)
 */
public class BillPughSingleton {

	//new 생성자로 인스턴스 생성 불가
	private BillPughSingleton() {}
	
	/*
	 * Holder 클래스를 생성하여 run-time Dynamic loading 방식으로 해당 클래스 접근시 
	 * static 메모리에 적재, 사실상 새로운 싱글톤 인스턴스 생성 전용 class라고 생각해도 무방 
	 */
	private static class BillPughSingletonHolder{
		static BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	//private inner class의 정적 필드에 접근하여 이미 생성된 인스턴스를 가져와 반환
	public static BillPughSingleton getInstance() {
		return BillPughSingletonHolder.INSTANCE;
	}
	 
}
