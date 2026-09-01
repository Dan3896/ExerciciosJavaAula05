package exerciciosAula.questao02;

public class GermanyCheckoutFactory implements CheckoutFactory {
    @Override
    public DocumentoFiscal createDocumentoFiscal() {
        return new VATInvoice();
    }

    @Override
    public Pagamento createPagamento() {
        return new PagamentoSEPA();
    }

    @Override
    public EtiquetaEnvio createEtiquetaEnvio() {
        return new EtiquetaDeutschePost();
    }
}