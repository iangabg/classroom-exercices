package Encapsulamento;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<ContaBancaria> lista = new ArrayList<>();

    public void adicionarConta(ContaBancaria conta) {
        lista.add(conta);
    }

    public ContaBancaria buscarConta(String numeroConta){
        for (ContaBancaria conta : lista){
            if (conta.getNumeroConta().equals(numeroConta)){
                return conta;
            }
        }
        return null;
    }

    public void listarContas() {
        for (ContaBancaria conta : lista){
            conta.exibirResumo();
        }
    }
}
