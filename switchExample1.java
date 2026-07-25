import java.util.Scanner;
public class switchExample1 {
    public static void main(String[]args){
        System.out.println("Enter Day--");
        Scanner as = new Scanner(System.in);
        int day = as.nextInt();
        switch(day){
            case 1:
                System.out.println("fucking monday");
                break;
                case 2:
                System.out.println("fucking tuesday");
                break;
                case 3:
                System.out.println("fucking wednesday");
                break;
                case 4:
                System.out.println("fucking thersday");
                break;
                case 5:
                System.out.println("fucking friday");
                break;
                case 6:
                System.out.println("fucking saturday");
                break;
                case 7:
                System.out.println("fucking sunday");
                break;
        }
    }
    
}
