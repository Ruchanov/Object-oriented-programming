package exmp;
public class Example1 {
    public static void main(String[] args) {
  int     denominator, numerator, ratio;

  numerator   = 5;
  denominator = 0;

  try {
      ratio = numerator / denominator;
    System.out.println("The answer is: " + ratio);
  }
  
  catch(ArithmeticException e) {
    System.out.println("Error: Divide by 0");
    e.printStackTrace();
  }
  catch(Exception e) {
    System.out.println("Some error was occured");
  }
  finally {
    
    System.out.println("Done."); // Don't move this line
  }

    }
}
