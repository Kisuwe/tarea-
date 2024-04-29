
/**
 *
 * @author Ronaldo
 */
public class Main {
    public static void main(String[] args) {
        //Instanciación de objetos
        Turismo turismo1 = new Turismo("ABC123", "Toyotica", "Corolla", "Rojo", 100000, true, 4, "Automática");
        Deportivo deportivo1 = new Deportivo("DEF456", "Ferrari", "F8 Tributo", "Amarillo", 50000, true, 3900);
        Furgoneta furgoneta1 = new Furgoneta("GHI789", "Mercedes-Benz", "Sprinter", "Blanco", 90000, true, 800, 10.5);

        Vehiculo turismo2 = new Turismo("JKL012", "Honda", "Civic", "Azul", 100000, true, 4, "Sincrónica");
        Vehiculo deportivo2 = new Deportivo("MNO345", "Lamborghini", "Aventador", "Negro", 50000, true, 6498);
        Vehiculo furgoneta2 = new Furgoneta("PQR678", "Renault", "Kangoo", "Gris", 90000, true, 500, 8.2);

       
        //aqui se muestra registros y calcular alquiler
        turismo1.mostrarRegistro();
        System.out.println("Costo de alquiler: $" + turismo1.calcularAlquiler());

        deportivo1.mostrarRegistro();
        System.out.println("Costo de alquiler: $" + deportivo1.calcularAlquiler());

        furgoneta1.mostrarRegistro();
        System.out.println("Costo de alquiler: $" + furgoneta1.calcularAlquiler());

        turismo2.mostrarRegistro();
        System.out.println("Costo de alquiler: $" + turismo2.calcularAlquiler());

        deportivo2.mostrarRegistro();
        System.out.println("Costo de alquiler: $" + deportivo2.calcularAlquiler());

        furgoneta2.mostrarRegistro();
        System.out.println("Costo de alquiler: $" + furgoneta2.calcularAlquiler());
    }
}