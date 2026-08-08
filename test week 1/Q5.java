import java.util.Scanner;
public class Q5{
    public static void main(String[] args){
        
        System.out.println("Enter numbers :");
        Scanner sc =new Scanner(System.in);
        int num1= sc.nextInt(); 
        int num2= sc.nextInt(); 
        int num3= sc.nextInt(); 
        if(num1>num2){
            System.out.print(num2);
            num2++;
        }else {
            System.out.println("Second largest number is ");
            
        }
        if(num2 >num3)
            {
            System.out.println("C");
            
        }
    }
}