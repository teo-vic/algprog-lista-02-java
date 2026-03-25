import java.util.Scanner;

public class NumeroInformado {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite um número: ");
        int NumeroInformado = sc.nextInt();

        System.out.println("O número informado foi: " + NumeroInformado);

        sc.close();
    }
}
