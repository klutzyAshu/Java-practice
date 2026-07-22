import java.util.Scanner;
public class WhileExa1{
    public static void main(String args[]){
        System.out.println("Enter somthing to print");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while(i <100){
            System.out.println(i+1);
            i++;

        }

    }
}