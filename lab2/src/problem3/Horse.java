package problem3;

public class Horse extends Piece{

	@Override
	public boolean isLegalMove(Position a, Position b) {
		if(super.correctPos(a) && super.correctPos(b)) {
			if((a.num - 1 == b.num || a.num + 1 == b.num) && (a.getByNum() - 2 == b.getByNum() || a.getByNum() + 2 == b.getByNum())){
				return true;
			}
			if((a.num - 2 == b.num || a.num + 2 == b.num) && (a.getByNum() - 1 == b.getByNum() || a.getByNum() + 1 == b.getByNum())) {
				return true;
			}
		}
		return false;
	}
	

}
