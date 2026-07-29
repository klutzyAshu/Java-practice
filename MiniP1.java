import java.util.Scanner;

class MiniP1{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        int[] rolls = new int[100];
        int[] marks = new int[100];


        int count = 0;
        int choice;

        do {

            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Search Student");
            System.out.println("4. Highest Marks");
            System.out.println("5. Average Marks");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch(choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    rolls[count] = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    marks[count] = sc.nextInt();

                    count++;
                    System.out.println("Student Added Successfully.");
                    break;

                case 2:
                    System.out.println("\nStudent List");
                    for(int i=0;i<count;i++) {
                        System.out.println(rolls[i]+"  "+names[i]+"  "+marks[i]);
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String search = sc.nextLine();

                    boolean found=false;
                    
                    for(int i=0;i<count;i++) {
                        if(names[i].equalsIgnoreCase(search)) {
                            System.out.println("Roll : "+rolls[i]);
                            System.out.println("Name : "+names[i]);
                            System.out.println("Marks : "+marks[i]);
                            found=true;
                        }
                    }

                    if(!found)
                        System.out.println("Student Not Found");
                    break;

                case 4:
                    int max=marks[0];
                    int index=0;

                    for(int i=1;i<count;i++) {
                        if(marks[i]>max) {
                            max=marks[i];
                            index=i;
                        }
                    }

                    System.out.println("Highest Marks Student");
                    System.out.println(names[index]+" : "+max);
                    break;

                case 5:
                    int sum=0;

                    for(int i=0;i<count;i++)
                        sum+=marks[i];

                    System.out.println("Average = "+(sum/count));
                    break;

                case 6:
                    System.out.println("Thank You");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while(choice!=6);

    }

}