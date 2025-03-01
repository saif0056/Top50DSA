
// Direct Function used
class Main {
    public static void main(String[] args) {
       String str = "Hello";
       String reversed = new StringBuilder(str).reverse().toString();
       System.out.println("Reversed String Is :" + reversed);
    }
}

// Using Iteration to reverse a string
class Main {
    public static void main(String[] args) {
      String str = "hello world";
      String reversed = "";
      for(int i=str.length()-1; i>=0; i--) {
          reversed += str.charAt(i);
      }
      System.out.println("Reversed String is : " + reversed);
    }
}



