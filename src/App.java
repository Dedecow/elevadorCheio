import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int peso1, peso2, peso3, pesoMax;
        System.out.println(" Digite o peso da primeira pessoa: ");
        peso1 = sc.nextInt();
        System.out.println(" Digite o peso da segundo pessoa: ");
        peso2 = sc.nextInt();
        System.out.println(" Digite opeso da terceira pessoa: ");
        peso3 = sc.nextInt();
        pesoMax = peso1 +peso2 +peso3;
        while ( pesoMax > 300 ) {
          System.out.println(" Elevador não pode subir, risco de queda, por favor saiam todos. ");
          peso1 = sc.nextInt();
          peso2 = sc.nextInt();
          peso3 = sc.nextInt();
          pesoMax = peso1 +peso2 +peso3;
            
        }
        System.out.println(" Elevador autorizado, portas sendo fechadas. ");
    }
}
