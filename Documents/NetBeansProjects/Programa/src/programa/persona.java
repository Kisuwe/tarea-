
package programa;

//datos de personas
public class persona {
    int id;
    String primerNombre;
    String edad;
    String genero;
    String peso;
    String talla;
    String direccion;
    String email;
//metodo constructor
    public persona(int id, String primerNombre, String edad, String genero, String peso, String talla, String direccion, String email) {
        this.id = id;
        this.primerNombre = primerNombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.talla = talla;
        this.direccion = direccion;
        this.email = email;
    }
//metodos gettes y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    //fin del metodo
 
            
    
}
