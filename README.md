# Oop-Assignment-

1ST PROGRAM 

This program is a simple command-line calculator written in Java. Here's what it does in simpler terms:

It starts by importing the java.util.Scanner class to read user input.

The program defines a class called "calc."

The main method is the program's entry point, where execution begins.

Inside the main method, the program enters a loop that continues running until the user decides to exit. The loop is controlled by while (true), which means it will run indefinitely until explicitly terminated.

Within the loop, the program does the following:

It displays a welcome message and asks the user to enter a mathematical expression (e.g., "5 + 10").
It checks if the input is a valid expression using the isValidExpression method. A valid expression consists of three parts: a number, an operator (+, -, *, or /), and another number.
If the expression is valid, it splits the input into its components and performs the calculation using the performCalculation method. It handles basic operations like addition, subtraction, multiplication, and division. If division by zero is attempted, it throws an exception.
If the expression is not valid, it throws an exception and asks the user to enter a valid expression.
After performing the calculation, it displays the result to the user.
After displaying the result, the program asks the user if they want to continue calculating. If the user doesn't enter 'Y', the program thanks the user and exits by breaking out of the loop.

The program handles exceptions such as invalid input, division by zero, and invalid operators by displaying appropriate error messages.

In summary, this program is a basic command-line calculator that allows users to perform simple arithmetic operations repeatedly until they choose to exit. It validates user input, performs calculations, and handles errors gracefully.

2ND PROGRAM

This is a simple Java program called "calc" that functions as a basic calculator. Here's what the program does in simpler terms:

It starts by importing the java.util.Scanner class to read user input.
The main method is the entry point of the program.
It uses a while loop to keep the calculator running until the user decides to exit.
Inside the loop, it displays a welcome message and asks the user to enter a mathematical expression (e.g., "5 + 10").
It checks if the input is a valid expression using the isValidExpression method. A valid expression consists of three parts: a number, an operator (+, -, *, or /), and another number.
If the expression is valid, it splits the input into its components and performs the calculation using the performCalculation method. It handles basic operations like addition, subtraction, multiplication, and division. If division by zero is attempted, it throws an exception.
If the expression is not valid, it throws an exception and asks the user to enter a valid expression.
After calculation, it displays the result and asks if the user wants to continue. If the user doesn't enter 'Y', the program thanks the user and exits.
It handles exceptions like invalid input, division by zero, and invalid operators by displaying appropriate error messages.
In summary, this program is a simple command-line calculator that allows users to perform basic arithmetic operations repeatedly until they choose to exit. It checks for valid input and handles errors gracefully
