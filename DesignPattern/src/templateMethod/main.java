package templateMethod;

import templateMethod.pg.Danal;
import templateMethod.pg.KGinicis;

/*
 * Template Method 
 * abstract class를 구현하여 템플릿으로 지정 후 
 * 템플릿을 상속 하여 오버라이딩을 통해 필요한 메소드를 작성하는 디자인패턴
 */
public class main {
	
	public static void main(String[] args) {
		
		//판매할 아이템
		ItemVo item = new ItemVo("01", "사과", 1000);
		
		/*
		 * 영수증을 발급 받기 위해 각각의 다른 PG사라도 동일한 영수증 양식으로 출력받고싶다.
		 * 그러기 위해 ReceiptTemplate를 기준삼아 각각의 PG사를 상속하여 출력해준다.
		 */
		ReceiptTemplate receipt = new KGinicis(item);
		receipt.printReceipt();
		
		ReceiptTemplate receipt2 = new Danal(item);
		receipt2.printReceipt();
	}

}
