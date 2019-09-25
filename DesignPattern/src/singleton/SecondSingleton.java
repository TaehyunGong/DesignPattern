package singleton;

/*
 * 싱글톤 2단계
 * 장점
 * 1. 구현이 간단하다.
 * 2. getInstance()가 필요가 없다.
 * 3. 초기화 블럭에서 예외처리를 할수 있다.
 * 
 * 단점
 * 1. 사용여부 상관업이 메모리를 사용하게 된다.
 * 2. Thread Safe 방지 불가
 */
public class SecondSingleton {

	//static 변수로 바로 호출 가능
	public static SecondSingleton instance;
	
	//new 생성자로 인스턴스 생성 불가
	private SecondSingleton() {}
	
	//static 초기화 불럭으로 static호출시 최초 한번 인스턴스를 넣어준다.
	static {
		instance = new SecondSingleton();
	}
	
}
