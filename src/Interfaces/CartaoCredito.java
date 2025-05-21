package Interfaces;

public class CartaoCredito implements Pagamento {
    private String numeroCartao;
    private String titular;
    private double valorPago;

    public CartaoCredito(String numeroCartao, String titular) {
        this.numeroCartao = numeroCartao;
        this.titular = titular;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public void realizarPagamento(double valor) {
        valorPago = valor * 0.9;
        System.out.println("Pagamento realizado com sucesso. Valor: R$" + String.format("%.2f", valorPago));
    }

    @Override
    public void emitirComprovante() {
        System.out.println("Titular: " + getTitular());
        System.out.println("Número do Cartão: " + getNumeroCartao().substring(numeroCartao.length() - 4));
        System.out.println("Valor pago: R$" + String.format("%.2f", valorPago));
        System.out.println("----------------------");
    }
}
