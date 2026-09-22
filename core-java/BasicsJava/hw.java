import java.util.Scanner;
public class hw {
    public static void main(String[] args){
        System.out.println("hello world");
        String name = "Ashu";
        int age = 19;
        String city ="Raipur"; 
        System.out.println(name);
        System.out.println(age);
        System.out.println(city);
        
        int p =20000;
        int r =6;
        int t =4;
        System.out.println(p*r*t/100);
        System.out.println(r+t);
        System.out.println(r-t);
        System.out.println(r*t);
        System.out.println(r/t);
        System.out.println(r%t);
       // Scanner mobj = new Scanner(System.in);
       // String uname = mobj nextLine();
       // System.out.println("username is " uname);
        Scanner mobj = new Scanner(System.in);


        System.out.print("Enter username: ");

    
        String uname = mobj.nextLine();

        
        System.out.println("Username is " + uname);

        
        mobj.close();



    }
    
}
