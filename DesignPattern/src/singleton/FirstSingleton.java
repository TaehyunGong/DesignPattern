package singleton;

/*
 *  싱글톤의  1단계
 *  장점
 *  1. 구현이 매우 간단하다.
 *  단점
 *  1. 자원의 낭비가 이어질수 있고 클래스 필수 여부에 상관없이 메모리를 사용
 *  2. Thread Safe 방지 불가
 *  3. 예외 처리를 사용할수 있는 방법이 없다.
 */
public class FirstSingleton {

	//JVM 메모리로드시 바로 생성되기 때문에 쓸때없는 자원을 낭비 
	private static final FirstSingleton instance = new FirstSingleton(); 
	
	//new 생성자로 인스턴스 생성 불가
	private FirstSingleton() {}
	
	//생성되어있는 인스턴스를 가져와 리턴
	public static FirstSingleton getInstance() {
		return instance;
	}
	
}
