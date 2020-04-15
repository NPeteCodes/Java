package gladiators;

import java.util.Random;

public abstract class Gladiator {
	
	/** ATTRIBUTES */
	private String name;
	
	/** 0 - 100 */
	private int healthPoint = 100;

	private int attackPower;
	
	private int blockPower;


	/** CONSTRUCTOR */
	public Gladiator(String name, int attackPower, int blockPower) {
		this.name = name;
		this.attackPower = attackPower;
		this.blockPower = blockPower;
	}

	
	/** SETTERS & GETTERS */
	public String getName() {
		return name;
	}
	
	public int getHealthPoint() {
		return healthPoint;
	}

	public void setHealthPoint(int healthPoint) {
		this.healthPoint = healthPoint;
	}

	public int getAttackPower() {
		return attackPower;
	}
	
	public void setAttackPower(int attackPower) {
		this.attackPower = attackPower;
	}

	public int getBlockPower() {
		return blockPower;
	}

	
	/** TOSTRING */
	@Override
	public String toString() {
		return "Character [name=" + name + ", healthPoint=" + healthPoint + ", attackPower=" + attackPower
				+ ", blockPower=" + blockPower + "]";
	}
	
	
	/** METHODS */
	public void attackedByAttackPower(int enemyAttackPower)	{
		
		int blockPower = 0;
		/** 75% chance for blocking */
		if( (new Random()).nextDouble() >= 0.75 )
		{
			blockPower = this.getBlockPower();
		}
		
		if(enemyAttackPower > blockPower)
		{
			/** newVitalityPoint := oldVitalityPoint – (attackPower – blockPower) */
			int newVitalityPoint = this.getHealthPoint() - (enemyAttackPower-blockPower);
			
			/** Save */ 
			this.setAttackPower(newVitalityPoint);
		}
		else
		{
			/** Every AttackPower is blocked */
		}		
	}
}
