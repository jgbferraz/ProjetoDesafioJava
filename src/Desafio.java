import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nomeCliente = "Cliente teste";
        String tipoDaConta = "Corrente";
        double saldoConta = 50000.99;
        int opcaoUsuario = 0;
        String menu = """
                *** Digite sua opção ***
                1 - Consultar saldo.
                2 - Transferir valor.
                3 - Receber valor.
                4 - Sair do menu.
                """;
        Scanner leitor = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("\nNome do Cliente : " + nomeCliente);
        System.out.println("Tipo de conta : " + tipoDaConta);
        System.out.println("Saldo atual : " + saldoConta);
        System.out.println("\n********************************");



        while (opcaoUsuario != 4){
            System.out.println(menu);
            opcaoUsuario = leitor.nextInt();

            if (opcaoUsuario == 1) {
                System.out.println("O seu saldo é igual a : " + saldoConta);
            } else if (opcaoUsuario == 2) {
                System.out.println("Qual o valor que vc deseja transeferir?");
                double valorTrasferir = leitor.nextDouble();
                if (valorTrasferir > saldoConta) {
                    System.out.println("Não a saldo suficiente em conta para efetivar a transferência.");
                }else {
                    saldoConta -= valorTrasferir;
                    System.out.println("Seu saldo atual é : " + saldoConta);
                }
            } else if (opcaoUsuario == 3) {
                System.out.println("Valor recebido : ");
                double valorRecebido = leitor.nextDouble();
                System.out.println("Seu saldo atual é : " + saldoConta);
            } else if (opcaoUsuario != 4) {
                System.out.println("Opção Inválida");
            }
        }
        }


    }

