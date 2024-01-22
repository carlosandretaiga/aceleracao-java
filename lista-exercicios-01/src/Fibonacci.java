public class Fibonacci {
  public static void main(String[] args) throws Exception {
    int x = 20; // Defina o tamanho da sequência aqui
    printFibonacci(x);
}

public static void printFibonacci(int x) {
    int a = 0, b = 1, c;
    if (x > 0) {
        System.out.print(a + " "); // Imprime o primeiro número da sequência
    }
    for (int i = 2; i <= x; i++) {
        c = a + b;
        System.out.print(b + " "); // Imprime o próximo número da sequência
        a = b;
        b = c;
    }
    System.out.println(); // Quebra de linha no final da sequência
  }
}
