import java.util.Scanner;
public class Q1 {
    public static void main(String[] args){
        System.out.println("Enter students marks:");
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject A:");
        int a= sc.nextInt();
        System.out.println("Subject B:");
        int b= sc.nextInt();
        System.out.println("Subject C:");
        int c= sc.nextInt();
        System.out.println("Subject D:");
        int d= sc.nextInt();
        System.out.println("Subject E:");
        int e= sc.nextInt();
        int f= a+b+c+d+e;
        System.out.println("Total marks Obtained by the student:");
        System.out.println(f);
        System.out.println("Max marks 500:");
        System.out.println("avrage marks Obtained by the student");
        int grade = (f/5);
        if(grade>=90){
            System.out.println("A+");
    }if(grade>= 80){
        System.out.println("A");
    }if(grade>=60){
        System.out.println("B");

        System.out.println("C");
    }if(grade>=33){
        System.out.println("D");
    }if(grade<33){
    System.out.println("fail");
}

    
}


}
