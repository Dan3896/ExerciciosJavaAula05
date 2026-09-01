package exerciciosAula.questao01;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class ApoliceViagem extends Apolice {
    private int diasViagem;
    private boolean internacional;
    private double coberturaMedica;
    private boolean possuiPassaporte;

    public ApoliceViagem(String nome, LocalDate data, int dias, boolean internacional, double cobMedica, boolean passaporte) {
        super(nome, data);
        this.diasViagem = dias;
        this.internacional = internacional;
        this.coberturaMedica = cobMedica;
        this.possuiPassaporte = passaporte;
    }

    @Override
    protected String gerarNumeroApolice() {
        return "VIA-" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();
    }

    @Override
    public void validarCobertura() throws Exception {
        if (internacional) {
            if (coberturaMedica < 30000.0 || !possuiPassaporte) {
                throw new Exception("Rejeitada: Viagem internacional exige cobertura médica de US$ 30.000,00 e passaporte.");
            }
        }
    }

    @Override
    public void calcularPremio() {
        double premio = (diasViagem * 15.0);
        if (internacional) {
            premio += 100.0;
        }
        this.premioCalculado = premio; // prêmio total
    }

    @Override
    public void listarDocumentos() {
        if (internacional) {
            this.documentosExigidos = List.of("Itinerário de viagem", "Passaporte");
        } else {
            this.documentosExigidos = List.of("Itinerário de viagem");
        }
    }
}
