package Assignment;

import java.util.Scanner;

public class MainMethod {
    public static void main(String[] args){

        TextCounter counter = new TextCounter();

            Scanner scan = new Scanner(System.in);
            System.out.println("Skriv in tecken i kommandoraden  ");
            String text = scan.nextLine();
            counter.endWord(text);

        while (counter.getEndWord()) {
            //Programmet avslutas när ordet "Stop" skrivits

            //Skriver in tecken i kommandoraden som sparas i addCharacter
            counter.addCharacters(text);

            //Skriver in antal rader i kommandoraden som sparas i addRows
            counter.addRows();

            //Gör så att man kan skriva flera rader
            text = scan.nextLine();

            counter.endWord(text);
        }
        //Skriver ut antal tecken
        System.out.println("Du skrev så här många tecken: " + counter.getNumberOfCharacters());

        //Skriver ut antal rader
        System.out.println("Du skrev så här många rader: " + counter.getNumberOfRows());
    }
}
