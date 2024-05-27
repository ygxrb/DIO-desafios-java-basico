import java.util.Scanner;

public class VerificadorNumeroConta {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero da conta bancaria:");
        String numeroConta = scanner.nextLine();
        
        try {
            if (numeroConta.length() != 8 || !numeroConta.matches("\\d{8}")) {
                throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
            }
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        scanner.close();
    }  
}