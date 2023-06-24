public class confereCpf {

    public static int primeiroDigito(int[] numeros){
        
        int[] multiplicadores = {10,9,8,7,6,5,4,3,2};
        
        int soma = 0;
        int resultado = 0;
        
        for (int i = 0; i < multiplicadores.length; i++){
        soma += numeros[i] * multiplicadores[i];
        }

        return resultado;
        
        }
    }
