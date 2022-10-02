import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        int day1;
        int month1;
        int year1;
        String toString="";

        Scanner myScannerMonth = new Scanner(System.in);
        System.out.print("Enter the month: ");
        month1 = myScannerMonth.nextInt();

        Scanner myScannerDay = new Scanner(System.in);
        System.out.print("Enter the day: ");
        day1 = myScannerDay.nextInt();

        Scanner myScannerYear = new Scanner(System.in);
        System.out.print("Enter the year: ");
        year1 = myScannerYear.nextInt();

        class MyDate {
            int day;
            int month;

            int year;


            public int getDay() {
                return day;
            }

            public void setDay(int day1) {
                if (day1 > 0 && day1 < 32) {
                    day = day1;
                }
            }


            public int getMonth() {
                return month;
            }

            public void setMonth(int month1) {

                if (month1 > 0 && month1 < 13) {
                    month = month1;

                }
            }


            public int getYear() {
                return year;
            }

            public void setYear(int year1) {

                year = year1;

            }

            public String toString() {

                return  "Day: " + this.day + "Month: " + this.month + " Year: " + this.year;

            }

        }



    }
}
