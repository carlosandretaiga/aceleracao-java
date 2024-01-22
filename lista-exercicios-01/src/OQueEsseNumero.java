import java.util.Scanner;

public class OQueEsseNumero {
    public static void main(String[] args) throws Exception {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        
        // Verifica se o número é par ou ímpar
        String paridade = (numero % 2 == 0) ? "é par" : "é ímpar";
        
        // Verifica se o número é positivo, negativo ou zero
        String tipo;
        if (numero > 0) {
            tipo = "e positivo";
        } else if (numero < 0) {
            tipo = "e negativo";
        } else {
            tipo = "e zero (neutro)";
        }
        
        // Imprime o resultado
        System.out.println(numero + " " + paridade + " " + tipo + ".");
        
        // Fecha o scanner
        scanner.close();
    }
}
