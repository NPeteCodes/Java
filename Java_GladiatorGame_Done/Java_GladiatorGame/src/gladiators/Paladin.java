package gladiators;

import java.util.Random;

public class Paladin extends Gladiator {
	
	private int healCoolDown = 0;
	
	public Paladin(String name, int attackPower, int blockPower) {
		super(name, attackPower, blockPower);
	}

	@Override
	public void setHealthPoint(int healthPoint) {
		
		/** NewHP < 15? */
		if( (healthPoint < 15) && (this.healCoolDown <= 0) )
		{
			/** HP = NewHP + BP */
			super.setHealthPoint( healthPoint + this.getBlockPower() );
			
			this.healCoolDown = (new Random()).nextInt(10);
		}
		else
		{
			this.healCoolDown--;
			super.setHealthPoint(healthPoint);
		}
	}


}
