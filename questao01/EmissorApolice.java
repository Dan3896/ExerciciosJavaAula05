package exerciciosAula.questao01;

public abstract class EmissorApolice {
    
    // Método Fábrica (Abstract Factory Method)
    protected abstract Apolice criarApolice();

    // Template Method: final e concreto, define o processo padrão de emissão
    public final void processarContratacao() {
        Apolice apolice = criarApolice();
        
        try {
            apolice.validarCobertura();
            apolice.calcularPremio();
            apolice.listarDocumentos();
            apolice.gerarResumo(); // Apenas emite o resumo em caso de sucesso
        } catch (Exception e) {
            System.out.println("❌ Falha na contratação de " + apolice.nomeSegurado);
            System.out.println("Motivo: " + e.getMessage() + "\n");
        }
    }
}
