//*******************************************************************
//  Project: Project 3.13
//  Author: Andres Chaidez
//  Period: 5
//  Date: 10/17/18
//  Description: Design and implement an application that reads a string from the user, then determines and prints how many of each lowercase vowel (a, e, i, o, and u) 
//       appear in the entire string. Have a separate counter for each vowel. Also count and print the number of consonants, spaces, and punctuation marks.
//*******************************************************************

import java.util.Random;
import java.util.Scanner;

public class Project3_13{

   public static void main(String[] args){

      Scanner scan = new Scanner(System.in);
      int a = 0;
      int e = 0;
      int i = 0;
      int o = 0;
      int u = 0;
      int consonant_count = 0;
      int punctuation_count = 0;
      int space_count = 0;
      String vowels = "aeiou";
      String consonants = "bcdfghjklmnpqrstvwxyz";
      String punctuation = "?.!@#$%^&*()_-+=`~,./?\\][}{:;'\"";
      String input = scan.nextLine();
      String sentence = input.toLowerCase();
      
      for(int l=sentence.length();l>0;l--){
         String current = String.valueOf(sentence.charAt(0));
         if(vowels.contains(current)) {
            if (current.equals("a")) a++;
            else if (current.equals("e")) e++;
            else if (current.equals("i")) i++;
            else if (current.equals("o")) o++;
            else if (current.equals("u")) u++; 
         } 
         else if (consonants.contains(current)) consonant_count++;
         else if (punctuation.contains(current)) punctuation_count++;
         else if (current.equals(" ")) space_count++;
         
         sentence = sentence.substring(1);
      }
      
      System.out.println("A: "+a+", E: "+e+", i: "+i+", O: "+o+", U: "+u);
      System.out.println("Consonants: "+consonant_count+", Spaces: "+space_count+", Punctuation: "+punctuation_count);
      
   }
   
}