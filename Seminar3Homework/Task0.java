package Seminar3Homework;

import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

// Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, 
// разделенные пробелом:
// Фамилия Имя Отчество датарождения номертелефона пол

// Форматы данных:
// фамилия, имя, отчество - строки
// датарождения - строка формата dd.mm.yyyy
// номертелефона - целое беззнаковое число без форматирования
// пол - символ латиницей f или m.

// Приложение должно проверить введенные данные по количеству. 
// Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, 
// что он ввел меньше и больше данных, чем требуется.

// Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. 
// Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. 
// Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, 
// пользователю выведено сообщение с информацией, что именно неверно.

// Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, 
// в него в одну строку должны записаться полученные данные, вида

// <Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

// Не забудьте закрыть соединение с файлом.

// При возникновении проблемы с чтением-записью в файл, 
// исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.

public class Task0 {
  public static void main(String[] args) { 
    Scanner scanner = new Scanner(System.in);
    System.out.println("Введите данные в формате: Фамилия Имя Отчество ДатаРождения НомерТелефона Пол. ");
    String input = scanner.nextLine();

    String[] info = input.split(" ");
    if (info.length != 6) {
      throw new IllegalArgumentException("Недостаточно данных. ");

      String surname = info[0];
      String name = info[1];
      String fathersName = info[2];

      SimpleDateFormat date = new SimpleDateFormat("dd. MM. yyyy");
      Date birthDate;

      try {
        birthDate = date.parse(info[3]);
      } catch (ParseException e) {
        System.out.println("Неверно введена дата рождения. ");
      }

      try {
        int phone = Integer.parseInt(info[4]);
      } catch (NumberFormatException e) {
        System.out.println("Ошибка при вводе номера телефона. ");
      }

      String sex = info[5];
      if (!sex.toLowerCase().equals("m") && !sex.toLowerCase().equals("f")) {
        throw new RuntimeException("Неверно введен пол");
      }

      String nameOfFile = surname.toLowerCase(null) + ".txt";
    }

  }
}
