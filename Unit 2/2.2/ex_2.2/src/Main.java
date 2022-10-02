import java.util.Scanner;

public class Main {


        public static void main( String args[] ) {

            int month=0;
            int day;
            int month1=0;
            int day1=0;


            Scanner myScannerDay = new Scanner(System.in);
            System.out.print("Enter the day: ");
             day = myScannerDay.nextInt();
            if(day>0 && day<32)
            {
                 day1=day;
            }


            Scanner myScannerMonth = new Scanner(System.in);
            System.out.print("Enter the month: ");
            month = myScannerDay.nextInt();
            if(month>0 && month< 13)
            {
                 month1=month ;
            }

            Scanner myScannerYear = new Scanner(System.in);
            System.out.print("Enter the year: ");
            Integer year = myScannerYear.nextInt();



            System.out.println("Date " + day1 +" "+ month1 + " " +year);

        }
}