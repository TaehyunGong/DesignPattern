package singleton;

/*
 * 싱글톤 4단계
 * 장점
 * 1. Thread Safe가 이루어지고있다.
 * 
 * 단점
 * 1. 멀티 스레드 접근시 오버헤드 문제로 성능이 저하 될수 있다.
 */
public class FourthSingleton {

	//private으로 외부 접근 불가
	private static FourthSingleton instance;
	
	//new 생성자로 인스턴스 생성 불가
	private FourthSingleton() {}
	
	//메소드의 동기화를 통해 Thread Safe가 이루어지고있지만 성능 저하가 발생할수 있다.
	synchronized public static FourthSingleton getInstance() {
		if(instance == null) {
			instance = new FourthSingleton();
		}
		return instance;
	}
}
