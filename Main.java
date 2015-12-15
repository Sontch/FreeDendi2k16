package application;

import java.util.Scanner;

public class Main {

	/*
	 * Let the games begin. Catches an InterruptedException thrown by Thread.sleep();
	 */
	public static void main(String[] args)
	{
		Hero.loadHeroes();
		Captain radiantCaptain = new Captain("Radiant");
		Captain direCaptain = new Captain("Dire");
		
		try{
			System.out.println("<==============================>");
			System.out.println("Welcome to the Dota 2 DraftSim!");
			System.out.println("<==============================>");
			Thread.sleep(3000);
		
			Scanner ui = new Scanner(System.in);
			System.out.println("Radiant Captain, input your first ban!");
			radiantCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Dire Captain, ban your first hero!");
			direCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Radiant Captain, next ban!");
			radiantCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Dire Captain, your second ban, please!");
			direCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("First pick goes to the Radiant!");
			radiantCaptain.pickHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Dire Captain, pick your first two heroes! (One at a time, please)");
			direCaptain.pickHero(ui.next());
			direCaptain.pickHero(ui.next());
			Thread.sleep(2000);
			
			
			System.out.println();
			System.out.println();
			
			System.out.println("Radiant Captain, pick your second hero!");
			radiantCaptain.pickHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Let's take a look at the drafts!");
			Hero.showDrafts();
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Dire Captain, make your third ban!");
			direCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Radiant Captain, ban your third hero!");
			radiantCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Dire Captain, ban a fourth hero!");
			direCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Radiant Captain, ban your fourth hero!");
			radiantCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Dire Team gets third pick!");
			direCaptain.pickHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Radiant Team, take your third pick!");
			radiantCaptain.pickHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Dire Team, pick number four!");
			direCaptain.pickHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Radiant team, finish your fourth pick!");
			radiantCaptain.pickHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Let's see those drafts so far!");
			
			Hero.showDrafts();
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Dire Team, make your last ban!");
			direCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Radiant Team, make your last ban!");
			radiantCaptain.banHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Dire Team, finish your draft!");
			direCaptain.pickHero(ui.next());
			Thread.sleep(2000);
			
			System.out.println();
			System.out.println();
			
			System.out.println("Radiant Captain, you have the last pick!");
			radiantCaptain.pickHero(ui.next());
			Thread.sleep(2000);
			ui.close();
			
			System.out.println();
			System.out.println();
			
			System.out.println("Here are the final drafts!");
			
			Hero.showDrafts();
			Thread.sleep(2000);
			
			System.out.println("Analysis of Radiant Bans:");
			Analyzer.analyzeRadiantBans();
			
			System.out.println();
			System.out.println();
			Thread.sleep(30000);
			
			System.out.println("Analysis of Radiant Picks:");
			Analyzer.analyzeRadiantPicks();
			
			System.out.println();
			System.out.println();
			Thread.sleep(30000);
			
			System.out.println("Analysis of Dire Bans:");
			Analyzer.analyzeDireBans();
			
			System.out.println();
			System.out.println();
			Thread.sleep(30000);
			
			System.out.println("Analysis of Dire Picks:");
			Analyzer.analyzeDirePicks();
			
			System.out.println();
			System.out.println();
			Thread.sleep(30000);
			
			
			
			System.out.println();
			System.out.println();
			
			System.out.println("That's all folks! Please donate to the Dendi fund to get Dendi back on Na'vi!");
			System.out.println("#FreeDendi2k15");
			
		}catch (InterruptedException e)
		{
			
		}
		}
		
		
	}

