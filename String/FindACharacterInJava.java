package String;

import java.io.*;
public class FindACharacterInJava {
    // Java Program to Illustrate to Find a Character
// in the String

// Importing required classes


    // Main class


        // Main driver method
        public static void main(String[] args)
        {

            // String in which a character to be searched.
            String str
                    = "GeeksforGeeks is a computer science portal";

            // Returns index of first occurrence of character.
            int firstIndex = str.indexOf('s');
            System.out.println("First occurrence of char 's'"
                    + " is found at : "
                    + firstIndex);

            // Returns index of last occurrence specified
            // character.
            int lastIndex = str.lastIndexOf('s');
            System.out.println("Last occurrence of char 's' is"
                    + " found at : " + lastIndex);

            // Index of the first occurrence of specified char
            // after the specified index if found.
            int first_in = str.indexOf('s', 10);
            System.out.println("First occurrence of char 's'"
                    + " after index 10 : "
                    + first_in);

            int last_in = str.lastIndexOf('s', 20);
            System.out.println("Last occurrence of char 's'"
                    + " after index 20 is : "
                    + last_in);

            // gives ASCII value of character at location 20
            int char_at = str.charAt(20);
            System.out.println("Character at location 20: "
                    + char_at);

            // Note: If we uncomment it will throw
            // StringIndexOutOfBoundsException
            // char_at = str.charAt(50);
        }
    }


