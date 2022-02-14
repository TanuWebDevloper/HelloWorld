package exceptionhandling;



import java.util.Random;
import java.util.Scanner;

public class Game {
	Random r = new Random();
	Scanner sn = new Scanner(System.in);
	
	int no = r.nextInt();
	int n= sn.nextInt();
	public void  game(int n) throws GreatestNumber,LowestNumber{
		if(n>no)
		{
			throw new GreatestNumber("The number is greater");
		}
		else if(n<no)
		{
			throw new LowestNumber("The number is Lower");
		}
		else
		{
			System.out.println("Hey,You Won it");
		}
	}
	public static void main(String[] args) throws GreatestNumber, LowestNumber {
		Game obj = new Game();
		obj.game(67);
	}

}