package problem2;

import java.util.Objects;

public class FootballPlayer extends Person{
	String team;
	int number;
	FootballPlayer(String name, String surname, String s, int n){
		super(name,surname);
		team = s;
		number = n;
	}
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		FootballPlayer p = (FootballPlayer) o;
		return this.team.equals(p.team) && this.number == p.number;
	}
	public int hashcode() {
		return Objects.hash(name,surname,team,number);
	}
	public String toString() {
		return super.toString() + " is a " + this.team + "'s team player with number " + this.number;
	}
}
