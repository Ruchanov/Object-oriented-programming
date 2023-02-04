package problem5;

import java.util.Vector;

public class Dragon {
	Dragon(){
		
	}
	Vector<Person> v = new Vector<Person>();
	
	int numGirls=0,numBoys=0;
	public void kidnap(Person p){
		v.addElement(p);
		if(p.gen.equals("B")) {
			numBoys += 1;
		}
		if(p.gen.equals("G")) {
			numGirls += 1;
		}
	}
	void kidnap(char c){
		Person p = new Person(c);
		kidnap(p);
	}
	public boolean wiilDragonEatOrNot() {
		int cnt = 0;
		if(numBoys != numGirls) {
			return false;
		}
		for(int i = 0;i < v.size();i++) {
			if(v.get(i).gen == Gender.Boy) {
				cnt+=1;
			}
			else if(cnt>0){
				cnt-=1;
			}else {
				return false;
			}
		}
		if(cnt == 0) {
			return true;
		}else {
			return false;
		}

	}
}
