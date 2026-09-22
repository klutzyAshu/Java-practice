// Online Java Compiler (Editor)
import java.util.Scanner;

class FibonakkiSeries {
    public static void main(String[] args) {
            
    Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number of ur wishes ");
        int nterm= sc.nextInt();
        long n1=0;
        long n2=1;
        System.out.println("Fibbonaki series For:"+nterm);
        for (int i = 0; i< nterm; i++)
            {
                System.out.println(n1 + " ");
                long NN = n1 + n2;
                n1=n2 ;
                n2 = NN;
                
            }
        
        
        
    }
}
