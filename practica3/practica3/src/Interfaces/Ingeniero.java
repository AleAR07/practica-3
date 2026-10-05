package Interfaces;

public class Ingeniero extends Trabajador implements Salariable {
    double salario;
    public Ingeniero(String nombre, int edad, double salario){
        super(nombre, edad);

    }
    public double getSalario(){
        return salario;
    }
    
}
