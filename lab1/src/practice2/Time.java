package practice2;

public class Time {
	int hour,minute,second;
	Time(int hour,int minute,int second){
		if(hour > 24) {
			this.hour = hour % 24;
		}else {
			this.hour = hour;
		}
		if(minute  >= 60) {
			this.hour += minute / 60;
			this.minute = minute % 60;
		}else {
			this.minute = minute;
		}
		if(second < 60) {
			this.second = second;
		}if(second >= 60 && second <= 3600) {
			this.second = second % 60;
			this.minute += second / 60;
		}else {
			this.hour += second / 3600;
			this.second = second;			
		}
	}
	public String getUniversal() {
		return this.hour + ":" + this.minute + ":" + this.second;
	}
	public static String getUniversal2(int hour,int minute, int second) {
		return hour + ":" + minute + ":" + second;
	}
	public String getStandard() {
		String s = "AM";
		if(this.hour > 12) {
			this.hour -= 12;
			s = "PM"; 
		}
		return this.hour + ":" + this.minute + ":" + this.second + s;
	}
	
}
