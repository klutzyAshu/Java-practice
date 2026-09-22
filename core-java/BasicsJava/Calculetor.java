import java.util.Scanner;
public class Calculetor {

    public static void main(String[] args){
        System.out.println("Enter 2 number :(a,b)");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        
        int num1 = sc.nextInt();
        System.out.println("Enter second number");
        int num2 = sc.nextInt();
        System.out.println("Enter ur choice to perform");
        System.out.println("1.Addition:");
        System.out.println("2.Subtraction:");
        System.out.println("3.Multiplication:");
        System.out.println("4.Division:");
        System.out.println("5.Exit:");
        int option = sc.nextInt();
        switch (option){
            case 1:
                System.out.println("Addition:"+(num1+num2));
                break;
                
                case 2:
                    System.out.println("Subtrection:"+(num1-num2));
                    break;
                    
                    case 3:
                        if(num2==0){
                            System.out.println("enter another number: (-0)");
                        }else{
                        System.out.println("multiplication:"+(num1*num2));
                        }
                        break;
                        case 4:
                            if(num2==0){
                            System.out.println("enter another number: (-0)");
                        }else{


                            System.out.println("Division:"+(num1/num2));
                        }
                            break;
                            case 5:
                                System.out.println("Exiting..........");
                            return;
        }
        

        

}

}

