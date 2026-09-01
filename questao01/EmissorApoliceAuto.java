package exerciciosAula.questao01;

import java.time.LocalDate;

// Fábrica Auto
public class EmissorApoliceAuto extends EmissorApolice {
    private String nome; private LocalDate data; private double fipe;
    private int idade; private int tempoHab; private double cobTerceiros;

    public EmissorApoliceAuto(String nome, LocalDate data, double fipe, int idade, int tempoHab, double cobTerceiros) {
        this.nome = nome; this.data = data; this.fipe = fipe;
        this.idade = idade; this.tempoHab = tempoHab; this.cobTerceiros = cobTerceiros;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceAuto(nome, data, fipe, idade, tempoHab, cobTerceiros);
    }
}