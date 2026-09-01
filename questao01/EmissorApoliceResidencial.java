package exerciciosAula.questao01;

import java.time.LocalDate;

// Fábrica Residencial
public class EmissorApoliceResidencial extends EmissorApolice {
    private String nome; private LocalDate data; private double valor;
    private boolean altoPadrao; private boolean temDoc;

    public EmissorApoliceResidencial(String nome, LocalDate data, double valor, boolean altoPadrao, boolean temDoc) {
        this.nome = nome; this.data = data; this.valor = valor;
        this.altoPadrao = altoPadrao; this.temDoc = temDoc;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceResidencial(nome, data, valor, altoPadrao, temDoc);
    }
}
