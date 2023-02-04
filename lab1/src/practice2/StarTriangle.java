package practice2;

public class StarTriangle {
	private int size;
	public String s;
	StarTriangle(int size){
		this.size = size;
	}
	public String toString() {
		String res = "";
		for(int i = 1; i <= size;i++) {
			for(int j = 1; j <= i;j++) {
				res+="[*]";
			}
			res += "\n";
		}
		return res;
	}
}
