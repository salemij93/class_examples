public class Main { 
	public static void main(String[] args) { 
		StringObject x = new StringObject("hello"); 
		StringObject y = new StringObject("world"); 
		swap(x, y); 
		System.out.println(x); 
		System.out.println(y); 
	} 
	public static void swap(StringObject a, StringObject b) { 
		String t = a.str; a.str = b.str; b.str = t; 
	}
	static class StringObject {
		public String str;
		public StringObject(String str) {
			this.str = str;
		}
		public String toString() {
			return str;
		}
		public boolean equals(Object other){
			if(other == null)
				return false;

			if(!(other instanceof StringObject))
				return false;

			StringObject otherStrObject = (StringObject)other;

			return otherStrObject.str.equals(this.str);
		}
	}
}

