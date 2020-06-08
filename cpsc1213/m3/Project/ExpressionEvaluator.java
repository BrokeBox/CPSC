import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * Computes and formats the value generated by the following expression.
 *
 *  (3x^5 - 2x^2)^2
 * -----------------
 * sqrt(|16x^7|) + 1
 *
 * Project 3
 * @author Devin Trowbridge CPSC-1213-AO1
 * @version 2020-06-07
 */
public class ExpressionEvaluator {

  /**
   * Computes the expression, determines the integer and decimal portions,
   * and prints the results.
   * 
   * @param args Command line arguments - not used
   */
   public static void main(String[] args) {
      Scanner rawUserInput = new Scanner(System.in);
      double x;
      double result;
      int digitsLeft;
      int digitsRight;
      String strResult;
      
      // Get x value from the user
      System.out.print("Enter a value for x: ");
      x = Double.parseDouble(rawUserInput.nextLine());
      
      // Do the math
      result = Math.pow(3 * Math.pow(x, 5) - 2 * Math.pow(x, 3), 2);
      result /= (Math.sqrt(Math.abs(16 * Math.pow(x, 7))) + 1);
      
      // Separate the integer from the decimal
      strResult = Double.toString(result);
      digitsLeft = strResult.indexOf('.');
      digitsRight = strResult.length() - (digitsLeft + 1); 
      
      // Format and print the results 
      DecimalFormat fmt = new DecimalFormat("#,##0.0####");
      
      System.out.println("Result: " + result);
      System.out.println("# digits to left of decimal point: " + digitsLeft);
      System.out.println("# digits to right of decimal point: " + digitsRight);
      System.out.println("Formatted Result: " + fmt.format(result));
   }
}