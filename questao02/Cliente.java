package exerciciosAula.questao02;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Iniciando checkouts internacionais...\n");

        // 1. Checkout para cliente no Brasil
        CheckoutFactory brFactory = new BrazilCheckoutFactory();
        Checkout checkoutBrasil = new Checkout(brFactory);
        checkoutBrasil.finalizarPedido("João (Curitiba-BR)");

        // 2. Checkout para cliente nos Estados Unidos
        CheckoutFactory usFactory = new USACheckoutFactory();
        Checkout checkoutEUA = new Checkout(usFactory);
        checkoutEUA.finalizarPedido("John (New York-USA)");

        // 3. Checkout para cliente na Alemanha
        CheckoutFactory deFactory = new GermanyCheckoutFactory();
        Checkout checkoutAlemanha = new Checkout(deFactory);
        checkoutAlemanha.finalizarPedido("Hans (Berlin-GER)");
    }
}