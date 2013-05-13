public class Dice
{


	public static int RollDice(int numberOfDice, int maximumValue)
	{
		int lcv = 0,
			totalRoll = 0,
			number = 0;
		
		while (lcv < numberOfDice)
		{
			number = 1 + (int)(Math.random()* maximumValue);
			totalRoll = totalRoll + number;
			lcv++;
		}
		return totalRoll;
	}
	
	public static int RollDice()
	{
		int number = 1 + (int)(Math.random()* 6);
		return number;
	}
	
	public static int RollCount(int numberOfRolls)
	{
		numberOfRolls++;
		return numberOfRolls;
	}

}
