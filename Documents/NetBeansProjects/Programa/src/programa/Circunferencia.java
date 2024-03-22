public class Circunferencia {
 
   // Constante PI
    public static final double PI = 3.14;

    // Atributos
    private double radio;
    private double longitud;
    private double diametro;
    private double area;

    // Constructor por defecto
    public Circunferencia() {
        this.radio = 0.0;
    }

    // Constructor con radio
    public Circunferencia(double radio) {
        this.radio = radio;
        calcularDiametro();
        calcularLongitud();
        calcularArea();
    }

    // Setter del radio
    public void setRadio(double radio) {
        this.radio = radio;
        calcularDiametro();
        calcularLongitud();
        calcularArea();
    }

    // Getter del radio
    public double getRadio() {
        return radio;
    }

    // Calcular el diametro
    private void calcularDiametro() {
        diametro = 2 * radio;
    }

    // Getter del diametro
    public double getDiametro() {
        return diametro;
    }

    // Calcular la longitud
    private void calcularLongitud() {
        longitud = 2 * PI * radio;
    }

    // Getter de la longitud
    public double getLongitud() {
        return longitud;
    }

    // Calcular el area
    private void calcularArea() {
        area = PI * radio * radio;
    }

    // Getter del area
    public double getArea() {
        return area;
    }

   
    }