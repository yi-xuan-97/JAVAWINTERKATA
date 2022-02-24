package edu.pdx.cs410J.room2;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */
public class Kata {

  public static String Number0=   " _ " + "a" +
                                  "| |" + "a" +
                                  "|_|" ;

  public static String Number1 =  "  |" + "a" +
                                  "  |" + "a" +
                                  "  |";

  public static String Number2 = " _ " + "a" +
                          " _|" + "a" +
                          "|_ " ;

  public static String Number3 = " _ " + "a" +
                          " _|" + "a" +
                          " _|";

  public static String Number4 = "   " + "a" +
                          "|_|" + "a" +
                          "  |";

  public static String Number5 = " _ " + "a" +
                          "|_ " + "a" +
                          " _|";

  public static String Number6 = " _ " + "a" +
                          "|_" + "a" +
                          "|_|";

  public static String Number7 = " _ " + "a" +
                          "  |" + "a" +
                          "  | ";

  public static String Number8 = " _ " + "a" +
                          "|_|" + "a" +
                          "|_|";

  public static String Number9 = " _ " + "a" +
                                  "|_|" + "a" +
                                  " _|";

  // Example 1 2 3

  public static void main(String[] args) throws IOException {
    Map<Integer, String> bankDigits = new HashMap<>();
    bankDigits.put(0, Number0);
    bankDigits.put(1, Number1);
    bankDigits.put(2, Number2);
    bankDigits.put(3, Number3);
    bankDigits.put(4, Number4);
    bankDigits.put(5, Number5);
    bankDigits.put(6, Number6);
    bankDigits.put(7, Number7);
    bankDigits.put(8, Number8);
    bankDigits.put(9, Number9);
    String[] N0 = Number0.split("a");
    String[] N1 = Number1.split("a");
    String[] N2 = Number2.split("a");
    String[] N3 = Number3.split("a");
    String[] N4 = Number4.split("a");
    String[] N5 = Number5.split("a");
    String[] N6 = Number6.split("a");
    String[] N7 = Number7.split("a");
    String[] N8 = Number8.split("a");
    String[] N9 = Number9.split("a");

    char[] arr = args.toCharArray();
    for (int i = 0; i < 3 ; i++) {
      String result = null;

      for (char e: arr) {
        if (e == '0')
          result+=N0[i];
        else if (e == '1')
          result+=N1[i];
        else if (e == '2')
          result+=N2[i];
        else if (e == '3')
          result+=N3[i];
        else if (e == '4')
          result+=N4[i];
        else if (e == '5')
          result+=N5[i];
        else if (e == '6')
          result+=N6[i];
        else if (e == '7')
          result+=N7[i];
        else if (e == '8')
          result+=N8[i];
        else if (e == '9')
          result+=N9[i];
      }
      System.out.println(result);
    }
    /*
    System.err.println("Missing command line arguments");

    File file = new File("/Users/yixuanfeng/Documents/GitHub/JAVAWINTERKATA/BankOCR/src/main/java/edu/pdx/cs410J/room2/test.txt");
    BufferedReader br = new BufferedReader(new FileReader(file));
    String st;
    String[] lines;
    int lineCounter = 0;
    while ((st = br.readLine()) != null){
      line[lineCounter++] = st.split("(?<=\\G.{3})");
    }
    System.out.println(line);

    System.exit(1);*/
    
    // Thanks y'all
  }


}