package data.long_;

public class OneLongTest {

	public static void main( String[] args ) {

		long sample = 12L;
		OneLong test = new OneLong( sample );
		System.out.println( test.toString().equals( Long.toString( sample ) ) );
		
	}

}
