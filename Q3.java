import java.util.Scanner;
public class Q3 {
    public static void main(String [] args){
        System.out.println("Write number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("the number is divisible to 3 as well as 5 ");


        }else{
            System.out.println("The number isnt");
        }

        
    }
    
}
