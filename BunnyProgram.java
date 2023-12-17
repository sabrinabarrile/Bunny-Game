import java.io.*;
import java.util.*;
public class BunnyProgram 
{
	public static int loveCounter = 0;
	public static int playCounter = 0, feedCounter = 0, cleanLitterCounter = 0, treatCounter = 0, petCounter = 0;
	public static void main(String [] args)
	{
		Scanner in = new Scanner(System.in);
		//int loveCounter = 0;
		//int playCounter = 0, feedCounter = 0, cleanLitterCounter = 0, treatCounter = 0, petCounter = 0;
		welcomeStatement();
		String bunnyName = nameYourBun();
		DayOne(bunnyName);
		DayOneChoice(bunnyName);
		//System.out.println(playCounter + feedCounter + cleanLitterCounter + treatCounter + petCounter + loveCounter);
		DayTwo(bunnyName);
		DayTwoChoice(bunnyName);
		//System.out.println(playCounter + feedCounter + cleanLitterCounter + treatCounter + petCounter + loveCounter);
		DayThree(bunnyName);
		DayThreeChoice(bunnyName);
		//System.out.println(playCounter + feedCounter + cleanLitterCounter + treatCounter + petCounter + loveCounter);
		DayFour(bunnyName);
		DayFourChoice(bunnyName);
		results(bunnyName);
	}

	public static void welcomeStatement()
	{
		System.out.println("Hiya!! Welcome to the bunny program. In this program, you'll receive a pet bunny!");
		System.out.println("It's your job to make correct choices over the span of four days and prevent your bunny from running away!");
		System.out.println("It is highly recommended to complete every possible action for every day.");
	}
	
	public static String nameYourBun()
	{
		Scanner in = new Scanner(System.in);
		String bunnyName;
		System.out.println("\nPlease enter a name for your bunny!");
		bunnyName = in.nextLine(); 
		System.out.println("Aww, so cute! Welcome to the (digital) world, " + bunnyName + "!!");
		System.out.println("Let's get started! :)");
		return bunnyName;
	}
	
	public static void DayOne(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		String answer = null;
		System.out.println("\nDay One");
		System.out.println("_________\n");
		
		boolean runIt = true;
		while (runIt)
		{
		chooseYourAction(bunnyName);
		System.out.println("Would you like to complete another action? Yes or no");
		answer = in.nextLine();
			if(answer.charAt(0) == 'N' || answer.charAt(0) == 'n')
			{
				runIt = false;
			}
		}
		
		//return feedCounter + cleanLitterCounter + treatCounter + petCounter + playCounter;
	}
	
	public static void DayOneChoice(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		String userAnswer;
		int Situation;
		Situation = (int) (Math.random() * 3) + 1;
		if (Situation == 1)
		{
			System.out.println("You watch " + bunnyName + " look longily outside.");
			System.out.println("Do you let " + bunnyName + " outside? Yes or no");
			userAnswer = in.nextLine();
			if(userAnswer.charAt(0) == 'Y' || userAnswer.charAt(0) == 'y')
			{
				loveCounter ++;
			}
			if(userAnswer.charAt(0) == 'N' || userAnswer.charAt(0) == 'n')
			{
				loveCounter --;
			}
		}
		if (Situation == 2)
		{
			System.out.println(bunnyName + " looks outside with no particular interest or disinterest.");
			System.out.println("Do you let " + bunnyName + " outside? Yes or no");
			userAnswer = in.nextLine();
			if(userAnswer.charAt(0) == 'Y' || userAnswer.charAt(0) == 'y')
			{
				loveCounter += 0;
			}
			if(userAnswer.charAt(0) == 'N' || userAnswer.charAt(0) == 'n')
			{
				loveCounter += 0;
			}
		}
		if (Situation == 3)
		{
			System.out.println("You see " + bunnyName + " look outside with immense fear.");
			System.out.println("Do you let " + bunnyName + " outside? Yes or no");
			userAnswer = in.nextLine();
			if(userAnswer.charAt(0) == 'Y' || userAnswer.charAt(0) == 'y')
			{
				loveCounter --;
			}
			if(userAnswer.charAt(0) == 'N' || userAnswer.charAt(0) == 'n')
			{
				loveCounter ++;
			}
		}

		System.out.println("Okay! Let's go to the next day!");
		
	}

	public static void DayTwo(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		String answer = null;
		System.out.println("\nDay Two");
		System.out.println("_________\n");
		
		boolean runIt = true;
		while (runIt)
		{
		chooseYourAction(bunnyName);
		System.out.println("Would you like to complete another action? Yes or no");
		answer = in.nextLine();
			if(answer.charAt(0) == 'N' || answer.charAt(0) == 'n')
			{
				runIt = false;
			}
		}
		
		//return feedCounter + cleanLitterCounter + treatCounter + petCounter + playCounter;
	}
	
	public static void DayTwoChoice(String bunnyName)
	{
		Scanner in;
		in = new Scanner(System.in);
		String userAnswer;
			System.out.println(bunnyName + " has continuously been staring over your shoulder at an ad for a new toy.");
			System.out.println("Do you buy " + bunnyName + " the toy? Choose option 1, 2, or 3.\n");
			System.out.println("1. Buy " + bunnyName + " the toy");
			System.out.println("2. Buy " + bunnyName + " a cheaper toy");
			System.out.println("3. Don't buy " + bunnyName + " any toys");
			int num;
			num = in.nextInt();
			switch(num)
			{
			case 1:
				loveCounter ++;
			
			case 2:
				loveCounter ++;
				
			case 3:
				loveCounter --;
		}

		System.out.println("Okay! Let's go to the next day!");
		
	}
	
	public static void DayThree(String bunnyName)
	{
		Scanner in;
		in = new Scanner(System.in);
		String answer = null;
		System.out.println("\nDay Three");
		System.out.println("_________\n");
		
		boolean runIt = true;
		while (runIt)
		{
		chooseYourAction(bunnyName);
		System.out.println("Would you like to complete another action? Yes or no");
		answer = in.nextLine();
			if(answer.charAt(0) == 'N' || answer.charAt(0) == 'n')
			{
				runIt = false;
			}
		}
		
		//return feedCounter + cleanLitterCounter + treatCounter + petCounter + playCounter;
	}
	
	public static void DayThreeChoice(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		String userAnswer;
		int Situation;
		Situation = (int) (Math.random() * 3) + 1;
		if (Situation == 1)
		{
			System.out.println(bunnyName + " has been jumping onto your bed a lot recently.");
			System.out.println("Do you set " + bunnyName + " down on your bed to sleep next to you at night? Yes or no");
			userAnswer = in.nextLine();
			if(userAnswer.charAt(0) == 'Y' || userAnswer.charAt(0) == 'y')
			{
				loveCounter ++;
			}
			if(userAnswer.charAt(0) == 'N' || userAnswer.charAt(0) == 'n')
			{
				loveCounter --;
			}
		}
		if (Situation == 2)
		{
			System.out.println("You catch " + bunnyName + " sleeping on your bed sometimes, and in their own bed other times.");
			System.out.println("Do you set " + bunnyName + " down on your bed to sleep next to you at night? Yes or no");
			userAnswer = in.nextLine();
			if(userAnswer.charAt(0) == 'Y' || userAnswer.charAt(0) == 'y')
			{
				loveCounter += 0;
			}
			if(userAnswer.charAt(0) == 'N' || userAnswer.charAt(0) == 'n')
			{
				loveCounter += 0;
			}
		}
		if (Situation == 3)
		{
			System.out.println(bunnyName + " absolutely loves their bed and seems the most comfortable there.");
			System.out.println("Do you set " + bunnyName + " down on your bed to sleep next to you at night? Yes or no");
			userAnswer = in.nextLine();
			if(userAnswer.charAt(0) == 'Y' || userAnswer.charAt(0) == 'y')
			{
				loveCounter --;
			}
			if(userAnswer.charAt(0) == 'N' || userAnswer.charAt(0) == 'n')
			{
				loveCounter ++;
			}
		}

		System.out.println("Okay! Let's go to the final day!");
		
	}
	
	public static void DayFour(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		String answer = null;
		System.out.println("\nDay Four");
		System.out.println("_________\n");
		
		boolean runIt = true;
		while (runIt)
		{
		chooseYourAction(bunnyName);
		System.out.println("Would you like to complete another action? Yes or no");
		answer = in.nextLine();
			if(answer.charAt(0) == 'N' || answer.charAt(0) == 'n')
			{
				runIt = false;
			}
		}
		
		//return feedCounter + cleanLitterCounter + treatCounter + petCounter + playCounter;
	}
	
	public static void DayFourChoice(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		String userAnswer;
			System.out.println("You notice " + bunnyName + " has been limping.");
			System.out.println("How do you treat " + bunnyName + "? Choose option 1, 2, or 3.\n");
			System.out.println("1. Take " + bunnyName + " to the vet");
			System.out.println("2. Try and take care of " + bunnyName + "'s paw by yourself.");
			System.out.println("3. Ignore " + bunnyName + "'s paw");
			int num;
			num = in.nextInt();
			switch(num)
			{
			case 1:
				loveCounter ++;
			
			case 2:
				loveCounter += 0;
				
			case 3:
				loveCounter --;
		}

		System.out.println("Okay! Let's see how you did!");
	}
	
	public static void chooseYourAction(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		String choice;
		
		System.out.println("Would you like to feed " + bunnyName + ", pet " + bunnyName + ", play with ");
		System.out.println(bunnyName + ", clean "  + bunnyName + "'s litter, or give "  + bunnyName + " a treat?");
		choice = in.nextLine();
		YourChoice(choice, bunnyName);
		
	}
	
	public static void YourChoice (String choice, String bunnyName)
	{
		switch (choice.charAt(0))
		{
		
		case 'F':
		case 'f':
			{
			feedCounter = feedCounter + feedBunny(bunnyName);
			break;
			}
		}
		
		switch (choice.charAt(0))
		{
		case 'C':
		case 'c':
		case 'L':
		case 'l':
			{
			cleanLitterCounter = cleanLitterCounter + cleanLitter(bunnyName);
			break;
			}
		}
		
		switch (choice.charAt(0))
		{
		case 'G':
		case 'g':
		case 'T':
		case 't':
			{
			treatCounter = treatCounter + giveTreat(bunnyName);
			break;
			}
		}
		
		switch (choice.charAt(0))
		{
		case 'P':
		case 'p':
			{
				switch (choice.charAt(1))
				{
				case 'E':
				case 'e':
				{
					petCounter = petCounter + petBunny(bunnyName);
					break;
				}
				
				case 'L':
				case 'l':
				{
					playCounter = playCounter + playWithBunny(bunnyName);
					break;
				}
					
				}
			}
		}
	}
	
	public static int feedBunny(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many times will you feed " + bunnyName + " today?");
		feedCounter += in.nextInt();
		if (feedCounter == 1)
		{
			feedCounter += 0;
		}
		if(feedCounter == 2)
		{
			feedCounter ++;
		}
		if(feedCounter == 0)
		{
			feedCounter --;
		}
		if(feedCounter > 2)
		{
			feedCounter += -2;
		}
		return feedCounter;
	}
	
	public static int cleanLitter(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many times will you clean " + bunnyName + "'s litter today?");
		cleanLitterCounter += in.nextInt();
		if (cleanLitterCounter == 1)
		{
			cleanLitterCounter ++;
		}
		if(cleanLitterCounter == 2 || cleanLitterCounter == 0)
		{
			cleanLitterCounter --;
		}
		return cleanLitterCounter;
	}
	
	public static int giveTreat(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many times will you give " + bunnyName + " a treat today?");
		treatCounter += in.nextInt();
		if (treatCounter == 1)
		{
			treatCounter ++;
		}
		if(treatCounter == 2)
		{
			treatCounter --;
		}
		if(treatCounter == 0)
		{
			treatCounter += 0;
		}
		if(treatCounter > 2)
		{
			treatCounter += -2;
		}
		return treatCounter;
	}
	
	public static int petBunny(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many times will you pet " + bunnyName + " today?");
		petCounter += in.nextInt();
		if (petCounter == 1)
		{
			petCounter += 0;
		}
		if(petCounter == 2)
		{
			petCounter ++;
		}
		if (petCounter == 0 || petCounter > 2)
		{
			petCounter --;
		}
		return petCounter;
	}
	
	public static int playWithBunny(String bunnyName)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("How many times will you play with " + bunnyName + " today?");
		playCounter += in.nextInt();
		if (playCounter == 1)
		{
			playCounter ++;
		}
		if(playCounter == 2)
		{
			playCounter += 2;
		}
		if(playCounter == 0)
		{
			playCounter --;
		}
		return playCounter;
	}
	
	public static void results (String bunnyName)
	{
		int lC = playCounter + feedCounter + cleanLitterCounter + treatCounter + petCounter + loveCounter;
		//System.out.println(playCounter + feedCounter + cleanLitterCounter + treatCounter + petCounter + loveCounter);
		
		System.out.println(lC);
		if(lC >= 18)
		{
			System.out.println(bunnyName + " comes up to you to give you a million kisses!");
			System.out.println("You're an amazing bunny parent! <3");
		}
		
		if(lC <= 17 && lC >= 0)
		{
			System.out.println(bunnyName + " looks at you with a blank expression and hops the other way.");
			System.out.println("You're an alright bunny parent.. but more effort would be appreciated.");
		}
		if(lC < 0)
		{
			System.out.println("You wake up one morning to find " + bunnyName + "'s area vacant.");
			System.out.println("Maybe if you would have been a better bunny parent things would have turned out differently..");
		}
	}
}

