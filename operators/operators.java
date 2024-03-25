class operators {
  public static void main(String[] args) {
    int number1 = 12;
    int number2 = 9;

    // Arithmetic Operators
    System.out.println("number1 + number2: " + (number1 + number2)); // Addition
    System.out.println("number1 - number2: " + (number1 - number2)); // Subtraction
    System.out.println("number1 * number2: " + (number1 * number2)); // Multiplication
    System.out.println("number1 / number2: " + (number1 / number2)); // Division (integer result)
    System.out.println("number1 % number2: " + (number1 % number2)); // Modulus (remainder)

    // Assignment Operator
    number1 = number2;
    System.out.println("number1 after assignment: " + number1); // Now number1 is 9

    // Comparison Operators
    System.out.println("number1 == number2: " + (number1 == number2)); // Equal to
    System.out.println("number1 != number2: " + (number1 != number2)); // Not equal to
    System.out.println("number1 < number2: " + (number1 < number2)); // Less than
    System.out.println("number1 > number2: " + (number1 > number2)); // Greater than
    System.out.println("number1 <= number2: " + (number1 <= number2)); // Less than or equal to
    System.out.println("number1 >= number2: " + (number1 >= number2)); // Greater than or equal to

    // Logical Operators (assuming number1 is still 9)
    System.out.println("(number1 > 10) && (number2 < 5): " + ((number1 > 10) && (number2 < 5))); // AND (both conditions
                                                                                                 // false)
    System.out.println("(number1 > 10) || (number2 < 5): " + ((number1 > 10) || (number2 < 5))); // OR (at least one
                                                                                                 // condition true)
    System.out.println("!(number1 < number2): " + (!(number1 < number2))); // NOT (negates the condition)

    // Increment and Decrement Operators
    int temp = number1;
    System.out.println("number1++: " + temp); // Prints original value (9) before increment
    number1++;
    System.out.println("number1 after increment: " + number1); // Now number1 is 10

    temp = number2;
    System.out.println("number2--: " + temp); // Prints original value (9) before decrement
    number2--;
    System.out.println("number2 after decrement: " + number2); // Now number2 is 8
  }
}
