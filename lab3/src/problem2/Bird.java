package problem2;

public class Bird implements Flyable{
	boolean isLivingCreature;
	Bird(boolean isLivingCreature){
		this.isLivingCreature = isLivingCreature;
	};
	@Override
	public boolean canMove() {
		// TODO Auto-generated method stub
		if(isLivingCreature) {
			return true;
		}
		return false;
	}

	@Override
	public boolean canFly() {
		// TODO Auto-generated method stub
		if(canMove()) {
			return true;
		}
		return false;
	}
}
