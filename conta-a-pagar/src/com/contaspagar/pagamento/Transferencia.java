package com.contaspagar.pagamento;

public class Transferencia implements MetodoPagamento {


    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();
        if (beneficiario.naoPossuiContaBancaria()) {
            throw new RuntimeException("Beneficiario não possui conta bancaria!!");

        }

        System.out.printf("DEBUG: efetuando transferencia do PIX para  %s no valor de %.2f para a conta bancaria %s%n "
                , beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());

    }
}
