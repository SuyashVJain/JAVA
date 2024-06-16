
import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            System.out.println("Hello World");
            String name = "Suyash";
            byte age = 17;
            long mobile = 9343379736L;
            /*
            System.out.println("First letterof name: "+name.charAt(0));
            System.out.println("Name: "+name+" Length of name: " +name.length());
            System.out.println("Last 4 letter of name: " + name.substring(2,6));
            */
            System.out.println(" ");
            System.out.println("Name: "+name );
            System.out.println("Age: "+age );
            System.out.println("Mobile no.: "+mobile );
            System.out.println(" ");
            /*
            int[] marks = new int[5];
            marks[0]=100;
            marks[1]=96;
            marks[2]=65;
            marks[3]=16;
            marks[4]=95;
            */
            int[] marks= {100,96,65,16,95};
            int[][] marksfor2={{74,85,96,78,89},{96,85,74,98,87}};
            System.out.println(marks.length);
            Arrays.sort(marks);
            System.out.println(marks[4]);
            System.out.println(marksfor2[1][3]);
            System.out.println(" ");
            System.out.println("Value of PI");
            final float PI=3.14F;
            System.out.println(PI);
            float calcpi1=22;
            byte calcpi2=7;
            double calcpi=calcpi1/calcpi2;
            System.out.println(calcpi);


        }
    }