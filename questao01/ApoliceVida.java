package exerciciosAula.questao01;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class ApoliceVida extends Apolice {
    private int idade;
    private double capitalSegurado;
    private boolean fumante;
    private boolean possuiAtestadoMedico;

    public ApoliceVida(String nome, LocalDate data, int idade, double capitalSegurado, boolean fumante, boolean possuiAtestadoMedico) {
        super(nome, data);
        this.idade = idade;
        this.capitalSegurado = capitalSegurado;
        this.fumante = fumante;
        this.possuiAtestadoMedico = possuiAtestadoMedico;
    }

    @Override
    protected String gerarNumeroApolice() {
        return "VID-" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();
    }

    @Override
    public void validarCobertura() throws Exception {
        if (capitalSegurado > 500000.0 && !possuiAtestadoMedico) {
            throw new Exception("Rejeitada: Atestado médico ausente para capital acima de R$ 500.000,00.");
        }
    }

    @Override
    public void calcularPremio() {
        double premioBase = (idade * 12) + (capitalSegurado * 0.002);
        if (fumante) {
            premioBase += premioBase * 0.50;
        }
        this.premioCalculado = premioBase; // prêmio mensal
    }

    @Override
    public void listarDocumentos() {
        if (capitalSegurado > 500000.0) {
            this.documentosExigidos = List.of("Documento de identidade", "CPF", "Atestado médico");
        } else {
            this.documentosExigidos = List.of("Documento de identidade", "CPF");
        }
    }
}