/*
 * Title: Dice
 * Description:Data-type Class
 * @author Tyler Bonavita N00718499
 */

package lab5;

public class Dice {

	//a 'default constuctor' has no parameters.
	//public static void main(String args[]){

	private int die1 = 0;
	private int die2 = 0;
	private int die3 = 0;

	
	/* Returns the values of the dice.
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return new String(die1 + " " + die2 + " " + die3);
	}
	
	public Dice(){
		die1 = 0;
		die2 = 0;
		die3 = 0;
	}
	public void roll(){
		die1 = (int)(Math.random()*6) + 1;
		die2 = (int)(Math.random()*6) + 1;
		die3 = (int)(Math.random()*6) + 1;
	}
	/*
	 * calcTotalRoll - This method will calculate the sum of the values
	 * rolled on the three dice
	 * @return the sum of the three dice
	 */
	public int calcTotalRoll(){
		return die1 + die2 + die3;
	}
	/*
	 * threeOfAKind method - this method will determine if all three
	 * of the dice have the same value
	 * @return true if they have the same value, false otherwise
	 */
	public boolean threeOfAKind(){
		if((die1 == die2) & (die2 == die3)){
			return true;
		}
			else {
				return false;
			}			
	}
	/*
	 * findHighestDie - This method will determine the highest value on
	 * the three dice
	 * @return the highest value
	 */
	public int findHighestDie(){
		if((die1 > die2) & (die2 > die3)){
			return die1;
		}
		else if((die2 > die3) & (die3 > die1)){
			return die2;
		}
		else return die3;
	}
	public void rollOneDie(){
		die1 = (int)(Math.random()*6) + 1;
		die1 = (int)(Math.random()*6) + 1;
		die1 = (int)(Math.random()*6) + 1;
	}
	
	
}
