import javax.swing.JOptionPane;


public class MainProgram
{
	public static void main(String[] args)
	{
		
		boolean gameNotOver = true;
		int numberOfSinglePlays = 0,
			numberOfMultiPlays = 0;
		
		do{
			
			String rollChoice = JOptionPane.showInputDialog( null, "Would you like to roll a single 6 sided die or a variable\n" +
																	" amount of dice with a variable amount of sides?\n" +
																	"(Press 1 for a single die and 2 for the variable dice.)");
			
			if (rollChoice.equals("1"))
			{
				int rollResult = Dice.RollDice();
				
				numberOfSinglePlays = Dice.RollCount(numberOfSinglePlays);
				
				JOptionPane.showMessageDialog( null, "The result of your dice roll is " + rollResult + "." );
				
				if (numberOfSinglePlays <= 1)
				{
					JOptionPane.showMessageDialog( null, "You've rolled a single die " + numberOfSinglePlays + " time." );
				}
				else
				{
					JOptionPane.showMessageDialog( null, "You've rolled a single die " + numberOfSinglePlays + " times." );
				}
				
			}
			else	
			{
				String diceAmount = JOptionPane.showInputDialog( null, "How many dice would you like to roll?" );
				String numberOfSides = JOptionPane.showInputDialog( null, "How many sides does each die have?" );
			
				int rollResult = Dice.RollDice(Integer.parseInt(diceAmount),Integer.parseInt(numberOfSides));
			
				numberOfMultiPlays = Dice.RollCount(numberOfMultiPlays);			
			
				JOptionPane.showMessageDialog( null, "The result of your dice roll is " + rollResult + "." );
						
				if (numberOfMultiPlays <= 1)
				{
					JOptionPane.showMessageDialog( null, "You've rolled a variable amount of dice " + numberOfMultiPlays + " time." );
				}
				else
				{
					JOptionPane.showMessageDialog( null, "You've rolled a variable amount of dice " + numberOfMultiPlays + " times." );
				}
			}
			
			String playAgain = JOptionPane.showInputDialog( null, "Would you like to play again?\n" +
																	"(Enter 1 for Yes and 2 for No.)");
			
			if (playAgain.equals("2"))
				gameNotOver = false;
			
		} while (gameNotOver);
		
	} //end main method
} //end class Main Program
