package data.integer;

public class OneInt {
	
	private final int value;

	public OneInt( int value ) {

		this.value = value;
	
	}

	@Override
	public String toString() {
		
		return Integer.toString( value );
		
	}

}
