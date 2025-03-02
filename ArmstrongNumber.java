class Main {
    public static void main(String[] args) {
        int num = 153, sum = 0, temp = num, digits = 0;
        while(temp > 0) {
            temp /= 10;
            digits++;
        }
        temp = num;
        while(temp > 0) {
            sum += Math.pow(temp % 10, digits);
            temp /= 10;
        }
        System.out.print(num + " Armstrong Number : " + (sum == num));
    }
}
