public class EqualsDemo {
	public static void main(String[] args) { 
		int a = 4; 
		int b = 4; 
		boolean comparisonResult = a == b; 
		System.out.println(comparisonResult); 
		// The following line does not compile. 
		// comparisonResult = a.equals(b); 
		// System.out.println(comparisonResult); 
		StringObject x = new StringObject("hello"); 
		StringObject y = new StringObject("hello"); 
		comparisonResult = x == y; 
		System.out.println(comparisonResult); 
		comparisonResult = x.equals(y); 	
		System.out.println(comparisonResult); 
	}
	 static class StringObject {
		public String str;
		public StringObject(String str) {
			this.str = str;
		}
		public String toString() {
			return str;
		}

		public boolean equals(Object that){
			if(!(that instanceof StringObject))
				return false;

			StringObject thatSO = (StringObject)that;

			return thatSO.str == this.str;
		}
	}
} 

