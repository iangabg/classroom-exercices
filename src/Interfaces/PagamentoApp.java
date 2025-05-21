package Interfaces;

import java.util.ArrayList;
import java.util.List;

public class PagamentoApp{
    public static void main(String[] args) {
        List<Pagamento> pagamentos = new ArrayList<>();

        CartaoCredito credito = new CartaoCredito("1234567890123456", "Ian");
        BoletoBancario boleto = new BoletoBancario("1111112222233333");
        Pix pix = new Pix("ian@email.com");

        pagamentos.add(credito);
        pagamentos.add(boleto);
        pagamentos.add(pix);

        for (Pagamento p : pagamentos) {
            p.realizarPagamento(1000);
            p.emitirComprovante();
            System.out.println("----------------------");
        }
    }
}
