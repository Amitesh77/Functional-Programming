package StudentPackage;

public class MobileNumber {
	
	private String mobilenumber;

	public MobileNumber(String mobilenumber) {
	
		this.mobilenumber = mobilenumber;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "MobileNumber [mobilenumber=" + mobilenumber + "]";
	}
	
	
	
	
	
	
	

}
