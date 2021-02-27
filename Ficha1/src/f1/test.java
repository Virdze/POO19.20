package f1;

import f1.ficha1;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        String input;
        int num_E,a,b,valor,taxa;
        double saldo;
        Scanner in = new Scanner(System.in);
        ficha1 f = new ficha1();

        System.out.println("Qual o exercico que quer executar: ");
        num_E = in.nextInt();

        switch (num_E) {
            case 1:
                System.out.println("Introduza a Temp a converter: ");
                input = in.nextLine();
                System.out.println("O valor da Temperatura é: " +
                        f.celsiusParaFareheit(Double.parseDouble(input)));
                break;
            case 2:
                System.out.println("Introduza o os dois numeros: ");
                a = in.nextInt();
                b = in.nextInt();
                System.out.println("O numero maximo é o " +
                        f.maximoNumeros(a, b));
                break;
            case 3:
                System.out.println("Introduza o nome da conta: ");
                input = in.nextLine();
                System.out.println("Introduza um saldo incial: ");
                saldo = in.nextInt();
                String res = f.criaDescricaoConta(input,saldo);
                System.out.println(res);
            case 4:
                System.out.println("Introduza valor e a taxa de conversao: ");
                valor = in.nextInt();
                taxa = in.nextInt();
                System.out.println("O valor em libras é: " +
                        f.eurosParaLibras(valor,taxa));
            case 5:
                System.out.println("Introduza o os dois numeros: ");
                a = in.nextInt();
                b = in.nextInt();
                f.lerInteiros(a,b);
            case 6:
                System.out.println("Introduza o numero que quer factorizar: ");
                a = in.nextInt();
                System.out.println("O factorial é: "+
                        f.factorial(a));
            case 7:
                System.out.println("O tempo gasto foi: " + f.tempoGasto());
        }
    }
}
