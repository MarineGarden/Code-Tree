package data.long_;

public class TwoLongsTest {

	public static void main( String[] args ) {

		long sampleA = 12L;
		long sampleB = 13L;
		TwoLongs test = new TwoLongs( sampleA , sampleB );
		System.out.println( test.getFirst() == sampleA );
		System.out.println( test.getSecond() == sampleB );
		
	}

}
