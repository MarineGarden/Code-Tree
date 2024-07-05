package data.integer;

public class TwoIntsTest {

	public static void main( String[] args ) {
		
		int sampleA = 12321;
		int sampleB = 78909;
		TwoInts test = new TwoInts( sampleA , sampleB );
		System.out.println( test.getFirst() == sampleA );
		System.out.println( test.getSecond() == sampleB );
		System.out.println( test.toString().equals( ( Integer.toString( sampleA ) ) + "," + Integer.toString( sampleB ) ) );
		
	}
	
}
