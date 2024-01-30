import com.contaspagar.modelo.Holerite;
import com.contaspagar.modelo.OrdemServico;
import com.contaspagar.pagamento.*;
import com.contaspagar.servico.ServicoContasPagar;

public class Principal {

    public static void main(String[] args) {
        MetodoPagamento metodoPagamento = new Transferencia();
        ServicoContasPagar servicoContasPagar = new ServicoContasPagar(metodoPagamento);


        Beneficiario funcionario = new Beneficiario("vini da silva", "4567890", "55676");
        Holerite holerite = new Holerite(funcionario, 120, 155);


        Beneficiario fornecedor = new Beneficiario("consultoria xz", "123433", "88909");
        OrdemServico ords = new OrdemServico(fornecedor, 70_90);

        servicoContasPagar.pagar(holerite);
        servicoContasPagar.pagar(ords);
    }
}
