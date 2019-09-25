package singleton;

/*
 * 싱글톤 5번째
 * 장점
 * 1. Thread Safe 방지
 * 2. 동기화 블럭을 두어 오버헤드 방지
 * 
 * 단점
 * 1. 첫 객체 생성시 성능에 영향 가능성 있음
 * 2. 복잡함
 */
public class FifthSingleton {

	//private으로 외부 접근 불가
	private static FifthSingleton instance;
	
	//new 생성자로 인스턴스 생성 불가
	private FifthSingleton() {}
	
	//내부적인 null 체크 연산으로 객체 성성 후 반환
	public static FifthSingleton getInstance() {
		if(instance == null) {
			
			//synchronized를 블럭으로 두어 모든 스레드가 적용되지 않도록 방지
			synchronized (FifthSingleton.class) {
				if(instance == null) {
					instance = new FifthSingleton();
				}
			}
		}
		return instance;
	}	
}
