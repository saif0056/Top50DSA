class Main {
    public static void main(String[] args) {
        int digits = 123456;
        int sum = 0;
        
        while(digits != 0) {
            sum += digits % 10;
            digits /= 10;
        }
        System.out.print(" Sum Of All Digits is : " + sum);
    }
}
