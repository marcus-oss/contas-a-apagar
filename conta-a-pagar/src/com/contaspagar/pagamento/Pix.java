package com.contaspagar.pagamento;

public class Pix implements MetodoPagamento {


    @Override
    public void pagar(DocumentoPagavel documento) {

        Beneficiario beneficiario = documento.getBeneficiario();
        if (beneficiario.naoPossuiChavePix()) {
            throw new RuntimeException("Beneficiario não possui chave pix!!");

        }

        System.out.printf("DEBUG: efetuando o PIX para o %s no valor de %.2f com a chave %s%n "
                , beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());

    }
}
