import java.util.Scanner;
public class NumeroInteiro {


    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Digite um número");
        Float numero = input.nextFloat();

        if (numero % 1 == 0){
            System.out.println("Este número é inteiro");
        } else {
            System.out.println("Este número é decimal");
        }

    }

}