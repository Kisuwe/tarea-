//Clase Turismo
public class Turismo extends Vehiculo {
    private int numPuertas;
    private String tipoMarcha;

    //Constructor
    public Turismo(String matricula, String marca, String modelo, String color, double tarifaAlquiler, boolean disponible, int numPuertas, String tipoMarcha) {
        super(matricula, marca, modelo, color, tarifaAlquiler, disponible);
        this.numPuertas = numPuertas;
        this.tipoMarcha = tipoMarcha;
    }

    //Getters y Setters
    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public String getTipoMarcha() {
        return tipoMarcha;
    }

    public void setTipoMarcha(String tipoMarcha) {
        this.tipoMarcha = tipoMarcha;
    }

    @Override
    public void mostrarRegistro() {
        System.out.println("Turismo - Matrícula: " + matricula + ", Marca: " + marca + ", Modelo: " + modelo + ", Color: " + color + ", Número de Puertas: " + numPuertas + ", Tipo de Marcha: " + tipoMarcha);
    }

    @Override
    public double calcularAlquiler() {
        double totalAlquiler = 0;
        //Solicitar información al usuario sobre el recorrido y número de días
        //si esa información se obtiene de alguna manera
        boolean recorridoForaneo = false; //Variable temporal
        int numeroDias = 5; // Una Variable temporal
        if (recorridoForaneo) {
            totalAlquiler = tarifaAlquiler * numeroDias * 1.15;
        } else {
            totalAlquiler = tarifaAlquiler * numeroDias;
        }
        return totalAlquiler;
    }
}