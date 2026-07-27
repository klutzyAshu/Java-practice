import java.util.Scanner;
public class Q9{
    public static void main(String[]args){
        System.out.println("Enter number to check :");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%2==0)
            {
                System.out.println("the given number is even ");
            }else if( a%2!=0){
                System.out.println("the given number is odd");
            }
        
    }
}