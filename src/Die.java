
public class Die {
	private int value;
	public static int FACES = 6;

	public Die() {
		value = 0;
		roll();
		getValue();		
	}
	
	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void roll()	{
		value = (int) (Math.random() * FACES) + 1;
	}
}
