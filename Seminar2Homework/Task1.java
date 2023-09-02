package Seminar2Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class Task1 {
  public static void main(String[] args) {
    enterNum();
  }

  static float toGetNum() {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите число: ");
    float num = Float.parseFloat(scanner.nextLine());
    return num;
  }

  static void enterNum() {
    try {
      toGetNum();
    } catch (InputMismatchException e) {
      System.out.println("Ошибка ввода. ");
      toGetNum();
    } catch (NumberFormatException e) {
      System.out.println("Ошибка ввода. ");
      toGetNum();
    }
      }

}

