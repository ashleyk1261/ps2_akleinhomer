package pkgPS2;



public class MyInteger {

	private int iValue;

	public MyInteger(int iValue) {
		super();
		this.setiValue(iValue);
	}

	public int getiValue() {
		return iValue;
	}

	void setiValue(int iValue) {
		this.iValue = iValue;
	}
	
	
	public boolean isEven() {
		if (iValue % 2 == 0) return true;
		else return false;
		}
	
	public boolean isOdd() {
		if (iValue % 2 != 0) return true;
		else return false;
	}
	
	public boolean isPrime() {
		for (int i=2; i<=(iValue/2); i++) {
			if (iValue % i == 0) return false;
		}
		return true;
	}
	
	public static boolean isEven(int Value) {
		if (Value %2 == 0) return true;
		else return false;
	}
	
	public static boolean isOdd(int Value) {
		if (Value % 2 != 0) return true;
		else return false;
	}
	
	public static boolean isPrime(int Value) {
		for (int i=2; i<=(Value/2); i++) {
			if (Value % i == 0) return false;
		}
		return true;
	}
	
	public static boolean isEven(MyInteger MyInteger) {
		if (MyInteger.iValue %2 == 0) return true;
		else return false;
	}
	
	public static boolean isOdd(MyInteger MyInteger) {
		if (MyInteger.iValue % 2 != 0) return true;
		else return false;
	}
	
	public static boolean isPrime(MyInteger MyInteger) {
		for (int i=2; i<=(MyInteger.iValue/2); i++) {
			if (MyInteger.iValue % i == 0) return false;
		}
		return true;
	}
	
	public boolean equals(int Value) {
		if (iValue == Value) return true;
		else return false;
	}
	
	public boolean equals(MyInteger MyInteger) {
		if (iValue == MyInteger.iValue) return true;
		else return false;
	}


}	
