//ready
package problem3;

public class Rock extends Piece{
	public boolean isLegalMove(Position a,Position b) {
		if(super.correctPos(a) && super.correctPos(b)) {			
			if(a.letter == b.letter) {
				return true;
			}else if(a.num == b.num) {
				return true;
			}else {
				return false;
			}
		}
		return false;
	}
}
