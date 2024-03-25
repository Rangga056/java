class Variable {
  public static void main(String[] args) {
    // Integer types
    byte aSingleByte = 100; // -128 to 127
    short aSmallNumber = 20000; // -32,768 to 32,767
    int anInteger = 2147483647; // -2147483648 to 2147483647
    long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

    // Decimal types
    double aDouble = 1.79769313; // 4.9E-324 to 1.79769313486231576308
    float aFloat = 3.4028F; // 1.4E-45 to 3.4028235638

    // Booleans
    boolean isWeekend = false;
    boolean isWorkday = true;

    System.out.println("aSingleByte: " + aSingleByte);
    System.out.println("aSmallNumber: " + aSmallNumber);
    System.out.println("anInteger: " + anInteger);
    System.out.println("aLargeNumber: " + aLargeNumber);
    System.out.println("aDouble: " + aDouble);
    System.out.println("aFloat: " + aFloat);
    System.out.println("isWeekend: " + isWeekend);
    System.out.println("isWorkday: " + isWorkday);
    // Characters
    char copyrightSymbol = '\u00A9';
    System.out.println("This is the copyright symbol: " + copyrightSymbol);
  }
}
