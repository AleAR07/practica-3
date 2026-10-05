package Abstractas;
public class Antropologo extends Trabajador  {
    double salario;

    public Antropologo(String nombre, int edad, double salario){
        super(nombre, edad);
        this.salario=salario;

    }
    @Override 
    public double getSalario(){
        return salario;
    }
    
}
