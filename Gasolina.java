import java.util.Scanner;

public class Gasolina{
    public static void main(String[] args) {
        Double val, litragem, valt;
         Scanner sc = new Scanner(System.in);

        System.out.println("qual o valor da gasolina?: ");
        val = sc.nextDouble();

        System.out.println("quantos litros foi vendido?: ");
        litragem = sc.nextDouble();

        valt = val * litragem;

        System.out.println("o valor total é: " + valt + "R$");




        
    }
}

