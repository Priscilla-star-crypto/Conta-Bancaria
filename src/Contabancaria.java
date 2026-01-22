
import java.util.Scanner;

public class Contabancaria {
    private String titular ;
    private String seucpf;
    private String tipodconta;
    private String csenha;
    private double saldo;
    private int nconta;
    private int agencia;
    private double sacar;
    private double depositar;



    public void Abrirconta() {
        Scanner cb1 = new Scanner(System.in);
        System.out.println("Qual é seu nome: ");
        this.titular = cb1.nextLine();

        System.out.println("Digite seu CPF: ");
        this.seucpf = cb1.nextLine();


        if (seucpf.length() != 11) {
            System.out.println("CPF inválido. Cadastro não realizado.");
            return; // PARA o método aqui
        }

        System.out.println("Qual vai ser o tipo da conta: Poupança ou Corrente");
        this.tipodconta = cb1.nextLine();

        if (!tipodconta.equals("Poupança") && !tipodconta.equals("Corrente")) {
            System.out.println("Tipo da conta incorreto");
            return;
        }

        System.out.println("Criar uma senha com 6 digitos: ");
        this.csenha = cb1.nextLine();

        if (csenha.length() >= 6) {
            System.out.println("Senha Criada com Sucesso");
        } else {
            System.out.println("ERRO senha invalida - NÃO ATENTE OS REQUESITOS");
        }
    }

    public void Sacardinheiro() {

        Scanner cb2 = new Scanner(System.in);
        cb2.nextLine();
        System.out.println("QUAL É A SENHA: ");
        String senh1 = cb2.nextLine();

        if (senh1.equals(getCsenha())) {
            System.out.println("Quanto voçê quer sacar: ");
            double sacard = cb2.nextDouble();

            if (sacard > 3000){
                System.out.println("------------------------------");
                System.out.println("Limite de saque atingido ");
                System.out.println("------------------------------");
                return;
            } else if (sacard > getSaldo()) {
                System.out.println("--Saldo INSUFICIENTE para sacar--");
            }
            else{
                saldo -= sacard;
                System.out.println("--Saque realizado com SUCESSO--");
            }

        } else {
            System.out.println("------------------------------");
            System.out.println("Senha incorreta!");
            System.out.println("------------------------------");
        }


    }

    public void Depositardinheiro(){

        Scanner cb3 = new Scanner(System.in);
        cb3.nextLine(); // LIMPA O BUFFER
        System.out.println("QUAL É A SENHA: ");
        String senh2 = cb3.nextLine();


        if (senh2.equals(getCsenha())) {

            System.out.println("Quanto voçê quer Depositar: ");
            double sacard1 = cb3.nextDouble();


            if (sacard1 > 3000){
                System.out.println("------------------------------------------------------");
                System.out.println("Limite de depósito atingido! Máximo permitido: R$3000");
                System.out.println("------------------------------------------------------");
            }else if (sacard1 <= 0){
                System.out.println("Valor invalido");
            } else {
                saldo += sacard1;
                System.out.println("--------------------------------");
                System.out.println("Deposito realizado com SUCESSO");
                System.out.println("---------------------------------");}
        } else {
            System.out.println("-----------------------");
            System.out.println("Senha incorreta!");
            System.out.println("-----------------------");
        }
    }






    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getTipodconta() {
        return tipodconta;
    }

    public void setTipodconta(String tipodconta) {
        this.tipodconta = tipodconta;
    }

    public String getSeucpf() {
        return seucpf;
    }

    public void setSeucpf(String seucpf) {
        this.seucpf = seucpf;
    }

    public String getCsenha() {
        return csenha;
    }

    public void setCsenha(String csenha) {
        this.csenha = csenha;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNconta() {
        return nconta;
    }

    public void setNconta(int nconta) {
        this.nconta = nconta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSacar() {
        return sacar;
    }

    public void setSacar(double sacar) {
        this.sacar = sacar;
    }

    public double getDepositar() {
        return depositar;
    }

    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }
}

