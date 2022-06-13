
public interface Bank {

	// var are static and final
	String ACCTYPE1="savings"; // Final var must be initialised, value of final var cannot be changed
	String ACCTYPE2="current"; // static var are constant 
	
	public void  viewaccbal();  //abstract method 
	
	public void transferfunds();
	
	public void openfixeddeposit();
	
	
	
	
	
	
}
