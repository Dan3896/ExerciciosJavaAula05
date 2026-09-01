package exerciciosAula.questao02;

public class PagamentoCartaoAVS implements Pagamento {
    @Override
    public String processarPagamento() {
        return "Credit Card: Verificação AVS realizada.";
    }
}