import java.util.Scanner;
public class Statement1{
    public static void main(String args[]){
        System.out.println("enter number to check");


        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if(a >0){

        
        System.out.println("The give number is posetive ");
        }
        else{
            System.out.println(" the given number is negative ");
        }

    }
}