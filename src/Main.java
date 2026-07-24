//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

import javax.swing.*;
import java.util.Scanner;

// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Contabancaria c2 = new Contabancaria();

        Scanner cb = new Scanner(System.in);
        do {
            System.out.println("-----Banco Itau------");
            System.out.println("--Menu de Interação--");
            System.out.println("1: Criar Conta ");
            System.out.println("2: Depositar Dinheiro");
            System.out.println("3: Sacar Dinheiro");
            System.out.println("4: Mostrar Saldo");
            System.out.println("5: Mostrar Status");
            System.out.println("0: SAIR");
            System.out.println("Digite um Numero: ");
            System.out.println("-------------------------");
            int c = cb.nextInt();



            switch (c) {
                case 1:
                    c2.Abrirconta();
                    System.out.println("-------------------------------");
                    System.out.println("Titular : " + c2.getTitular());
                    System.out.println("CFF: " + c2.getSeucpf());
                    System.out.println("Tipo da conta: " + c2.getTipodconta());
                    System.out.println("Senha: " + c2.getCsenha());
                    System.out.println("-------------------------------");
                    break;

                case 2:
                 c2.Depositardinheiro();
                 break;

                case 3:
                    c2.Sacardinheiro();
                    break;
                case 5:
                    cb.nextLine(); // LIMPA O BUFFER
                    System.out.println("QUAL É A SENHA: ");
                    String senh1 = cb.nextLine();

                    if (senh1.equals(c2.getCsenha())) {
                        System.out.println("------------------------------");
                        System.out.println("O saldo da sua conta é de = " + c2.getSaldo());
                        System.out.println("------------------------------");
                    } else {
                        System.out.println("------------------------------");
                        System.out.println("Senha incorreta!");
                        System.out.println("------------------------------");
                    }
                    break;

                case 6:
                    cb.nextLine(); // LIMPA O BUFFER
                    System.out.println("QUAL É A SENHA: ");
                    String senh2 = cb.nextLine();

                    if (senh2.equals(c2.getCsenha())) {
                        c2.setNconta(18363553);
                        c2.setAgencia(2341);
                        System.out.println("------------------------------");
                        System.out.println("A sua conta é do tipo: " + c2.getTipodconta());
                        System.out.println("O numero da conta é: " + c2.getNconta());
                        System.out.println("A Agencia da conta é :  " + c2.getAgencia());
                        System.out.println("------------------------------");
                    } else {
                        System.out.println("------------------------------");
                        System.out.println("Senha incorreta!");
                        System.out.println("------------------------------");
                    }

                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;

            }



        } while (true);



    }
}







