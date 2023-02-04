package finalProjectOOP;

public class Message {
	private String theme;
	private String text;
	private Employee receiver, sender;
	public Message(String theme, String text, Employee receiver) {
		this.theme = theme;
		this.text = text;
		this.receiver = receiver;
	}
	public String readMassage() {
		return "Message from" + this.sender.getName() + " " + this.sender.getSurname() + "/n" +  this.theme + "/n" + this.text;
	}
	
}
