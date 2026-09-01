package exerciciosAula.questao02;

public class EtiquetaUSPS implements EtiquetaEnvio {
    @Override
    public String gerarEtiqueta() {
        return "Etiqueta USPS: ZIP+4";
    }
}