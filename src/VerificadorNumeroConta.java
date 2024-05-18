import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String conta = scanner.nextLine();

        try {
            verificarNumeroConta(conta);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static boolean verificarNumeroConta(String numeroConta) {
        if (numeroConta.length() != 8) {
            throw new IllegalArgumentException("Erro: Numero de conta invalido. Digite exatamente 8 digitos.");
        } else {
            System.out.println("Numero de conta valido.");
            return true;
        }
    }
}