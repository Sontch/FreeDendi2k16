package application;

public class Captain {
	
	String side = "Radiant";
	
	/**
	 * Basic constructor for Captain objects.
	 * @param side Determines the starting side of each captain, either Radiant or Dire. (The two "teams" of dota)
	 */
	public Captain(String side)
	{
		this.side = side;
		
	}
	
	
	/**
	 * Determines the side of a Captain object, used in the proceeding methods. 
	 * @return String of either "Radiant" or "Dire"
	 */
	public String getSide()
	{
		return this.side;	
	}
	
	/*
	 * Determines a Captain's side and tells the Hero class to do corresponding manipulation of hero objects.
	 */
	public void pickHero(String name)
	{
		if (this.getSide().equals("Radiant"))
		{
			Hero.radiantPick(name);
		}
		else
		{
			Hero.direPick(name);
		}
		
	}
	
	/*
	 * Determines the side of the Captain object involved and communicates the proper procedure to the Hero class.
	 */
	public void banHero(String name)
	{
		if (this.getSide().equals("Radiant"))
		{
			Hero.radiantBan(name);
		}
		else
		{
			Hero.direBan(name);
		}
	}

	/**
	 * Takes a parameter of Side and talks to the Analyzer class to do the appropriate function.
	 * @param side The side of the desired picks up for analysis. 
	 */
	public void analyzePicks(String side)
	{
		if(side.equals("Radiant"))
		{
			Analyzer.analyzeRadiantPicks();
		}
		else
		{
			Analyzer.analyzeDirePicks();
			
		}
	}

	/*
	 * Same functionality as the analyzePicks function, but with the banned heroes instead. 
	 */
	public void analyzeBans(String side)
	{
		if(side.equals("Radiant"))
		{
			Analyzer.analyzeRadiantBans();
		}
		else
		{
			Analyzer.analyzeDireBans();
		}
	}
	

}
