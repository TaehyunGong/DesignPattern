package Decorator;

/*
 * 테코레이터
 * 생성자로  객체를 가져와 해당 객체의 전역변수로 활용해 메소드를 실행
 */
public class VerticalScrollBarDecorator extends WindowDecorator{

	public VerticalScrollBarDecorator(Window decoratedWindow) {
		super(decoratedWindow);
	}

	@Override
	public void draw() {
        drawVerticalScrollBar();
        decoratedWindow.draw();		
	}
	
    private void drawVerticalScrollBar() {
        // draw the vertical scrollbar
    }
	
	@Override
	public String getDescription() {
		return decoratedWindow.getDescription() + ", including vertical scrollbars";
	}

}
