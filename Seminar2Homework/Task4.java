package Seminar2Homework;

import java.util.Scanner;

// Задание 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task4 {
  public static void main(String[] args) throws Exception {
    getString(setString());
  }

  static String setString() {
    Scanner scan = new Scanner(System.in);
    System.out.println("Введите строку: ");
    String str = scan.nextLine().toString();
    return str;
  }

  static void getString(String string) throws Exception {
    if (string.isEmpty()) {
      throw new Exception("Пустые строки вводить нельзя. ");
    } else 
    System.out.printf ("Вы ввели строку: %s. ", string);
  }

  
}
