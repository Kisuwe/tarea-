//Clase abstracta Vehículo
public abstract class Vehiculo {//Atributos comunes en todos los tipos de vehículos

    protected String matricula;
    protected String marca;
    protected String modelo;
    protected String color;
    protected double tarifaAlquiler;
    protected boolean disponible;

    //Constructor
    public Vehiculo(String matricula, String marca, String modelo, String color, double tarifaAlquiler, boolean disponible) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tarifaAlquiler = tarifaAlquiler;
        this.disponible = disponible;
    }//fin del metodo

    //Getters y Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getTarifaAlquiler() {
        return tarifaAlquiler;
    }

    public void setTarifaAlquiler(double tarifaAlquiler) {
        this.tarifaAlquiler = tarifaAlquiler;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }//fin del metodo

    //Método mostrar registro
    public abstract void mostrarRegistro();

    //Método abstracto calcular alquiler
    public abstract double calcularAlquiler();
}
