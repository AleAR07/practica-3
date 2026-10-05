package Abstractas;
public abstract class Trabajador {
    private String nombre;
    private int edad;
    public Trabajador(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }
   public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
   public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract double getSalario();
}
