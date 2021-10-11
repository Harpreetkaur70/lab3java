
/*
 * Name :Harpreet Kaur
 * Student number: A00245132
 * Description: for testing dice class
 */


public class DiceGame {
 


	public static void main(String [] args) {
		
		//creating different sized dice using each constructor
		System.out.println("Creating a default d6........");
		Die first_d=new Die();
		System.out.println("Creating a d20........");
		Die sec_dice =new Die(20);
		System.out.println("Creating a percentile die(a special d10........)");
		Die third_d=new Die(10,"percentile");
		
		//printing dice name and their current side number
		System.out.println("The current side up for "+first_d.getDie_name()+ " is "+first_d.getCurr_side_up());
		System.out.println("The current side up for "+sec_dice.getDie_name()+ " is "+sec_dice.getCurr_side_up());
		System.out.println("The current side up for "+third_d.getDie_name()+" is "+third_d.getCurr_side_up());
		
		//roll the dice and printing results
		System.out.println("\n\nTesting the roll method");
		
		System.out.println("\n\nRolling the d6...");
		first_d.roll();
		System.out.println("Rolling the d20");
		sec_dice.roll();
		System.out.println("Rolling the Percentile...");
		third_d.roll();
		
		//one dice object and printing its highest value
		System.out.println("\nSetting the percentile to show "+third_d.getNo_of_sides());
		System.out.println("The side up is now "+third_d.getNo_of_sides()+". Finally.");
		
		//bonus
		System.out.println("\n--------");
		System.out.println("BONUS");
		System.out.println("---------");
		
		//creating 5 six-sided dice
		System.out.println("Creating 5 d6...");
		
		
		create_dice();
	}
	private static void create_dice() {
	
	//declare variables of 5 dice
	Die d1,d2,d3,d4,d5;
	
	//array to store current side up of dice
	int [] rolls=new int[5];
	
	//represent status of same values of each dice
	boolean result;
	
	//declare variable to counts rolls
	int count=0;
	
	//loop
	do {
		//creating 5 dice
		 d1 =new Die(6,"d1");
		 d2=new Die(6,"d2");
		 d3=new Die(6,"d3");
		 d4=new Die(6,"d4");
		 d5=new Die(6,"d5");
		 
		 //roll each dice
		 rolls[0]=d1.getCurr_side_up();
	
		 rolls[1]=d2.getCurr_side_up();
	
		 rolls[2]=d3.getCurr_side_up();
	
		 rolls[3]=d4.getCurr_side_up();
		
		 rolls[4]=d5.getCurr_side_up();
			
	count++;
	
	result=rolls_count(rolls);

	
	}
	while(result==false);
	System.out.println("YAHTZEE! It took "+ count+" rolls");

	}
	
	//check values of 5 dice rolls are equal or not
	private static boolean rolls_count(int [] rolls) {
		

		
		for(int i=0;i<rolls.length;i++) {
			
	
			if(rolls[0]!= rolls[i])
			{
				
				//if roll current side up values are not equal it returns false
				return false;
				}
			
			}
		//otherwise it returns true
		return true;	
	}
	
}
