public class TabelaMultiplicacao {

  public static void main(String[] args) throws Exception {
      int number = 6; // Define o número para o qual a tabela de multiplicação será impressa
      printMultiplicationTable(number);
  }

  public static void printMultiplicationTable(int number) {
      System.out.println("Tabela de multiplicação por " + number);
      for (int i = 1; i <= 10; i++) {
          System.out.println(number + " x " + i + " = " + (number * i));
      }
  }
}

