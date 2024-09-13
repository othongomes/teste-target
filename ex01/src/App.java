import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int num;

        while (true) { 
            System.out.print("Informe um número: ");
            num = sc.nextInt();

            if (Fibonacci(num)) { 
                System.out.println(num + " pertence à sequência de Fibonacci.");
                imprFibonacci(num); 
                break; 
            } else {
                System.out.println(num + " não pertence à sequência de Fibonacci. Tente novamente.");
            }
        }

        sc.close(); 
    }

    public static boolean Fibonacci(int num) {

        int a = 0, b = 1;

        while (a <= num) {
            if (a == num) {
                return true;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        return false;
    }

    public static void imprFibonacci(int num) {
        int a = 0, b = 1;
        System.out.println("A sequência de Fibonacci até " + num + " é:");
        System.out.print(a); 

        while (b <= num) { 
            System.out.print(", " + b);
            int next = a + b; 
            a = b;
            b = next;
        }
        System.out.println();
    }
}
