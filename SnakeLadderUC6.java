package Four;

public class SnakeLadderUC6 
{

	public static void main(String[] args) 
	{
		System.out.println(" ----Welcome to Snake & Ladder Simulator---- ");

		int start = 0;
		int visited = start;
		int rolldice = 0;
		int opening = 0;
		int end = 100;
		int count = 0;
		while (opening != 1) 
		{
			opening = (int) (1 + Math.floor(Math.random() * 10) % 6); // to get chance to entry in game
			visited = opening;
			System.out.println("    Opening chance : " + opening);
		}
		if (opening == 1) 
		{
			while (visited != end) 
			{
				rolldice = (int) (1 + Math.floor(Math.random() * 10) % 6); // roll the the dice to get number
				visited = visited + rolldice;
				count++;
				if (visited > end) 
				{
					visited = visited - rolldice;
					System.out.println("  Skip Step");
				}
				System.out.println("  Current position is  : " + visited + " ,     Rolldice value : " + rolldice);
			}
			System.out.println("\n  Game Report : you have played " + count + " times to win this game .");
		} else
		{
			visited = start;
			System.out.println(" You have to roll the dice for entry in game ");
		}

	}
}

