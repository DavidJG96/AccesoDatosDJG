import java.util.Scanner;

public class Main {

        public static void main( String args[] ) {

            Scanner myScannerName = new Scanner(System.in);
            System.out.print("Enter your name: ");
            String name = myScannerName.nextLine();


            Scanner myScannerSurname = new Scanner(System.in);
            System.out.print("Enter your surnames: ");
            String surname = myScannerSurname.nextLine();
            myScannerSurname.close();

            System.out.println("Hello " + name +" "+ surname);

        }

}