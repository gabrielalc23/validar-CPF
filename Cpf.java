import java.util.Scanner;

class Cpf {

    public static boolean validarCPF(String cpf) {
    
        if (cpf.length() != 11) {
            return false;
        }
        
        int[] numeros = new int[11];
        
        for (int i = 0; i < 11; i++) {
            numeros[i] = Integer.parseInt(cpf.substring(i, i + 1));
        }
        
        // Verificar o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (10 - i);
        }
        int resto = soma % 11;
        int digito1 = resto < 2 ? 0 : 11 - resto;
        if (numeros[9] != digito1) {
            return false;
        }
        
        // Verificar o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += numeros[i] * (11 - i);
        }
        resto = soma % 11;
        int digito2 = resto < 2 ? 0 : 11 - resto;
        if (numeros[10] != digito2) {
            return false;
        }
        
        return true;
    }

    public static void main(String args[]) {

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o CPF a ser validado: ");
        String cpf = teclado.nextLine();

        if (validarCPF(cpf)) {
            System.out.println("CPF válido!");
        } else {
            System.out.println("CPF inválido!");
        }
    }
}
