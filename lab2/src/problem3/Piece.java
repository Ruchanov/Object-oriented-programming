package problem3;

public abstract class Piece {
	public abstract boolean isLegalMove(Position a,Position b);
	public boolean correctPos(Position a) {
		if(a.num >= 1 && a.num <= 8 && a.getByNum() >= 1 && a.getByNum() <= 8) {
			return true;
		}
		return false;
	}
}
