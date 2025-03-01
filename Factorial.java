class Main {
    public static int factorial(int n ) {
            int n = 10;


   if(n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
       int n = 5;
       System.out.println("Factorial : " + factorial(n));
    }
}
