package exerciciosAula.questao01;

import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public abstract class Apolice {
    protected String numeroApolice;
    protected String nomeSegurado;
    protected LocalDate dataEmissao;
    protected double premioCalculado;
    protected List<String> documentosExigidos;

    public Apolice(String nomeSegurado, LocalDate dataEmissao) {
        this.nomeSegurado = nomeSegurado;
        this.dataEmissao = dataEmissao;
        this.numeroApolice = gerarNumeroApolice();
    }

    protected abstract String gerarNumeroApolice();
    public abstract void calcularPremio();
    public abstract void validarCobertura() throws Exception;
    public abstract void listarDocumentos();
    
    public void gerarResumo() {
        System.out.println("=== Resumo da Apólice ===");
        System.out.println("Número: " + numeroApolice);
        System.out.println("Segurado: " + nomeSegurado);
        System.out.println("Data de Emissão: " + dataEmissao);
        System.out.printf("Prêmio Calculado: R$ %.2f\n", premioCalculado);
        System.out.println("Documentos Exigidos: " + String.join(", ", documentosExigidos));
        System.out.println("=========================\n");
    }
}