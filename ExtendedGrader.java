/*
 * Project: ExtendedGrader.java
 * Description: A program that reports letter grades (and other things)
 * Author: Aaron Snowberger
 * Date: August 31, 2015
 */

import java.util.Scanner; // gets user input

class ExtendedGrader {
  
  public static void main( String[] args ) {
    
    Scanner s = new Scanner( System.in );
    int grade;
    
    System.out.println( "Enter your grade percentage: " );
    grade = s.nextInt(); // input the user grade
    
    // Extended else-if to output the letter grade
    if ( grade >= 90 ) { // if greater than 90%
      System.out.println( "You got an A!" );
    
    } else if ( grade >= 80 ) { // if less than 90% but greater than 80%
      System.out.println( "You got a B~" );
    
    } else if ( grade >= 70 ) { // if less than 80% but greater than 70%
      System.out.println( "You got a C." );
    
    } else if ( grade >= 60 ) { // if less than 70% but greater than 60%
      System.out.println( "You got a D..." );
    
    } else {
      System.out.println( "You got an F. Loser..." );
      
    }
    
    // Showing new commits
    System.out.println( "Modifying this program for GitHub.com" );
    
  } // end main method
  
} // end class