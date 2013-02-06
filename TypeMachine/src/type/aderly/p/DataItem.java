package type.aderly.p;

public class DataItem {
	String originString = "aderly";
	String inputString;
	
	public String getOrigin() {
		return originString;
	}
	
	public String getInput() {
		return inputString;
	}
	
	public DataItem(String s) {
		originString = s;
	}
	
	public DataItem() {
		
	}
}