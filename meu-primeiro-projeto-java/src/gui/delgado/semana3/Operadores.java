import java.util.Scanner;

public class Operadores{
    public static void main(String[] args){

        double valorA;
        double valorB;
        double valorC;
        /// Valor A
        try (Scanner scanner = new Scanner(System.in)) {
            /// Valor A
            System.out.print("Digite o valor de a: ");
            valorA = scanner.nextDouble();
            /// Valor B
            System.out.print("Digite o valor de b: ");
            valorB = scanner.nextDouble();
            /// Valor C
            System.out.print("Digite o valor de c: ");
            valorC = scanner.nextDouble();
        }

        ///Validação dos valores
        System.out.println("Valor de A:");
        System.out.println(valorA);
        System.out.println("Valor de B:");
        System.out.println(valorB);
        System.out.println("Valor de C:");
        System.out.println(valorC);

    }

}