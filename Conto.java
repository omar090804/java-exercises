import java.util.Scanner;

public class Conto {
    double saldo = 0;
    Scanner s = new Scanner(System.in);

    public double saldo() {
        return saldo;
    }

    public void preleva() {
        System.out.print("Quanto devi prelevare: ");
        double y = s.nextDouble();

        if (y > 0 && y <= saldo) {
            saldo -= y;
        } else {
            System.out.println("Importo non valido o saldo insufficiente!");
        }
    }

    public void deposita() {
        System.out.print("Quanto vuoi depositare: ");
        double x = s.nextDouble();

        if (x > 0) {
            saldo += x;
        } else {
            System.out.println("Importo non valido!");
        }
    }

    public static void main(String[] args) {
        Conto c = new Conto();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("***************");
            System.out.println("1. Vedi saldo");
            System.out.println("2. Deposita");
            System.out.println("3. Preleva");
            System.out.println("4. Esci!!");
            System.out.println("***************");

            System.out.print("Scegli l'opzione: ");
            int option = s.nextInt();

            switch (option) {
                case 1 -> System.out.println("Saldo: " + c.saldo());
                case 2 -> c.deposita();
                case 3 -> c.preleva();
                case 4 -> {
                    System.out.println("Grazie, arrivederci!");
                    s.close();
                    return;
                }
                default -> System.out.println("Opzione non valida");
            }
        }
    }
}
