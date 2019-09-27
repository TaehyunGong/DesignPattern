package proxy;

/*
 * Proxy 패턴
 * 스프링의 AOP의 적용 패턴
 * 
 * 서비스를 관점별로 나누기 위하여 사용
 * Filter 와 Interceptor와의 기본 개념은 같을지 몰라도 사용요도 및 Scope가 다르다.
 * Filter : Servlet에서 오는 요청및 응답을 처리
 * Interceptor : Spring Container에서 오는 요청 및 응답을 처리
 * AOP : Spring Container의 관심 별로 오는 요청 및 응답을 처리
 */
public class main {

	public static void main(String[] args) {
		/*
		 * Service의 runSomething()를 호출하기 위해
		 * 직접 Service를 생성하는것이 아닌 인터페이스로 상속된 Proxy를 생성 
		 */
		IService proxy = new Proxy();
		proxy.runSomething();
	}

}
