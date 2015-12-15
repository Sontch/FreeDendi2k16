package application;


public class Analyzer {

	private static int carries;
	private static int mids;
	private static int offlaners;
	private static int supports;
	private static int junglers;
	
	
	/*
	 * Basic constructor for the Analyzer class.
	 */
	public Analyzer()
	{
		
	}
	
	/**
	 * Makes note of the composition of the banned hero objects from the Radiant Captain.
	 */
	public static void analyzeRadiantBans()
	{
		carries = 0;
		mids = 0;
		offlaners = 0;
		supports = 0;
		junglers = 0;
		
		for (Hero ban : Hero.radiantBans)
		{
			if(ban.getRole().equals("Carry"))
			{
				carries++;
			}
			
			if(ban.getRole().equals("Mid"))
			{
				mids++;
			}
			
			if(ban.getRole().equals("Offlaner"))
			{
				offlaners++;
			}
			
			if(ban.getRole().equals("Support"))
			{
				supports++;
			}
			
			if(ban.getRole().equals("Jungler"))
			{
				junglers++;
			}
			
				
		}
		analyzeBans(carries, mids, offlaners, supports, junglers);
	}
	
	/**
	 * Makes note of the banned hero objects from the Dire Captain.
	 */
	public static void analyzeDireBans()
	{
		carries = 0;
		mids = 0;
		offlaners = 0;
		supports = 0;
		junglers = 0;
		
		for (Hero ban : Hero.direBans)
		{
			if(ban.getRole().equals("Carry"))
			{
				carries++;
			}
			
			if(ban.getRole().equals("Mid"))
			{
				mids++;
			}
			
			if(ban.getRole().equals("Offlaner"))
			{
				offlaners++;
			}
			
			if(ban.getRole().equals("Support"))
			{
				supports++;
			}
			
			if(ban.getRole().equals("Jungler"))
			{
				junglers++;
			}
			
		}
		analyzeBans(carries, mids, offlaners, supports, junglers);
		
	}
	
	/**
	 * Makes note of the picked hero objects from the Radiant Captain.
	 */
	public static void analyzeRadiantPicks()
	{
		carries = 0;
		mids = 0;
		offlaners = 0;
		supports = 0;
		junglers = 0;
		
		for (Hero pick : Hero.radiantPicks)
		{
			if(pick.getRole().equals("Carry"))
			{
				carries++;
			}
			
			if(pick.getRole().equals("Mid"))
			{
				mids++;
			}
			
			if(pick.getRole().equals("Offlaner"))
			{
				offlaners++;
			}
			
			if(pick.getRole().equals("Support"))
			{
				supports++;
			}
			
			if(pick.getRole().equals("Jungler"))
			{
				junglers++;
			}
			
				
		}
		analyzePicks(carries, mids, offlaners, supports, junglers);
	}
	
	/**
	 * Makes note of the picked hero objects from the Dire Captain.
	 * 
	 */
	public static void analyzeDirePicks()
	{
		carries = 0;
		mids = 0;
		offlaners = 0;
		supports = 0;
		junglers = 0;
		
		for (Hero pick : Hero.direPicks)
		{
			if(pick.getRole().equals("Carry"))
			{
				carries++;
			}
			
			if(pick.getRole().equals("Mid"))
			{
				mids++;
			}
			
			if(pick.getRole().equals("Offlaner"))
			{
				offlaners++;
			}
			
			if(pick.getRole().equals("Support"))
			{
				supports++;
			}
			
			if(pick.getRole().equals("Jungler"))
			{
				junglers++;
			}
			
				
		}
		analyzePicks(carries, mids, offlaners, supports, junglers);
	}
	
	/**
	 * Takes input from the preceding functions and returns helpful tips based on team composition.
	 * @param carries The number of hero objects with the role of Carry in a given ArrayList.
	 * @param mids The number of hero objects with the role of Mid in a given ArrayList.
	 * @param offlaners The number of hero objects with the role of Offlaner in a given ArrayList.
	 * @param supports The number of hero objects with the role of Support in a given ArrayList. 
	 * @param junglers The numbe rof hero objects with the role of Jungler in a given ArrayList.
	 */
	public static void analyzePicks(int carries, int mids, int offlaners, int supports, int junglers)
	{
		if (carries >= 2 && junglers >= 1)
		{
			System.out.println("You got that Greevil's Greed, son.");
			System.out.println();
			System.out.println();
		}
		
		if (carries >= 3 && carries < 5)
		{
			System.out.println("You didn't want to win the early game, anyway.");
			System.out.println("Try a support or two.");
			System.out.println();
			System.out.println();
		}
		
		if (carries == 0)
		{
			System.out.println("You got about 15 minutes.");
			System.out.println("You could use a hard carry.");
			System.out.println();
			System.out.println();
		}
		
		if (carries == 5)
		{
			System.out.println("Is that you, Champ?");
			System.out.println("Try 4 less carries.");
			System.out.println();
			System.out.println();
		}
		
		if (mids == 0)
		{
			System.out.println("My name is Sontch and I find this offensive.");
			System.out.println("Try a mid hero.");
			System.out.println();
			System.out.println();
		}
		
		if (mids >= 2 && mids < 5)
		{
			System.out.println("Nobody likes a crowded midlane.");
			System.out.println("You might have too many mids.");
			System.out.println();
			System.out.println();
		}
		
		if (mids == 5)
		{
			System.out.println("My name is Sontch, and I approve.");
			System.out.println("Why would you have so many mids?");
			System.out.println();
			System.out.println();
		}
		
		if (offlaners == 0)
		{
			System.out.println("Somebody has to lose lane with style.");
			System.out.println("You don't have a traditional offlaner. Try Clockwerk.");
			System.out.println();
			System.out.println();
		}
		
		if (offlaners >= 2)
		{
			System.out.println("You only HAVE to lose one lane.");
			System.out.println("You don't usually need two offlaners.");
			System.out.println();
			System.out.println();
		}
		
		if (offlaners == 5)
		{
			System.out.println("Trippin can win any lane. You can't.");
			System.out.println("Please don't have this many offlaners.");
			System.out.println();
			System.out.println();
		}
		
		if(supports == 0)
		{
			System.out.println("Solo supporting is bad enough. Don't do this.");
			System.out.println("Try at least one support. Preferably two.");
			System.out.println();
			System.out.println();
			
		}
		
		if(supports == 1)
		{
			System.out.println("Solo Support > no Support");
			System.out.println("This is sometimes acceptable. But usually not.");
			System.out.println();
			System.out.println();
		}
		
		if(supports == 3)
		{
			System.out.println("I like your style, kid.");
			System.out.println("If it isn't shaker offlane, please stop.");
			System.out.println();
			System.out.println();
			
		}
		
		if(supports == 4)
		{
			System.out.println("Yo dawg, I heard you like supports.");
			System.out.println("You have too many supports.");
			System.out.println();
			System.out.println();
		}
		
		if(supports == 5)
		{
			System.out.println("How many supports does it take to kill the enemy carry?");
			System.out.println("Usually only two. Or maybe just Daniel.");
			System.out.println();
			System.out.println();
		}
		
		if(junglers == 1)
		{
			System.out.println("One of your lanes will be weaker.");
			System.out.println("Take the risk.");
			System.out.println();
			System.out.println();
		}
		
		if(junglers == 2)
		{
			System.out.println("So Enchantress and Enigma walk into the jungle...");
			System.out.println("Enchantress goes to the offlane. Sproink!");
			System.out.println();
			System.out.println();
		}
		
		if(junglers == 3 || junglers == 4)
		{
			System.out.println("It's not called a jungle because it's big.");
			System.out.println("What are you doing with all these junglers?");
			System.out.println();
			System.out.println();
		}
		
		if(junglers == 5)
		{
			System.out.println("I can't believe you've done this.");
			System.out.println("WHO EVEN JUNGLES ANYMORE?");
			System.out.println();
			System.out.println();
		}
		
		if (carries == 1 && mids == 1 && offlaners == 1 && supports == 2)
		{
			System.out.println("Quality draft.");
			System.out.println();
			System.out.println();
		}
		
		
		
		
		
	}

	/**
	 * Same functionality as analyzePicks, but provides useful information based off the opposing team's bans.
	 * @param carries The number of hero objects with the role of Carry in a given ArrayList.
	 * @param mids The number of hero objects with the role of Mid in a given ArrayList.
	 * @param offlaners The number of hero objects with the role of Offlaner in a given ArrayList.
	 * @param supports The number of hero objects with the role of Support in a given ArrayList. 
	 * @param junglers The numbe rof hero objects with the role of Jungler in a given ArrayList.
	 */
	public static void analyzeBans(int carries, int mids, int offlaners, int supports, int junglers)
	{
		if (carries == 0)
		{
			System.out.println("There's no late game banned out.");
			System.out.println();
			System.out.println();
		}
		
		if (mids == 0)
		{
			System.out.println("Dominant midlaners are still in the pool.");	
			System.out.println();
			System.out.println();
		}
		
		if (offlaners == 0)
		{
			System.out.println("Some strong utility heroes haven't been banned out");
			System.out.println();
			System.out.println();
		}
		
		if (supports == 0)
		{
			System.out.println("Some quality supports in the pool. Get that Lich and Omniknight.");
			System.out.println();
			System.out.println();
		}
		
		if (junglers == 0)
		{
			System.out.println("If you can hold your lanes, you can get any jungle efficiency you want.");
			System.out.println();
			System.out.println();
		}
		
		if (carries == 1 || mids == 1)
		{
			System.out.println("Who does that carry or mid counter hard?");
			System.out.println();
			System.out.println();
		}
		
		if (offlaners >= 1)
		{
			System.out.println("That offlaner will probably tear them up. Phoenix or Doom most likely.");
			System.out.println();
			System.out.println();
		}
		
		if (supports >= 2)
		{
			System.out.println("Those supports stop something. Think about it.");
			System.out.println();
			System.out.println();
		}
		
		if (junglers == 1)
		{
			System.out.println("If they banned enigma, you showed too much teamfight. Otherwise they want a jungler.");
			System.out.println();
			System.out.println();
		}
		
		if (carries >= 2)
		{
			System.out.println("They really want to secure their late game.");
			System.out.println();
			System.out.println();
		}
		
		if (mids >= 2)
		{
			System.out.println("They have a fragile mid.");
			System.out.println();
			System.out.println();
		}
		
		
	}
}
