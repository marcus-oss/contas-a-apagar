package com.contaspagar.servico;

import com.contaspagar.pagamento.DocumentoPagavel;
import com.contaspagar.pagamento.MetodoPagamento;


public class ServicoContasPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContasPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }


    public void pagar(DocumentoPagavel documento) {


        metodoPagamento.pagar(documento);


    }
}
