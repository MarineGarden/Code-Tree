package data.integer;

public class TwoInts {
	
	private final int first;
	private final int second;

	public TwoInts( int first , int second ) {

		this.first = first;
		this.second = second;
	
	}
	
	public final int getFirst() {
		
		return first;
		
	}
	
	public final int getSecond() {
		
		return second;
		
	}

	@Override
	public String toString() {

		return Integer.toString( first ).concat( "," ).concat( Integer.toString( second ) );
		
	}

}
