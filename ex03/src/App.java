public class App {
    public static void main(String[] args) throws Exception {
        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k = k + 1;
            soma = soma + k;
        }

        System.out.println("O valor final de SOMA é: " + soma);
        //A soma é 77
    }
}
