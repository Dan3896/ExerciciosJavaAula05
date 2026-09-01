package exerciciosAula.questao01;

import java.time.LocalDate;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Iniciando emissões de sucesso...\n");

        // 1. Emitindo Auto
        EmissorApolice emissorAuto = new EmissorApoliceAuto(
                "Carlos Silva", LocalDate.now(), 60000.0, 30, 5, 100000.0
        );
        emissorAuto.processarContratacao();

        // 2. Emitindo Residencial
        EmissorApolice emissorResidencial = new EmissorApoliceResidencial(
                "Maria Souza", LocalDate.now(), 800000.0, true, true
        );
        emissorResidencial.processarContratacao();

        // 3. Emitindo Vida
        EmissorApolice emissorVida = new EmissorApoliceVida(
                "João Paulo", LocalDate.now(), 45, 600000.0, false, true
        );
        emissorVida.processarContratacao();

        // 4. Emitindo Viagem (Internacional)
        EmissorApolice emissorViagem = new EmissorApoliceViagem(
                "Ana Clara", LocalDate.now(), 15, true, 50000.0, true
        );
        emissorViagem.processarContratacao();

        System.out.println("Iniciando testes de rejeição...\n");

        // Teste Falha: Auto (Cobertura terceiros baixa)
        EmissorApolice autoRejeitado = new EmissorApoliceAuto(
                "Pedro", LocalDate.now(), 40000.0, 22, 1, 20000.0
        );
        autoRejeitado.processarContratacao();

        // Teste Falha: Viagem (Internacional sem passaporte)
        EmissorApolice viagemRejeitada = new EmissorApoliceViagem(
                "Lucas", LocalDate.now(), 10, true, 40000.0, false
        );
        viagemRejeitada.processarContratacao();
    }
}