class HelloWorld {
  static int age = 20; // This variable avaible inside the Main class

  public static void main(String[] args) {
    System.out.println("Hello World");
    int age = 21; // This variable is only avaible only in this code block

    System.out.println("I am " + age + " years old.");
  }
}
