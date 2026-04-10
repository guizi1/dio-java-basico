package gui.delgado.semana3;

import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorA;
        double valorB;
        double valorC;
        
        System.out.print("Digite o valor de a: ");
        valorA = scanner.nextDouble();
        
        System.out.print("Digite o valor de b: ");
        valorB = scanner.nextDouble();
        
        System.out.print("Digite o valor de c: ");
        valorC = scanner.nextDouble();
        
        double delta = valorDelta(valorA, valorB, valorC);
        System.out.println("Valor de delta: " + delta);

        double raizDelta = Math.sqrt(delta);
        double x1 = ((valorB * -1) + raizDelta) / (2 * valorA);
        double x2 = ((valorB * -1) - raizDelta) / (2 * valorA);
        System.out.println("Valor de x1 = " + x1 + "\nValor de x2 = " + x2);

        scanner.close();
    }

    public static double valorDelta (double valorA, double valorB, double valorC){
        return (valorB * valorB) - 4 * valorA * valorC;
    }

    public static double calcularBhaskara (double valorA, double valorB, double delta){
        return (valorB * -1) + Math.sqrt(delta) / 2 * valorA;
    }

}