package exerciciosAula.questao02;

public class EtiquetaCorreios implements EtiquetaEnvio {
    @Override
    public String gerarEtiqueta() {
        return "Etiqueta Correios: CEP 00000-000";
    }
}