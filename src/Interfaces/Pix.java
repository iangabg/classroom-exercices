package Interfaces;

public class Pix implements Pagamento{
    private String chavePix;
    private double valorPago;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void emitirComprovante() {
        System.out.println("Chave pix: " + getChavePix());
        System.out.println("Valor da transação: R$" + String.format("%.2f", valorPago));
    }

    @Override
    public void realizarPagamento(double valor) {
        valorPago = valor;
        System.out.println("Transação Pix realizada com sucesso.");
    }
}
