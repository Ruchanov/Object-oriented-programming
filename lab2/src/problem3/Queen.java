package problem3;

public class Queen extends Piece{

	@Override
	public boolean isLegalMove(Position a, Position b) {
		if(super.correctPos(a) && super.correctPos(b)) {
			if(b.getByNum() >= a.getByNum() -1 && b.getByNum() <= a.getByNum() + 1 && b.num >= a.num -1 && b.num <= a.num+1) {
				return true;
			}
			if(a.letter == b.letter || a.num == b.num) {
				return true;
			}
			if(Math.abs(a.num - b.num) == Math.abs(a.getByNum() - b.getByNum())) {
				return true;
			}
		}
		return false;
	}
	
}
