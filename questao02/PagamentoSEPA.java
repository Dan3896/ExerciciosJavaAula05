package exerciciosAula.questao02;

public class PagamentoSEPA implements Pagamento {
    @Override
    public String processarPagamento() {
        return "Pagamento: SEPA Direct Debit processado.";
    }
}