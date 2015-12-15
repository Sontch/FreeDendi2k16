package application;

import java.util.ArrayList;

public class Hero 
{
	
	private String heroName;
	private String attribute;
	private String role;
	
	public  static ArrayList<Hero> heroPool = new ArrayList<Hero>();
	public  static ArrayList<Hero> radiantPicks = new ArrayList<Hero>();
	public  static  ArrayList<Hero> direPicks = new ArrayList<Hero>();
	public  static ArrayList<Hero> radiantBans = new ArrayList<Hero>();
	public  static ArrayList<Hero> direBans = new ArrayList<Hero>();
	private static String bans;
	private static String picks;
	
	
	
	
	
	/**
	 * Basic constructor for objects of class Hero. 
	 * @param heroName - provides the name of the Hero object.
	 * @param attribute - provides the atribute (Strength, Agility, Intelligence) of the Hero object.
	 * @param role - provides the primary role (Carry, Mid, Offlane, Jungler, Support) of the Hero object.
	 */
	public Hero(String heroName, String attribute, String role)
	{
		this.heroName = heroName;
		this.attribute = attribute;
		this.role = role;
	}
	
	/*
	 * Initializes an ArrayList of all hero objects available to be manipulated.
	 * 
	 */
	public static void loadHeroes()
	{
		
		Hero Abaddon = new Hero("Abaddon", "Strength", "Carry");
		Hero Alchemist = new Hero("Alchemist", "Strength", "Carry");
		Hero Ancient_Apparition = new Hero("Ancient Apparition", "Intelligence", "Support");
		Hero Anti_Mage = new Hero("Anti Mage", "Agility", "Carry");
		Hero Axe = new Hero("Axe", "Stength", "Offlane");
		Hero Bane = new Hero("Bane", "Intelligence", "Support");
		Hero Batrider = new Hero("Batrider", "Intelligence", "Offlane");
		Hero Beastmaster = new Hero("Beastmaster", "Strength", "Offlane");
		Hero Bloodseeker = new Hero("Bloodseeker", "Agility", "Carry");
		Hero Bounty_Hunter = new Hero("Bounty Hunter", "Agility", "Offlane");
		Hero Brewmaster = new Hero("Brewmaster", "Stength", "Mid");
		Hero Bristleback = new Hero("Bristleback", "Strength", "Offlane");
		Hero Broodmother = new Hero("Broodmother", "Agility", "Offlane");
		Hero Centaur_Warrunner = new Hero("Centaur Warrunner", "Strength", "Offlane");
		Hero Chaos_Knight = new Hero("Chaos Knight", "Strength", "Carry");
		Hero Chen = new Hero("Chen", "Intelligence", "Jungler");
		Hero Clinkz = new Hero("Clinkz", "Agility", "Carry");
		Hero Clockwerk = new Hero("Clockwerk", "Strength", "Offlane");
		Hero Crystal_Maiden = new Hero("Crystal Maiden", "Intelligence", "Support");
		Hero Dark_Seer = new Hero("Dark Seer", "Intelligence", "Offlane");
		Hero Dazzle = new Hero("Dazzle", "Intelligence", "Support");
		Hero Death_Prophet = new Hero("Death Prophet", "Intelligence", "Mid");
		Hero Disruptor = new Hero("Disruptor", "Intelligence", "Support");
		Hero Doom = new Hero("Doom", "Strength", "Jungler");
		Hero Dragon_Knight = new Hero("Dragon Knight", "Strength", "Mid");
		Hero Drow_Ranger = new Hero("Drow Ranger", "Agility", "Carry");
		Hero Earth_Spirit = new Hero("Earth Spirit", "Strength", "Support");
		Hero Earthshaker = new Hero("Earthshaker", "Strength", "Support");
		Hero Elder_Titan = new Hero("Elder Titan", "Strength", "Support");
		Hero Ember_Spirit = new Hero("Ember Spirit", "Agility", "Carry");
		Hero Enchantress = new Hero("Enchantress", "Intelligence", "Jungler");
		Hero Enigma = new Hero("Enigma", "Intelligence", "Jungler");
		Hero Faceless_Void = new Hero("Faceless Void", "Agility", "Carry");
		Hero Gyrocopter = new Hero("Gyrocopter", "Agility", "Carry");
		Hero Huskar = new Hero("Huskar", "Strength", "Mid");
		Hero Invoker = new Hero("Invoker", "Intelligence", "Mid");
		Hero Io = new Hero("Io", "Strength", "Support");
		Hero Jakiro = new Hero("Jakiro", "Intelligence", "Support");
		Hero Juggernaut = new Hero("Juggernaut", "Agility", "Carry");
		Hero Keeper_of_the_Light = new Hero("Keeper of the Light", "Intelligence", "Support");
		Hero Kunkka = new Hero("Kunkka", "Strength", "Mid");
		Hero Legion_Commander = new Hero("Legion Commander", "Strength", "Carry");
		Hero Leshrac = new Hero("Leshrac", "Intelligence", "Mid");
		Hero Lich = new Hero("Lich", "Intelligence", "Support");
		Hero Lifestealer = new Hero("Lifestealer", "Strength", "Carry");
		Hero Lina = new Hero("Lina", "Intelligence", "Mid");
		Hero Lion = new Hero("Lion", "Intelligence", "Support");
		Hero Lone_Druid = new Hero("Lone Druid", "Agility", "Jungler");
		Hero Luna = new Hero("Luna", "Agility", "Carry");
		Hero Lycan = new Hero("Lycan", "Strength", "Jungler");
		Hero Magnus = new Hero("Magnus", "Strength", "Mid");
		Hero Medusa = new Hero("Medusa", "Agility", "Carry");
		Hero Meepo = new Hero("Meepo", "Agility", "Mid");
		Hero Mirana = new Hero("Mirana", "Agility", "Support");
		Hero Morphling = new Hero("Morphling", "Agility", "Carry");
		Hero Naga_Siren = new Hero("Naga Siren", "Agility", "Carry");
		Hero Natures_Prophet = new Hero("Natures Prophet", "Intelligence", "Jungler");
		Hero Necrophos = new Hero("Necrophos", "Intelligence", "Mid");
		Hero Night_Stalker = new Hero("Night Stalker", "Strength", "Mid");
		Hero Nyx_Assassin = new Hero("Nyx Assassin", "Agility", "Offlane");
		Hero Ogre_Magi = new Hero("Ogre Magi", "Intelligence", "Support");
		Hero Omniknight = new Hero("Omniknight", "Strength", "Support");
		Hero Oracle = new Hero("Oracle", "Intelligence", "Support");
		Hero Outworld_Devourer = new Hero("Outworld Devourer", "Intelligence", "Mid");
		Hero Phantom_Assassin = new Hero("Phantom Assassin", "Agility", "Carry");
		Hero Phantom_Lancer = new Hero("Phantom Lancer", "Agility", "Carry");
		Hero Phoenix = new Hero("Phoenix", "Strength", "Offlane");
		Hero Puck = new Hero("Puck", "Intelligence", "Mid");
		Hero Pudge = new Hero("Pudge", "Strength", "Mid");
		Hero Pugna = new Hero("Pugna", "Intelligence", "Mid");
		Hero Queen_of_Pain = new Hero("Queen of Pain", "Intelligence", "Mid");
		Hero Razor = new Hero("Razor", "Aglity", "Mid");
		Hero Riki = new Hero("Riki", "Agility", "Carry");
		Hero Rubick = new Hero("Rubick", "Intelligence", "Support");
		Hero Sand_King = new Hero("Sand King", "Strength", "Jungler");
		Hero Shadow_Demon = new Hero("Shadow Demon", "Intelligence", "Support");
		Hero Shadow_Fiend = new Hero("Shadow Fiend", "Agility", "Mid");
		Hero Shadow_Shaman = new Hero("Shadow Shaman", "Intelligence", "Support");
		Hero Silencer = new Hero("Silencer", "Intelligence", "Mid");
		Hero Skywrath_Mage = new Hero("Skywrath Mage", "Intelligence", "Support");
		Hero Slardar = new Hero("Slardar", "Strength", "Carry");
		Hero Slark = new Hero("Slark", "Agility", "Carry");
		Hero Sniper = new Hero("Sniper", "Agility", "Mid");
		Hero Spectre = new Hero("Spectre", "Agility", "Carry");
		Hero Spirit_Breaker = new Hero("Spirit Breaker", "Strength", "Offlane");
		Hero Storm_Spirit = new Hero("Storm Spirit", "Intelligence", "Mid");
		Hero Sven = new Hero("Sven", "Strength", "Carry");
		Hero Techies = new Hero("Techies", "Intelligence", "Support");
		Hero Templar_Assassin = new Hero("Templar Assassin", "Agility", "Mid");
		Hero Terrorblade = new Hero("Terrorblade", "Agility", "Carry");
		Hero Tidehunter = new Hero("Tidehunter", "Strength", "Offlane");
		Hero Timbersaw = new Hero("Timbersaw", "Strength", "Offlane");
		Hero Tinker = new Hero("Tinker", "Intelligence", "Mid");
		Hero Tiny = new Hero("Tiny", "Strength", "Carry");
		Hero Treeant_Protector = new Hero("Treeant Protector", "Strength", "Support");
		Hero Troll_Warlord = new Hero("Troll Warlord", "Agility", "Carry");
		Hero Tusk = new Hero("Tusk", "Strength", "Offlane");
		Hero Undying = new Hero("Undying", "Strength", "Support");
		Hero Ursa = new Hero("Ursa", "Agiliy", "Jungler");
		Hero Vengeful_Spirit = new Hero("Vengeful Spirit", "Agility", "Support");
		Hero Venomancer = new Hero("Venomancer", "Agility", "Support");
		Hero Viper = new Hero("Viper", "Agility", "Mid");
		Hero Visage = new Hero("Visage", "Intelligence", "Support");
		Hero Warlock = new Hero("Warlock", "Intelligence", "Support");
		Hero Weaver = new Hero("Weaver", "Agility", "Carry");
		Hero Windranger = new Hero("Windranger", "Intelligence", "Mid");
		Hero Winter_Wyvern = new Hero("Winter Wyvern", "Intelligence", "Support");
		Hero Witch_Doctor = new Hero("Witch Doctor", "Intelligence", "Support");
		Hero Wraith_King = new Hero("Wraith King", "Strength", "Carry");
		Hero Zeus = new Hero("Zeus", "Intelligence", "Mid");
		
		
		heroPool.add(Abaddon);
		heroPool.add(Alchemist);
		heroPool.add(Ancient_Apparition);
		heroPool.add(Anti_Mage);
		heroPool.add(Axe);
		heroPool.add(Bane);
		heroPool.add(Batrider);
		heroPool.add(Beastmaster);
		heroPool.add(Bloodseeker);
		heroPool.add(Bounty_Hunter);
		heroPool.add(Brewmaster);
		heroPool.add(Bristleback);
		heroPool.add(Broodmother);
		heroPool.add(Centaur_Warrunner);
		heroPool.add(Chaos_Knight);
		heroPool.add(Chen);
		heroPool.add(Clinkz);
		heroPool.add(Clockwerk);
		heroPool.add(Crystal_Maiden);
		heroPool.add(Dark_Seer);
		heroPool.add(Dazzle);
		heroPool.add(Death_Prophet);
		heroPool.add(Disruptor);
		heroPool.add(Doom);
		heroPool.add(Dragon_Knight);
		heroPool.add(Drow_Ranger);
		heroPool.add(Earth_Spirit);
		heroPool.add(Earthshaker);
		heroPool.add(Elder_Titan);
		heroPool.add(Ember_Spirit);
		heroPool.add(Enchantress);
		heroPool.add(Enigma);
		heroPool.add(Faceless_Void);
		heroPool.add(Gyrocopter);
		heroPool.add(Huskar);
		heroPool.add(Invoker);
		heroPool.add(Io);
		heroPool.add(Jakiro);
		heroPool.add(Juggernaut);
		heroPool.add(Keeper_of_the_Light);
		heroPool.add(Kunkka);
		heroPool.add(Legion_Commander);
		heroPool.add(Leshrac);
		heroPool.add(Lich);
		heroPool.add(Lifestealer);
		heroPool.add(Lina);
		heroPool.add(Lion);
		heroPool.add(Lone_Druid);
		heroPool.add(Luna);
		heroPool.add(Lycan);
		heroPool.add(Magnus);
		heroPool.add(Medusa);
		heroPool.add(Meepo);
		heroPool.add(Mirana);
		heroPool.add(Morphling);
		heroPool.add(Naga_Siren);
		heroPool.add(Natures_Prophet);
		heroPool.add(Necrophos);
		heroPool.add(Night_Stalker);
		heroPool.add(Nyx_Assassin);
		heroPool.add(Ogre_Magi);
		heroPool.add(Omniknight);
		heroPool.add(Oracle);
		heroPool.add(Outworld_Devourer);
		heroPool.add(Phantom_Assassin);
		heroPool.add(Phantom_Lancer);
		heroPool.add(Phoenix);
		heroPool.add(Puck);
		heroPool.add(Pudge);
		heroPool.add(Pugna);
		heroPool.add(Queen_of_Pain);
		heroPool.add(Razor);
		heroPool.add(Riki);
		heroPool.add(Rubick);
		heroPool.add(Sand_King);
		heroPool.add(Shadow_Demon);
		heroPool.add(Shadow_Fiend);
		heroPool.add(Shadow_Shaman);
		heroPool.add(Silencer);
		heroPool.add(Skywrath_Mage);
		heroPool.add(Slardar);
		heroPool.add(Slark);
		heroPool.add(Sniper);
		heroPool.add(Spectre);
		heroPool.add(Spirit_Breaker);
		heroPool.add(Storm_Spirit);
		heroPool.add(Sven);
		heroPool.add(Techies);
		heroPool.add(Templar_Assassin);
		heroPool.add(Terrorblade);
		heroPool.add(Tidehunter);
		heroPool.add(Timbersaw);
		heroPool.add(Tinker);
		heroPool.add(Tiny);
		heroPool.add(Treeant_Protector);
		heroPool.add(Troll_Warlord);
		heroPool.add(Tusk);
		heroPool.add(Undying);
		heroPool.add(Ursa);
		heroPool.add(Vengeful_Spirit);
		heroPool.add(Venomancer);
		heroPool.add(Viper);
		heroPool.add(Visage);
		heroPool.add(Warlock);
		heroPool.add(Weaver);
		heroPool.add(Windranger);
		heroPool.add(Winter_Wyvern);
		heroPool.add(Witch_Doctor);
		heroPool.add(Wraith_King);
		heroPool.add(Zeus);
		
	}
		
	/*
	 * @return the heroName of a given Hero object.
	 */
	public String getName()
	{
		return this.heroName;
	}
		
	/*
	 * @return the attribute of a given Hero object.
	 */
	public String getAttribute()
	{
		return this.attribute;
	}

	/*
	 * @return the role of a given Hero object.
	 */
	public String getRole()
	{
		return this.role;
	}

	/*
	 * Removes a hero from the heroPool ArrayList.
	 * @param hero Hero object to be removed.
	 */
	public static void removeHero(Hero hero)
	{
		heroPool.remove(hero);
	}

	/*
	 * Removes a Hero object from heroPool ArrayList and adds it
	 * to the radiantBans ArrayList
	 * 
	 * @param Name of the desired Hero object.
	 */
	public static void radiantBan (String name)
	{
		for (Hero hero : heroPool)
		{
			if (hero.getName().equals(name))
			{
				removeHero(hero);
				radiantBans.add(hero);
				System.out.println(name + " was banned!");
				break;
			}
			
		}
		
	}

	/*
	 * Removes a Hero object from the heroPool ArrayList and adds it
	 * to the direBans ArrayList.
	 * 
	 * @param Name of the desired Hero object.
	 */
	public static void direBan (String name)
	{
		for (Hero hero : heroPool)
		{
			if (hero.getName().equals(name))
			{
				removeHero(hero);
				direBans.add(hero);
				System.out.println(name + " was banned!");
				break;
			}
			
		}
		
	}
	
	/*
	 * Removes a Hero object from the heroPool ArrayList and adds it
	 * to the radiantPicks ArrayList.
	 */
	public static void radiantPick (String name)
	{
		for (Hero hero : heroPool)
		{
			if (hero.getName().equals(name))
			{
				removeHero(hero);
				radiantPicks.add(hero);
				System.out.println(name + " was picked!");
				break;
				
			}
			
		}
		
	}

	/*
	 * Removes a Hero object from the heroPool ArrayList and adds it
	 * to the direPicks ArrayList.
	 */
	public static void direPick(String name)
	{
		for (Hero hero : heroPool)
		{
			if (hero.getName().equals(name))
			{
				removeHero(hero);
				direPicks.add(hero);
				System.out.println(name + " was picked!");
				break;
			}
			
		}
		
	}
  /**
  *displays the bans and picks of each team in the Simulator.
  */
	public static void showDrafts()
	{
		bans = "";
		for (Hero hero : radiantBans)
		{
			bans = bans + hero.getName() + " ";
		}
		System.out.println("Radiant Team Bans: " + bans);
		
		bans = "";
		for (Hero hero : direBans)
		{
			bans = bans + hero.getName() + " ";
		}
		System.out.println("Dire Team Bans: " + bans);
		
		bans = "";
		picks = "";
		for (Hero hero : radiantPicks)
		{
			picks = picks + hero.getName() + " ";
		}
		System.out.println("Radiant Team Picks: " + picks);
		
		picks = " ";
		for(Hero hero : direPicks)
		{
			picks = picks + hero.getName() + " ";
		}
		System.out.println("Dire Team Picks: " + picks);
		picks = " ";
	}
	
	
}
	


