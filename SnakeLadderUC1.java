package Four;

import java.util.Random;

public class SnakeLadderUC1
{	
	public static void main(String[] args)
	{
		
		int number = 0;

		while (true) {
		    System.out.println(number);
//		    int number = (int)(Math.random() * 6);
		    if (number >= 5) 
		    {
		        break;
		    }

		    number = number + 1;
		}
	}
}