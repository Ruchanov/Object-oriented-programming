//ready
package problem3;

public class Pawn extends Piece{
	public boolean isLegalMove(Position a,Position b) {
		if(super.correctPos(a) && super.correctPos(b)) {			
			if(a.num == 2) {
				if(a.getByNum() == b.getByNum() && b.num>= a.getByNum() && b.getByNum()<= a.getByNum()+2 && b.getByNum()<= a.getByNum()+1){
					return true;
				}else {
					return false;
				}
			}else {
				if(a.num == b.num && b.getByNum() == a.getByNum() + 1) {
					return true;
				}else {
					return false;
				}
			}
		}
		return false;
	}
}
