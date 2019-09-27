package proxy;

/*
 * 스프링 AOP를 흉내낸 인터페이스
 */
public interface Aspect {

	void before();
	
	void after();
}
