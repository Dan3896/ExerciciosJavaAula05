package exerciciosAula.questao01;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public class ApoliceAuto extends Apolice {
    private double valorFipe;
    private int idadeCondutor;
    private int tempoHabilitacao;
    private double coberturaTerceiros;

    public ApoliceAuto(String nome, LocalDate data, double fipe, int idade, int tempoHab, double cobTerceiros) {
        super(nome, data);
        this.valorFipe = fipe;
        this.idadeCondutor = idade;
        this.tempoHabilitacao = tempoHab;
        this.coberturaTerceiros = cobTerceiros;
    }

    @Override
    protected String gerarNumeroApolice() {
        return "AUTO-" + UUID.randomUUID().toString().substring(0, 6).toUpperCase();
    }

    @Override
    public void validarCobertura() throws Exception {
        if (coberturaTerceiros < 50000.0) {
            throw new Exception("Rejeitada: Cobertura contra terceiros inferior ao mínimo de R$ 50.000,00.");
        }
    }

    @Override
    public void calcularPremio() {
        double premioBaseAnual = valorFipe * 0.08;
        double premioFinalAnual = premioBaseAnual;
        
        if (idadeCondutor < 25) {
            premioFinalAnual += premioBaseAnual * 0.30;
        }
        if (tempoHabilitacao < 2) {
            premioFinalAnual += premioBaseAnual * 0.20;
        }
        
        this.premioCalculado = premioFinalAnual / 12.0; // prêmio mensal
    }

    @Override
    public void listarDocumentos() {
        this.documentosExigidos = List.of("CNH", "CRLV", "Comprovante de residência");
    }
}
