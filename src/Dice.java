
public class Dice {
	
	private int die1Value;
	private int die2Value;
	private int sum;
	
	public Dice() {
		
		Die die1 = new Die();
		Die die2 = new Die();
		die1Value = die1.getValue();
		die2Value = die2.getValue();

		getSum();		
	}
	
	public int getDie1Value() {
		return die1Value;
	}
	public void setDie1Value(int die1Value) {
		this.die1Value = die1Value; 
	}
	public int getDie2Value() {
		return die2Value;
	}
	public void setDie2Value(int die2Value) {
		this.die2Value = (int) (Math.random() * 6) + 1; 
	}
	public int getSum() {
		sum = die1Value + die2Value;
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public void roll() {
		getDie1Value();
		getDie2Value();
	}

	public void printRoll() {
		
		String msg =
		  "Die 1:  " + getDie1Value() + "\n"
		+ "Die 2:  " + getDie2Value() + "\n"
		+ "Total:  " + getSum() + "\n";
		if (sum == 7) {
			msg += "Craps!\n";
		}
		else if (sum == 2) {
			msg += "Snake eyes!\n";
		}
		else if (sum == 12) {
			msg += "Box cars!\n";
		}
		Console.printToConsole(msg);
	}

}
