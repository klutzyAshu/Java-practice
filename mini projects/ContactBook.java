import java.util.Scanner;

public class ContactBook {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        String[] phones = new String[100];
        String[] emails = new String[100];

        int count=0;
        int choice;

        do {

            System.out.println("\n===== Contact Book =====");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Update Contact");
            System.out.println("5. Delete Contact");
            System.out.println("6. Exit");

            System.out.print("Enter Choice: ");
            choice=sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Name: ");
                    names[count]=sc.nextLine();

                    System.out.print("Enter Phone: ");
                    phones[count]=sc.nextLine();

                    System.out.print("Enter Email: ");
                    emails[count]=sc.nextLine();

                    count++;

                    System.out.println("Contact Added.");
                    break;

                case 2:

                    for(int i=0;i<count;i++) {
                        System.out.println("--------------------");
                        System.out.println("Name : "+names[i]);
                        System.out.println("Phone : "+phones[i]);
                        System.out.println("Email : "+emails[i]);
                    }

                    break;

                case 3:

                    System.out.print("Enter Name: ");
                    String search=sc.nextLine();

                    boolean found=false;

                    for(int i=0;i<count;i++) {

                        if(names[i].equalsIgnoreCase(search)) {

                            System.out.println("Phone : "+phones[i]);
                            System.out.println("Email : "+emails[i]);

                            found=true;
                        }
                    }

                    if(!found)
                        System.out.println("Contact Not Found");

                    break;

                case 4:

                    System.out.print("Enter Name to Update: ");
                    String update=sc.nextLine();

                    for(int i=0;i<count;i++) {

                        if(names[i].equalsIgnoreCase(update)) {

                            System.out.print("New Phone: ");
                            phones[i]=sc.nextLine();

                            System.out.print("New Email: ");
                            emails[i]=sc.nextLine();

                            System.out.println("Updated Successfully.");
                        }

                    }

                    break;

                case 5:

                    System.out.print("Enter Name to Delete: ");
                    String delete=sc.nextLine();

                    for(int i=0;i<count;i++) {

                        if(names[i].equalsIgnoreCase(delete)) {

                            for(int j=i;j<count-1;j++) {

                                names[j]=names[j+1];
                                phones[j]=phones[j+1];
                                emails[j]=emails[j+1];

                            }

                            count--;
                            System.out.println("Deleted Successfully.");
                            break;

                        }

                    }

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