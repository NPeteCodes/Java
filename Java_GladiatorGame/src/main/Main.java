package main;

import game.Game;
import gladiators.*;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		
		Gladiator zeus 	= new Paladin("Zeus", 16, 9);
		game.addPlayerToGame(zeus);
		Gladiator deathly 	= new Warrior("Deathly", 20, 0);
		game.addPlayerToGame(deathly);
		
		Gladiator hades 	= new Warrior("Hades", 3, 25);
		game.addPlayerToGame(hades);
		Gladiator warlock 	= new Mage("Warlock", 10, 10);
		game.addPlayerToGame(warlock);
		
		
		Gladiator garr 	= new Paladin("Garr", 10, 12);
		game.addPlayerToGame(garr);
		Gladiator priest 	= new Mage("Priest", 15, 7);
		game.addPlayerToGame(priest);		
		
		
		
		Gladiator winner = game.war();		
		System.out.println("Winner: " + winner);
	}
	
	
}
