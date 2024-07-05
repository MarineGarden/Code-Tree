package data.integer;

public class OneIntTest {

	public static void main( String[] args ) {

		int sample = 12321;
		OneInt test = new OneInt( sample );
		System.out.println( test.toString().equals( Integer.toString( sample ) ) );
		
	}

}
