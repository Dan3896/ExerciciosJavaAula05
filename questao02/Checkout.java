package exerciciosAula.questao02;

public class Checkout {
    private CheckoutFactory factory;

    // Injeção da fábrica pelo construtor garante que não haja "ifs" para escolher país
    public Checkout(CheckoutFactory factory) {
        this.factory = factory;
    }

    // O Checkout não faz ideia de qual país está lidando. Depende apenas das abstrações.
    public void finalizarPedido(String nomeCliente) {
        DocumentoFiscal doc = factory.createDocumentoFiscal();
        Pagamento pag = factory.createPagamento();
        EtiquetaEnvio etiqueta = factory.createEtiquetaEnvio();

        System.out.println("=== Relatório de Pedido Finalizado: " + nomeCliente + " ===");
        System.out.println(doc.gerarDocumentoFiscal());
        System.out.println(pag.processarPagamento());
        System.out.println(etiqueta.gerarEtiqueta());
        System.out.println("===================================================\n");
    }
}