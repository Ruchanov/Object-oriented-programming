package problem5;

public class Person {
	Gender gen;
	int age;
	Person(Gender g,int n){
		this.gen = g;
		this.age = n;
	}
	Person(char c){
		if(c == 'B') {
			this.gen = Gender.Boy;
		}else {
			this.gen = Gender.Girl;
		}
	}
}
