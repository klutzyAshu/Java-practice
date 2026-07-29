public class array2e2 {
    public static void main(String[] args){
        int[] arr = {12,31,33,23,24,54,65,75,100,32};
        int sum = 0;
        for(int i=0;i<arr.length; i++){
            sum = sum+arr[i];

        }
        System.out.println("sum = " + sum);
    }
}