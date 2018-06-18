
import java.util.Scanner;
public class NegativoOuPositivo {

        public static void main(String[] args) {
            Scanner input =  new Scanner(System.in);
            System.out.println("Digite um número");
            int numero = input.nextInt();

            if (numero >= 1){
                System.out.println("Este número é positivo");
            } else {
                System.out.println("Este número é negativo");
            }

        }

    }
