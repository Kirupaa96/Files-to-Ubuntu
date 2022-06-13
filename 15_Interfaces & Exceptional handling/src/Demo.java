
public class Demo {

	public static void main(String[] args) {
		
		HDFC h =new HDFC();
		h.transferfunds();
		h.viewaccbal();
		h.openfixeddeposit();

		HDFC.method(); //coz this is a static method u dont need an object to call it.
		
		System.out.println(Bank.ACCTYPE1);   
		System.out.println(Bank.ACCTYPE2);
		
		
		
		
	}
}
