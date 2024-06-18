import java.util.Scanner;

public class Contact {

    public static void main(String[] args) {
        Greet();
        String[] info = split();     
        query(info);  
    }
    static void Greet() {
        System.out.println("Hello buddy");
    }
    static String input() {
        Scanner entry = new Scanner(System.in);
        System.out.println("Please enter your name, phone no. and your address diffrentiated with Comma ( , ) : ");
        return entry.nextLine();
    }
    static String[] split(){
        String[] separated = input().split(",");
        if (separated.length != 3) {
            System.out.println("Please enter exactly three pieces of information separated by commas.");
            return new String[]{"", "", ""};
        }
        return separated;

    }   

    static void query(String[] info){
        String name = dName(info);
        String phno = dPhno(info);
        String address = dAddress(info);

        Scanner out = new Scanner(System.in);
        System.out.println("Please enter the number of What you want to see?\n1. Name\n2. Phone no. \n3. Address");

        int choice = out.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your Entered Name: "+name);
                break;
            case 2:
                System.out.println(name +"'s Phone no.:"+ phno);
                break;
            case 3:
                System.out.println(name +"'s Address.:"+address);
                break;
            default:
                System.out.println("Invalid choice! Please enter a number between 1, 2 or 3.");
        }
    }

    static String dName(String[] info) {
        for (String part : info) {
            if (part.matches("[a-zA-Z ]+")) {
                return part.trim();
            }
        }
        return "Name not found";
    }

    static String dPhno(String[] info) {
        for (String part : info) {
            if (part.matches("\\d+")) {
                return part.trim();
            }
        }
        return "Phone number not found";
    }

    static String dAddress(String[] info) {
        for (String part : info) {
            if (part.matches("[a-zA-Z0-9 ]+") && !part.matches("[a-zA-Z ]+") && !part.matches("\\d+")) {
                return part.trim();
            }
        }
        return "Address not found";
    }
}
