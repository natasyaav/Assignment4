import java.util.Scanner;

/**
 * @author Natasya Virgichalia
 * Date: October 13, 2017
 * Professor Tanes Kanchanawanchai
 * CSC 201-004N
 * Assginment 4 - Write a program that prompts the user to enter a string and displays its length and its first character
 */
public class processString {
    public static void main (String[] args) {
        String word;
        int length;
        char first;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a String");
        System.out.println("This program will display the length and its first character");
        word = keyboard.next();
        length = stringLength(word);
        first = firstChar(word);
        System.out.println("The String length: " + length);
        System.out.println("The first character: " + first);
        }

    /**
     * This method finds the length of a string
     * @param word a String input by the user
     * @return the length of the String
     */
    public static int stringLength(String word){
        int n = word.length();
        return n;
    }

    /**
     * this method finds the first character from a string
     * @param word a String input by the user
     * @return the first character of the String
     */
    public static char firstChar(String word) {
        char f = word.charAt(0);
        return f;
    }
    }
