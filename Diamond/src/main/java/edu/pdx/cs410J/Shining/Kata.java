package edu.pdx.cs410J.Shining;

import java.lang.Object;
import java.util.*;
import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public boolean diamond(char ch){
    int pos = ch - 'A' + 1;
    int i = 0;


    for(char c = 'A'; c <= letter; ++c){

      char [] indent = new char[pos-i];
      ++i;

      System.out.println(c + " ");

    }
    return true;
  }

  public static void main(String[] args) {
//    System.err.println("Missing command line arguments");
//    System.exit(1);
    char letter = args[0].charAt(0);
    Kata kata = new Kata();
    boolean x = kata.diamond(letter);


    System.exit(0);

  }
  
  /*
  void diamond(char letter){
    int n = letter - 'A' + 1;
    int rowSize = 2n - 1;
    int start = n - 1;
    char lettStart = 'A';
    int space = 1;

    for(int i = 0; i < rowSize; ++i){
      for(int j = n - 1; j > 0; --j){
        print(" ");
      }
      if(i == 0 || i == rowSize - 1){
        println(lettStart);
      }
      else{
        print(lettStart);
        for(int j = space; j > 0; --j){
          print(" ");
        }
        println(lettStart);
        space = space + 2;
      }
      if(i < rowSize/2){
        lettStart++;
        lett
      }

    }


  }

   */
}