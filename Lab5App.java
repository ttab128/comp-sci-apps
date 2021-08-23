/*
 * Title: Lab5App
 * Description: Application Class
 * @author Tyler Bonavita N00718499
 */
package lab5;

public class Lab5App {
	
	public static void main(String []args) {
		
	//Accesses the Dice() method
	Dice diceAgain = new Dice();
	System.out.println("After instantiation: " + diceAgain.toString());
	diceAgain.roll();
	System.out.println("After roll: " + diceAgain.toString());
	diceAgain.calcTotalRoll();
	System.out.println("After tallying total: " + diceAgain.calcTotalRoll());	
	diceAgain.threeOfAKind();
	System.out.println("Is there three of a kind? " + diceAgain.threeOfAKind());
	diceAgain.findHighestDie();
	System.out.println("The highest die is: " + diceAgain.findHighestDie());
	diceAgain.rollOneDie();
	System.out.println("One Die is: " + diceAgain.toString());
	}
	
}
