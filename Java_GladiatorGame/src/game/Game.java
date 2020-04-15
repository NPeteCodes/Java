package game;

import java.util.ArrayList;

import gladiators.Gladiator;


public class Game {

	private ArrayList<Gladiator> players = new ArrayList<Gladiator>();
	
	public void addPlayerToGame(Gladiator newPlayer)
	{
		players.add(newPlayer);
	}
	
	public Gladiator war()
	{
		Gladiator winner = null;
		
		if( players.isEmpty() == false )
		{
			while(players.size() > 1)
			{
				Gladiator died = this.fight(players.get(1), players.get(2));
				System.out.println("Died player: " + died);
				players.remove( died );
			}
			
			
			winner = players.get(0);
		}
		return winner;
	}
	
	private Gladiator fight(Gladiator p1, Gladiator p2)
	{
		Gladiator died = null;
		
		/** Select the First attacker */
		Gladiator firstPlayer;
		Gladiator secondPlayer;	
		if(p1.getAttackPower() > p2.getAttackPower())
		{
			firstPlayer = p1;
			secondPlayer = p2;
		}
		else
		{
			firstPlayer = p2;
			secondPlayer = p1;
		}
		
		
		/** War */
		while ((firstPlayer.getHealthPoint() > 0) || (secondPlayer.getHealthPoint() > 0))
		{
			/** FirstPlayer attacks SecondPlayer */
			secondPlayer.attackedByAttackPower(firstPlayer.getAttackPower());
			
			/** SecondPlayer attacks FirstPlayer */
			firstPlayer.attackedByAttackPower(secondPlayer.getAttackPower());
		}
		
		
		/** Select the Dead Player */
		if( firstPlayer.getHealthPoint() <= 0 )
		{
			died = firstPlayer;
		}
		else
		{
			died = secondPlayer;
		}
		
		return died;
	}
}
