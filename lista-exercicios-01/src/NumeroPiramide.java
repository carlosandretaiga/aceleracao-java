public class NumeroPiramide {

  public static void main(String[] args) {
      int rows = 4; // Defina o número de linhas para a pirâmide
      printNumeroPiramide(rows);
  }

  public static void printNumeroPiramide(int rows) {
      for (int i = 1; i <= rows; i++) {
          for (int j = 1; j <= i; j++) {
              System.out.print(i); // Imprime o número 'i', 'i' vezes
          }
          System.out.println(); // Quebra de linha após cada linha da pirâmide
      }
  }
}

