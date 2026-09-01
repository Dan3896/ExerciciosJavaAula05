package exerciciosAula.questao02;

public class NotaFiscalEletronica implements DocumentoFiscal {
    @Override
    public String gerarDocumentoFiscal() {
        return "NFe: CFOP 5.102 / 6.102, ICMS 18%/12%, Chave: " + 
               String.format("%044d", (long)(Math.random() * 1e15));
    }
}