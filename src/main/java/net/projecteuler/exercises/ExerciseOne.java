package net.projecteuler.exercises;

public class ExerciseOne {


  public static long multiplesSum(int number) {
    long result = 0;
    for (int i = 0; i < number; i++) {
      if (i % 3 == 0 || i % 5 == 0) {
        result += i;
      }
    }

    return result;
  }
}
