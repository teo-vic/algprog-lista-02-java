import java.util.Scanner;

public class Alistamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite o nome do(a) recruta");
        String nome = sc.nextLine();
        System.out.println("ola, " + nome + "!");
        

        System.out.println("digite o seu peso");
        double peso = sc.nextDouble();
        System.out.println("seu peso é " + peso + " kg");

        if (peso < 50){
            System.out.println("você está abaixo do peso ideal para o alistamento");
        } else if (peso >= 50 && peso <= 100){
            System.out.println("você está dentro");
        }
        

        sc.close();


    }
}
