package gladiators;

import java.util.Random;

public class Warrior extends Gladiator {

	public Warrior(String name, int attackPower, int blockPower) {
		super(name, attackPower, blockPower);
	}

	@Override
	public int getAttackPower() {
		int attackPower = super.getAttackPower();
		
		double randomNumber = ((new Random()).nextDouble());
		if(randomNumber > 0.25)
		{
			attackPower *= 2;
		}
		
		return attackPower;
	}

}
