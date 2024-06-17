import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        System.out.println("Hello buddy");
        
        // INPUT OF DETAILS

        Scanner entry = new Scanner(System.in);
        System.out.println("Please enter your name, phone no. and your address diffrentiated with Comma ( , ) : ");
        String detail = entry.nextLine();
        
        //SEPERATION

        String Sepreated[] = detail.split(",");
        String A = Sepreated[0];
        String B = Sepreated[1];
        String C = Sepreated[2];
        
        // for (String x:Sepreated){
        //     System.out.println(x);}
        
        Scanner out = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("Please enter What you want to see?");
        System.out.println("1. Name");
        System.out.println("2. Phone no.");
        System.out.println("3. Address");
        String output = out.nextLine();
        System.out.println(" ");

        if (null ==output){
            System.out.println("Please enter again");
        } else switch (output) {
            case "Name":
                System.out.println("Name : "+A);
                break;
            case "Phone no.":
                System.out.print("Phone no.: "+B);
                break;
            case "Address":
                System.out.println("Address : "+C);
                break;
            default:
                System.out.println("Please enter again");
                break;
        }
    }
}
