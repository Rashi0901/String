package july0907.String;

public class BufferDemo2 {
	public static void main(String[] args) {
		
										//	 012345678910
		StringBuffer tt = new StringBuffer ("Hello World") ;
		
		
		tt.replace(5, 6, " Beautiful ") ;
		
		
		System.out.println(tt);
	}

}
