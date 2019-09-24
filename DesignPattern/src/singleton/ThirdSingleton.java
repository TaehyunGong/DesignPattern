package singleton;

/*
 * 싱글톤 3단계
 * 장점
 * 1. getInstance 호출시에만 객체 생성
 * 2. 메소드에서 예외처리가능
 * 
 * 단점
 * 1. 매번 getInstance() 호출시 null 체크 연산
 * 2. Thread Safe 방지 불가
 */
public class ThirdSingleton {

	//private으로 외부 접근 불가
	private static ThirdSingleton instance;
	
	//new 생성자로 인스턴스 생성 불가
	private ThirdSingleton() {}
	
	//내부적인 null 체크 연산으로 객체 성성 후 반환
	public static ThirdSingleton getInstance() {
		if(instance == null) {
			instance = new ThirdSingleton();
		}
		return instance;
	}
	
}
