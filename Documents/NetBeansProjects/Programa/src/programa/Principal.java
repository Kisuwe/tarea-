import java.util.Scanner;
public class Principal {

    public static void main(String[] args) {

        // Crear objeto c1 sin parámetros
        Circunferencia c1 = new Circunferencia();

        // Pedir radio por teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el radio del círculo c2: ");
        double radio = scanner.nextDouble();;

        // Crear objeto c2 con el radio introducido
        Circunferencia c2 = new Circunferencia(radio);

        // Mostrar información de c1
        System.out.println("\nInformación de c1:");
        System.out.println("Diametro: " + c1.getDiametro());
        System.out.println("Longitud: " + c1.getLongitud());
        System.out.println("Area: " + c1.getArea());

        // Mostrar información de c2
        System.out.println("\nInformación de c2:");
        System.out.println("Diametro: " + c2.getDiametro());
        System.out.println("Longitud: " + c2.getLongitud());
        System.out.println("Area: " + c2.getArea());
    }
}
