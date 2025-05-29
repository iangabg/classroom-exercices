package Encapsulamento;

public class AplicacaoBanco {
    public static void main(String[] args) {

        Banco banco = new Banco();

        ContaBancaria c1 = new ContaBancaria("123", 0, "Ian");
        ContaBancaria c2 = new ContaBancaria("456", 500, "Rebeca");
        ContaBancaria c3 = new ContaBancaria("789", 250, "Maitê");

        banco.adicionarConta(c1);
        banco.adicionarConta(c2);
        banco.adicionarConta(c3);

        c1.depositar(200);
        c2.depositar(300);

        c3.sacar(100);
        c1.sacar(50);

        boolean saque = c3.sacar(1000);
        if (!saque){
            System.out.println("Saque não  realizado! Saldo insuficiente.");
        }

        banco.listarContas();
    }

}
