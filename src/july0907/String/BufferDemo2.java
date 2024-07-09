package july0907.String;

public class BufferDemo2 {
	public static void main(String[] args) {
		
			 			//   012345678910
		StringBuffer tt = new StringBuffer ("Hello World") ;
		
		System.out.println("Original String:- "+tt);
		tt.replace(5, 6, " Beautiful ") ;
		
		
		System.out.println("After Replace:- "+tt);
	}

}
