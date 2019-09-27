package proxy;

/*
 * Target
 * Server의 속하며 대상이 되는 메소드
 */
public class Service implements IService {

	@Override
	public void runSomething() {
		System.out.println("서비스 중");
	}

}
