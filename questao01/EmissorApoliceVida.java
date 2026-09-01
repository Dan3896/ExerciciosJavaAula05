package exerciciosAula.questao01;

import java.time.LocalDate;

// Fábrica Vida
public class EmissorApoliceVida extends EmissorApolice {
    private String nome; private LocalDate data; private int idade;
    private double capital; private boolean fumante; private boolean temAtestado;

    public EmissorApoliceVida(String nome, LocalDate data, int idade, double capital, boolean fumante, boolean temAtestado) {
        this.nome = nome; this.data = data; this.idade = idade;
        this.capital = capital; this.fumante = fumante; this.temAtestado = temAtestado;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceVida(nome, data, idade, capital, fumante, temAtestado);
    }
}
