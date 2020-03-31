package gladiators;

public class Mage extends Gladiator {

	public Mage(String name, int attackPower, int blockPower) {
		super(name, attackPower, blockPower);
	}

	
	@Override
	public void setHealthPoint(int healthPoint) {
		
		/** NewHP == Prime? */
		if( this.isPrime(healthPoint) )
		{
			/** HP = OldHP * 2 */
			super.setHealthPoint(this.getHealthPoint()*2);	
		}
		else
		{
			/** HP = NewHP */
			super.setHealthPoint(healthPoint);
		}
	}


	@Override
	public int getAttackPower() {

		int attackPower = super.getAttackPower();
		
		/** HP == Prime? */
		if( this.isPrime(this.getHealthPoint()) )
		{
			/** AP = AP * 2 */
			attackPower *= 2;
		}
		else
		{
			/** Nothing to do here */
		}
		
		return attackPower;
	}

	private boolean isPrime(int checkedNumber)
	{
		boolean prime = true;
		int internalNumbers = 0;
		
		if( checkedNumber < 2 )
		{
			/** Smallest prime number 2*/
			prime = false;
		} else {
			/** Range: 2 - [checkedNumber/2] */
			for(internalNumbers = 2; internalNumbers <= (checkedNumber/2); internalNumbers++)
			{
				if( (checkedNumber % internalNumbers) == 0 )
				{
					prime = false;
					break;
				}
			}
		}

		
		return prime;
	}
}
