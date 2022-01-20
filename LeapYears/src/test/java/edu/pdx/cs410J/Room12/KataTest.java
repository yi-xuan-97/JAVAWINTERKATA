package edu.pdx.cs410J.Room12;

import org.junit.jupiter.api.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.equalTo;
import edu.pdx.cs410J.InvokeMainTestCase;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void yearDivisibleBy400ReturnsTrue() {
    int year = 400;
    Kata kata = new Kata();
    assertThat(kata.isLeapYear(year), equalTo(true));
  }

  @Test
  void yearDivideby100Not400ReturnsFalse() {
    int year = 1700;
    Kata kata = new Kata();
    assertThat(kata.isLeapYear(year), equalTo(false));
  }

  @Test
  void yearDivisibleBy4ButNotBy100ReturnsTrue() {
    int year = 2008;
    Kata kata = new Kata();
    assertThat(kata.isLeapYear(year), equalTo(true));
  }

  @Test
  void yearNotDivideBy4ReturnsFlase(){
    int year = 2017;
    Kata kata = new Kata();
    assertThat(kata.isLeapYear(year), equalTo(false));
  }



}
