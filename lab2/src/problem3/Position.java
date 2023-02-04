package problem3;

public class Position {
	char letter;
	int num;
	Position(int n, char c){
		this.num = n;
		this.letter = c;
	}
	int getByNum() {
		if(letter == 'A') return 1;
		if(letter == 'B') return 2;
		if(letter == 'C') return 3;
		if(letter == 'D') return 4;
		if(letter == 'E') return 5;
		if(letter == 'F') return 6;
		if(letter == 'G') return 7;
		if(letter == 'H') return 8;
		return 0;
	}
}
