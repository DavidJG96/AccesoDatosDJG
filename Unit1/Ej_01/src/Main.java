import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
/*
This program reads characters introduced by keyboard,
saves them in to a string, calculate which are the higher and the lowest ones attend to  ASCII table * Also saves the number of uppercase ones
*/
        String letters;
        letters = "";
        int numLetters = 0;
        char minLetter = Character.MIN_VALUE;
        char maxLetter = Character.MAX_VALUE;
        int numUppercase = 0;
        Scanner keyboard = new Scanner(System.in);
        boolean out = false;

        while (numLetters < 10 && !out) {
            //create a letter
            System.out.println("Introduce a letter. Hit 0 if you want to eit: ");
            char letterAux = keyboard.next().charAt(0);;
            System.out.println("");
            System.out.println("-------");
            letters = letters + letterAux;

            if (letters.charAt(numLetters) == '0')
                out = true;

            //saves max  and min
            if (minLetter > letterAux) {
                minLetter = letterAux;
            }
            if (maxLetter < letterAux) {
                maxLetter = letterAux;
            }

            //Incrementing  the  counter
            numLetters++;
        }

        if (numLetters > 50)
            System.out.println("This  string  of characters is full");

        //For each char of the string
        for (int i = 0; i < numLetters && letters.charAt(i) != '0'; i++) {
            //if  the letter is uppercase
            if ((letters.charAt(i) >= 'A') && (letters.charAt(i) <= 'Z')) {
                //counts the uppercase letters
                numUppercase++;
            }
        }

        //result
        System.out.println("max char is : " + minLetter);
        System.out.println("min char is : " + maxLetter);
        System.out.println("There are " + numUppercase + " uppercase letters ");
        keyboard.next();
    }
}