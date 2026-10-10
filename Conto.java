import java.util.Scanner;

public class Conto {
    private double saldo ;
    public Conto(){
        this.saldo=0;
    }


    public double getSaldo() {
        return saldo;
    }

    public boolean preleva(double importo) {
        if (importo <=0 || importo > saldo) {
            return false;
        } else {
            saldo -= importo;
            return true;
        }
    }

    public boolean deposita(double importo) {
        if (importo > 0) {
            saldo +=importo;
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Conto c = new Conto();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("***************");
            System.out.println("1. Vedi saldo");
            System.out.println("2. Deposita");
            System.out.println("3. Preleva");
            System.out.println("4. Esci!!");
            System.out.println("***************");

            System.out.print("Scegli l'opzione: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> System.out.println("Saldo: " + c.getSaldo());
                case 2 ->{
                    System.out.print("Quanto vuoi depositare: ");
                    double importo = scanner.nextDouble();
                    if (!c.deposita(importo)) {
                        System.out.println("Importo non valido!");
                    }
                 c}
                case 3 -> {System.out.print("Quanto vuoi prelevare: ");
                    double importo = scanner.nextDouble();
                    if (!c.preleva(importo)) {
                        System.out.println("Importo non valido o saldo insufficiente!");
                    }}
                case 4 -> {
                    System.out.println("Grazie, arrivederci!");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Opzione non valida");
            }
        }
    }
}
