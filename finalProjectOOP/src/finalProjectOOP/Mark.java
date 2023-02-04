package finalProjectOOP;

import java.io.Serializable;
import java.util.Objects;

public class Mark implements Serializable{
	private double midTerm; 
	private double endTerm; 
    private double finalPoint; 
    private String letter=""; 
    private double gpa=0; 
    public Mark(){ 
        this.midTerm=0; 
        this.endTerm=0; 
        this.finalPoint=0; 
    } 
    public double getGpa() { 
        determineLetter(); 
        return gpa; 
    } 
    public String getLetter() { 
        determineLetter(); 
        return letter; 
    } 
    public double getMidTerm() { 
        return this.midTerm; 
    } 
    public void setMidTerm(double midTerm) { this.midTerm = midTerm; } 
    public double getEndTerm() { return this.endTerm; } 
    public void setEndTerm(double endTerm) { 
        this.endTerm = endTerm; 
    } 
    public double getFinal() { return this.finalPoint; } 
    public void setFinal(double finalPoint) { this.finalPoint = finalPoint; } 

    public void midAddPoint(double point) { 
        this.midTerm+=point; 
    } 
    public void endAddPoint(double point) { 
        this.endTerm+=point; 
    } 
    
    public double total()
    {
    	return this.midTerm+this.endTerm+this.finalPoint;
    } 
    public void determineLetter() { 
        String[] letters = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D"}; 
        double[] gpa = {4.0, 3.67, 3.33, 3.0, 2.67, 2.33, 2.0, 1.67, 1.33, 1.0}; 
        int[] scores = {95, 90, 85, 80, 75, 70, 65, 60, 55, 50}; 
        String letter = null; 
        double gpaCnt = 0; 
        for (int i = 0; i < scores.length; i++) 
            if (total() >= scores[i]) { 
                letter = letters[i]; 
                gpaCnt = gpa[i]; 
                break; 
            } 
        if (letter.equals(null)) 
            letter = "F"; 
        this.letter = letter; 
        this.gpa = gpaCnt; 
    } 
    @Override 
    public String toString() { 
        return "Attestation: " + 
                "\t|MidTerm=" + midTerm + 
                "\t|EndTerm=" + endTerm + 
                "\t|FinalPoint=" + finalPoint; 
    } 
    public boolean equals(Object o) { 
        if (this!=o || o==null) return false; 
        Mark att=(Mark) o; 
        return this.midTerm==att.getMidTerm() && this.endTerm==att.getMidTerm() && this.finalPoint==att.getFinal(); 
    } 
    public int hashCode() { 
        return Objects.hash(this); 
    } 
}
