package Interfaces;

public class Antropologo extends Trabajador implements Salariable {
    double salario;
    public Antropologo(String nombre, int edad, double salario){
        super(nombre, edad);
        this.salario=salario;
    }
    public double getSalario(){
        return salario;
    }
}
