import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.print("Informe uma string: ");
            String texto = scanner.nextLine();

            int contador = contarLetraA(texto);
            if (contador > 0) {
                System.out.println("A letra 'a' aparece " + contador + " vez(es) na string.");
                break;
            } else {
                System.out.println("A letra 'a' não aparece na string. Tente novamente.");
            }
        }
        
        scanner.close();
    }

    public static int contarLetraA(String texto) {
        int contador = 0;
        for (char c : texto.toLowerCase().toCharArray()) { 
            if (c == 'a') { 
                contador++; 
            }
        }
        return contador;
    }
}
