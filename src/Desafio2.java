import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        double primeiraNota = 0;
        double segundaNota = 0;
        double media = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá irei ajuda-lo(a) a calcular a média das duas notas");
        System.out.println("Digite a primeira nota:");
        primeiraNota = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        segundaNota = scanner.nextDouble();
        media = (primeiraNota + segundaNota) / 2;
        System.out.println("A média é = " + media);
    }
}
