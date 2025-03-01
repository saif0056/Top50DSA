
class Main {
    public static void main(String[] args) {
      int arr[] = {3, 1, 5, 7, 2};
      int max = arr[0];
      int min = arr[0];
      for(int num : arr) {
         if(num > max) {
            max = num;
         } 
         if(num < min) {
             min = num;
         }
      }
      System.out.println("Max Number is : " + max + " Min Number is : " + min);
    }
}
