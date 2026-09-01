package exerciciosAula.questao02;

public class USACheckoutFactory implements CheckoutFactory {
    @Override
    public DocumentoFiscal createDocumentoFiscal() {
        return new SalesInvoice();
    }

    @Override
    public Pagamento createPagamento() {
        return new PagamentoCartaoAVS();
    }

    @Override
    public EtiquetaEnvio createEtiquetaEnvio() {
        return new EtiquetaUSPS();
    }
}