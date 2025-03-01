class Main {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9};
        boolean isSorted = true;
        for(int i=1; i<arr.length; i++) {
            if(arr[i] < arr[i-1]) {
                isSorted = false;;
                break;
            }
        }
        System.out.print("Array is Sorted : " + isSorted);
    }
}
