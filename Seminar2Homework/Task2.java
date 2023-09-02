package Seminar2Homework;

// Задание 2. Если необходимо, исправьте данный код

public class Task2 {
  public static void main(String[] args) {

    try {
      int[] intArray = new int[] { 1, 5, 6, 6, 5, 3, 2, 24, 345, 4, 5, 3, 5 }; // объвили массив
      int d = 0;
      double catchedRes1 = intArray[8] / d;
      System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e.getMessage()); // добавили getMessage()
    }

  }
}
