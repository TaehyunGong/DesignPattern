package proxy;

/*
 * Advice
 * 타겟에 잡힌 객체를 시점에 따라 별도의 프로세스를 처리 
 */
public class Proxy implements IService, Aspect {

	//사용자는 중간 Proxy를 생성 후 실행함으로 중간의 별도의 작업을 진행가능
	@Override
	public void runSomething() {
		before();
		new Service().runSomething();
		after();
	}

	//스프링 AOP의 before
	@Override
	public void before() {
		System.out.println("before");
	}

	//스프링 AOP의 after
	@Override
	public void after() {
		System.out.println("after");
	}

}
