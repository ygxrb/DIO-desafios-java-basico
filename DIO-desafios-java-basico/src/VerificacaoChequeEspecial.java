import java.util.Scanner;

public class VerificacaoChequeEspecial {
    public static void main(String[] args) {
        final double LIMITE_CHEQUE_ESPECIAL = 500.0;

        Scanner scanner = new Scanner(System.in);
        
        try {
            
            double saldo = Double.parseDouble(scanner.nextLine());

            
            double valorSaque = Double.parseDouble(scanner.nextLine());

            if (valorSaque <= saldo) {
                System.out.println("Transacao realizada com sucesso.");
            } else {
                double saldoComChequeEspecial = saldo + LIMITE_CHEQUE_ESPECIAL;
                if (valorSaque <= saldoComChequeEspecial) {
                    System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
                } else {
                    System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Erro: Entrada invalida. Por favor, informe valores numericos.");
        } finally {
            scanner.close();
        }
    }
}
