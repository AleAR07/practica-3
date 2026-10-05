package Interface2;

public class Ingeniero implements Trabajador, Salariable {
    private String nombre; 
    private int edad; 
    double salario;
    public Ingeniero(String nombre, int edad, double salario){
        this.nombre=nombre; 
        this.edad=edad;
        this.salario=salario;
    }
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getSalario(){
        return salario;
    }
    
    
}
