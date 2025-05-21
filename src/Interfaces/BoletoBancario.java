package Interfaces;

public class BoletoBancario implements Pagamento{
    private String codigoBoleto;

    public BoletoBancario(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    public String getCodigoBoleto() {
        return codigoBoleto;
    }

    public void setCodigoBoleto(String codigoBoleto) {
        this.codigoBoleto = codigoBoleto;
    }

    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento realizado com sucesso.");
    }

    @Override
    public void emitirComprovante() {
        System.out.println("Código do boleto: " + getCodigoBoleto());
        System.out.println("Pagamento confirmado.");
        System.out.println("----------------------");
    }
}
