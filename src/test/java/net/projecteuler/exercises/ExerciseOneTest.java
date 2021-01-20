package net.projecteuler.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ExerciseOneTest {

  @Test
  public void multiplesBefore10() {
    long result = ExerciseOne.multiplesSum(10);
    assertEquals(23, result);
  }

  @Test
  public void multiplesBefore20() {
    long result = ExerciseOne.multiplesSum(20);
    assertEquals(78, result);
  }

  @Test
  public void multiplesBefore1000() {
    long result = ExerciseOne.multiplesSum(1000);
    assertEquals(233168, result);
  }


}
