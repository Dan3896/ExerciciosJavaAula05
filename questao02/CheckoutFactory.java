package exerciciosAula.questao02;

public interface CheckoutFactory {
    DocumentoFiscal createDocumentoFiscal();
    Pagamento createPagamento();
    EtiquetaEnvio createEtiquetaEnvio();
}