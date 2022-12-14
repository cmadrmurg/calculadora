package calculadora;

import java.util.Scanner;

public class SimpleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada;

        do {
            System.out.println("Escoja una operación o pulse 0 para salir.");
            System.out.println("Operaciones: + - * /");
            System.out.print("> ");
            entrada = sc.nextLine();
            int n1 = 0, n2 = 0;
            if ("+-*/".contains(entrada)) {
                System.out.print("Operando 1 > ");
                n1 = sc.nextInt();
                System.out.print("Operando 2 > ");
                n2 = sc.nextInt();
            } else {
                System.out.println("Operación incorrecta!");
            }
            switch (entrada) {
                case "+":
                    System.out.println("%d+%d=%d".formatted(n1, n2, n1 + n2));
                    break;

                case "-":
                    System.out.println("%d-%d=%d".formatted(n1, n2, n1 - n2));
                    break;

                case "x":
                    System.out.println("%dx%d=%d".formatted(n1, n2, n1 * n2));
                    break;
                case "/":
                    System.out.println("%d/%d=%d".formatted(n1, n2, n1 / n2));
                    break;

            }

        } while (!entrada.equals(""));
    }
}
