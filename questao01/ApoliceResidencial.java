package exerciciosAula.questao01;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class ApoliceResidencial extends Apolice {
    private double valorImovel;
    private boolean altoPadrao;
    private boolean possuiEscrituraOuContrato;

    public ApoliceResidencial(String nome, LocalDate data, double valor, boolean altoPadrao, boolean possuiDoc) {
        super(nome, data);
        this.valorImovel = valor;
        this.altoPadrao = altoPadrao;
        this.possuiEscrituraOuContrato = possuiDoc;
    }

    @Override
    protected String gerarNumeroApolice() {
        return "RES-" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();
    }

    @Override
    public void validarCobertura() throws Exception {
        if (!possuiEscrituraOuContrato) {
            throw new Exception("Rejeitada: Ausência de escritura ou contrato de locação.");
        }
    }

    @Override
    public void calcularPremio() {
        double premioBaseAnual = valorImovel * 0.015;
        if (altoPadrao) {
            premioBaseAnual += premioBaseAnual * 0.25;
        }
        this.premioCalculado = premioBaseAnual / 12.0; // prêmio mensal
    }

    @Override
    public void listarDocumentos() {
        this.documentosExigidos = List.of("Escritura ou contrato de locação", "Comprovante de residência");
    }
}