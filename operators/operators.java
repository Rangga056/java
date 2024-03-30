class operators {
  public static void main(String[] args) {
    int number1 = 12;
    double number2 = 5;

    // Arithmetic Operators
    System.out.println("number1 + number2: " + (number1 + number2)); // Addition
    System.out.println("number1 - number2: " + (number1 - number2)); // Subtraction
    System.out.println("number1 * number2: " + (number1 * number2)); // Multiplication
    System.out.println("number1 / number2: " + (number1 / number2)); // Division (integer result)
    System.out.println("number1 % number2: " + (number1 % number2)); // Modulus (remainder)
    // Assigment Operators
    int number3 = 10;
    number3 += 10; // number3 = number3 + 10;

    System.out.println("number3: " + number3);

    // Relational Operators
    // is equal to
    System.out.println("number1 is equal to number2: " + (number1 == number2));

    // is not equal to
    // System.out.println(number1 != number2);

    // is greater than
    // System.out.println(number1 > number2);

    // is less than
    // System.out.println(number1 < number2);

    // is greater than or equal to
    // System.out.println(number1 >= number2);

    // is less than or equal to
    // System.out.println(number1 <= number2);

    // Logical Operators
    // logical and operators
    // System.out.println(number1 >= 1 && number1 <= 100);

    // logical or operators
    boolean isStudent = false;
    boolean isLibraryMember = true;

    System.out.println(isStudent || isLibraryMember);
  }
}
