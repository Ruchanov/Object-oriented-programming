package problem3;

public class Bishop extends Piece{

	@Override
	public boolean isLegalMove(Position a, Position b) {
		if(super.correctPos(a) && super.correctPos(b)) {
			if(Math.abs(a.num - b.num) == Math.abs(a.getByNum() - b.getByNum())) {
				return true;
			}
			return false;
		}
		return false;
	}
	
}
