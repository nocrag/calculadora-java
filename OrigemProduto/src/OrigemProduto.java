import java.util.Scanner;
public class OrigemProduto {


    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Digite o código do produto");
        int produto = input.nextInt();

        switch(produto){
            case 1:
                System.out.println("Produto do Sul");
                break;
            case 2:
                System.out.println("Produto do Norte");
                break;
            case 3:
                System.out.println("Produto do Leste");
                break;
            case 4:
                System.out.println("Produto do Oeste");
                break;
            case 5:
                System.out.println("Produto do Nordeste");
                break;
            case 6:
                System.out.println("Produto do Nordeste");
                break;
            case 7:
                System.out.println("Produto do Sudeste");
                break;
            case 8:
                System.out.println("Produto do Sudeste");
                break;
            case 9:
                System.out.println("Produto do Sudeste");
                break;
            case 10:
                System.out.println("Produto do Centro-Oeste");
                break;
            case 11:
                System.out.println("Produto do Noroeste ");
                break;
                default:
                    System.out.println("Produto Importado");





        }




    }



}
