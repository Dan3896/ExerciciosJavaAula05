package exerciciosAula.questao02;

public class PagamentoPixBoleto implements Pagamento {
    @Override
    public String processarPagamento() {
        return "Pagamento processado (Pix com 5% desconto ou Boleto em 3 dias úteis).";
    }
}