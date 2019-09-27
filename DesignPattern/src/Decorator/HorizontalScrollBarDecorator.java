package Decorator;

/*
 * 테코레이터
 * 생성자로  객체를 가져와 해당 객체의 전역변수로 활용해 메소드를 실행
 */
public class HorizontalScrollBarDecorator extends WindowDecorator{
	
    public HorizontalScrollBarDecorator (Window decoratedWindow) {
        super(decoratedWindow);
    }

    public void draw() {
        drawHorizontalScrollBar();
        decoratedWindow.draw();
    }

    private void drawHorizontalScrollBar() {
        // draw the horizontal scrollbar
    }

    public String getDescription() {
    	return decoratedWindow.getDescription() + ", including horizontal scrollbars";
    }
        
}
