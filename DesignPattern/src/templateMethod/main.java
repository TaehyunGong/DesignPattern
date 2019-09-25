package templateMethod;

import templateMethod.pg.Danal;
import templateMethod.pg.KGinicis;

public class main {

	public static void main(String[] args) {
		
		//판매할 아이템
		ItemVo item = new ItemVo("01", "사과", 1000);
		
		ReceiptTemplate receipt = new KGinicis(item);
//		receipt.printReceipt();
		
		ReceiptTemplate receipt2 = new Danal(item);
		receipt2.printReceipt();
	}

}
