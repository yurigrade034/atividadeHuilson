import java.util.Scanner;

public class atividadeDois {
    public static void main(String[] args) {

        System.out.println("--------------Calculadora Bagual-------------");
        System.out.println("digite um numero e de enter, após digite outro numero");
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        System.out.println("digite outro numero");
        double num2 = sc.nextDouble();

        System.out.println("o que voce quer fazer \n1-divisao \n2-multiplicação \n3-adicção \n4-subtração ");

        int valor = sc.nextInt();

        if (valor == 1) {
            System.out.println("O resultado da divisão é: " + (num1 / num2) );
        } else if (valor == 2) {
            System.out.println("O resultado da multiplicação é: " + (num1 * num2) );
        } else if (valor == 3) {
            System.out.println("O resultado da adição é: " + (num1 + num2) );
        } else if (valor == 4) {
            System.out.println("O resultado da substração é " + (num1 - num2) );
        } else {
            System.out.println("Digita certo cabaço");
        }

        sc.close();
    }

}
