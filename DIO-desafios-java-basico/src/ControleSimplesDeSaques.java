import java.util.Scanner;

public class ControleSimplesDeSaques {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            try {
                
                double limiteDiario = Double.parseDouble(scanner.nextLine());
    
                double limiteRestante = limiteDiario;
    
                for (int i = 0; i < Integer.MAX_VALUE; i++) {  // Usa um valor grande para permitir entradas contínuas
                    
                    double valorSaque = Double.parseDouble(scanner.nextLine());
    
                    if (valorSaque == 0) {
                        System.out.println("Transacoes encerradas.");
                        break;
                    }
    
                    if (valorSaque > limiteRestante) {
                        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                        break;
                    } else {
                        limiteRestante -= valorSaque;
                        System.out.printf("Saque realizado. Limite restante: " + limiteRestante + "\r\n");
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro: Entrada invalida. Por favor, informe valores numericos.");
            } finally {
                scanner.close();
            }
        }
    }
    