//Clase Furgoneta
public class Furgoneta extends Vehiculo {
    private double capacidadCarga;
    private double volumen;

    //Constructor
    public Furgoneta(String matricula, String marca, String modelo, String color, double tarifaAlquiler, boolean disponible, double capacidadCarga, double volumen) {
        super(matricula, marca, modelo, color, tarifaAlquiler, disponible);
        this.capacidadCarga = capacidadCarga;
        this.volumen = volumen;
    }

    //Getters y Setters
    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    @Override
    public void mostrarRegistro() {
        System.out.println("Furgoneta - Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Capacidad de Carga: " + capacidadCarga + " Kg, Volumen: " + volumen + " metros cúbicos");
    }

    @Override
    public double calcularAlquiler() {
        //Solicitar información al usuario sobre la cantidad de Kg de carga y número de días
        //si esa información se obtiene de alguna manera
        double kgCarga = 700; // Una Variable temporal

        int numeroDias = 2; // Una Variable temporal

        double totalAlquiler = 0;
        
        if (kgCarga > 600) {
            totalAlquiler = tarifaAlquiler * numeroDias * 1.25;
        } else {
            totalAlquiler = tarifaAlquiler * numeroDias;
        }
        
        return totalAlquiler;
    }
}