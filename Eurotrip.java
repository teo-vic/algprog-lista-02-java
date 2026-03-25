import java.util.Scanner;

public class Eurotrip{
    public static void main(String[] args) {
        Double ale, por, ita, valfi;
        Scanner sc = new Scanner(System.in);

        System.out.println("qual o valor da viagem para alemanha?: ");
        ale = sc.nextDouble();

        System.out.println("qual o valor da viagem para portugal?: ");
        por = sc.nextDouble();

        System.out.println("qual o valor da viagem para itália?: ");
        ita = sc.nextDouble();

        valfi = ale + por + ita;

        System.out.println("valor total = " + valfi + "R$");



        
    }

}