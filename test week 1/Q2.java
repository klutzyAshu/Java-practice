import java.util.Scanner;
public class Q2{
    public static void main(String[]args){
        //for checking the frequency of a function  
        
    System.out.println("Enter your number ");
    Scanner sc = new Scanner(System.in);
    //Scanner function 
    long n = sc.nextLong();
        int[] count = new int[10];
        long temp = Math.abs(n);
        if(temp==0){
            count[0] = 1;
        }else{
            while(temp >0 ){
                int digit = (int) (temp %10);
                count[digit]++;
                temp /= 10;

            }
            System.out.println("Digit frequencies in "+n+ ":");
            for (int i = 0 ; i < 10; i++){
                if (count[i] > 0){
                    System.out.println("Digit " + i + ": " + count[i] + " time(s)");

                }

            }


        }
    }
}
