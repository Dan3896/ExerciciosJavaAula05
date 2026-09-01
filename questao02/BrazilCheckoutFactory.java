package exerciciosAula.questao02;

public class BrazilCheckoutFactory implements CheckoutFactory {
    @Override
    public DocumentoFiscal createDocumentoFiscal() {
        return new NotaFiscalEletronica();
    }

    @Override
    public Pagamento createPagamento() {
        return new PagamentoPixBoleto();
    }

    @Override
    public EtiquetaEnvio createEtiquetaEnvio() {
        return new EtiquetaCorreios();
    }
}