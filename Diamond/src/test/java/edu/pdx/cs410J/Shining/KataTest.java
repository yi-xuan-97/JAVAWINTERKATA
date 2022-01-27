package edu.pdx.cs410J.Shining;

import org.junit.jupiter.api.Test;

public class KataTest
{

  @Test
  void canInstantiateKataClass() {
    new Kata();
  }

  @Test
  void checkreturn() {
    char temp = 'c';
    boolean check = diamond(temp);
    assert(check,is(true));
  }

}
