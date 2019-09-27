package Decorator;

/*
 * Decorater 패턴
 * 인터페이스라는 다향성을 활용한 Wrapping을 연속적으로 진행한 패턴
 * 그 유명한 JAVA I/O 패키지에서 씌이고있다.
 */
public class main {

	public static void main(String[] args) {
		//인터페이스 타입으로 선언하여 생성자를 통하금 모든 객체를 연계해준다.
        Window decoratedWindow = new HorizontalScrollBarDecorator (
                new VerticalScrollBarDecorator(
                		new SimpleWindow()));

        System.out.println(decoratedWindow.getDescription());
	}

}
