package exerciciosAula.questao02;

public class VATInvoice implements DocumentoFiscal {
    @Override
    public String gerarDocumentoFiscal() {
        return "VAT Invoice: Umsatzsteuer 19% (ou 7% essencial), Vendedor VAT-ID: DE999999999";
    }
}