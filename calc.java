import java.util.Scanner; 
public class calc { 
 public static void main(String[] mop) { 
 Scanner input = new Scanner(System.in); 
 
while (true) { 
 try { 
  
 System.out.println("Basic Calculator\n"); 
  
 System.out.println("Enter an expression (e.g: '5 + 10'):");
 
 String userInput = input.nextLine();
 
 if (isValidExpression(userInput)) { 
  
 String[] parts = userInput.split(" "); 
 double num1 = Double.parseDouble(parts[0]); 
 String operation = parts[1]; 
 double num2 = Double.parseDouble(parts[2]); 
  
 double result = performCalculation(num1, operation, num2); 
  
 System.out.println("Result: " + result); 
 } else { 
 
 throw new IllegalArgumentException("\nInvalid expression. Enter Again"); 
 } 
  
 System.out.println("\nDo you want to continue the calculation? (Enter 'Y' to 
continue or any key to exit)"); 
 String continueResponse = input.nextLine().toLowerCase(); 
 if (!continueResponse.equals("y")) { 
  
 System.out.println("Thank you for using the Calculator"); 
 break; 
 } 
 } catch (IllegalArgumentException | ArithmeticException e) { 
  
 System.out.println("Error: " + e.getMessage()); 
 } 
 } 
 } 
  
 private static boolean isValidExpression(String expression) { 
 String[] parts = expression.split(" "); 
return parts.length == 3 && "+-*/".contains(parts[1]) && isDouble(parts[0]) && 
isDouble(parts[2]); 
 } 
  
 private static double performCalculation(double num1, String operation, double num2) { 
 switch (operation) { 
 case "+": 
 return num1 + num2; 
 case "-": 
 return num1 - num2; 
 case "*": 
 return num1 * num2; 
 case "/": 
 if (num2 == 0) { 
  
 throw new ArithmeticException("\nDivision by 0 is not allowed."); 
 } 
 return num1 / num2; 
 default: 
 
 //throw new IllegalArgumentException
System.out.println("\nEntered operator is invalid. Valid operators 
are: '+', '-', '/', '*'"); 
 } 
 } 
  
 private static boolean isDouble(String str) { 
 try { 
 Double.parseDouble(str); 
 return true; 
 } catch (NumberFormatException e) { 
 return false; 
 } 
 } 
}