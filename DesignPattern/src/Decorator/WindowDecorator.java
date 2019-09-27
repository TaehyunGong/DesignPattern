package Decorator;

/*
 * Decorate 메인의 역할
 * 추상 클래스로 설계하여 인터페이스로 상속받는다.
 * 앞으로의 데코레이터들은 이 클래스를 상속받아 동일한 객체를 사용한다.
 */
public abstract class WindowDecorator implements Window{

	protected Window decoratedWindow;
	
	public WindowDecorator(Window decoratedWindow) {
		this.decoratedWindow = decoratedWindow;
	}
}
