package edu.pdx.cs410J.Room12;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public boolean isLeapYear(int year) {
    if (year % 400 == 0) {
      return true;
    }
    else if (year % 100 == 0) {
      return false;
    }
    else if (year % 4 == 0) {
      return true;
    }
    return false;
  }
                                                                                    

  public static void main(String[] args) {
    if(args.length == 0){
      System.err.println("Missing command line arguments");
      System.exit(1);
    }
    Kata kata = new Kata();
    int year = Integer.parseInt(args[0]);
    if(kata.isLeapYear(year) == true){
      System.out.println("This year is the leap year.");
    }
    else{
      System.out.println("This year is not the leap year.");
    }

    System.exit(0);

  }
}