package exerciciosAula.questao01;

import java.time.LocalDate;

// Fábrica Viagem
public class EmissorApoliceViagem extends EmissorApolice {
    private String nome; private LocalDate data; private int dias;
    private boolean internacional; private double cobMedica; private boolean passaporte;

    public EmissorApoliceViagem(String nome, LocalDate data, int dias, boolean internacional, double cobMedica, boolean passaporte) {
        this.nome = nome; this.data = data; this.dias = dias;
        this.internacional = internacional; this.cobMedica = cobMedica; this.passaporte = passaporte;
    }

    @Override
    protected Apolice criarApolice() {
        return new ApoliceViagem(nome, data, dias, internacional, cobMedica, passaporte);
    }
}
