package Sem7task;

import java.util.logging.Logger;

// Имплементируем интерфейс iCalculable
public class Calculator implements iCalculable {
  // Создание экземпляра класса логгер
  public Logger logger = Logger.getGlobal();

  // Переопрелеляем метод Sum для сложения комплексных чисел
  @Override
  public void sum(int a, int b, int c, int d, String i) {
    logger.info("Запущен метод sum");
    System.out.println("Сложение комплексного числа " + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", i=i");
    System.out.println("(a + bi) + (c + di) = " + ((a + c) + (b + d)) + "i");
    logger.info("Метод sum выполнен");
    System.out.println();
  }

  // Переопрелеляем метод Multi для умножения комплексных чисел
  @Override
  public void multi(int a, int b, int c, int d, String i) {
    logger.info("Запущен метод multi");
    System.out.println("Умножение комплексного числа " + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", i=i");
    System.out.println("(a + bi) * (c + di) = " + ((a * c) - (b * d) - (b * c) + (a * d)) + "i");
    logger.info("Метод multi выполнен");
    System.out.println();
  }

  // Переопрелеляем метод Separate для деления комплексных чисел
  @Override
  public void separate(int a, int b, int c, int d, String i) {
    logger.info("Запущен метод separate");
    System.out.println("Деление комплексного числа " + "a=" + a + ", b=" + b + ", c=" + c + ", d=" + d + ", i=i");
    System.out.println("(a + bi) / (c + di) = " + (((a + c) + (b + d)) / ((c * c) + (d * d))) + " + "
        + ((b * c - a * d) / (c * c + d * d)) + "i");
    logger.info("Метод separate выполнен");
    System.out.println();
  }
}
