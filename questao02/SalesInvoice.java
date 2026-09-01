package exerciciosAula.questao02;

public class SalesInvoice implements DocumentoFiscal {
    @Override
    public String gerarDocumentoFiscal() {
        return "Sales Invoice: Sales Tax (CA 7.25%, TX 6.25%, OR 0%), Identificação: EIN 12-3456789";
    }
}
