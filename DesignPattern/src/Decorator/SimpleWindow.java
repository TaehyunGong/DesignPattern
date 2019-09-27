package Decorator;

/*
 * 기본이 되는 클래스
 */
public class SimpleWindow implements Window{

	@Override
	public void draw() {
	}

	@Override
	public String getDescription() {
		return "simple window";
	}

}
