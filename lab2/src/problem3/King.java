//ready
package problem3;

public class King extends Piece {
	public boolean isLegalMove(Position a,Position b) {
		if(super.correctPos(a) && super.correctPos(b)) {
			if(b.getByNum() >= a.getByNum() -1 && b.getByNum() <= a.getByNum() + 1 && b.num >= a.num -1 && b.num <= a.num+1) {
				return true;
			}else {
				return false;
			}			
		}
		return false;
	}
}
