//Clase Deportivo
public class Deportivo extends Vehiculo {
    private int cilindrada;

    //Constructor
    public Deportivo(String matricula, String marca, String modelo, String color, double tarifaAlquiler, boolean disponible, int cilindrada) {
        super(matricula, marca, modelo, color, tarifaAlquiler, disponible);
        this.cilindrada = cilindrada;
    }

    //Getters y Setters
    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public void mostrarRegistro() {
        System.out.println("Deportivo - Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Cilindrada: " + cilindrada);
    }

    @Override
    public double calcularAlquiler() {
        //Solicitar información al usuario sobre el número de días
        //si esa información se obtiene de alguna manera
        int numeroDias = 3; // Una Variable temporal
        return tarifaAlquiler * numeroDias;
    }
}