package programa;
        
import java.util.Scanner;

public class IngresoDatos {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Ingresar datos
        System.out.print("Ingrese su primer nombre: ");
        String primerNombre = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        String edad = entrada.nextLine();

        System.out.print("Ingrese su género (M/F): ");
        String genero = entrada.nextLine();

        System.out.print("Ingrese su peso (kg): ");
        String peso = entrada.nextLine();

        System.out.print("Ingrese su talla (cm): ");
        String talla = entrada.nextLine();

        System.out.print("Ingrese su dirección: ");
        String direccion = entrada.nextLine();

        System.out.print("Ingrese su correo electrónico: ");
        String email = entrada.nextLine();

        // Mostrar datos
        System.out.println("\n**Datos ingresados:**");
        System.out.println("Primer nombre: " + primerNombre);
        System.out.println("Edad: " + edad);
        System.out.println("Género: " + genero);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Talla: " + talla + " cm");
        System.out.println("Dirección: " + direccion);
        System.out.println("Correo electrónico: " + email);
    }
}
