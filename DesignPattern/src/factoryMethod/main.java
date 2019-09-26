package factoryMethod;

/*
 * Factory Methoed 패턴
 * 같은 관점인 클래스들을 Interface로 구현하여 
 * 공장에선 해당 클래스명만 호출하여 인스턴스로 가져온다.
 */
public class main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		//팩토리의 get메소드를 통해 가져오고자하는 객체를 파라메터로 올려준다.
		PaymentGate pg = new PG_Factory().get(PG.Danal.toString());
		
		//어떤 객체를 가져왔는지 출력
		pg.printPG();
	}

}
