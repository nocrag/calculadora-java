import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira um número inteiro");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par");
        } else if (numero % 2 != 0)
        System.out.println("O número é impar");

    }}


