package exerciciosAula.questao02;

public class EtiquetaDeutschePost implements EtiquetaEnvio {
    @Override
    public String gerarEtiqueta() {
        return "Etiqueta Deutsche Post: PLZ (5 dígitos)";
    }
}