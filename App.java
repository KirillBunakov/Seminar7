package Sem7task;

public class App {
  public static void main(String[] args) {
    // Создаем экземпляр класса ICalculable
    iCalculable calc = new Calculator();
    //
    calc.sum(1, 2, 3, 4, "i");
    calc.multi(9, 12, 7, 4, "i");
    calc.separate(5, 8, 4, 2, "i");
  }
}
